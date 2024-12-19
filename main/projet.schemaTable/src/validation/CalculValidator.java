package validation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import calcul.CalculPackage;
//import calcul.CalculFactory;
import calcul.Calcul;
import calcul.Entree;
import calcul.Expression;
import calcul.Binaire;
import calcul.Unaire;
import calcul.Constante;
//import calcul.TypeBinaire;
//import calcul.TypeUnaire;

/**
 * Class de validation de calcul
 * @author Nino Rottier
 * @version 1
 */
public class CalculValidator {
	
	// contraintes sur constante
	/** la constante existe (!= null) */
	public static boolean validateConstExistence(Constante cst) {
		return cst != null;
	}
	
	
	// contraintes sur entree
	/** toute entree utilisée dans un calcul est déclarée */
	public static boolean validateEntryDeclared(Entree entree, List<String> entreesDeclarees) {
		if (entree.getValeur() == null || entree.getValeur().equals("")) {
			return false;
		}
		return entreesDeclarees.contains(entree.getValeur());
	}
	

	// contraintes dans les expressions
	// fonction récursive pour vérifier tous les sous-cas
	/** Valide une expression */
	public static List<String> validateExpression(Expression expr, List<String> entrees) {
		List<String> errors = new ArrayList<>();
		
		// cas d'erreur
		if (expr == null) {
			errors.add("Une expression n'est pas définie : ExpressionNullException\n");
			return errors;
		}
		
		// cas de base :
		if (expr instanceof Constante) {
			Constante cst = (Constante) expr;
			
			if (!validateConstExistence(cst)) {
				errors.add("Une constante est mal déclarée\n");
			}
		
		} else if (expr instanceof Entree) {
			Entree entr = (Entree) expr;
			
			if (!validateEntryDeclared(entr,entrees)) {
				errors.add("Une entrée utilisée dans le calcul n'est pas déclarée comme entrée : " + entr.getValeur() + "\n");
			}
			// TODO contraintes sur entree
			
		}
		
		// cas de récursion : (parcours préfixe btw)
		else if (expr instanceof Unaire) {
			Unaire unaire = (Unaire) expr;
			
			// TODO contraintes sur unaire
			
			errors.addAll(validateExpression(unaire.getExpression(),entrees));
			
		} else if (expr instanceof Binaire) {
			Binaire binaire = (Binaire) expr;
			
			// TODO contraintes sur binaire
			
			errors.addAll(validateExpression(binaire.getExpressiong(),entrees));
			errors.addAll(validateExpression(binaire.getExpressiond(),entrees));
			
		}
		
		return errors;
	}
	
	// contraintes sur calcul
	/** Valide un calcul */
	public static List<String> validateCalcul(Calcul calcul) {
		List<String> errors = new ArrayList<String>();
		
		// on parcourt l'arbre des expressions pour vérifier les autres contraintes
		List<String> entreesString = new ArrayList<String>();
		for (Entree entree : calcul.getEntree()) {
			entreesString.add(entree.getValeur());
		}
		
		// ajouter des contraintes sur les entrees 
        // et sorties du calcul ici
		
        errors.addAll(validateExpression(calcul.getExpression(),entreesString));
        
        return errors;
	}
	
	/**
     * Main
     * Lance les tests sur un fichier en argument.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java CalculValidator <path_to_xmi_file>");
            return;
        }

        String filePath = args[0];
        File file = new File(filePath);

        if (!file.exists()) {
            System.err.println("Le fichier " + filePath + " n'existe pas.");
            return;
        }

        // Initialiser EMF
        ResourceSet resourceSet = new ResourceSetImpl();

        // Enregistrer le package pour qu'il soit accessible
        CalculPackage.eINSTANCE.eClass();

        // Configurer le gestionnaire de ressources pour XMI
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Charger le fichier XMI
        Resource resource;
        try {
            resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
            resource.load(null);
        } catch (IOException e) {
            System.err.println("Erreur lors du chargement du fichier XMI : " + e.getMessage());
            return;
        } catch (Exception e) {
        	System.err.println("Le fichier ne représente pas un calcul : \n"
        			+ e.getMessage());
        	return;
        }

        // Récupérer l'instance racine
        Calcul calcul = (Calcul) resource.getContents().get(0);

        System.out.println("Début de la vérification du fichier : " + file.toString() + "\n");
        // Valider la table
        List<String> errors = validateCalcul(calcul);

        // Afficher les résultats
        if (errors.isEmpty()) {
            System.out.println("Le fichier est valide !");
        } else {
            System.out.println("Le fichier contient des erreurs :");
            errors.forEach(System.err::println);
        }
    }

}
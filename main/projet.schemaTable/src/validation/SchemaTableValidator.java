package validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


import schemaTable.SchemaTablePackage;
//import schemaTable.SchemaTableFactory;
import schemaTable.Table;
import schemaTable.Colonne;
import schemaTable.ColonneIdentifiants;
import schemaTable.ColonneDerivee;
import schemaTable.ColonneEtrangere;
import algorithme.Algorithme;
import algorithme.Langage;

/**
 * Class de validation de schemaTable
 * @author Nino Rottier
 * @version 2.4
 */
public class SchemaTableValidator {
	
	// Valide table
	/** nom != vide */
    public static boolean validateTableName(Table table) {
        return table.getNom() != null && !table.getNom().trim().isEmpty();
    }
    
    /** le nom de chaque colonne est unique */
    public static String validateUniqueColumnNames(Table table) {
        Set<String> columnNames = new HashSet<>();
        for (Colonne colonne : table.getColonneData()) {
            if (colonne.getNom() == null || colonne.getNom().trim().isEmpty()) {
                // Si un nom est nul ou vide, ce sera une erreur différente
                // return false; // pour éviter de relever l'erreur plusieurs fois
            }
            if (!columnNames.add(colonne.getNom())) {
                // Si le nom existe déjà dans l'ensemble, il n'est pas unique
                return colonne.getNom();
            }
        }
        return "";
    }
    
    /** Il y a une colonne identifiant dans la table */
    public static boolean validateIdentityColumnExistence(Table table) {
    	int count = 0;
        for (Colonne colonne : table.getColonneData()) {
            if (colonne instanceof ColonneIdentifiants) {
                count++;
            }
        }
        return (count == 1);
    }

    
    // Valide les contraintes sur table    
    /** nom de algo != vide */
    public static boolean validateTableAlgorithmName(Table table) {
    	boolean b = true;
    	for (Algorithme algo : table.getAlgoContrainte()) {
    		if (!(algo.getNom() != null && algo.getNom() != "")) {
        		b = false;
        	}
    	}
    	return b;
    }
    
    /** les colonnes d'entrees de l'algo sont dans la table */
    public static boolean validateTableAlgorithmIN(Table table) {
    	boolean b = true;
    	// on créer la liste des noms
    	Set<String> columnNames = new HashSet<>();
        for (Colonne colonne : table.getColonneData()) {
            if (!(colonne.getNom() == null || colonne.getNom().trim().isEmpty())) {
            	columnNames.add(colonne.getNom());
            }
        }
    	for (Algorithme algo : table.getAlgoContrainte()) {
    		for (String aname : algo.getEntree()) {
    			if (!columnNames.contains(aname)) {
            		b = false;
            	}
    		}
    	}
    	return b;
    }
    
    /** algo.ressource existe */
    public static boolean validateTableAlgorithmRessourceExiste(Table table) {
    	boolean b = true;
    	for (Algorithme algo : table.getAlgoContrainte()) {
    		String path = algo.getRessource();
    		if (path != null) {
    			File file = new File(path);
                if (!file.exists()) {
                    b = false;
                }
    		} else {
    			b = false;
    		}
    	}
    	return b;
    }
    
    /** algo.ressource est conforme au langage demandé */
    public static boolean validateTableAlgorithmLanguage(Table table) {
    	boolean b = true;
    	for (Algorithme algo : table.getAlgoContrainte()) {
    		String path = algo.getRessource();
    		if (path != null) {
    			int dotIndex = path.lastIndexOf('.');
                if (dotIndex >= 0) {
                	String extension = path.substring(dotIndex+1);
                	if (algo.getLangage() == Langage.PYTHON) {
                		if (!extension.equals("py")) {
                			b = false;
                		}
                	} else if (algo.getLangage() == Langage.INTERNE) {
                		if (!extension.equals("calc")) {
                			b = false;
                		}
                	}
                }
    		} else {
    			b = false;
    		}
    	}
    	return b;
    }
    
    
    // Valide les colonnes normales
    /** nom != vide */
    public static boolean validateColumnName(Colonne colonne) {
        return colonne.getNom() != null && !colonne.getNom().trim().isEmpty();
    }
    
    // Valide les colonnes dérivées
    /** algo != vide */
    public static boolean validateAlgorithmExistence(ColonneDerivee colonned) {
        return colonned.getAlgorithme() != null;
    }
    
    /** nom de algo != vide */
    public static boolean validateAlgorithmName(ColonneDerivee colonned) {
        if (colonned.getAlgorithme() != null) {
        	if (colonned.getAlgorithme().getNom() != null && colonned.getAlgorithme().getNom() != "") {
        		return true;
        	}
        	return false;
        }
        return true; // pour éviter de renvoyer 2 fois la même erreur
    }
    
    /** colonne de sortie de l'algo = nom de la colonne */
    public static boolean validateAlgorithmOUT(ColonneDerivee colonned) {
        if (colonned.getAlgorithme() != null && colonned.getNom() != null) {
        	if (colonned.getAlgorithme().getSortie().equals(colonned.getNom())) {
        		return true;
        	}
        	return false;
        }
        return true; // pour éviter de renvoyer 2 fois la même erreur
    }
    
    /** les colonnes d'entrees de l'algo sont dans la table */
    public static boolean validateAlgorithmIN(ColonneDerivee colonned, Table table) {
        if (colonned.getAlgorithme() != null) {
        	Set<String> columnNames = new HashSet<>();
            for (Colonne colonne : table.getColonneData()) {
                if (!(colonne.getNom() == null || colonne.getNom().trim().isEmpty())) {
                	columnNames.add(colonne.getNom());
                }
            }
            for (String name : colonned.getAlgorithme().getEntree()) {
            	if (!columnNames.contains(name)) {
            		return false;
            	}
            }
        }
        return true; // pour éviter de renvoyer 2 fois la même erreur
    }
    
    /** algo.ressource existe */
    public static boolean validateAlgorithmRessourceExiste(ColonneDerivee colonned) {
        if (colonned.getAlgorithme() != null) {
        	String path = colonned.getAlgorithme().getRessource();
        	if (path != null) {
        		File file = new File(path);
                if (file.exists()) {
                    return true;
                }
        	}
        	return false;
        }
        return true;
    }
    
    /** algo.ressource est conforme au langage demandé */
    public static boolean validateAlgorithmLanguage(ColonneDerivee colonned) {
        if (colonned.getAlgorithme() != null) {
        	String path = colonned.getAlgorithme().getRessource();
        	if (path != null) {
                int dotIndex = path.lastIndexOf('.');
                if (dotIndex >= 0) {
                	String extension = path.substring(dotIndex+1);
                	if (colonned.getAlgorithme().getLangage() == Langage.PYTHON) {
                		return extension.equals("py");
                	} else if (colonned.getAlgorithme().getLangage() == Langage.INTERNE) {
                		return extension.equals("calc");
                	}
                }
                return false;
        	}
        	return false;
        }
        return true;
    }
    
    
    // Valide les colonnes étrangères
    /** la table existe */
    public static boolean validateTableEtrangereExiste(ColonneEtrangere ce) {
    	return ce.getTableEtrangere() != null;
    }
    
    /** la table n'est pas celle de la colonne etrangere */
    public static boolean validateTableEtrangereDifferente(ColonneEtrangere ce, Table table) {
    	if (ce.getTableEtrangere() != null) {
    		return ce.getTableEtrangere() != table;
    	}
    	return true; // pour ne pas faire 2 fois la meme erreur
    }
    
    /** la colonne référencée existe bien dans la table référencée */
    public static boolean validateTableEtrangereColonneExiste(ColonneEtrangere ce) {
    	if (ce.getTableEtrangere() != null && ce.getNom() != null
    			&& !ce.getNom().equals("")) {
    		for (Colonne c : ce.getTableEtrangere().getColonneData()) {
    			if (c.getNom().equals(ce.getIdColonneTableEtrangere())) {
    				return true;
    			}
    		}
    		return false;
    	}
    	return true; // pour ne pas faire 2 fois la meme erreur
    }
    

    // Valide une table entière et retourne les erreurs
    public static List<String> validateTable(Table table) {
        List<String> errors = new ArrayList<>();
        String redondant = validateUniqueColumnNames(table);
        
        // contrainte sur table
        if (!validateTableName(table)) {
            errors.add("Nom de la table invalide");
        } if (redondant != "") {
            errors.add("Au moins un nom de colonne est redondant : " + redondant);
        } if (!validateIdentityColumnExistence(table)) {
            errors.add("Il faut une (unique) colonne identifiants dans la table");
        }
        
        // contrainte sur les algos de contraintes de la table
        if (!validateTableAlgorithmName(table)) {
    		errors.add("Le nom de certains algorithmes de contraintes n'est pas défini");
    	} if (!validateTableAlgorithmIN(table)) {
    		errors.add("Les entrées de certains algorithmes de contraintes n'existent pas dans la table");
    	} if (!validateTableAlgorithmRessourceExiste(table)) {
    		errors.add("Les ressources de certains algorithmes de contraintes n'existent pas\n"
    				+ "(Une ressource doit être le chemin depuis la racine du projet)");
    	} if (!validateTableAlgorithmLanguage(table)) {
    		errors.add("Les ressources de certains algorithmes de contraintes ne sont pas du type du langage associé"
    				+ "\n(.py pour PYTHON et .calc pour le langage INTERNE)");
    	}
        // contrainte sur colonne
        for (Colonne colonne : table.getColonneData()) {
        	// colonne normale
            if (!validateColumnName(colonne)) {
                errors.add("Nom de colonne invalide : un nom de colonne n'est pas défini");
            }
            
            // contraintes sur colonne dérivées 
            if (colonne instanceof ColonneDerivee) {
            	ColonneDerivee colonned = (ColonneDerivee) colonne;
            	String dname = colonned.getNom();
            	
            	if (!validateAlgorithmExistence(colonned)) {
                    errors.add("L'algorithme de la colonne : " + dname + " n'est pas défini");
                } if (!validateAlgorithmName(colonned)) {
            		errors.add("Le nom de l'algorithme de la colonne : " + dname + " n'est pas défini");
            	} if (!validateAlgorithmOUT(colonned)) {
            		errors.add("La sortie de l'algorithme n'est pas relié à sa colonne dérivée : " + dname);
            	} if (!validateAlgorithmIN(colonned, table)) {
            		errors.add("Les entrées de l'algorithme de " + dname + " n'existent pas dans la table : " + table.getNom());
            	} if (!validateAlgorithmRessourceExiste(colonned)) {
            		errors.add("La ressource de l'algorithme de la colonne " + dname + " n'existe pas\n"
            				+ "(Une ressource doit être le chemin depuis la racine du projet)");
            	} if (!validateAlgorithmLanguage(colonned)) {
            		errors.add("La ressource de l'algorithme de la colonne " + dname + " doit être du type du langage associé"
            				+ "\n(.py pour PYTHON et .calc pour le langage INTERNE)");
            	}
            
            // contraintes sur colonne étrangères
            } else if (colonne instanceof ColonneEtrangere) {
            	ColonneEtrangere ce = (ColonneEtrangere) colonne;
            	
            	if (!validateTableEtrangereExiste(ce)) {
            		errors.add("La table référencée de la colonne " + ce.getNom() + " n'existe pas" );
            	} if (!validateTableEtrangereDifferente(ce, table)) {
            		errors.add("La table référencée de la colonne " + ce.getNom() + " ne doit pas être celle dont elle provient"
            				+ "\n(vous pouvez utiliser une colonne dérivée pour ça)");
            	} if (!validateTableEtrangereColonneExiste(ce)) {
            		errors.add("La colonne référencée dans la table étrangère de " + ce.getNom() + " n'existe pas");
            	}
            	// TODO
            }
        }
        
        return errors;
    }
    
    
    /**
     * Main
     * Lance les tests sur un fichier en argument.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java SchemaTableValidator <path_to_xmi_file>");
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
        SchemaTablePackage.eINSTANCE.eClass();

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
        	System.err.println("Le fichier ne représente pas un schema table : \n"
        			+ e.getMessage());
        	return;
        }

        // Récupérer l'instance racine
        Table table = (Table) resource.getContents().get(0);

        System.out.println("Début de la vérification du fichier : " + file.toString());
        // Valider la table
        List<String> errors = validateTable(table);

        // Afficher les résultats
        if (errors.isEmpty()) {
            System.out.println("Le fichier est valide !");
        } else {
            System.out.println("Le fichier contient des erreurs :");
            errors.forEach(System.err::println);
        }
    }

}

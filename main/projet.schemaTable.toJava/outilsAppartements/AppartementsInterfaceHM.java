import java.util.*;

public class AppartementsInterfaceHM {

    public static void main(String[] argsMain) throws Exception {

		System.out.println("Pensez à bien importer les csv avant d'appeler toutes autres commandes");
        Scanner scanner = new Scanner(System.in);

		AppartementsDonnees donnees = (new AppartementsDonnees(new HashMap<String,List<Float>>(), "", new ArrayList<String>()));
		String[] args = new String[1+1];

        while (true) {
            // Afficher le menu
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Importer csv");
            System.out.println("2. Valider le csv");
			System.out.println("3. Calculer les colonnes dérivées");
			System.out.println("4. Exporter les données en csv");
			System.out.println("5. Visualiser les données avec un html");
            System.out.println("6. Quitter");
            System.out.print("Veuillez choisir une option (1/2/3/4/5/6) : ");

            // Lire l'option choisie par l'utilisateur
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
					System.out.println("Indiquer le chemin vers le csv : ");
					args[0] = scanner.next();
					System.out.println("Indiquer le chemin vers le csv de la colonne étrangère charges 2014 : ");
					args[1] = (scanner.next());
					donnees = (new AppartementsImporter()).importer(args);
                    break;
                case 2:
                    (new AppartementsVerifier()).verifierContraintes(donnees);
                    break;
				case 3:
                    donnees = (new AppartementsCalculAuto()).calculerColonnesDerivees(donnees);
                    break;
                case 4:
                    (new AppartementsExporter()).exporter(donnees.donneesJava, donnees.id, donnees.valeurs_id);
                    break;
				case 5:
                    (new AppartementsVisualisation()).toHTML(donnees.donneesJava, donnees.id, donnees.valeurs_id);
					Runtime.getRuntime().exec("firefox AppartementsTableau.html");
                    break;
                case 6:
                    System.out.println("Au revoir!\n");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Essayez à nouveau.");
            }
        }
    }


}



import java.io.*;
import java.util.*;

public class AppartementsImporter {


     // Fonction pour convertir une List<String> en List<Float>
     public static List<Float> stringListToFloatList(List<String> stringList) {
        List<Float> floatList = new ArrayList<>();
        
        for (String str : stringList) {
            try {
                // Convertir chaque chaîne en un float et ajouter à la liste
                floatList.add(Float.parseFloat(str));
            } catch (NumberFormatException e) {
                System.err.println("Données invalides dans le CSV (ne doit contenir que des float sauf pour la colonne identifiants) " + str);
                System.exit(1);
            }
        }
        
        return floatList;
    }

    public static AppartementsDonnees importer(String[] args) throws Exception {

		System.out.println("Début de l'importation des données");
		if (args.length != 1+1) {
			throw new Exception("Usage : java AppartementsVerifier <path_to_csv> <table_etr_1.csv> .. <table_etr_n.csv>");
		}

        // Chemin du fichier CSV passé en argument
        String fichierCsv = args[0];

        // HashMap pour stocker les données
        HashMap<String, List<String>> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fichierCsv))) {
            String ligne;
            String[] entetes = null;

            // Lire la première ligne (les noms des colonnes)
            if ((ligne = br.readLine()) != null) {
                entetes = ligne.split(","); 
                for (String entete : entetes) {
                    map.put(entete, new ArrayList<>());
                }
            }

            // Lire les lignes suivantes et les ajouter à la HashMap
            while ((ligne = br.readLine()) != null) {
                String[] valeurs = ligne.split(",");

                for (int i = 0; i < entetes.length; i++) {
                    map.get(entetes[i]).add(valeurs[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("CSV invalide : toutes les colonnes doivent avoir la même taille");
		}
	
		// Les colonnes du schémaTable
		List<String> colonnesTable = new LinkedList<>();
		Collections.addAll(colonnesTable,  "N° appartements", "surface","" );
		colonnesTable.remove("");

		// ajout des colonnes étrangères
		String te_charges = args[1];
		
		List<String> elt_ce = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(te_charges))) {
            String ligne;
            String[] entetes = null;

            // Lire la première ligne pour connaitre l'indice de la colonne dans la table etrangere

			int indice_etr = 0;
            if ((ligne = br.readLine()) != null) {
                entetes = ligne.split(",");
				int i = 0;
                for (String nom_c : entetes) {
                    if (nom_c.equals("2014")) {
						indice_etr = i;
					}
					i++;
                }
            }

            // Lire les lignes suivantes et les ajouter à la HashMap
            while ((ligne = br.readLine()) != null) {
                String[] valeurs = ligne.split(",");
				elt_ce.add(valeurs[indice_etr]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("CSV invalide : toutes les colonnes doivent avoir la même taille");
		}

		map.put("charges 2014", elt_ce);
		colonnesTable.add("charges 2014");

		// Validité du CSV
		for (String str : colonnesTable) {
			if (!(map.keySet().contains(str))) {
				throw new Exception("CSV invalide : le csv ne correspond pas au schematable Appartements");
			}
		}

		for (String str : map.keySet()) {
			if (!(colonnesTable.contains(str))) {
				throw new Exception("CSV invalide : le csv ne correspond pas au schematable Appartements");
			}
		}
		String id = "N° appartements";
		List<String> valeurs_id = map.remove("N° appartements");
	
		// on vérifie qu'il n'y a pas 2 fois le meme nom
		Set<String> set_id = new HashSet<>(valeurs_id);
    	if (set_id.size() != valeurs_id.size()) {
			throw new Exception("CSV invalide : il ne peut y avoir deux instances d'un même identifiant dans la colonne identifiants");
		}

		HashMap<String, List<Float>> donneesJava = new HashMap<>();
		for (String cle : map.keySet()){
			donneesJava.put(cle,stringListToFloatList(map.get(cle)));
		}

		// on vérifie que toutes les colonnes ont la bonne taille
		for (List<Float> colonnevaleurs : donneesJava.values()) {
			if (colonnevaleurs.size() != valeurs_id.size()) {
				throw new Exception("CSV invalide : toutes les colonnes doivent avoir la même taille");
			}
		} 
	
		// System.out.println(donneesJava.toString() + id + valeurs_id);
		return new AppartementsDonnees(donneesJava, id, valeurs_id);
    }

}

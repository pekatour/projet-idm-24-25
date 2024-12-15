import java.io.*;
import java.util.*;

public class exempleImporter {


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

    public static exempleDonnees importer(String[] args) throws Exception {

        // Chemin du fichier CSV passé en argument
        String fichierCsv = args[0];

        // HashMap pour stocker les données
        Map<String, List<String>> map = new HashMap<>();

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
        }
	
	// Les colonnes du schémaTable
	List<String> colonnesTable = new LinkedList<>();
	Collections.addAll(colonnesTable,  "joliecolonne", "oui","" );
	colonnesTable.remove("");
	
	// Validité du CSV
	for (String str : colonnesTable) {
		if (!(map.keySet().contains(str))) {
			throw new Exception("CSV invalide");
		}
	}

	for (String str : map.keySet()) {
		if (!(colonnesTable.contains(str))) {
			throw new Exception("CSV invalide");
		}
	}
	String id = "oui";
	List<String> valeurs_id = map.remove("oui");
	
	Map<String, List<Float>> donneesJava = new HashMap<>();
	for (String cle : map.keySet()){
		donneesJava.put(cle,stringListToFloatList(map.get(cle)));
	}
	
	// System.out.println(donneesJava.toString() + id + valeurs_id);
	return new exempleDonnees(donneesJava,id, valeurs_id);
    }

}

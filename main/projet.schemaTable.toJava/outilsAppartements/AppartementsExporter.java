import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AppartementsExporter {

    /**
     * Crée un fichier .csv comportant les données
     * @param donneesJava   issues de l'import d'un csv (HashMap)
     * @param id            le nom de la colonne identitée
     * @param valeurs_id    les valeurs de la colonne identitée
     */
    public static void exporter(HashMap<String, List<Float>> donneesJava, String id, List<String> valeurs_id) {
        String fileName = "AppartementsExport.csv";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            
            writer.write(id); // Nom de la colonne identitée
            for (String key : donneesJava.keySet()) {
                writer.write("," + key); // Nom des autres colonnes
            }
            writer.newLine(); // Nouvelle ligne après l'en-tête
            
            // Ecrire les valeurs des lignes
            for (String valueId : valeurs_id) {
                writer.write(valueId);
                
                for (String key : donneesJava.keySet()) {
                    List<Float> valeurs = donneesJava.get(key);
                    // Trouver l'indice de valueId dans valeurs_id et récupérer la valeur correspondante
                    int index = valeurs_id.indexOf(valueId);
                    if (index != -1 && index < valeurs.size()) {
                        writer.write("," + valeurs.get(index));
                    } else {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }

            System.out.println("Fichier CSV créé avec succès : " + fileName);
            
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erreur lors de l'export du fichier CSV.");
        }
    }

	// Exemple
    public static void main(String[] args) {
        HashMap<String, List<Float>> donneesJava = new HashMap<>();
        donneesJava.put("Colonne1", List.of(1.1f, 2.2f, 3.3f));
        donneesJava.put("Colonne2", List.of(4.4f, 5.5f, 6.6f));
        List<String> valeurs_id = List.of("ID1", "ID2", "ID3");

        exporter(donneesJava, "Identifiant", valeurs_id);
    }
}

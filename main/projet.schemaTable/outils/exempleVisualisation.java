import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class exempleVisualisation {
	
	/**
	 * Créer un fichier .html affichant les données
	 * @param donneesJava   issues de l'import d'un csv
	 * @param id            le nom de la colonne identitée
	 * @param valeurs_id    les valeurs de la colonne identitée
	 */
	public static void toHTML(HashMap<String, List<Float>> donneesJava, String id, List<String> valeurs_id) {
        try {
            FileWriter writer = new FileWriter("exempleTableau.html");

            // Début du fichier
            writer.write("<html><head><title>exemple</title></head><body>");
            writer.write("<h1>exemple</h1>");
            writer.write("<table border='1'>");

            // en-tête du tableau
            writer.write("<tr><th>" + id + "</th>");
            for (String key : donneesJava.keySet()) {
                writer.write("<th>" + key + "</th>");
            }
            writer.write("</tr>");

            // lignes du tableau
            for (int i = 0; i < valeurs_id.size(); i++) {
                writer.write("<tr>");
                // Afficher la valeur de la colonne d'identité
                writer.write("<td>" + valeurs_id.get(i) + "</td>");
                // Afficher les autres données pour chaque ligne
                for (String key : donneesJava.keySet()) {
                    List<Float> dataList = donneesJava.get(key);
                    if (dataList.size() > i) {
                        writer.write("<td>" + dataList.get(i) + "</td>");
                    } else {
                        writer.write("<td></td>");
                    }
                }
                writer.write("</tr>");
            }

            // Fin du fichier HTML
            writer.write("</table>");
            writer.write("</body></html>");
            writer.close();

            System.out.println("Le fichier HTML a été généré avec succès : exempleTableau.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	/**
	 * Main pour tester un exemple
	 */
	public static void main(String[] args) {
        HashMap<String, List<Float>> donneesJava = new HashMap<>();
        donneesJava.put("loyer / mois", Arrays.asList(400f, 290f, 590f));
        donneesJava.put("surface (m²)", Arrays.asList(25f, 3f, 400f));
        donneesJava.put("charges / mois", Arrays.asList(30f, 4f, 600f));

        toHTML(donneesJava, "Identité", Arrays.asList("appart 1", "appart 2", "appart 3"));
    }
}

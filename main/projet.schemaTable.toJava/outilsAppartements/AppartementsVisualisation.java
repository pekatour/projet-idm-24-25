import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class AppartementsVisualisation {
	
	public static void toHTML(HashMap<String, List<Float>> donneesJava, String id, List<String> valeurs_id) {
        try {
            FileWriter writer = new FileWriter("AppartementsTableau.html");

            // Début du fichier
            writer.write("<html><head><title>Appartements</title></head><body>");
            writer.write("<h1>Appartements</h1>");
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

            System.out.println("Le fichier HTML a été généré avec succès : AppartementsTableau.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	/**
	 * Main pour tester un exemple
	 */
	public static void main(String[] args) throws Exception {
        
		AppartementsDonnees donnees = (new AppartementsImporter()).importer(args);
		//(new AppartementsVerifier()).verifierContraintes(donnees);
        toHTML(donnees.donneesJava, donnees.id, donnees.valeurs_id);
    }
}

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

//import projet.calcul.toPython.src.projet.calcul.toPython.main.ToPython;

public class AppartementsVerifier {

	public static List<String> lireArguments(String cheminFichier) throws Exception {
        List<String> liste = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] elements = ligne.split(",");
                for (String element : elements) {
                    // Ajouter l'élément à la liste, en ignorant les chaînes vides si nécessaire
                    if (!element.isEmpty()) {
                        liste.add(element);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return liste;
    }

	public static List<Float> lireData() {
        List<Float> floatList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line = reader.readLine();
            
            if (line != null && !line.trim().isEmpty()) {
                // Supprimer les crochets et parse la chaîne par virgule + espace
                line = line.trim();
                if (line.startsWith("[") && line.endsWith("]")) {
                    line = line.substring(1, line.length() - 1);
                }
                
                String[] values = line.split(", ");
                
                for (String value : values) {
                    try {
                        floatList.add(Float.parseFloat(value.trim()));
                    } catch (NumberFormatException e) {
                        System.err.println("Erreur de format dans la ligne: " + value);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }

        return floatList;
    }

	public static boolean verifierContraintes(AppartementsDonnees donnees) throws IOException, InterruptedException, Exception {
		boolean b = true;
		List<String> errors = new ArrayList<>();

			String path = "/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/superieur_a_9.calc";
			String commandToPython = "/usr/lib/jvm/java-17-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -classpath /mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.annotation.versioning_1.1.2.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.annotation.bundle_2.0.0.202202082230.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.component.annotations_1.5.1.202212101352.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.metatype.annotations_1.4.1.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.runtime_3.29.0.v20230726-0617.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.osgi_3.18.500.v20230801-1826.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.osgi.compatibility.state_1.2.800.v20221116-1440.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.common_3.18.100.v20230730-1117.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.jobs_3.15.0.v20230808-1403.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.registry_3.11.300.v20230801-1826.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.preferences_3.10.300.v20230630-1303.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.prefs_1.1.2.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.contenttype_3.9.100.v20230630-1232.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.app_1.6.300.v20230630-1303.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.ecore_2.35.0.v20230829-0934.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.common_2.29.0.v20230810-0713.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.ecore.xmi_2.35.0.v20230801-1141.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl_3.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/lpg.runtime.java_2.0.17.v201004271640.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl.common_1.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl.ecore_3.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.common_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.model_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.profiler_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.engine_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.codegen.ecore_2.35.0.v20230801-1141.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.codegen_2.23.0.v20230211-1150.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/com.google.guava_32.1.2.jre.jar:/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/bin:/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.calcul.toPython/bin -XX:+ShowCodeDetailsInExceptionMessages projet.calcul.toPython.main.ToPython /home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/superieur_a_9.calc .";
			Process prArgs = Runtime.getRuntime().exec(commandToPython);
			prArgs.waitFor();
			path = "./calcul.py";
			System.out.println("Vérification des contraintes de " + "surface minimal requise");
			//TimeUnit.MILLISECONDS.sleep(500); // (solution d'urgence) pour attendre le référencement du fichier au niveau de la table des fichiers
			List<String> args = lireArguments("arguments.txt");
			String[] command = {"python3", path, args.get(0).toString(), donnees.getDataToString("surface")}; // + " > data.txt"; 
			//System.out.println("Commande Python : " + String.join(" ", command));

			ProcessBuilder builder = new ProcessBuilder(command);
        	builder.redirectErrorStream(true);  // Redirige les erreurs vers la sortie standard
        	Process pr = builder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
        	while ((line = reader.readLine()) != null) {
            	System.out.println(line); // lire la sortie du process
        	}
			pr.waitFor();
			// il faut lire la data
			List<Float> dataFloat = lireData();
			
			// vérifier qu'il y a que des 0 (si non: b <- faux et print erreur sur le nom de l'algo)
			int i = 1; 
			for (Float value : dataFloat) {
				if (value <= 0f) {
					b = false;
					errors.add("La contrainte surface minimal requise n'est pas validé à la ligne : " + i);
				}
				i++;
			}
			
			// remove la data + remove les arguments
			Runtime.getRuntime().exec("rm data.txt arguments.txt calcul.py");

		if (!b) {
			System.out.println("La table ne vérifie pas les contraintes :");
        	errors.forEach(System.err::println);
		} else {
			System.out.println("La table vérifie toute les contraintes");
		}

		return b;
	}

	public static void main(String args[]) throws IOException, InterruptedException, Exception {
		// Exemple d'appel
		/*HashMap<String, List<Float>> donneesJava = new HashMap<>();
        donneesJava.put("loyer", Arrays.asList(400f, 290f, 590f));
        donneesJava.put("surface", Arrays.asList(25f, 10f, 400f));

		verifierContraintes(new AppartementsDonnees(donneesJava, "Identité", Arrays.asList("appart 1", "appart 2", "appart 3"))); */


		AppartementsDonnees donnees = (new AppartementsImporter()).importer(args);
		verifierContraintes(donnees);
	}
}


import java.io.*;
import java.util.*;

public class AppartementsCalculAuto {

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

	public static AppartementsDonnees calculerColonnesDerivees(AppartementsDonnees donnees) throws IOException, InterruptedException, Exception {
		
		// Récupérer les colonnes des tables étrangères
		// (les ajouter aux donnees)
		// à faire dans Importer et appeler dans le main avant d'utiliser

		// Récupérer les colonnes dérivées et trouver l'ordre de maj
		HashMap<String,Boolean> c_der = new HashMap<String,Boolean>();
		c_der.put("loyer9",false);
		c_der.put("loyer",false);
		c_der.put("loyer3",false);
		
		// Générer les (avec toPython) calcul(i).py et arguments(i).txt pour ne pas générer 2 python identiques
		HashMap<String,String> assoc_ressource_newressource = new HashMap<String,String>();
		HashMap<String,String> assoc_der_newressource = new HashMap<String,String>();
		if (!assoc_ressource_newressource.keySet().contains("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc")) {
			assoc_der_newressource.put("loyer9","loyer9");
			assoc_ressource_newressource.put("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc","loyer9");

			String commandToPythonloyer9 = "/usr/lib/jvm/java-17-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -classpath /mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.annotation.versioning_1.1.2.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.annotation.bundle_2.0.0.202202082230.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.component.annotations_1.5.1.202212101352.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.metatype.annotations_1.4.1.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.runtime_3.29.0.v20230726-0617.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.osgi_3.18.500.v20230801-1826.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.osgi.compatibility.state_1.2.800.v20221116-1440.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.common_3.18.100.v20230730-1117.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.jobs_3.15.0.v20230808-1403.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.registry_3.11.300.v20230801-1826.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.preferences_3.10.300.v20230630-1303.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.prefs_1.1.2.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.contenttype_3.9.100.v20230630-1232.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.app_1.6.300.v20230630-1303.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.ecore_2.35.0.v20230829-0934.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.common_2.29.0.v20230810-0713.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.ecore.xmi_2.35.0.v20230801-1141.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl_3.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/lpg.runtime.java_2.0.17.v201004271640.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl.common_1.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl.ecore_3.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.common_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.model_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.profiler_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.engine_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.codegen.ecore_2.35.0.v20230801-1141.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.codegen_2.23.0.v20230211-1150.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/com.google.guava_32.1.2.jre.jar:/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/bin:/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.calcul.toPython/bin -XX:+ShowCodeDetailsInExceptionMessages projet.calcul.toPython.main.ToPython /home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc .";
			Process prArgsloyer9 = Runtime.getRuntime().exec(commandToPythonloyer9);
			prArgsloyer9.waitFor();
			Process prRenameCalcloyer9 = Runtime.getRuntime().exec("mv ./calcul.py ./calculloyer9.py");
			prRenameCalcloyer9.waitFor();
			Process prRenameArgsloyer9 = Runtime.getRuntime().exec("mv ./arguments.txt ./argumentsloyer9.txt");
			prRenameArgsloyer9.waitFor();
		} else {
			assoc_der_newressource.put("loyer9",assoc_ressource_newressource.get("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc"));
			assoc_ressource_newressource.put("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc",assoc_ressource_newressource.get("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc"));
		}
		if (!assoc_ressource_newressource.keySet().contains("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc")) {
			assoc_der_newressource.put("loyer","loyer");
			assoc_ressource_newressource.put("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc","loyer");

			String commandToPythonloyer = "/usr/lib/jvm/java-17-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -classpath /mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.annotation.versioning_1.1.2.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.annotation.bundle_2.0.0.202202082230.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.component.annotations_1.5.1.202212101352.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.metatype.annotations_1.4.1.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.runtime_3.29.0.v20230726-0617.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.osgi_3.18.500.v20230801-1826.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.osgi.compatibility.state_1.2.800.v20221116-1440.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.common_3.18.100.v20230730-1117.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.jobs_3.15.0.v20230808-1403.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.registry_3.11.300.v20230801-1826.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.preferences_3.10.300.v20230630-1303.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.osgi.service.prefs_1.1.2.202109301733.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.core.contenttype_3.9.100.v20230630-1232.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.equinox.app_1.6.300.v20230630-1303.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.ecore_2.35.0.v20230829-0934.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.common_2.29.0.v20230810-0713.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.ecore.xmi_2.35.0.v20230801-1141.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl_3.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/lpg.runtime.java_2.0.17.v201004271640.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl.common_1.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.ocl.ecore_3.18.0.v20221201-0557.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.common_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.model_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.profiler_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.acceleo.engine_3.7.9.201911060712.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.codegen.ecore_2.35.0.v20230801-1141.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/org.eclipse.emf.codegen_2.23.0.v20230211-1150.jar:/mnt/n7fs/ens/tp_dupont/modelling-2023-09/eclipse/plugins/com.google.guava_32.1.2.jre.jar:/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/bin:/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.calcul.toPython/bin -XX:+ShowCodeDetailsInExceptionMessages projet.calcul.toPython.main.ToPython /home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc .";
			Process prArgsloyer = Runtime.getRuntime().exec(commandToPythonloyer);
			prArgsloyer.waitFor();
			Process prRenameCalcloyer = Runtime.getRuntime().exec("mv ./calcul.py ./calculloyer.py");
			prRenameCalcloyer.waitFor();
			Process prRenameArgsloyer = Runtime.getRuntime().exec("mv ./arguments.txt ./argumentsloyer.txt");
			prRenameArgsloyer.waitFor();
		} else {
			assoc_der_newressource.put("loyer",assoc_ressource_newressource.get("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc"));
			assoc_ressource_newressource.put("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc",assoc_ressource_newressource.get("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc"));
		}
		if (!assoc_ressource_newressource.keySet().contains("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.py")) {
			assoc_der_newressource.put("loyer3","loyer3");
			assoc_ressource_newressource.put("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.py","loyer3");

		} else {
			assoc_der_newressource.put("loyer3",assoc_ressource_newressource.get("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.py"));
			assoc_ressource_newressource.put("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.py",assoc_ressource_newressource.get("/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.py"));
		}

		String line;
		int max_iter = 100;
		int iter = 0;

		while (iter < max_iter && c_der.values().stream().anyMatch(b -> !b)) {
		if (!c_der.get("loyer9")) { // est-ce que la colonne est déjà calculée
			List<String> c_der_entree = new ArrayList<String>();
			c_der_entree.add("loyer3");
			// tester si il y a une colonne de c_der_entree dans les c_der à false
			for (String nom_entree : c_der_entree) {
				if ((!c_der.keySet().contains(nom_entree)) || (c_der.keySet().contains(nom_entree) && c_der.get(nom_entree))) {
					// calculer la colonne c_der (executer le .py)
					
					c_der.replace("loyer9",false,true);
					String pathCalculloyer9 = "./calcul" + assoc_der_newressource.get("loyer9") + ".py";
					String pathArgsPyloyer9 = "/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc";
					List<String> args = lireArguments("arguments" + assoc_der_newressource.get("loyer9") + ".txt");
					String[] commandloyer9 = {"python3", pathCalculloyer9, args.get(0).toString(), donnees.getDataToString("loyer3")}; // + " > data.txt"; 

					ProcessBuilder builderloyer9 = new ProcessBuilder(commandloyer9);
			        builderloyer9.redirectErrorStream(true);  // Redirige les erreurs vers la sortie standard
			        Process prloyer9 = builderloyer9.start();
					BufferedReader readerloyer9 = new BufferedReader(new InputStreamReader(prloyer9.getInputStream()));
					
			        while ((line = readerloyer9.readLine()) != null) {
			           	System.out.println(line); // lire la sortie du process
			        }
					prloyer9.waitFor();

					List<Float> valeurs_loyer9 = lireData();
					Process prCleanloyer9 = Runtime.getRuntime().exec("rm data.txt");
					prCleanloyer9.waitFor();

					// remove les calculs

					donnees.donneesJava.put("loyer9",valeurs_loyer9);

				} // sinon : il y en a un autre à calculer avant... (pas de code à écrire)
			}
			
		}
		if (!c_der.get("loyer")) { // est-ce que la colonne est déjà calculée
			List<String> c_der_entree = new ArrayList<String>();
			c_der_entree.add("surface");
			// tester si il y a une colonne de c_der_entree dans les c_der à false
			for (String nom_entree : c_der_entree) {
				if ((!c_der.keySet().contains(nom_entree)) || (c_der.keySet().contains(nom_entree) && c_der.get(nom_entree))) {
					// calculer la colonne c_der (executer le .py)
					
					c_der.replace("loyer",false,true);
					String pathCalculloyer = "./calcul" + assoc_der_newressource.get("loyer") + ".py";
					String pathArgsPyloyer = "/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.calc";
					List<String> args = lireArguments("arguments" + assoc_der_newressource.get("loyer") + ".txt");
					String[] commandloyer = {"python3", pathCalculloyer, args.get(0).toString(), donnees.getDataToString("surface")}; // + " > data.txt"; 

					ProcessBuilder builderloyer = new ProcessBuilder(commandloyer);
			        builderloyer.redirectErrorStream(true);  // Redirige les erreurs vers la sortie standard
			        Process prloyer = builderloyer.start();
					BufferedReader readerloyer = new BufferedReader(new InputStreamReader(prloyer.getInputStream()));
					
			        while ((line = readerloyer.readLine()) != null) {
			           	System.out.println(line); // lire la sortie du process
			        }
					prloyer.waitFor();

					List<Float> valeurs_loyer = lireData();
					Process prCleanloyer = Runtime.getRuntime().exec("rm data.txt");
					prCleanloyer.waitFor();

					// remove les calculs

					donnees.donneesJava.put("loyer",valeurs_loyer);

				} // sinon : il y en a un autre à calculer avant... (pas de code à écrire)
			}
			
		}
		if (!c_der.get("loyer3")) { // est-ce que la colonne est déjà calculée
			List<String> c_der_entree = new ArrayList<String>();
			c_der_entree.add("loyer");
			// tester si il y a une colonne de c_der_entree dans les c_der à false
			for (String nom_entree : c_der_entree) {
				if ((!c_der.keySet().contains(nom_entree)) || (c_der.keySet().contains(nom_entree) && c_der.get(nom_entree))) {
					// calculer la colonne c_der (executer le .py)
					
					c_der.replace("loyer3",false,true);
					String pathCalculloyer3 = "./calcul" + assoc_der_newressource.get("loyer3") + ".py";
					String pathArgsPyloyer3 = "/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.py";
					List<String> args = lireArguments(pathArgsPyloyer3.substring(0,pathArgsPyloyer3.length() - 3) + ".txt");
					String[] commandloyer3 = {"python3", "/home/tkn7092/2A/IDM/projet-idm-24-25/main/projet.schemaTable/Exemples/fois3.py", args.get(0).toString(), donnees.getDataToString("loyer")}; // + " > data.txt"; 

					ProcessBuilder builderloyer3 = new ProcessBuilder(commandloyer3);
			        builderloyer3.redirectErrorStream(true);  // Redirige les erreurs vers la sortie standard
			        Process prloyer3 = builderloyer3.start();
					BufferedReader readerloyer3 = new BufferedReader(new InputStreamReader(prloyer3.getInputStream()));
					
			        while ((line = readerloyer3.readLine()) != null) {
			           	System.out.println(line); // lire la sortie du process
			        }
					prloyer3.waitFor();

					List<Float> valeurs_loyer3 = lireData();
					Process prCleanloyer3 = Runtime.getRuntime().exec("rm data.txt");
					prCleanloyer3.waitFor();

					// remove les calculs

					donnees.donneesJava.put("loyer3",valeurs_loyer3);

				} // sinon : il y en a un autre à calculer avant... (pas de code à écrire)
			}
			
		}
		iter++;
		}

		if (iter == max_iter) {
			System.out.println("Toutes les colonnes n'ont pas pu être calculé \nIl doit y avoir présence d'un cycle entre les colonnes dérivées");
		} else {
			System.out.println("Les colonnes dérivées ont été calculées avec succès");
		}

		return donnees;
	}

	public static void main(String args[]) throws IOException, InterruptedException, Exception {
		
		AppartementsDonnees donnees = (new AppartementsImporter()).importer(args);
		// on pourrait vérifier les donnees ici
		AppartementsDonnees donneesCalculees = calculerColonnesDerivees(donnees);
		// pour afficher les nouvelles valeurs
		(new AppartementsVisualisation()).toHTML(donnees.donneesJava, donnees.id, donnees.valeurs_id);
		(new AppartementsExporter()).exporter(donnees.donneesJava, donnees.id, donnees.valeurs_id);
	}
}


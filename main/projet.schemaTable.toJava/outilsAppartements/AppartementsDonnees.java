import java.util.*;

public class AppartementsDonnees {
	public HashMap<String, List<Float>> donneesJava;
	public String id;
	public List<String> valeurs_id;

	public AppartementsDonnees(HashMap<String, List<Float>> donneesJava, String id, List<String> valeurs_id) {
		this.donneesJava = donneesJava;
		this.id = id;
		this.valeurs_id = valeurs_id;
	}

	public String getDataToString(String cle) {
		String r = "[";
		for (Float f : donneesJava.get(cle)) {
			r = r + f + ",";
		}
		r = r.substring(0,r.length()-1);
		return r + "]";
	}

}

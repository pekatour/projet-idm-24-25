import java.util.*;

public class exempleDonnees {
	public Map<String, List<Float>> donneesJava;
	public String id;
	public List<String> valeurs_id;

	public exempleDonnees(Map<String, List<Float>> donneesJava, String id, List<String> valeurs_id) {
		this.donneesJava = donneesJava;
		this.id = id;
		this.valeurs_id = valeurs_id;
	}

}

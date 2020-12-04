package aprojektwoche.model;

import java.util.ArrayList;

public enum PieceName {
	
	KLAVIERTRIO_ESDUR("Klaviertrio Es-Dur, op. 100 (D929)", new String[] { 
			"Klaviertrio", "op 100", "Franz Schubert", "Es-Dur"}),
	SPIEGEL("Spiegel im Spiegel", new String[] {"Spiegel im Spiegel", "Arvo Pärt", "F-Dur"});

	private final String name;
	private ArrayList<String> keywords = new ArrayList<String>();
	
	private PieceName(String name, String[] keywords) {
		this.name = name;
		
		for (String keyword : keywords) {
			this.keywords.add(keyword);
		}
	}

	public String getName() {
		return this.name;
	}
	
	public ArrayList<String> getKeywords() {
		ArrayList<String> keywordsOut = this.keywords;		
		return keywordsOut;
	}
	
	
}

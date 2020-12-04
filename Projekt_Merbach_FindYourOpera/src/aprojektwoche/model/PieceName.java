package aprojektwoche.model;

import java.util.ArrayList;

public enum PieceName {
	
	KLAVIERTRIO_ESDUR_SCHUBERT("Klaviertrio Es-Dur, op. 100 (D929)", new String[] { 
			"franz", "schubert", "klaviertrio", "d929", "100", "es-dur"}),
	SPIEGEL_PAERT("Spiegel im Spiegel", new String[] {"arvo", "pärt", "spiegel", "f-dur"}),
	KLAVIERKONZERT_AMOL_SCHUMANN("Klavierkonzert a-Moll, op. 7", new String[] 
			{"clara", "schumann", "klavierkonzert", "a-moll"}),
	SEPT_PAPILLONS("Sept papillons", new String[] {"kaija", "saariaho", "sept", "papillons"}),
	CELLOKONZERT_UN_SUK("Konzert für Violoncello und Orchester", new String[] {"chin", "un-suk", "cellokonzert"});

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

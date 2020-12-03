package aprojektwoche.model;

public enum PieceName {
	
	KLAVIERTRIO_ESDUR("Klaviertrio Es-Dur, op. 100 (D929)", new String[] 
			{"Klaviertrio", "Piano Trio", "100", "Franz Schubert", "Es-Dur"}),
	SPIEGEL("Spiegel im Spiegel", new String[] {"Spiegel im Spiegel", "Arvo Pärt", "F-Dur"});

	private final String name;
	private final String[] keywords;
	
	private PieceName(String name, String[] keywords) {
		this.name = name;
		this.keywords = keywords;
	}

	public String getName() {
		return this.name;
	}
	
	public String[] getKeywords() {
		String[] keywords = this.keywords;		
		return keywords;
	}
	
	
}

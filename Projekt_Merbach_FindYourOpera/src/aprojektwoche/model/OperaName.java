package aprojektwoche.model;

public enum OperaName {
	
	MEISTERSINGER("Die Meistersinger von Nürnberg", new String[] 
			{ "meistersinger", "nürnberg", "nuernberg" }), 
	RUSALKA("Rusalka", new String[] {"rusalka", "arielle", "dvorak"}), 
	HUMAINE("La Voix Humaine", new String[] {"voix", "humaine", "poulenc"});
	
	private final String name;
	private final String[] keywords;
	
	private OperaName(String name, String[] keywords) {
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

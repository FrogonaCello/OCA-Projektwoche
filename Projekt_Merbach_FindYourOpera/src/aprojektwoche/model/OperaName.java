package aprojektwoche.model;

import java.util.ArrayList;

public enum OperaName {
	
	MEISTERSINGER("Die Meistersinger von Nürnberg", new String[] 
			{ "meistersinger", "nürnberg", "nuernberg" }), 
	RUSALKA("Rusalka", new String[] {"rusalka", "arielle", "dvorak"}), 
	HUMAINE("La Voix Humaine", new String[] {"voix", "humaine", "poulenc"});
	
	private final String name;
	private ArrayList<String> keywords = new ArrayList<String>();;
	
	private OperaName(String name, String[] keywords) {
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

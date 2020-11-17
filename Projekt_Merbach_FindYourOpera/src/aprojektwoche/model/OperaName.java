package aprojektwoche.model;

public enum OperaName {
	
	MEISTERSINGER("Die Meistersinger von Nürnberg"), RUSALKA("Rusalka"), HUMAINE("La Voix Humaine");
	
	private final String name;
	
	private OperaName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}

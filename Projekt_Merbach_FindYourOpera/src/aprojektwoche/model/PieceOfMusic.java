package aprojektwoche.model;

public class PieceOfMusic extends Composer implements Performable{

	private Composer composer;
	private PieceName pieceName;
	private String[] keywords;
	
	
	
	public Composer getComposer() {
		return composer;
	}

	public void setComposer(Composer composer) {
		this.composer = composer;
	}

	public PieceName getPieceName() {
		return pieceName;
	}

	public void setPieceName(PieceName pieceName) {
		this.pieceName = pieceName;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	
	// Konstruktor
	
	public PieceOfMusic(Composer composer, PieceName name) {
		this.setComposer(composer);
		this.setPieceName(name);
		
		// Keywords Array wird aus dem Datensatz des gewählten Stücks geholt
		this.setKeywords(name.getKeywords());
	}
	
	// toString()

	public String toString() {
	
		String output = this.getPieceName().getName() + " by " +  this.getComposer();
		
		return output;
	}
	
	// überschriebene Methoden aus Performables

	@Override
	public String[] getPerformablesKeywords() {
		String[] keywords = this.getKeywords();
		return keywords;
	}

	@Override
	public String getPerformablesName() {
		String name = this.getPieceName().getName();
		return name;
	}

}

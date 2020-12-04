package aprojektwoche.model;

import java.util.ArrayList;

public class PieceOfMusic extends Composer implements Performable{

	private Composer composer;
	private PieceName pieceName;
	private ArrayList<String> keywordsList;
	
	
	
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

	public ArrayList<String> getKeywordsList() {
		return keywordsList;
	}

	public void setKeywordsList(ArrayList<String> keywords) {
		this.keywordsList = keywords;
	}
	
	// Konstruktor
	
	public PieceOfMusic(Composer composer, PieceName name) {
		this.setComposer(composer);
		this.setPieceName(name);
		
		// Keywords Array wird aus dem Datensatz des gewählten Stücks geholt
		this.setKeywordsList(name.getKeywords());
	}
	
	// toString()

	public String toString() {
	
		String output = this.getPieceName().getName() + " by " +  this.getComposer();
		
		return output;
	}
	
	// überschriebene Methoden aus Performables

	@Override
	public ArrayList<String> getPerformablesKeywords() {
		ArrayList<String> keywords = this.getKeywordsList();
		return keywords;
	}

	@Override
	public String getPerformablesName() {
		String name = this.getPieceName().getName();
		return name;
	}

}

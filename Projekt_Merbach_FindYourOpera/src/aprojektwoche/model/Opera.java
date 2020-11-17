package aprojektwoche.model;

import java.time.LocalDate;
import java.time.Year;

public class Opera extends Composer implements Performable{
	
	// Attribute
	
	private Composer composer;
	private OperaName operaName;
	private Year year;
	private LocalDate version;
	private String[] keywords;
	private StringBuilder information;
	
	// Getter/Setter
	
	public Composer getComposer() {
		return this.composer;
	}
	
	public void setComposer(Composer composer) {
		this.composer = composer;
	}
	
	public OperaName getOperaName() {
		return this.operaName;
	}
	
	public void setOperaName(OperaName name) {
		this.operaName = name;
	}
	
	public Year getYear() {
		return this.year;
	}
	
	public void setYear(Year year) {
		this.year = year;
	}
	
	public LocalDate getVersion() {
		return this.version;
	}
	
	public void setVersion(LocalDate version) {
		this.version = version;
	}
	
	public String[] getKeywords() {
		return this.keywords;
	}
	
	public void setKeyword(String[] keywords) {
		this.keywords = keywords;
	}
	
	public StringBuilder getInformation() {
		return this.information;
	}
	
	public void setInformation(StringBuilder information) {
		this.information = information;
	}
	
	// Konstruktor
	
	public Opera(Composer composer, OperaName name, Year year, LocalDate version, String[] keywords, StringBuilder information) {
	this.setComposer(composer);
	this.setOperaName(name);
	
	// if year or version is not known, then year won´t be initialised
	if (year != null) this.setYear(year);
	if (version != null) this.setVersion(version);
	
	this.setKeyword(keywords);
	this.setInformation(information);
	
	}
	
	// toString()
	
	public String toString() {
		String output = this.getOperaName().getName() + " by " + this.getComposer();
		
		// Output won´t include year or version, if they are not initialised
		
		if (this.getYear() != null) {
			output += " from " + this.getYear() ;
		}
		
		if (this.getVersion() != null) {
			output += ", version: " + this.getVersion().format(FormatDateTime.date_tf);
		}
		
		output += "\nFurther information: \n" + this.getInformation();
		
		return output;
	}

	// Interface Methode
	@Override
	public String[] getPerformablesKeywords() {
		String[] keywords = this.getKeywords();
		return keywords;
	}

	@Override
	public String getPerformablesName() {
		String name = this.getOperaName().getName();
		return name;
	}
	

}

package aprojektwoche.model;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Opera extends Composer implements Performable{
	
	// Attribute
	
	private Composer composer;
	private OperaName operaName;
	private Year year;
	private LocalDate version;
	private ArrayList<String> keywords;
	private StringBuilder info;
	
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
	
	public ArrayList<String> getKeywords() {
		return this.keywords;
	}
	
	public void setKeyword(ArrayList<String> keywords) {
		this.keywords = keywords;
	}
	
	public StringBuilder getInfo() {
		return this.info;
	}
	
	public void setInfo(StringBuilder information) {
		this.info = information;
	}
	
	// Konstruktor
	
	public Opera(Composer composer, OperaName name, Year year, LocalDate version, StringBuilder information) {
	this.setComposer(composer);
	this.setOperaName(name);
	
	// if year or version is not known, then year won´t be initialised
	if (year != null) this.setYear(year);
	if (version != null) this.setVersion(version);
	
	// Array of keywords belongs to each enum OperaName
	this.setKeyword(name.getKeywords());
	this.setInfo(information);
	
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
		
		output += "\nFurther information: \n" + this.getInfo();
		
		return output;
	}

	// Interface Methode
	@Override
	public ArrayList<String> getPerformableKeywords() {
		ArrayList<String> keywords = this.getKeywords();
		return keywords;
	}

	@Override
	public String getPerformableName() {
		String name = this.getOperaName().getName();
		return name;
	}
	

}

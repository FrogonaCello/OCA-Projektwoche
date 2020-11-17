package aprojektwoche.model;

public class Address {
	
	// Attribute
	
	private String street;
	private int streetNumber;
	private int zip;
	private String town;
	
	// Getter/Setter
	
	public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String streetname) {
		this.street = streetname;
	}
	
	public int getStreetNumber() {
		return this.streetNumber;
	}
	
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public int getZip() {
		return this.zip;
	}
	
	public void setZip(int zipCode) {
		this.zip = zipCode;
	}
	
	public String getTown() {
		return this.town;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	// Konstruktor
	
	public Address() {
		
	}
	
	public Address(String street, int streetNumber, int zip, String town) {
		this.setStreet(street);
		this.setStreetNumber(streetNumber);
		this.setZip(zip);
		this.setTown(town);
	}
	
	// toString()
	
	public String toString() {
		return this.getStreet() + " " + this.getStreetNumber() + ", " + zipHasZero(this.getZip()) + " " + this.getTown(); 
	}
	
	// Methoden
	
	public String zipHasZero(int zipcode) {
		
		String zipString = "";
		if (zipcode < 10000) {
			zipString = "0";
		}
		
		return zipString + zipcode; 
		
	}
	
}

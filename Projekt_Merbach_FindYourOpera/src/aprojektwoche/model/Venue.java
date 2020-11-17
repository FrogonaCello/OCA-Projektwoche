package aprojektwoche.model;

public class Venue extends Address{
	
	// Attribute
	
	private String name;
	private Address address;
	private String website;
	
	// Getter/Setter
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getWebsite() {
		return this.website;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}
	
	// Konstruktoren
	
	public Venue(String name, Address address, String website) {
		this.setName(name);
		this.setAddress(address);
		this.setWebsite(website);
	}
	
	// toString()
	
	@Override
	public String toString() {
		return this.getName() +  ", " + this.getAddress().toString() + "\nVisit venue´s webpage for further information: " + this.getWebsite() + "\n";
	}
}

package aprojektwoche.model;

import java.time.LocalDateTime;

public class Event implements Comparable<Event>{
	
	// Attribute
	
	private LocalDateTime dateTime;
	private Performable performance;
	private Venue venue;
	
	// Getter/Setter
	
	public LocalDateTime getDateTime() {
		return this.dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public Performable getPerformance() {
		return this.performance;
	}
	
	public void setPerformance(Performable performance) {
		this.performance = performance;
	}
	
	public Venue getVenue() {
		return this.venue;
	}
	
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
	// Konstruktor
	
	public Event(LocalDateTime dateTime, Performable performance, Venue venue) {
		this.setDateTime(dateTime);
		this.setPerformance(performance);
		this.setVenue(venue);
	}
	
	// toString()

	public String toString() {
		
		return this.getPerformance().toString() + "\nwill be performed at \n" 
		+ this.getVenue().toString() + "on " + this.getDateTime().format(FormatDateTime.date_time_f);
	}
	
	// from Comparator Interface
	
	@Override
	public int compareTo(Event event) {
		
		int result = 0;
		if (event instanceof Event && ((Event) event).getDateTime() != null) {
			
			if (this.getDateTime().isBefore(((Event) event).getDateTime())) {
				result = -1;
			}
			
			else if (this.getDateTime().isAfter(((Event) event).getDateTime())) {
				result = 1;
			}
			
			else {
				result = 0;
			}
			
		}
		return result;
	}
	
	// Methoden
	
	public String infoDate() {
		
		return this.getDateTime().format(FormatDateTime.date_tf); 
	}
	
	public String infoTown() {
		
		return this.getVenue().getAddress().getTown().toString();
	}



}

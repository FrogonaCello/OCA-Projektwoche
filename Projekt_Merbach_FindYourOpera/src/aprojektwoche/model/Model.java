package aprojektwoche.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Model implements Predicate<Event>{
	
	private Event testevent, testevent01, testevent02, testevent03, testevent04, testevent05, testevent06;
	private ArrayList<Event> performances = new ArrayList<>();
	
	public Event getTestevent() {
		return this.testevent;
	}

	public void setTestevent(Event testevent) {
		this.testevent = testevent;
	}
	
	public Event getTestevent01() {
		return this.testevent01;
	}

	public void setTestevent01(Event testevent) {
		this.testevent01 = testevent;
	}

	public Event getTestevent02() {
		return this.testevent02;
	}

	public void setTestevent02(Event testevent02) {
		this.testevent02 = testevent02;
	}

	public Event getTestevent03() {
		return this.testevent03;
	}

	public void setTestevent03(Event testevent03) {
		this.testevent03 = testevent03;
	}

	public Event getTestevent04() {
		return this.testevent04;
	}

	public void setTestevent04(Event testevent04) {
		this.testevent04 = testevent04;
	}

	public Event getTestevent05() {
		return this.testevent05;
	}

	public void setTestevent05(Event testevent05) {
		this.testevent05 = testevent05;
	}

	public Event getTestevent06() {
		return this.testevent06;
	}

	public void setTestevent06(Event testevent06) {
		this.testevent06 = testevent06;
	}

	public ArrayList<Event> getPerformances() {
		return this.performances;
	}

	public void setPerformances(ArrayList<Event> performances) {
		this.performances = performances;
	}

	public Model() {
		// Prüfung Veranstaltungsort
		
		Address testaddress = new Address("Schlosspark", 5, 87456, "Wolkingen");
		Address testaddress02 = new Address("Hexenberg", 7, 03452, "Auingen");
		Venue testvenue = new Venue("Auf dem Saturnring", testaddress, "saturnring.de");
		Venue testvenue02 = new Venue("Amphitheater Wolkig", testaddress02, "wolkig.de");
		
		
		// Prüfung Komponist
		
		Composer testcomposer = new Composer("Antonin Dvorak", LocalDate.of(1841, 9, 8), false, null);
		Composer testcomposer01 = new Composer("Francis Poulenc", LocalDate.of(1899, 1, 7), false, LocalDate.of(1963, 1, 30));
		Composer testcomposer02 = new Composer("Richard Wagner", LocalDate.of(1813, 5, 22), true, null);
		
		
		// Prüfung Oper
		
		Opera testopera = new Opera(testcomposer02, OperaName.MEISTERSINGER, Year.of(1868), null,
				new String[] { "meistersinger", "nürnberg", "nuernberg" }, new StringBuilder(
						"https://de.wikipedia.org/wiki/Die_Meistersinger_von_Nürnberg"));
		Opera testopera02 = new Opera(testcomposer, OperaName.RUSALKA, Year.of(1900), null, 
				new String[] {"rusalka", "arielle", "dvorak"}, new StringBuilder("https://de.wikipedia.org/wiki/Rusalka_(Oper)"));
		
		Opera testopera03 = new Opera(testcomposer01, OperaName.HUMAINE, Year.of(1959), null, new String[] {"voix", "humaine", "poulenc"}, new StringBuilder("https://de.wikipedia.org/wiki/La_voix_humaine"));
		
		// Prüfung Event

		this.testevent = new Event(LocalDateTime.of(2020,12,05, 18,30), testopera03, testvenue);
		this.testevent01 = new Event(LocalDateTime.of(2020, 11,11, 18,30), testopera, testvenue);
		this.testevent02 = new Event(LocalDateTime.of(2020, 12, 12, 20, 30), testopera, testvenue02);
		this.testevent03 = new Event(LocalDateTime.of(2020, 12, 17, 20, 30), testopera, testvenue);
		this.testevent04 = new Event(LocalDateTime.of(2020, 12, 24, 17, 30), testopera02, testvenue02);
		this.testevent05 = new Event(LocalDateTime.of(2021, 01, 27, 17, 30), testopera02, testvenue);
		this.testevent06 = new Event(LocalDateTime.of(2021,01,27, 18,30), testopera03, testvenue02);
		
	}
	
	// aus Predicate
	
	@Override
	public boolean test(Event t) {
		
		return false;
	}
	
	// Methoden
	
	public ArrayList<Event> startPerformables() {

		ArrayList<Event> performables = this.getPerformances();
				
				// Einfügen in Klassenarray
		
				
				performables.addAll(Arrays.asList(testevent, testevent01, testevent02,
						testevent03, testevent04, testevent05, testevent06));
				
				// Entfernen vergangener Events
				
				performables.removeIf(e -> e.getDateTime().isBefore(LocalDateTime.now()));
				
				// Sortieren nach Datum und Zeit

				Collections.sort(performables);
						
				return performables;
	}
	

	public List<Event> getResults(String text) {
		// split input in single Strings
				String[] singleInputValues = text.toLowerCase().split(" ");
				// use static perfomances array to get to the keywords array from every single event
				String[][] searchArray = new String[][] {this.getPerformances().get(0).getPerformance().getPerformablesKeywords(), 
					this.getPerformances().get(1).getPerformance().getPerformablesKeywords(), 
					this.getPerformances().get(2).getPerformance().getPerformablesKeywords(),
					this.getPerformances().get(3).getPerformance().getPerformablesKeywords(),
					this.getPerformances().get(4).getPerformance().getPerformablesKeywords(),
					this.getPerformances().get(5).getPerformance().getPerformablesKeywords()};
				
				ArrayList<Event> eventsMeetingSearchCriteria = new ArrayList<>();

				
				for (int j = 0; j < searchArray.length; j++) {
				// iterate through the single terms of the inputstring 
					valueDimensionOfSearchArray: 
					for (String term : singleInputValues) {
					
						// get the keywords from the performances´ array
						String[] arrayOfKeywordValues = searchArray[j];
					
						// iterate through the single keywords
						for (String keyword : arrayOfKeywordValues) {
							
							// if one of the keywords matches a single term from input, then print the performance
							// and leave this iteration of position j immediately
							
							if (keyword.equals(term)) {

								eventsMeetingSearchCriteria.add(this.getPerformances().get(j));
								break valueDimensionOfSearchArray;
							}
						}
					}
				}
		return eventsMeetingSearchCriteria;
	}




}

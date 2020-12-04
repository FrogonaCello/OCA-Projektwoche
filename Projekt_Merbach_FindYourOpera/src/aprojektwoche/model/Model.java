package aprojektwoche.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Model{
	
	private Event testevent, testevent01, testevent02, testevent03, testevent04, testevent05, testevent06, testevent07, testevent08;
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
	
	public Event getTestevent07() {
		return this.testevent06;
	}

	public void setTestevent07(Event testevent06) {
		this.testevent06 = testevent06;
	}
	
	public Event getTestevent08() {
		return this.testevent06;
	}

	public void setTestevent08(Event testevent06) {
		this.testevent06 = testevent06;
	}
	
	

	public ArrayList<Event> getPerformances() {
		return this.performances;
	}

	public void setPerformances(ArrayList<Event> performances) {
		this.performances = performances;
	}

	public Model() {
		// Adressen und Veranstaltungsorte
		
		Address wolkingen = new Address("Schlosspark", 5, 87456, "Wolkingen");
		Address auingen = new Address("Hexenberg", 7, 03452, "Auingen");
		
		Venue saturnring = new Venue("Auf dem Saturnring", wolkingen, "saturnring.de");
		Venue wolkig = new Venue("Amphitheater Wolkig", auingen, "wolkig.de");
		
		
		// Komponisten
		
		Composer dvorak = new Composer("Antonin Dvorak", LocalDate.of(1841, 9, 8), false, null);
		Composer poulenc = new Composer("Francis Poulenc", LocalDate.of(1899, 1, 7), false, LocalDate.of(1963, 1, 30));
		Composer wagner = new Composer("Richard Wagner", LocalDate.of(1813, 5, 22), false, LocalDate.of(1883, 2, 13));
		
		Composer schubert = new Composer("Franz Schubert", LocalDate.of(1797, 1, 31), false, LocalDate.of(1828, 11, 19));
		Composer paert = new Composer("Arvo Pärt", LocalDate.of(1935, 9, 11), true, null);
		
		
		// Opern und Musikstücke
		
		Opera meistersinger = new Opera(wagner, OperaName.MEISTERSINGER, Year.of(1868), null,
				new StringBuilder(
						"https://de.wikipedia.org/wiki/Die_Meistersinger_von_Nürnberg"));
		Opera rusalka = new Opera(dvorak, OperaName.RUSALKA, Year.of(1900), null, 
				new StringBuilder("https://de.wikipedia.org/wiki/Rusalka_(Oper)"));
		
		Opera humaine = new Opera(poulenc, OperaName.HUMAINE, Year.of(1959), null, new StringBuilder("https://de.wikipedia.org/wiki/La_voix_humaine"));
		
		PieceOfMusic schubert_klaviertrio = new PieceOfMusic(schubert, PieceName.KLAVIERTRIO_ESDUR);
		PieceOfMusic spiegelSpiegel = new PieceOfMusic(paert, PieceName.SPIEGEL);
		
		// Events

		this.testevent = new Event(LocalDateTime.of(2020,12,05, 18,30), humaine, saturnring);
		this.testevent01 = new Event(LocalDateTime.of(2020, 11,11, 18,30), meistersinger, saturnring);
		this.testevent02 = new Event(LocalDateTime.of(2020, 12, 12, 20, 30), meistersinger, wolkig);
		this.testevent03 = new Event(LocalDateTime.of(2020, 12, 17, 20, 30), meistersinger, saturnring);
		this.testevent04 = new Event(LocalDateTime.of(2020, 12, 24, 17, 30), rusalka, wolkig);
		this.testevent05 = new Event(LocalDateTime.of(2021, 01, 27, 17, 30), rusalka, saturnring);
		this.testevent06 = new Event(LocalDateTime.of(2021,01,27, 18,30), humaine, wolkig);
		this.testevent07 = new Event(LocalDateTime.of(2020, 12, 10, 17, 00), schubert_klaviertrio, saturnring);
		this.testevent08 = new Event(LocalDateTime.of(2020, 12, 24, 22, 00), spiegelSpiegel, saturnring);
		
		
		// Erstellen des Klassenarrays
		
		ArrayList<Event> performables = new ArrayList<Event>();
		
		performables.addAll(Arrays.asList(testevent, testevent01, testevent02,
				testevent03, testevent04, testevent05, testevent06, testevent07, testevent08));
		
		this.setPerformances(performables);
	}
	
	// Methoden
	
	public ArrayList<Event> startPerformables() {

		ArrayList<Event> performables = this.getPerformances();
				
				// Entfernen vergangener Events
				
				performables.removeIf(e -> e.getDateTime().isBefore(LocalDateTime.now()));
				
				// Sortieren nach Datum und Zeit

				Collections.sort(performables);
				
				// Übergeben der bereinigten und sortierten Liste an das Klassenattribut
				this.setPerformances(performables);
						
				return performables;
	}
	

	public List<Event> getResults(String text) {
		// split input in single Strings
				String[] singleInputValues = text.toLowerCase().split(" ");
				// use dynamic perfomances array to get to the keywords array from every single event
				
				ArrayList<ArrayList<String>> searchArray = new ArrayList<ArrayList<String>>();
				
				for (Event e : this.getPerformances()) {
					searchArray.add(e.getPerformance().getPerformablesKeywords());
				}					
				
				ArrayList<Event> eventsMeetingSearchCriteria = new ArrayList<>();

				
				for (int j = 0; j < searchArray.size(); j++) {
				// iterate through the single terms of the inputstring 
					valueDimensionOfSearchArray: 
					for (String term : singleInputValues) {
					
						// get the keywords from the performances´ array
						ArrayList<String> arrayOfKeywordValues = searchArray.get(j);
					
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

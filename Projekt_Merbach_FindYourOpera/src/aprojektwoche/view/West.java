package aprojektwoche.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import aprojektwoche.model.Event;

@SuppressWarnings("serial")
public class West extends JPanel{
	
	private String eventName, datum, town;
	
	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String name) {
		this.eventName = name;
	}

	public String getDatum() {
		return this.datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public West(ArrayList<Event> upcomingEvents) {
		this.setLayout(new GridLayout(9,1));
		
		Font f = new Font("Arial", Font.PLAIN, 12);
		JLabel performancesTitel = new JLabel("Upcoming Performances");
		performancesTitel.setFont(f);
		
		this.add(performancesTitel);
		
		// display 4 upcoming events only
		

		for (int i = 0; i<4; i++ ) {
			this.setEventName(upcomingEvents.get(i).getPerformance().getPerformableName());
			this.setDatum(upcomingEvents.get(i).infoDate());
			this.setTown(upcomingEvents.get(i).infoTown());

			
			StringBuilder sbUpcoming = new StringBuilder(this.getEventName() + "\non" + this.getDatum() + "\nin " + this.getTown());
			JTextArea upcomings = new JTextArea(sbUpcoming.toString());
			upcomings.setFont(f);
			upcomings.setEditable(false);
			upcomings.setLineWrap(true);
			upcomings.setWrapStyleWord(true);
			this.add(upcomings);
			this.add(new JLabel("______________________"));
			
		}

		this.setBackground(Color.white);
	}

}

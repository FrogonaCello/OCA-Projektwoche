package aprojektwoche.view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.UIManager;

import aprojektwoche.controller.Controller;
import aprojektwoche.model.Event;

@SuppressWarnings("serial")
public class View extends JFrame{
	
	private Center centerPanel;
	private North northPanel;
	private West westPanel;
	private South southPanel;
	
	public South getSouthPanel() {
		return this.southPanel;
	}

	public void setSouthPanel(South southPanel) {
		this.southPanel = southPanel;
	}

	public Center getCenterPanel() {
		return this.centerPanel;
	}

	public void setCenterPanel(Center centerPanel) {
		this.centerPanel = centerPanel;
	}

	public North getNorthPanel() {
		return this.northPanel;
	}

	public void setNorthPanel(North northPanel) {
		this.northPanel = northPanel;
	}

	public West getWestPanel() {
		return this.westPanel;
	}

	public void setWestPanel(West westPanel) {
		this.westPanel = westPanel;
	}
	
	public View(ArrayList<Event> upcomingEvents) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e){
			e.printStackTrace();
		}
		
		this.setTitle("Find Your Favorite Opera");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(600, 300, 800, 600);
		this.setCenterPanel(new Center());
		this.setNorthPanel(new North());
		this.setWestPanel(new West(upcomingEvents));
		this.setSouthPanel(new South());
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(this.getNorthPanel(), BorderLayout.NORTH);
		panel.add(this.getCenterPanel(), BorderLayout.CENTER);
		panel.add(this.getWestPanel(), BorderLayout.WEST);
		panel.add(this.getSouthPanel(), BorderLayout.SOUTH);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

	


	public void addActionListenerToSearchField(Controller controller) {
		this.getCenterPanel().getSearchArea().addActionListener(controller);
		
	}

	public void displayResults(List<Event> results, ArrayList<Event> performables) {
	
		StringBuilder sbResults = new StringBuilder("\n");
		
		if (results.size() == 0) {
			sbResults.append("Sorry, your favourite opera isn´t played these days.\n Check some other current performances instead:\n\n");
			sbResults.append(performables.get(0).toString() + "\n\n" + performables.get(1).toString() + "\n\n");
		}
		else {
		for (Event e : results) {
			sbResults.append(e.toString() + "\n\n");
			
		}
		}
		
		this.getCenterPanel().getResultArea().setText(sbResults.toString() + "\n" );
		
	}
	
	
	
	
	
	
}

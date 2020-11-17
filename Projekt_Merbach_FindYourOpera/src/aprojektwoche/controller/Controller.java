package aprojektwoche.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextField;

import aprojektwoche.model.Event;
import aprojektwoche.model.Model;
import aprojektwoche.view.View;

public class Controller implements ActionListener{
	private View view;
	private Model model;
	
	public View getView() {
		return this.view;
	}
	public void setView(View view) {
		this.view = view;
	}
	public Model getModel() {
		return this.model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Controller() {
		this.setModel(new Model());
		this.setView(new View(this.getModel().startPerformables()));

		this.getView().addActionListenerToSearchField(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String searchCriteria = ((JTextField)e.getSource()).getText();
		List<Event> results = this.getModel().getResults(searchCriteria);
		this.getView().getCenterPanel().getSearchArea().setText("Upcoming performances of " + searchCriteria);
		this.getView().displayResults(results, this.getModel().startPerformables());
		
	}
	
}

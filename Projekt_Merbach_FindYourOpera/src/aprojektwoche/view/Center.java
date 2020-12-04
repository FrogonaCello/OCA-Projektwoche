package aprojektwoche.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Center extends JPanel {
	
	private JTextField searchArea;
	private JTextArea resultArea;


	public JTextField getSearchArea() {
		return this.searchArea;
	}

	public void setSearchArea(JTextField searchArea) {
		this.searchArea = searchArea;
	}

	public JTextArea getResultArea() {
		return this.resultArea;
	}

	public void setResultArea(JTextArea resultArea) {
		this.resultArea = resultArea;
	}
	
	
	// Konstruktor

	public Center() {
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.lightGray);
		
		Font f = new Font("Arial", Font.PLAIN, 15);
			
		JTextField searchArea = new JTextField("Choose an opera or a specific piece of music you want to see?", 35);
		searchArea.setBackground(Color.white);
		searchArea.setFont(f);
		searchArea.setForeground(Color.BLUE);
		searchArea.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_searchArea = new GridBagConstraints();
		gbc_searchArea.gridwidth = 2;
		gbc_searchArea.fill = GridBagConstraints.NORTH;
		gbc_searchArea.insets = new Insets(0,0,30,0);
		gbc_searchArea.gridx = 0;
		gbc_searchArea.gridy = 1;
		this.setSearchArea(searchArea);
		
		JTextArea resultArea = new JTextArea("Your results will be shown here");

		resultArea.setFont(f);
		resultArea.setEditable(false);
		resultArea.setBackground(Color.white);
		resultArea.setBounds(25,25,500,60);
		resultArea.setLineWrap(true);
		resultArea.setWrapStyleWord(true);	
		GridBagConstraints gbc_resultArea = new GridBagConstraints();
		gbc_resultArea.gridwidth = 2;
		gbc_resultArea.fill = GridBagConstraints.NORTH;
		gbc_resultArea.insets = new Insets(0, 0, 30, 0);
		gbc_resultArea.gridx = 0;
		gbc_resultArea.gridy = 10;
		this.setResultArea(resultArea);
		

		this.add(this.getSearchArea(), gbc_searchArea);
		this.add(this.getResultArea(), gbc_resultArea);

	}
	

}

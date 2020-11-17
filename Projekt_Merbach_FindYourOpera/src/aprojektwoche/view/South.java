package aprojektwoche.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class South extends JPanel{
	
	private JLabel footer;
	
	public JLabel getFooter() {
		return this.footer;
	}

	public void setFooter(JLabel footer) {
		this.footer = footer;
	}

	public South() {
	
	String text = "Johanna Merbach, Projektwoche OCA 11/2020";
	Font f = new Font("Arial", Font.PLAIN, 12);
	JLabel footer = new JLabel(text);
	footer.getAccessibleContext().setAccessibleName(text);
	footer.getAccessibleContext().setAccessibleDescription("App´s Footer");
	footer.setFont(f);
	this.setFooter(footer);	
		
	this.setLayout(new GridBagLayout());
	this.setBackground(Color.white);
	
	this.add(this.getFooter());
	}

}

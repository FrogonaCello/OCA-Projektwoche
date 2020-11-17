package aprojektwoche.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class North extends JPanel{
	
	private JLabel header;

	public JLabel getHeader() {
		return this.header;
	}

	public void setHeader(JLabel header) {
		this.header = header;
	}

	public North() {
		
		JLabel text = new JLabel("Find Your Favorite Opera");
		text.setFont(new Font("Arial", Font.PLAIN, 12));
		text.getAccessibleContext().setAccessibleName("Find Your Favorite Opera");
		text.getAccessibleContext().setAccessibleDescription("App´s Title");
		this.setHeader(text);
		
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.white);
		
		this.add(this.getHeader());
	}
}

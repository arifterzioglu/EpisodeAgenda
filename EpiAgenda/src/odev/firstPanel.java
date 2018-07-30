package odev;

import javax.swing.JPanel;
import java.awt.Color;


public class firstPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public firstPanel( User u,MainFrame f) {
		setLayout(null);
		

		TopRatedPanel topRatedPanel = new TopRatedPanel();
		topRatedPanel.setBounds(719, 0, 180, 529);
		setBackground(new Color(34,34,34));
		add(topRatedPanel);
		
		
		
		MainPanel mainPanel = new MainPanel(u);
		mainPanel.setBounds(230, 16, 474, 500);
		add(mainPanel);
		
		BasePage bp= new BasePage(mainPanel,f);
		bp.setBounds(8, 0, 195, 536);
		add(bp);

	}
}

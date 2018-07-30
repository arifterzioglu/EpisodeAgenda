package odev;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JProgressBar;


public class TopRatedPanel extends JPanel {
        
    public TopRatedPanel() {
        	
        	setBackground(new Color(50,50,50));

                setLayout(null);
                
                
                JLabel lblNewLabel = new JLabel("Top Rated Series");
                lblNewLabel.setForeground(new Color(0,143,104));
                lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
                lblNewLabel.setBounds(18, 33, 170, 34);
                add(lblNewLabel);
                
                JButton btngameOfThrones = new JButton("1.Game of Thrones");
                btngameOfThrones.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent arg0) {
                		
                		
                		
                		String link="http://www.imdb.com/title/tt0944947/";
                		
                	    try {
							Desktop.getDesktop().browse(new URL(link).toURI());
						} catch (MalformedURLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (URISyntaxException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                		
                	}
                });
                btngameOfThrones.setToolTipText("Wiki Page");
                btngameOfThrones.setBounds(5, 100, 170, 30);
                add(btngameOfThrones);
                
                JButton btntheFlash = new JButton("2.The Flash");
                btntheFlash.setToolTipText("Wiki Page");
                btntheFlash.setBounds(5, 150, 170, 30);

                add(btntheFlash);
                
                JButton btnMrRobot = new JButton("3.Mr Robot");
                btnMrRobot.setToolTipText("Wiki Page");
                btnMrRobot.setBounds(5, 200, 170, 30);

                add(btnMrRobot);
                
                JButton btnarrow = new JButton("4.Arrow");
                btnarrow.setToolTipText("Wiki Page");
                btnarrow.setBounds(5, 250, 170, 30);

                add(btnarrow);
                
                JButton btnOrangeIsThe = new JButton("5.Orange is the New Black");
                btnOrangeIsThe.setToolTipText("Wiki Page");
                btnOrangeIsThe.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                        }
                });
                btnOrangeIsThe.setBounds(5, 300, 170, 30);

                add(btnOrangeIsThe);
                
                JButton btntrueDetective = new JButton("6.True Detective");
                btntrueDetective.setToolTipText("Wiki Page");
                btntrueDetective.setBounds(5, 350, 170, 30);

                add(btntrueDetective);
                
                JButton btnTheWalking = new JButton("7. The Walking Dead");
                btnTheWalking.setToolTipText("Wiki Page");
                btnTheWalking.setBounds(5, 400, 170, 30);

                add(btnTheWalking);
        }
    
}
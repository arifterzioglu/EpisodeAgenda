package odev;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Wikipage extends JPanel {

	/**
	 * Create the panel.
	 */
	String trailerLink="http://www.google.com";
	String imageUrl="indir.jpg";
	ImageIcon image;
	JTextArea infoText;
	final JLabel imdbLabel;
	final JLabel rtLabel;
	final JLabel nameLabel;


	public Wikipage() {
		setBackground(new Color(34,34,34));
		setLayout(null);
		
	    image=new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\Game Of Thrones.jpeg");
	    JLabel i1 = new JLabel(image);
	    add(i1);
	    
        JLabel lblWikipage = new JLabel("SERIES");
        lblWikipage .setForeground(new Color(219, 88, 0));
        lblWikipage .setFont(new Font("Tahoma", Font.BOLD, 18));
        lblWikipage .setBounds(0, 0, 180, 49);
        add(lblWikipage );
		
		
		JButton btnNewButton = new JButton("Watch Trailer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
        		
        		
        	    try {
				Desktop.getDesktop().browse(new URL(trailerLink).toURI());
					
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
		btnNewButton.setBackground(new Color(219,88,0));
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBounds(0, 340, 153, 29);
		add(btnNewButton);
		
//		JButton btnForeshadowing = new JButton("Foreshadowing");
//		btnForeshadowing.setBackground(new Color(219,88,0));
//		btnForeshadowing.setForeground(Color.white);
//		btnForeshadowing.setBounds(0, 370, 153, 29);
//		add(btnForeshadowing);
		
		JButton btnLeavecomment = new JButton("Commendation");
		btnLeavecomment.setBackground(new Color(219,88,0));
		btnLeavecomment.setForeground(Color.white);
		btnLeavecomment.setBounds(0, 370, 153, 29);

		add(btnLeavecomment);
		
        infoText = new JTextArea();
		infoText.setBackground(new Color(34,34,34));
		infoText.setForeground(Color.white);
		infoText.setText("asdas\u015Fkldms\u015Fkladmk");
		infoText.setLineWrap(true);
		infoText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		infoText.setRows(15);
		infoText.setWrapStyleWord(true);
		infoText.setTabSize(11);
		infoText.setBounds(179, 111, 232, 205);
		add(infoText);
		
		JLabel lblImdb = new JLabel("IMDB:");
		lblImdb.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblImdb.setForeground(Color.white);
		lblImdb.setBounds(179, 45, 56, 50);
		add(lblImdb);
		
		JLabel lblRottentomatoes = new JLabel("Rottentomatoes:");
		lblRottentomatoes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRottentomatoes.setBounds(292, 45, 153, 50);
		lblRottentomatoes.setForeground(Color.white);
		add(lblRottentomatoes);
		
		imdbLabel = new JLabel("");
		imdbLabel.setBounds(250, 45, 42, 50);
		imdbLabel.setForeground(new Color(219, 88, 0));
		add(imdbLabel);
		
		rtLabel = new JLabel("");
		rtLabel.setBounds(446, 45, 42, 50);
		rtLabel.setForeground(new Color(219, 88, 0));
		add(rtLabel);
		
		nameLabel = new JLabel("");
		nameLabel.setForeground(new Color(219, 88, 0));
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        nameLabel.setBounds(181, 0, 210, 49);
		add(nameLabel);

	}
	public void setProperties(String name,String imageLink,String trailer,String info,String imdb,String rottem)
	{
	    image=new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\Game Of Thrones.jpeg");
	    nameLabel.setText(name);
	    trailerLink=trailer;
	    infoText.setText(info);
	    rtLabel.setText(rottem);
	    imdbLabel.setText(imdb);
	    repaint();

	}
	/*
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		 g.drawImage(image,0,60,170,200,null);
		 
		 
	}*/
}

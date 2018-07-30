	package odev;
	
	import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;

import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.SystemColor;

import javax.swing.border.CompoundBorder;
	
	public class SeriesPanel extends JPanel {
	        private JTable table;
	
	        /**
	         * Create the applet.
	         */
	        
	        DatabaseConnection u1 = new DatabaseConnection();
	
	        public SeriesPanel(User user,final MainPanel m) {
	     
	                setBounds(170,0,500,500);
	                setLayout(null);
	        		setBackground(new Color(34,34,34));

	                table = new JTable(new jTable(user));
	                
	                table.setShowVerticalLines(false);
	                table.setBackground(new Color (50,50,50));
	                table.setForeground(Color.white);
	                table.setBounds(0, 125, 455, 112);
	                add(table);
	                
	                JLabel lblTvShows = new JLabel("TV Shows");
	                lblTvShows.setFont(new Font("Tahoma", Font.BOLD, 16));
	                lblTvShows.setForeground(Color.WHITE);
	                lblTvShows.setBounds(0, 84, 100, 49);
	                add(lblTvShows);
	                
	                JLabel lblImdbRates = new JLabel("IMDB Rates");
	                lblImdbRates.setFont(new Font("Tahoma", Font.BOLD, 16));
	                lblImdbRates.setForeground(Color.WHITE);
	                lblImdbRates.setBounds(152, 90, 112, 36);
	                add(lblImdbRates);
	                
	                JLabel lblRottenTomatoes = new JLabel("RTRates\r\n");
	                lblRottenTomatoes.setFont(new Font("Tahoma", Font.BOLD, 16));
	                lblRottenTomatoes.setBounds(303, 90, 154, 36);
	                lblRottenTomatoes.setForeground(Color.WHITE);
	                add(lblRottenTomatoes);
	                

	                JButton btnAddFavorite = new JButton("Add Favorite");
	                btnAddFavorite.setFont(new Font("Tahoma", Font.BOLD, 16));
	                btnAddFavorite.setBounds(26, 352, 146, 43);
	                add(btnAddFavorite);
	                
	                //JButton btnGoToViki = new JButton("Go To Viki!");
	                /*
	                Image flash = new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\Flash.jpeg").getImage();
	                Image arrow = new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\Arrow.jpeg");
	                Image got = new ImageIcon ("C:\\Users\\Arif\\Desktop\\PostersImage\\Game of Thrones.jpeg");
	                Image walking = new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\The Walking Dead.jpeg");
	                Image orange= new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\Orange is the New Black.jpeg)");
	                Image mrrobot= new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\Mr Robot.jpeg)");
	                Image truDet= new ImageIcon("C:\\Users\\Arif\\Desktop\\PostersImage\\True Detective.jpeg)");*/

	                
	
	                btnAddFavorite.addActionListener(new ActionListener() {
	                	public void actionPerformed(ActionEvent e) {
	                		u1.dbConnection();
	                		Model m1 = new Model();
	                		IntroPage s1 = new IntroPage();
	                		
	                		String serieName=(String) table.getValueAt(table.getSelectedRow(), 0);
	                		
	                		
	                		
	                		Series fav = m1.search(serieName);
	                		
	                		u1.addFavourite(fav, s1.newUser);
	                		
	                		
	      
	                		
	                		repaint();
	                	}
	                	
	                });
	                btnAddFavorite.setFont(new Font("Tahoma", Font.BOLD, 16));
	                btnAddFavorite.setBounds(26, 352, 146, 43);
	                add(btnAddFavorite);
	                
	                JButton btnGoToViki = new JButton("Go To Viki!");
	                btnGoToViki.addActionListener(new ActionListener() {
	                	public void actionPerformed(ActionEvent e) {
	                		
	                		u1.dbConnection();
	                		// serieName  seçilen  filmin adý , link'i o filmin viki linkine eþitleyeceksin             		
	                		String serieName=(String) table.getValueAt(table.getSelectedRow(), 0);
	                		
	                		Model k1 = new Model();
	                		
	                		Series i1 = k1.search(serieName);
	                 		//bilgileri aþaðýdaki metod ile yollayacaksýn.
	                		String  x = "C:\\Users\\Arif\\Desktop\\PostersImage\\"+serieName+".jpeg";
	                		m.showWiki(serieName,x,u1.getVideoLink(serieName),i1.getPlot(),i1.getImdbRate(),u1.getRotten(serieName));
	
	                		
	                		
	                	}
	                });
	                btnGoToViki.setFont(new Font("Tahoma", Font.BOLD, 16));
	                btnGoToViki.setBounds(278, 352, 154, 43);
	                add(btnGoToViki);
	                
	                JLabel lblSeres = new JLabel("SERIES");
	                lblSeres.setForeground(new Color(219, 88, 0));
	                lblSeres.setFont(new Font("Tahoma", Font.BOLD, 18));
	                lblSeres.setBounds(0, 0, 180, 49);
	                add(lblSeres);
	                
	                JLabel label = new JLabel("");
	                label.setBounds(133, 402, 112, 73);
	                add(label);
	        }
	
	}

package odev;

import javax.swing.JPanel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Desktop;

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

public class Favories extends JPanel {
        private JTable table;

        /**
         * Create the applet.
         */
        MainPanel m;
        DatabaseConnection u1 = new DatabaseConnection();
        
        
        public Favories(User u,final MainPanel m) {
                setBounds(170,0,500,500);
                setLayout(null);
        		setBackground(new Color(34,34,34));

                
                table = new JTable(new jfavoriesTable(u));
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
                
                JButton btnDelFavorite = new JButton("Delete Favorite!");
                btnDelFavorite.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		              		

            			u1.dbConnection();
            		String serieName=(String) table.getValueAt(table.getSelectedRow(), 0);
            		System.out.println(serieName);
            		

            	
            		IntroPage s1 = new IntroPage();

            		u1.deleteFromFavourites(s1.newUser,serieName);
           	
            		repaint();
                		
                	}
                });
                btnDelFavorite.setFont(new Font("Tahoma", Font.BOLD, 16));
                btnDelFavorite.setBounds(26, 352, 163, 43);
                add(btnDelFavorite);
                
                
//                JButton btnOpenWiki = new JButton("Open Wiki!");
//                btnOpenWiki.setFont(new Font("Tahoma", Font.BOLD, 16));
//                btnOpenWiki.addActionListener(new ActionListener() {
//                	public void actionPerformed(ActionEvent e) {
//                		
//                		
//                		
//                		String serieName=(String) table.getValueAt(table.getSelectedRow(), 0);
//                		System.out.println(":"+serieName);
//                		Model k1 = new Model();
//                		
//                		Series i1 = k1.search(serieName);
//                		
//                		
//                		m.showWiki(serieName,"",u1.getVideoLink(serieName),i1.getPlot(),i1.getImdbRate(),u1.getRotten(serieName));
//                	}
//                });
//                btnOpenWiki.setBounds(299, 349, 137, 49);
//                btnOpenWiki.setFont(new Font("Tahoma", Font.BOLD, 16));
//                btnOpenWiki.setBounds(278, 352, 154, 43);
//                add(btnOpenWiki);
                
                JLabel lblFavs = new JLabel("FAVORITES");
                lblFavs.setForeground(new Color(219, 88, 0));
                lblFavs.setFont(new Font("Tahoma", Font.BOLD, 18));
                lblFavs.setBounds(0, 0, 180, 49);
                add(lblFavs);
        }

}

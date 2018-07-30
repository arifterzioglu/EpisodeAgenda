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

public class upcomingShows extends JPanel {
        private JTable table;

        /**
         * Create the applet.
         */
        public upcomingShows(User user) {
                setBounds(170,0,500,500);
                setLayout(null);
                setBackground(new Color(34,34,34));
                
                table = new JTable(new upComingTable(user));
                table.setShowVerticalLines(false);
                table.setBackground(new Color (50,50,50));
                table.setForeground(Color.white);
                table.setBounds(0, 125, 455, 82);
                add(table);
                
                JLabel lblTvShows = new JLabel("TV Show");
                lblTvShows.setFont(new Font("Tahoma", Font.BOLD, 16));
                lblTvShows.setBounds(0, 90, 100, 36);
                lblTvShows.setForeground(Color.white);

                add(lblTvShows);
                
                JLabel lblepi = new JLabel("Episode");
                lblepi.setFont(new Font("Tahoma", Font.BOLD, 16));
                lblepi.setBounds(129, 90, 112, 36);
                lblepi.setForeground(Color.white);

                add(lblepi);
                
                JLabel lblDate = new JLabel("Date");
                lblDate.setFont(new Font("Tahoma", Font.BOLD, 16));
                lblDate.setForeground(Color.white);
                lblDate.setBounds(256, 90, 154, 36);
                add(lblDate);
                
                JLabel lblSeres = new JLabel("Upcoming Shows For This Week");
                lblSeres.setForeground(new Color(219, 88, 0));
                lblSeres.setFont(new Font("Tahoma", Font.BOLD, 18));
                lblSeres.setBounds(0, 0, 300, 49);
                add(lblSeres);
                
                JLabel lblTime = new JLabel("Time");
                lblTime.setFont(new Font("Tahoma", Font.BOLD, 16));
                lblTime.setBounds(373, 90, 154, 36);
                lblTime.setForeground(Color.white);

                add(lblTime);
        }

}
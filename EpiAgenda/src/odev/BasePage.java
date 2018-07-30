package odev;

import javax.swing.JPanel;
import javax.swing.JPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
//import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Button;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.FlowLayout;

public class BasePage extends JPanel implements ActionListener
{

	    MainPanel secondPanel;
        private JFrame frame;
        private JTextField txtTheMenu;
        private Button favoritesButton;
        private Button seriesButton;
        private Button homeButton;
        private Button settingsButton;
        private Button notificationsButton;
        private Button logoutButton;
        public int click = 4;
        MainFrame f;        
        

        public BasePage(MainPanel m,final MainFrame f) 
        {
        		
                this.setBackground(new Color(34,34,34));
        		this.secondPanel=m;
                frame = new JFrame("Episode Agenda");
                frame.getContentPane().setForeground(new Color(34,34,34));
                frame.getContentPane().setBackground(new Color(34,34,34));
                setBounds(100, 100, 960, 540);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(null);

                JPanel MenuPanel = new JPanel();
                MenuPanel.setBackground(new Color(50,50,50));
                MenuPanel.setBounds(0, 0, 170, 510);
                add(MenuPanel);
                                
                txtTheMenu = new JTextField();
                txtTheMenu.setBounds(5, 15, 160, 28);
                
                MenuPanel.setLayout(null);
                txtTheMenu.setEditable(false);
                txtTheMenu.setToolTipText("The Menu");
                txtTheMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
                txtTheMenu.setHorizontalAlignment(SwingConstants.CENTER);
                txtTheMenu.setForeground(SystemColor.text);
                txtTheMenu.setBackground(new Color(34,34,34));
                txtTheMenu.setText("THE MENU");
                MenuPanel.add(txtTheMenu);
                txtTheMenu.setColumns(9);
                
                //SERIES BUTTON
                final Button seriesButton = new Button("Series");
                seriesButton.setBounds(5, 69, 160, 30);
                seriesButton.addActionListener(this);
            	seriesButton.addMouseListener(new MouseAdapter() 
        		{
        			@Override
        			public void mouseClicked(MouseEvent event) 
        			{
        				click = 2;
        				
        				seriesButton.setBackground(new Color(0, 104, 153));
        				seriesButton.setForeground(SystemColor.white);
        				
        				favoritesButton.setForeground(SystemColor.white);
        				favoritesButton.setBackground(new Color(34,34,34));
        				
        				homeButton.setForeground(SystemColor.white);
        				homeButton.setBackground(new Color(34,34,34));
        				
        				settingsButton.setForeground(SystemColor.white);
        				settingsButton.setBackground(new Color(34,34,34));
        				
        				notificationsButton.setForeground(SystemColor.white);
        				notificationsButton.setBackground(new Color(34,34,34));
        				
        				logoutButton.setForeground(SystemColor.white);
        				logoutButton.setBackground(new Color(34,34,34));
        				frame.repaint();
        				
        			}
        			@Override
        			public void mouseEntered(MouseEvent e) 
        			{
        				if(click != 2)
        				{
        					seriesButton.setForeground(new Color(0, 104, 153));
        					seriesButton.setBackground(SystemColor.white);
        				}
        			}
        			@Override
        			public void mouseExited(MouseEvent e) 
        			{
        				if(click != 2)
        				{
        					seriesButton.setBackground(new Color(34,34,34));
        					seriesButton.setForeground(Color.white);
        				}
        			}
        		});
               
                
                seriesButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                seriesButton.setForeground(SystemColor.text);
             
                seriesButton.setBackground(new Color(34,34,34));                
                MenuPanel.add(seriesButton);
                
                //FAVORITES BUTTON
                favoritesButton = new Button("My Favorites");
                favoritesButton.addActionListener(this);
                favoritesButton.setBounds(5, 104, 160, 30);
                
                favoritesButton.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent arg0) {
        				click = 3;
        				favoritesButton.setForeground(SystemColor.white);
        				favoritesButton.setBackground(new Color(0, 104, 153));	
        				
        				seriesButton.setForeground(SystemColor.white);
        				seriesButton.setBackground(new Color(34,34,34));
        				
        				homeButton.setForeground(SystemColor.white);
        				homeButton.setBackground(new Color(34,34,34));
        				
        				settingsButton.setForeground(SystemColor.white);
        				settingsButton.setBackground(new Color(34,34,34));
        				
        				notificationsButton.setForeground(SystemColor.white);
        				notificationsButton.setBackground(new Color(34,34,34));
        				
        				logoutButton.setForeground(SystemColor.white);
        				logoutButton.setBackground(new Color(34,34,34));
        			}
        			@Override
        			public void mouseEntered(MouseEvent e) {
        				if(click != 3)
        				{
        					favoritesButton.setForeground(new Color(0, 104, 153));
        					favoritesButton.setBackground(SystemColor.white);
        				}
        			}
        			@Override
        			public void mouseExited(MouseEvent e) {
        				if(click != 3)
        				{
        					favoritesButton.setBackground(new Color(34,34,34));
        					favoritesButton.setForeground(Color.white);
        				}
        			}
        		});
               
                favoritesButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                favoritesButton.setForeground(SystemColor.text);
                favoritesButton.setBackground(new Color(34,34,34));
                MenuPanel.add(favoritesButton);
                
                //HOME BUTTON
                homeButton = new Button("Home Page");
                homeButton.setBounds(5, 139, 160, 30);
               
                homeButton.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent arg0) {
        				click = 4;
        				homeButton.setForeground(SystemColor.white);
        				homeButton.setBackground(new Color(0, 104, 153));	
        				
        				favoritesButton.setForeground(SystemColor.white);
        				favoritesButton.setBackground(new Color(34,34,34));
        				
        				seriesButton.setForeground(SystemColor.white);
        				seriesButton.setBackground(new Color(34,34,34));
        				
        				settingsButton.setForeground(SystemColor.white);
        				settingsButton.setBackground(new Color(34,34,34));
        				
        				notificationsButton.setForeground(SystemColor.white);
        				notificationsButton.setBackground(new Color(34,34,34));
        				
        				logoutButton.setForeground(SystemColor.white);
        				logoutButton.setBackground(new Color(34,34,34));
        			}
        			@Override
        			public void mouseEntered(MouseEvent e) {
        				if(click != 4)
        				{
        					homeButton.setForeground(new Color(0, 104, 153));
        					homeButton.setBackground(SystemColor.white);
        				}
        			}
        			@Override
        			public void mouseExited(MouseEvent e) {
        				if(click != 4)
        				{
        					homeButton.setBackground(new Color(34,34,34));
        					homeButton.setForeground(Color.white);
        				}
        			}
        		});
                
                
                homeButton.setForeground(SystemColor.text);
                homeButton.setBackground(new Color(0,104,153));
                homeButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                homeButton.addActionListener(this);
                MenuPanel.add(homeButton);                
                
                //SETTINGS BUTTON
                settingsButton = new Button("Settings");
                settingsButton.setBounds(5, 174, 160, 30);
                
                
                settingsButton.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent arg0) {
        				click = 5;
        				settingsButton.setForeground(SystemColor.white);
        				settingsButton.setBackground(new Color(0, 104, 153));	
        				
        				favoritesButton.setForeground(SystemColor.white);
        				favoritesButton.setBackground(new Color(34,34,34));
        				
        				homeButton.setForeground(SystemColor.white);
        				homeButton.setBackground(new Color(34,34,34));
        				
        				seriesButton.setForeground(SystemColor.white);
        				seriesButton.setBackground(new Color(34,34,34));
        				
        				notificationsButton.setForeground(SystemColor.white);
        				notificationsButton.setBackground(new Color(34,34,34));
        				
        				logoutButton.setForeground(SystemColor.white);
        				logoutButton.setBackground(new Color(34,34,34));
        			}
        			@Override
        			public void mouseEntered(MouseEvent e) {
        				if(click != 5)
        				{
        					settingsButton.setForeground(new Color(0, 104, 153));
        					settingsButton.setBackground(SystemColor.white);
        				}
        			}
        			@Override
        			public void mouseExited(MouseEvent e) {
        				if(click != 5)
        				{
        					settingsButton.setBackground(new Color(34,34,34));
        					settingsButton.setForeground(Color.white);
        				}
        			}
        		});
                
                settingsButton.setBackground(new Color(34,34,34));
                settingsButton.setForeground(Color.WHITE);
                settingsButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                settingsButton.addActionListener(this);
                MenuPanel.add(settingsButton);
                
                //NOTIFICATIONS BUTTON
                notificationsButton = new Button("Notifications");
                notificationsButton.setBounds(5, 209, 160, 30);
              
        		notificationsButton.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent arg0) {
        				click = 6;
        				notificationsButton.setForeground(SystemColor.white);
        				notificationsButton.setBackground(new Color(0, 104, 153));	
        				
        				favoritesButton.setForeground(SystemColor.white);
        				favoritesButton.setBackground(new Color(34,34,34));
        				
        				homeButton.setForeground(SystemColor.white);
        				homeButton.setBackground(new Color(34,34,34));
        				
        				settingsButton.setForeground(SystemColor.white);
        				settingsButton.setBackground(new Color(34,34,34));
        				
        				seriesButton.setForeground(SystemColor.white);
        				seriesButton.setBackground(new Color(34,34,34));
        				
        				logoutButton.setForeground(SystemColor.white);
        				logoutButton.setBackground(new Color(34,34,34));
        			}
        			@Override
        			public void mouseEntered(MouseEvent e) {
        				if(click != 6)
        				{
        					notificationsButton.setForeground(new Color(0, 104, 153));
        					notificationsButton.setBackground(SystemColor.white);
        				}
        			}
        			@Override
        			public void mouseExited(MouseEvent e) {
        				if(click != 6)
        				{
        					notificationsButton.setBackground(new Color(34,34,34));
        					notificationsButton.setForeground(Color.white);
        				}
        			}
        		});
                
                notificationsButton.setForeground(SystemColor.text);
                notificationsButton.setBackground(new Color(34,34,34));
                notificationsButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                notificationsButton.addActionListener(this);
                MenuPanel.add(notificationsButton);
                
                //LOG OUT BUTTON                
                logoutButton = new Button("Log out");
                logoutButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                	
                		f.backToHome();
                	}
                });
                
        		logoutButton.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent arg0) {				
        				click = 7;
        				logoutButton.setForeground(SystemColor.white);
        				logoutButton.setBackground(new Color(0, 104, 153));
        				
        				favoritesButton.setForeground(SystemColor.white);
        				favoritesButton.setBackground(new Color(34,34,34));
        				
        				homeButton.setForeground(SystemColor.white);
        				homeButton.setBackground(new Color(34,34,34));
        				
        				settingsButton.setForeground(SystemColor.white);
        				settingsButton.setBackground(new Color(34,34,34));
        				
        				notificationsButton.setForeground(SystemColor.white);
        				notificationsButton.setBackground(new Color(34,34,34));
        				
        				seriesButton.setForeground(SystemColor.white);
        				seriesButton.setBackground(new Color(34,34,34));	
        			}
        			@Override
        			public void mouseEntered(MouseEvent e) {
        				if(click != 7)
        				{
        					logoutButton.setForeground(new Color(0, 104, 153));
        					logoutButton.setBackground(SystemColor.white);
        				}
        			}
        			@Override
        			public void mouseExited(MouseEvent e) {
        				if(click != 7)
        				{
        					logoutButton.setBackground(new Color(34,34,34));
        					logoutButton.setForeground(Color.white);
        				}
        			}
        		});
                
                logoutButton.setBounds(5, 446, 160, 30);
                logoutButton.setForeground(Color.WHITE);
                logoutButton.setBackground(new Color(34,34,34));
                logoutButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                MenuPanel.add(logoutButton);

        }



		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("gLDİ"+e.getActionCommand());
			
			if(e.getActionCommand().equalsIgnoreCase("Series"))
			{	
				secondPanel.showSeries();
			}
			
			if(e.getActionCommand().equalsIgnoreCase("My Favorites"))
			{
				secondPanel.showFavories();
			}
			
			if(e.getActionCommand().equalsIgnoreCase("Home Page"))
			{
				secondPanel.showCalendar();
			}
			
			if(e.getActionCommand().equalsIgnoreCase("Settings"))
			{
				secondPanel.showSettings();
			}
			
			if(e.getActionCommand().equalsIgnoreCase("Notifications"))
			{
				secondPanel.showUpcoming();
			}
			
			
		}

		
}

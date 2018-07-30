package odev;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	
	// MAINPANEL ==   ORTADAKÝ PANEL 
	
	CardLayout l;
	Wikipage w=new Wikipage();
	public MainPanel(User u) {
		
		l=new CardLayout();
                setForeground(new Color(34,34,34));
		setBounds(171,0,700,484);
		setLayout(l);
		add("home",new CalendarPanel(u));
		add("seriespanel",new SeriesPanel(u,this));
		add("toprated",new TopRatedPanel());
		add("favories",new Favories(u,this));
		add("settings",new settings(u));
		add("notifications",new upcomingShows(u));
		add("wiki",w);

	}
	
	public void showWiki(String name,String imageLink,String trailer,String info,String imdb,String rottem)
	{
		w.setProperties(name,imageLink, trailer, info, imdb, rottem);
		l.show(this,"wiki");
		repaint();
	}
	public void showUpcoming()
	{
		l.show(this,"notifications");
		repaint();
	}
	public void showSeries()
	{
		l.show(this, "seriespanel");
		repaint();
	}
	public void showTopRated()
	{
		l.show(this,"toprated");
		repaint();
	}
	
	public void showCalendar()
	{
		
		l.show(this,"home");
		repaint();
	}
	public void showFavories()
	{
		l.show(this, "favories");
		repaint();
	}
	public void showSettings()
	{
		l.show(this,"settings");
		repaint();
	}
	
	

	

}

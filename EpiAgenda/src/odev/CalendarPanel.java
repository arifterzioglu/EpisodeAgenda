package odev;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class CalendarPanel extends JPanel 
{
	private JTable table;

	/**
	 * Create the panel.
	 */
	DatabaseConnection i1 = new DatabaseConnection();

	Image image;
	public CalendarPanel(User u) 
	{
		setLayout(null);
		image=new ImageIcon("takvim.jpg").getImage();


	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(image,0,0,500,400,null);
		Calendar myc;
		myc = Calendar.getInstance();
		int dayOfWeek = myc.get(myc.DAY_OF_WEEK);
		int dayOfMonth = myc.get(myc.DAY_OF_MONTH);
		int currentYear = myc.get(myc.YEAR);
		int currentMonth = myc.get(myc.MONTH);
		int mondayMonth, tuesdayMonth, wednesdayMonth,thursdayMonth ,fridayMonth,saturdayMonth;


		currentMonth++;

		int isSunday;
		int sundayMonth = currentMonth;
		System.out.println("ay"+ currentMonth);
		System.out.println("Ayin kaci" +dayOfMonth);
		System.out.println("haftanin kacinci günü" +dayOfWeek);

		int  [] week = new int[7];

		if(dayOfWeek ==1)
		{
			isSunday= dayOfMonth;
		}
		else if(dayOfWeek==2)
		{
			isSunday= dayOfMonth-1;
		}
		else if(dayOfWeek==3)
		{
			isSunday= dayOfMonth-2;
		}
		else if(dayOfWeek==4)
		{
			isSunday= dayOfMonth-3;
		}
		else if(dayOfWeek==5)
		{
			isSunday= dayOfMonth-4;
		}
		else if(dayOfWeek==6)
		{
			isSunday= dayOfMonth-5;
		}
		else
		{
			isSunday= dayOfMonth-6;
		}

		week[0]=isSunday;

		for(int  z= 1 ; z<week.length; z++)
		{

			if( week[z-1] == 31&&  (currentMonth ==1 ||currentMonth ==3 ||currentMonth ==5 ||currentMonth ==7 ||currentMonth ==9 ||currentMonth ==11) )
			{
				currentMonth ++;
				isSunday= 1;
				week[z]= isSunday;
			}
			else if(week[z-1] == 30 && (currentMonth ==4 ||currentMonth ==6 ||currentMonth ==8 ||currentMonth ==10 ||currentMonth ==12))
			{
				currentMonth++;
				isSunday= 1;
				week[z]= isSunday;
			}
			else if( week[z-1]== 2 && currentMonth == 2 )
			{
				currentMonth++;
				isSunday = 1;
				week[z]= isSunday;
			}

			else
			{
				isSunday++;
				week[z]= isSunday;

			}
			if(z == 0)
			{
				sundayMonth = currentMonth;
			}
			if(z == 1)
			{
				mondayMonth = currentMonth;
			}
			if(z == 2)
			{
				tuesdayMonth = currentMonth;
			}
			if(z == 3)
			{
				wednesdayMonth = currentMonth;
			}
			if(z == 4)
			{
				thursdayMonth = currentMonth;
			}
			if(z == 5)
			{
				fridayMonth = currentMonth;
			}
			if(z == 6)
			{
				saturdayMonth = currentMonth;
			}
		}



		DateTime sunday = new DateTime(currentYear,sundayMonth,week[0],0,0);
		i1.dbConnectionSeries();


		ArrayList<Integer> days = i1.getDays();
		ArrayList<Integer> months  = i1.getMonth();
		ArrayList<Integer> years  = i1.getYear();
		ArrayList<String>  name = i1.getAllEpisode();
		ArrayList<String>  eands = i1.getEpisodeAndSeason();

		for(int i = 0 ; i<days.size() ; i++)
		{		
			DateTime episodeDate = new DateTime(years.get(i),months.get(i),days.get(i),0,0);
			int x = Math.abs(Days.daysBetween(sunday,episodeDate).getDays());
			System.out.println("Aradaki gun farki " + x);


			if(x == 0)
			{
				// print sunday
				page.drawString(week[0]+"."+currentMonth+"."+currentYear,0,100);
				page.drawString(name.get(i)+ " " + eands.get(i),0,200);
			}

			if(x == 1)
			{
				//print monday
				page.drawString(week[1]+"."+currentMonth+"."+currentYear,75,100);
				page.drawString(name.get(i)+ " " + eands.get(i),75,200);
			}

			if(x == 2)
			{
				//print tuesday
				page.drawString(week[2]+"."+currentMonth+"."+currentYear,150,100);
				page.drawString(name.get(i)+ " " + eands.get(i),150,200);
			}

			if(x == 3)
			{
				//çarþa wednesday
				page.drawString(week[3]+"."+currentMonth+"."+currentYear,225,100);
				page.drawString(name.get(i)+ " " + eands.get(i),225,200);
			}

			if(x == 4)
			{
				//print thursday
				page.drawString(week[4]+"."+currentMonth+"."+currentYear,300,100);
				page.drawString(name.get(i)+ " " + eands.get(i),300,200);
			}

			if(x == 5)
			{
				//print friday
				page.drawString(week[5]+"."+currentMonth+"."+currentYear,375,100);
				page.drawString(name.get(i)+ " " + eands.get(i),375,200);
			}		

			if(x == 6)
			{
				//print saturday
				page.drawString(week[6]+"."+currentMonth+"."+currentYear,450,100);
				page.drawString(name.get(i)+ " " + eands.get(i),450,200);
			}
			
		}
		repaint();
	}
}

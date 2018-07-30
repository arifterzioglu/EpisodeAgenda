package odev;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class jfavoriesTable extends AbstractTableModel {



	public static int count =0;
	private String[] culumnNames=
		{"TVShows","rates","RTrates"};

	User user;
	private jTable tab;
	public jfavoriesTable(User u)
	{
		user=u;	
		tab = new jTable(u);
	}
	public int getColumnCount(){
		return 3;
	}
	@Override
	public int getRowCount() {

		DatabaseConnection u1 = new DatabaseConnection();
		u1.dbConnection();
		IntroPage m1 = new IntroPage();

		ArrayList<Integer> arr = u1.getFavSeriesID(m1.newUser);
		ArrayList<Series> arr2 = u1.getSeriesFromFav(arr);

		return arr.size();
	}
	public String getColumnName(int column){
		return culumnNames[column];
	}

	public Object getValueAt(int rowIndex, int columnIndex) {

		DatabaseConnection u1 = new DatabaseConnection();
		u1.dbConnection();


		u1.dbConnection();
		IntroPage m1 = new IntroPage();

		ArrayList<Integer> arr = u1.getFavSeriesID(m1.newUser);
		ArrayList<Series> arr2 = u1.getSeriesFromFav(arr);

		String showName=arr2.get(0).getTitle();
		String rate=arr2.get(0).getImdbRate();
		String rtRate=""+u1.getRotten(arr2.get(0).getTitle());
		if(columnIndex==0){
			for(int i = 0; i<arr.size();i++)
			{
				if(rowIndex ==i)
				{
					showName=arr2.get(i).getTitle();

				}
			}

			return showName;

		}
		else if(columnIndex==1)
		{   String shw = "";
		for(int i = 0; i<arr.size();i++)
		{
			if(rowIndex ==i)
			{
				shw=arr2.get(i).getTitle();
				for(int j = 0; j<7;j++)
				{
					if(shw.equals(tab.getValueAt(j, 0)))
						return tab.getValueAt(j,1);
				}

			}
		}

		return rate;              

		}

		else if(columnIndex==2 )
		{
			
			for(int i = 0; i<arr.size();i++)
			{	
				String shw ="";
				if(rowIndex ==i)
				{
					shw=arr2.get(i).getTitle();
					for(int j = 0; j<7;j++)
					{
						if(shw.equals(tab.getValueAt(j, 0)))
							return tab.getValueAt(j,2);
					}

				}
			}

			return rtRate ;

		}
		else
		{

			return "unknown";
		}

	}       

}

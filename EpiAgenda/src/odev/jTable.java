package odev;

import javax.swing.table.AbstractTableModel;

public class jTable extends AbstractTableModel {
	
	
	
	
	
	  private String[] culumnNames=
		    {"TVShows","rates","RTrates"};
	
	  User user;
	public jTable(User u)
	{
		user=u;	
	}
	 public int getColumnCount(){
		    return 3;
    }
	@Override
	public int getRowCount() {
		
		
		return 7;
	}
	 public String getColumnName(int column){
		    return culumnNames[column];
		  }
	 
	 
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		String showName="show";
		String rate="rate";
		String rtRate="rrate";
		if(columnIndex==0)
		{   
			if(rowIndex==0)
			{
				showName = "Arrow";
				return showName;
			}
			else if(rowIndex==1)
			{
				showName = "Game Of Thrones";
				return showName;
			}
			else if(rowIndex==2)
			{
				showName = "Mr Robot";
				return showName;
			} 			
			else if(rowIndex==3)
			{
				showName = "Orange Is the New Black";
				return showName;
			} 				
			else if(rowIndex==4)
			{
				showName = "The Flash";
				return showName;
			} 			
			else if(rowIndex==5)
			{
				showName = "The Walking Dead";
				return showName;
			}			
			else if(rowIndex==6)
			{
				showName = "True Detective";
				return showName;
			}
			
			return showName;
		}
		
		
		else if(columnIndex==1)
		{
			if(rowIndex==0)
			
				return "8.2";
			
			else if(rowIndex==1)
				return "8.8";
			
			else if(rowIndex==2)
				return "9.4";
			
			else if(rowIndex==3)
				return "7.4";
			
			else if(rowIndex==4)
				return "8.6";
			
			else if(rowIndex==5)
				return "8,9";
			
			else if(rowIndex==6)
				return "9.3";             
		   
		     return rate;
		 }
		    
		    else if(columnIndex==2)
		   {				
		    if(rowIndex==0)			
			return "8.1";
			
			else if(rowIndex==1)
				return "9.5";
			
			else if(rowIndex==2)
				return "9.2";
			
			else if(rowIndex==3)
				return "8.4";
			
			else if(rowIndex==4)
				return "8.3";
			
			else if(rowIndex==5)
				return "8.7";
			
			else if(rowIndex==6)
				return "9.7"; 
			    return rtRate ;

		    }
		    else
		    {
		    	return rtRate;
		    }
		
	} 

}

package odev;

import javax.swing.table.AbstractTableModel;

public class upComingTable extends AbstractTableModel {
	
	
	
	//  BU  JTABLE SERÝLER ÝÇÝN
	// KULLANICININ  SERÝLERÝ ÇEKÝLECEK 
	
	  private String[] culumnNames=
		    {"TVShows","Episode Numb","Date","Time"};
	
	  User user;
	public upComingTable(User u)
	{
		user=u;	
	}
	 public int getColumnCount(){
		    return 4;
    }
	@Override
	public int getRowCount() {
		return 2;
	}
	 public String getColumnName(int column){
		    return culumnNames[column];
		  }
	 
	public Object getValueAt(int rowIndex, int columnIndex) {
		

		String showName="show";
		String epNumber="";
		String date="21/10/2015";
		String time="22:00";
		
		
		if(columnIndex==0)
		{
			if(rowIndex == 0)
				return "Mr Robot";
			else if(rowIndex == 1)
				return "True Detective";
			
			return showName;
		    
		}
		
		
		
		
		else if(columnIndex==1){
			if(rowIndex == 0)
				return "S1. Ep.5 eps.1.5_br4ve-trave1er.asf";
			else if(rowIndex == 1)
				return "S2. Ep.7 Black Maps and Motel Rooms";
			
		        return epNumber;              
		   
		      }
		    
		    else if(columnIndex==2){
		    	
				if(rowIndex == 0)
					return "29/07/2015 Wednesday";
				else if(rowIndex == 1)
					return "02/08/2015 Sunday";
			    return date ;

		    }
		    else if(columnIndex==3)
		    {
		    	if(rowIndex == 0)
					return "1:00 pm on USA ";
				else if(rowIndex == 1)
					return "9 pm on HBO";
			    
		    	return time;
		    }
		    else
		    {
		    	return "unknown";
		    }
	}       

}
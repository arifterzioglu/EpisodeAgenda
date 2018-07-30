package odev;
import java.sql.*;
import java.util.*;
public class DatabaseConnection 
{

	
	
	Connection con=null;
	private boolean check = false;
	public static int count=0;
	
	Model i8;
	public Connection dbConnection()
	{
		
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Arif\\Desktop\\database\\EpisodeAgenda.sqlite");
	     
	    

	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	     return con;
	}
	public Connection dbConnectionSeries()
	{
		
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Arif\\Desktop\\database\\Series.sqlite");
	     
	    

	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	     return con;
	}
	
	public void addUser(User obj)
	{
		
		try {
			String mystr="Insert into UserInfo(UserID,UserName,UserPassword,Gender,imageURL) values ('"+ obj.getId() +"','"+ obj.getUserName() +"','"+obj.getPassword() +"','"+ obj.getGender() +"','"+""+"')";
			 PreparedStatement pst = con.prepareStatement(mystr);
			 pst.execute();
			 pst.close();
			} catch ( Exception e ) {
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			}
		
	}
	public int getLastIndex()
	{
		int x = 0;
		try {
			
			Statement stmt = null;
			 stmt = con.createStatement();
		     ResultSet rs = stmt.executeQuery( "SELECT * FROM UserInfo;" );
		      
		      while ( rs.next() )
		      {
		        
		        	  
		    	  x = rs.getInt("UserID");
			         
			          
		          
		       }
		      stmt.close();
			} catch ( Exception e ) {
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			}
		
	      return x;
	}
	
	
		public User  check(String name,String password)
		{
			User i1= null;
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM UserInfo;" );
			     
			      while ( rs.next() ) 
			      {
			          if(name.equals(rs.getString("UserName")) && password.equals(rs.getString("UserPassword")) )
			          {
			        	  
			        	  i1 = new User(rs.getInt("UserID"),rs.getString("UserName"),rs.getString("UserPassword"),rs.getString("Gender"));
				          check = true;
			          }
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
		      return i1;
		
	}
		
		
		public boolean isCheck() {
			return check;
		}
		
		
		public void addFavourite(Series obj,User temp)
		
		
		{
			
				try
				{
				String mystr="Insert into Favourite(SeriesID,UserID) values ('"+ obj.getId() +"','"+ temp.getId() +"')";
				 PreparedStatement pst = con.prepareStatement(mystr);
				 pst.execute();
				 pst.close();
				 count++;
				 
				}
				catch ( Exception e ) 
				{
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
		}
		
		public ArrayList<Integer> getFavSeriesID(User obj)
		
		{
			ArrayList<Integer> arr =  new <Integer>ArrayList();
			
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM Favourite;" );
			     
			      while ( rs.next() ) 
			      {
			          if(obj.getId()==rs.getInt("UserID")) 
			          {
			        	  
			        	  System.out.println(rs.getInt("SeriesID"));
			        	  arr.add(rs.getInt("SeriesID"));
			          }
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
		      return arr;
	
		}
		
		
		public ArrayList<Series> getSeriesFromFav(ArrayList<Integer> arr)
		{		
			
			i8 = new Model();
			ArrayList<Series> k1 = new <Series>ArrayList();
			
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM SeriesInfo;" );
			     
			     
			      while ( rs.next()  ) 
			      {
			         for(int i = 0; i< arr.size();i++)
			         {
			        	 if(arr.get(i)==rs.getInt("SeriesID"))
			        	 {
			        		 Series i1 = i8.search(rs.getString("Series"));
			        		 k1.add(i1);
			        		 
			        	 }
			         }
			    	  
			      }
			      
			       
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			return k1;
			
		}
		
		public int getSeriesID(String name)
		{
			int x = 0;
			
				try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM SeriesInfo;" );
			     
			      while ( rs.next() ) 
			      {
			          if(name.equals(rs.getString("Series"))) 
			          {
			        	  
			        	 x= rs.getInt("SeriesID");
			          }
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
				
				return x;
			
		}
		
		public String getSeriesLink(String name)
		{
			String result="";

			try {
			
			Statement stmt = null;
			
			 stmt = con.createStatement();
			
		     ResultSet rs = stmt.executeQuery( "SELECT * FROM SeriesInfo;" );
		     
		      while ( rs.next() ) 
		      {
		          if(name.equals(rs.getString("Series"))) 
		          {
		        	  
		        	 result = rs.getString("OMDBID");
		          }
		       }
		      stmt.close();
		      
			} 
			catch ( Exception e ) {
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			}
			return result;
			
		}
		
		public String getVideoLink(String name)
		{
			String result="";

			try {
			
			Statement stmt = null;
			
			 stmt = con.createStatement();
			
		     ResultSet rs = stmt.executeQuery( "SELECT * FROM SeriesInfo;" );
		     
		      while ( rs.next() ) 
		      {
		          if(name.equals(rs.getString("Series"))) 
		          {
		        	  
		        	 result = rs.getString("VideoLink");
		          }
		       }
		      stmt.close();
		      
			} 
			catch ( Exception e ) {
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			}
			return result;
			
		}
		
		public String getRotten(String name)
		{
			double x=0;
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM SeriesInfo;" );
			     
			      while ( rs.next() ) 
			      {
			          if(name.equals(rs.getString("Series"))) 
			          {
			        	  
			        	 x = rs.getDouble("RottenTomatoes");
			          }
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			return ""+x;
		}
		
		
		
		
		public ArrayList<String> getAllComments(String SeriesName)
		{
			ArrayList<String> arr = new <String>ArrayList();
			
			int x = getSeriesID(SeriesName);
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM RateAndComment;" );
			     
			      while ( rs.next() ) 
			      {
			          if(x==rs.getInt("SeriesID"))
			          {
			        	  
			        	 arr.add(rs.getString("Comment"));
			          }
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
			return arr;
			
		}
		
		
		public String getSingleComment(User temp,String name)
		{
			String result= "";
			int x = getSeriesID(name);
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM RateAndComment;" );
			     
			      while ( rs.next() ) 
			      {
			          if(x==rs.getInt("SeriesID") && temp.getId()==rs.getInt("UserID"))
			          {
			        	  result = rs.getString("Comment");
			        	 
			          }
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
		return result;
		}
		
		public double computeOveralRate(String name)
		{
			double y =0;
			double count = 0;
			int x = getSeriesID(name);
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM RateAndComment;" );
			     
			      while ( rs.next() ) 
			      {
			          if(x==rs.getInt("SeriesID") )
			          {
			        	  y=y+rs.getInt("Rate");
			        	  count++;
			          }
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			return y/count;

		}
		
		
		public String getEpisodeLink(String name,int season,int episode)	
		{
			String result="";
			
			String name2= name+"Season"+season;
			
			try {
			
			Statement stmt = null;
			
			 stmt = con.createStatement();
			
		     ResultSet rs = stmt.executeQuery( "SELECT * FROM "+name2+";" );
		     
		      while ( rs.next() ) 
		      {
		    	  
		          if( season == rs.getInt("SeasonNumber")&& episode== rs.getInt("EpisodeNumber")) 
		          {
		        	  
		        	 result =result+ rs.getString("OMDB");
		          }
		       }
		      stmt.close();
		      
			} 
			catch ( Exception e ) {
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			}
			return result;
			
		}
		public void insertCommentAndRate(String name,User temp)
		{

			try
			{
			String mystr="Insert into RateAndComment(UserID,SeriesID,Rate,Comment) values ('"+ temp.getId()  +"','"+ getSeriesID(name)+"','"+ temp.getRate()+"','"+ temp.getComment()+"')";
			 PreparedStatement pst = con.prepareStatement(mystr);
			 pst.execute();
			 pst.close();
			 
			}
			catch ( Exception e ) 
			{
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			}
			
		}
		
		public void deleteFromFavourites(User temp, String seriesName)
		{
			dbConnection();
			int x = getSeriesID(seriesName);
			seriesName = seriesName.replaceFirst("o", "O");
			try {
				String mystr = "DELETE FROM Favourite WHERE SeriesID ="+x+" AND "+" UserID ="+temp.getId();
			
				 PreparedStatement pst = con.prepareStatement(mystr);
				 pst.execute();
				 pst.close();
				
		  
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
		}
		public void updateImageURL(String url,User i1)
		{
			try {
				String mystr="Update UserInfo set imageURL='"+i1.getImageURL()+" where userID="+i1.getId();
				 PreparedStatement pst = con.prepareStatement(mystr);
				 pst.execute();
				 pst.close();
				} catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
		}
		
		public void updateUserInfo(User update)
		{
			try {
				String mystr="UPDATE UserInfo SET UserName='"+update.getUserName()+"' WHERE UserID='"+update.getId()+"'";
				 PreparedStatement pst = con.prepareStatement(mystr);
				 pst.execute();
				 pst.close();
				} catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
		}
		public void updateUserInfo2(User update)
		{
			try {
				String mystr="UPDATE UserInfo SET UserPassword='"+update.getPassword()+"' WHERE UserID='"+update.getId()+"'";
				 PreparedStatement pst = con.prepareStatement(mystr);
				 pst.execute();
				 pst.close();
				} catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
		}
		
		
		public ArrayList<String> getAllEpisode()
		{
			ArrayList<String> arr = new <String>ArrayList();
			
			
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM MrRobot;" );
			     
			      while ( rs.next() ) 
			      {
			           
			        	 arr.add(rs.getString("EpisodeName"));
			          
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
			return arr;
			
		}
		public ArrayList<String> getEpisodeAndSeason()
		{
			ArrayList<String> arr = new <String>ArrayList();
			
			
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM MrRobot;" );
			     
			      while ( rs.next() ) 
			      {
			           
			        	 arr.add(rs.getString("EpisodeandSeason"));
			          
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
			return arr;
			
		}
		public ArrayList<Integer> getDays()
		{
			ArrayList<Integer> arr = new <Integer>ArrayList();
			
			
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM MrRobot;" );
			     
			      while ( rs.next() ) 
			      {
			           
			        	 arr.add(rs.getInt("Day"));
			          
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
			return arr;
			
		}
		public ArrayList<Integer> getMonth()
		{
			ArrayList<Integer> arr = new <Integer>ArrayList();
			
			
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM MrRobot;" );
			     
			      while ( rs.next() ) 
			      {
			           
			        	 arr.add(rs.getInt("Month"));
			          
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
			return arr;
			
		}
		public ArrayList<Integer> getYear()
		{
			ArrayList<Integer> arr = new <Integer>ArrayList();
			
			
			try {
				
				Statement stmt = null;
				
				 stmt = con.createStatement();
				
			     ResultSet rs = stmt.executeQuery( "SELECT * FROM MrRobot;" );
			     
			      while ( rs.next() ) 
			      {
			           
			        	 arr.add(rs.getInt("Year"));
			          
			       }
			      stmt.close();
			      
				} 
				catch ( Exception e ) {
				      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				      System.exit(0);
				}
			
			
			return arr;
			
		}
		
		
}

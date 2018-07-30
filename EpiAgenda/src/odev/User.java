package odev;

public class User 
{
	private String userName;
	private String password;
	private int id;
	private String color;
	String imageURL;
	String gender;
	
	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	//rateide set metodu ile alýn
	private double rate;
	
	public User(int id, String userName, String password,String gender) 
	{
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.imageURL = imageURL;
		this.gender = gender;
	}
	
	
	
	public String getImageURL() {
		return imageURL;
	}



	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}



	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	//commenti set metodu ile alýn
	private String comment;


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	//kullanýcý olustururkan id kýsmýna databasconnectiondaki getlastindexmetodunu kullanýn
	

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", id=" + id + ", color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	

}

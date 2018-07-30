package odev;



public class Series {
	String title;
	String imdbRate;
	String year;
	String released;
	String actors;
	String plot;
	String language;
	String country;
	String awards;
	String photosLink;
	String imdbID;
	int id;
	Double rotten;
	
	public Double getRotten() {
		return rotten;
	}
	public void setRotten(Double rotten) {
		this.rotten = rotten;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImdbRate() {
		return imdbRate;
	}
	public void setImdbRate(String imdbRate) {
		this.imdbRate = imdbRate;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getPhotosLink() {
		return photosLink;
	}
	public void setPhotosLink(String photosLink) {
		this.photosLink = photosLink;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public Series(String title, String imdbRate,String year, String released,
			String actors, String plot, String language, String country,
			String awards, String photosLink, String imdbID,int id) 
	{
		super();
		this.title = title;
		this.imdbRate = imdbRate;
		this.year=year;
		this.released = released;
		this.actors = actors;
		this.plot = plot;
		this.language = language;
		this.country = country;
		this.awards = awards;
		this.photosLink = photosLink;
		this.imdbID = imdbID;
		this.id = id;
	}
	@Override
	public String toString()
	{
		return "Series " + title + "\n imdbRate:" + imdbRate + "\n year:"
				+ year + " \nreleased:" + released + "\n actors:" + actors
				+ "\n plot:" + plot + "\n language:" + language + " \ncountry:"
				+ country + "\n awards:" + awards + "\n photosLink:" + photosLink
				+ "\n imdbID:" + imdbID;
	}
	


}

package odev;


public class Episode  
{

	String episodeTitle;
	String year;
	String released;
	String season;
	String episodeNumber;
	String duration;
	String genre;
	String director;
	String plot;
	String language;
	String country;
	String Poster;
	String imdbRating;
	String imbdID;
	String seriesID;
	String actor;
	public String getEpisodeTitle() {
		return episodeTitle;
	}
	public void setEpisodeTitle(String episodeTitle) {
		this.episodeTitle = episodeTitle;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(String episodeNumber) {
		this.episodeNumber = episodeNumber;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
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
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String poster) {
		Poster = poster;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImbdID() {
		return imbdID;
	}
	public void setImbdID(String imbdID) {
		this.imbdID = imbdID;
	}
	public String getSeriesID() {
		return seriesID;
	}
	public void setSeriesID(String seriesID) {
		this.seriesID = seriesID;
	}
	@Override
	public String toString() {
		return "Episode episodeTitle=" + episodeTitle + ",\n year=" + year
				+ ", \nreleased=" + released + ", \nseason=" + season
				+ ",\n episodeNumber=" + episodeNumber + ",\n duration=" + duration
				+ ",\n genre=" + genre + ", \ndirector=" + director + ",\n plot="
				+ plot + ", \n language=" + language + ",\n country=" + country
				+ ",\n Poster=" + Poster + ",\n imdbRating=" + imdbRating
				+ ",\n imbdID=" + imbdID + ",\n seriesID=" + seriesID + ",\n2 actor="
				+ actor;
	}
	public Episode(String episodeTitle, String year, String released,
			String season, String episodeNumber, String duration, String genre,
			String director, String plot, String language, String country,
			String poster, String imdbRating, String imbdID, String seriesID,String actors) 
	{
		
		

		this.episodeTitle = episodeTitle;
		this.year = year;
		this.released = released;
		this.season = season;
		this.episodeNumber = episodeNumber;
		this.duration = duration;
		this.genre = genre;
		this.director = director;
		this.plot = plot;
		this.language = language;
		this.country = country;
		this.Poster = poster;
		this.imdbRating = imdbRating;
		this.imbdID = imbdID;
		this.seriesID = seriesID;
		this.actor =actors;
	}
	
	
	

}

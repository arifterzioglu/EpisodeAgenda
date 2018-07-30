package odev;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Model {
	DatabaseConnection i1 =  new DatabaseConnection();
	
	
	//Bu method ismini kesinlikle ama kesinlike düzenli bir þekilde girdiðiniz dizinin objesini yaratýr.Kullanýrken series objesine eþitlryip kullanýn genel bilgiler içeren kýsmý
	// her bölüm için obje döndüren metodda aþagý bakýn
	public Series search(String strToSearch)
	{
		
		i1.dbConnection();
		Series returnSeries = null;

		String url = i1.getSeriesLink(strToSearch);
		
		MySimpleUrlReader urlRead = new MySimpleUrlReader(url);
		String pageContent = urlRead.getPageContents();
		System.out.println(pageContent);
		
		DocumentBuilderFactory factory =
		DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			ByteArrayInputStream input =  new ByteArrayInputStream(pageContent.getBytes("UTF-8"));
			Document doc = builder.parse(input);
			Element rootElement = doc.getDocumentElement();
			Element movieElement = (Element)rootElement.getElementsByTagName("movie").item(0);
			returnSeries = new Series(movieElement.getAttribute("title"), movieElement.getAttribute("imdbRating"),movieElement.getAttribute("year"),movieElement.getAttribute("released"),movieElement.getAttribute("actors"),movieElement.getAttribute("plot"),movieElement.getAttribute("language"),movieElement.getAttribute("country"),movieElement.getAttribute("awards"),movieElement.getAttribute("poster"),movieElement.getAttribute("imdbID"),i1.getSeriesID(strToSearch));
			//System.out.println(movieElement.getAttribute("title"));
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnSeries;
	}
	
	public Episode search2(String strToSearch,int season,int episode)
	{
		
		i1.dbConnection();
		Episode returnSeries = null;

		String url = i1.getEpisodeLink(strToSearch, season, episode);
		System.out.println(url);
		MySimpleUrlReader urlRead = new MySimpleUrlReader(url);
		String pageContent = urlRead.getPageContents();
		System.out.println(pageContent);
		
		DocumentBuilderFactory factory =
		DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			ByteArrayInputStream input =  new ByteArrayInputStream(pageContent.getBytes("UTF-8"));
			Document doc = builder.parse(input);
			Element rootElement = doc.getDocumentElement();
			Element movieElement = (Element)rootElement.getElementsByTagName("movie").item(0);
			returnSeries = new Episode(movieElement.getAttribute("title"),movieElement.getAttribute("year"),movieElement.getAttribute("released"),movieElement.getAttribute("season"),movieElement.getAttribute("episode"),movieElement.getAttribute("runtime"),movieElement.getAttribute("genre"),movieElement.getAttribute("director"),movieElement.getAttribute("plot"),movieElement.getAttribute("language"),movieElement.getAttribute("country"),movieElement.getAttribute("poster"),movieElement.getAttribute("imdbRating"),movieElement.getAttribute("imdbID"),movieElement.getAttribute("seriesID"),movieElement.getAttribute("actors"));
			//System.out.println(movieElement.getAttribute("title"));
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnSeries;
	}

}

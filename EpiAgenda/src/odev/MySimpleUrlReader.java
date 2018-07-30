package odev;
import cs1.SimpleURLReader;

public class MySimpleUrlReader extends SimpleURLReader 
{
	
	String url;
	public MySimpleUrlReader(String url)
	{
		super(url);
		this.url=url;	
	}
	
	String getUrl(String url)
	{
		return url;			
	}
	
	String getName()
	{
		for(int i=url.length()-1;i>=0;i--)
		{
			if(url.charAt(i)=='/')
			{
				return url.substring(i+1);
			}
		}
		return url;
	}
	
	public String getPageContents()
	{
		String result;
		result=super.getPageContents();
		return result.substring(4);
	}
	
	
	

}

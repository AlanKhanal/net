import java.lang.*;
import java.io.*;
import java.net.*;

public class lab3_host{
	public static void main(String args[]) throws MalformedURLException
	{
		URL url = new URL("http://www.gmail.com");
	
	try
	{
		System.out.println("Host Name: " + url.getHost());
		System.out.println("Port No.: " + url.getPort());
		System.out.println("Protocol used: " + url.getProtocol());
		
	}
	catch(Exception e)
	{
		System.out.println("error"+ e);
	}
}
}

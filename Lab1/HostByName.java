import java.net.*;
public class HostByName {

	public static void main(String[] args)
	{
		try 
		{
			InetAddress address = InetAddress.getByName("www.facebook.com");
			System.out.println(address);
		}
		catch(UnknownHostException ex)
		{
			System.out.println("Could not find www.facebook.com");
		}
	}
}

import java.net.*;
public class InetDemo{
	public static void main(String args[]){
		try
		{
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println("IP Address of Local Host "+ia); ia=InetAddress.getByName("");
			System.out.println("IP Address of "+ "args[]" + " : "+ia);
			
		}
		catch(UnknownHostException ue)
		{
			System.out.println("There is an error" +ue);
		}
	}
}

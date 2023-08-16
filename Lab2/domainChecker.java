//Program to verify the two given domain namve are same or not?
import java.net.*;

public class domainChecker{
    public static void main (String args[]){
        try{
            InetAddress domain1 = InetAddress.getByName("www.facebook.com");
            InetAddress domain2 = InetAddress.getByName("m.facebook.com");
            if(domain1.equals(domain2)){
                System.out.println("www.facebook.com is the same as m.facebook.com");
            }
            else{
                System.out.println("www.facebook.com is not same as m.facebook.com");
            }
        }
        catch(UnknownHostException ex){
            System.out.println("Host lookup failed");
        }
    }
}
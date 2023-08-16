//Program to find the IP address of the local machine

import java.net.*;

public class MyAddress{
    public static void main(String[] args){
        try{
            InetAddress me = InetAddress.getLocalHost();
            String dottedQuad = me.getHostAddress();
            System.out.println("My address: " + dottedQuad);
        }
        catch(UnknownHostException ex){
            System.out.println("Sorry, don't know my address");
        }
    }
}
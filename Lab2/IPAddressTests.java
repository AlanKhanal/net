//Determining IP Version

import java.net.*;

public class IPAddressTests{
    public static void main (String[] args){
        try{
            InetAddress ia = InetAddress.getByName("192.168.2.3");
            byte[] address = ia.getAddress();
            if(address.length==4)
                System.out.println("IPv4");
            else if(address.length==16)
                System.out.println("IPv6");
            }
            catch(UnknownHostException ex){
                System.out.println("Error! Not an IP");
            }
    }
}
//Program to test reachability

import java.net.*;

public class TestingReachability{
    public static void main(String[] a){
        try{
            InetAddress net = InetAddress.getByName("172.16.0.1");
            if(net.isReachable(100))
            System.out.println("Success");
            else
            System.out.println("Failed");
        }
        catch(Exception e){
        }
    }
}
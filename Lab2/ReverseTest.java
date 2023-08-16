// Program to find the hostname form the given address
import java.net.*;

public class ReverseTest{
    public static void main (String[] args) throws UnknownHostException{
        InetAddress ia = InetAddress.getByName("8.8.8.8");
        System.out.println(ia.getCanonicalHostName());
    }
}
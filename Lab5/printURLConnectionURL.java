//WAP to print the URL of a URLConnection
package Lab5;

import java.net.*;

public class printURLConnectionURL {
    public static void main(String[] args){
        try{
            URL url = new URL("https://www.oracle.com/");
            URLConnection connection = url.openConnection();
            System.out.println("URL of connection: " + connection.getURL());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

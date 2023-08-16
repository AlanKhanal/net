import java.io.*;
import java.net.*;

public class downloadObject{
    public static void main(String[] args){
        try{
            URL u = new URL(("https://www.oracle.com/"));
            Object o = u.getContent();
            System.out.println("Got a" + o.getClass().getName());
        }
        catch(MalformedURLException ex){
            System.out.println("Is not a parseable URL");        
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }
}
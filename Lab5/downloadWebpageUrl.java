//WAP to download a webpage using URLConnection
package Lab5;

import java.io.*;
import java.net.*;

public class downloadWebpageUrl {
    public static void main(String[] args){
        try{
            URL url = new URL("https://www.oracle.com/");
            URLConnection connection = url.openConnection();
            InputStream input = connection.getInputStream();
            FileOutputStream output = new FileOutputStream("home.html");

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1){
                output.write(buffer,0,bytesRead);
            }

            input.close();
            output.close();
            System.out.println("Webpage downloaded successfully.");
        }
        catch(IOException e){
            System.out.println("Error downloading webpage: " + e.getMessage());
        }
    }
}

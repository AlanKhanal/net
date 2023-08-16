//WAP assuming that HTTP server is running on the localhost (IP address 127.0.0.1) at oprt 8000.

import java.net.*;
import java.io.*; 

public class httpClient {
    public static void main(String[] args){
        try{
            //Create a URL object for the desired page
            URL url = new URL("https://www.oracle.com/");

            //Open a connection to thie URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //Set request method to GET
            connection.setRequestMethod("GET");

            //Send the request and receive the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
            //Disconnect the connection
            connection.disconnect();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

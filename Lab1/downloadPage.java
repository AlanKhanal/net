import java.net.*;
import java.io.*;
import java.util.*;

public class downloadPage {

    public static void main(String[] args) {
        
        try {
            // Create a URL object for the web page to download
            URL url = new URL("https://www.google.com/");
            
            // Open a connection to the web page and retrieve its properties
            URLConnection connection = url.openConnection();
            Map<String, List<String>> properties = connection.getHeaderFields();
            
            // Print out the properties of the web page
            for (Map.Entry<String, List<String>> entry : properties.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                System.out.println(key + ": " + value);
            }
            
            // Download the contents of the web page
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading from URL: " + e.getMessage());
        }
    }
}

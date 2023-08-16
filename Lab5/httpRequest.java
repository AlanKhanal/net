//WAP for HTTP Request method
package Lab5;

import java.net.*;
import java.io.*;

public class httpRequest {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.google.com/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("Response code: " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while((inputLine = in.readLine()) != null){
            response.append(inputLine);
        }
        in.close();
        System.out.println("Response body: " + response.toString());
    }
}

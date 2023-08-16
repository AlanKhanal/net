import java.net.*;
import java.io.*;

public class Download_webpage{
    public static void main(String[] args) throws IOException{
        String webPageUrl = "https://www.oracle.com/";
        URL url = new URL(webPageUrl);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("oracle.html"));

        String line;
        while((line = reader.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();

        System.out.println("Web page downloaded successfully.");
    }
}
//WAP for resolving relatives URI
import java.net.URI;
import java.net.URL;

public class relativesURI {
    public static void main(String[] args)throws Exception{
        String baseUrlString = "https://www.oracle.com/";
        String relativeUriString = "/page.html";

        URL baseUrl = new URL(baseUrlString);
        URI relativeUri = new URI(relativeUriString);

        URI resolvedUri = baseUrl.toURI().resolve(relativeUri);
        String resolveUriString = resolvedUri.toString();

        System.out.println("Resolved URI: " + resolveUriString);
    }
}

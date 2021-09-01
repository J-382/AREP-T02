package co.org.E2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        try {
            String site = "https://ldbn.is.escuelaing.edu.co/events/cloudnative2021/index.html";
            URL siteURL = new URL(site);
            URLConnection urlConnection = siteURL.openConnection();
            Map<String, List<String>> headers = urlConnection.getHeaderFields();
            Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();

            for(Map.Entry<String, List<String>> entry: entrySet){
                String headerName = entry.getKey();
                if(headerName != null ) {
                    System.out.print(headerName + ":");
                    List<String> headerValues = entry.getValue();
                    for(String value: headerValues) {
                        System.out.println(value);
                    }
                }
            }

            System.out.println("-------message-body-------");

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String inputLine = null;
                while ((inputLine = reader.readLine()) != null) {
                    System.out.println(inputLine);
                }
            } catch (Exception ex) {
                System.err.println(ex);
            }
            
        } catch (Exception e) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE,null, e);
        }
    }
}

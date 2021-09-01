package co.org.E1;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        try {
            URL url = new URL("https://www.google.com");
            System.out.println("URL: " + url.toString());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("File: " + url.getFile());
            System.out.println("Path: " + url.getPath());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Reference: " + url.getRef());
        } catch (MalformedURLException e) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE,null, e);
        }
    }
}

package utility;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by yangr on 2/27/2016.
 */
public class GeoLocationReader {

    public static JSONObject getAddress(double lat, double lon) {
        String targetURL = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + lat + "," + lon
                + "&key=AIzaSyBdPB-prc6QApzr6demSq1xrc8DckHw1b0";
        try {
            URL geoLocation = new URL(targetURL);
            URLConnection l = geoLocation.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(l.getInputStream()));
            String inputLine = in.readLine();
            String result = "";
            while (inputLine != null) {
                result += inputLine;
                inputLine = in.readLine();
            }
            in.close();
            JSONObject obj = new JSONObject(result);
            return obj;
        } catch (Exception e) {
            System.out.println("url exception");
        }
        return null;
    }
}

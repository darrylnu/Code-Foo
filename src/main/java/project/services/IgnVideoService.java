package project.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IgnVideoService {

    public String sendVideoRequest() throws Exception {

        String urlString = "http://ign-apis.herokuapp.com/videos?startIndex=3&count=10";

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        System.out.println("sending request to " + url);
        System.out.println("response code is " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String output;
        StringBuffer response = new StringBuffer();

        while ((output = in.readLine()) != null) {
            response.append(output);
        }
        in.close();

        //printing result from response
        System.out.println(response.toString());
        return response.toString();
    }
}

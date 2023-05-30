package com.herokuapp.theinternet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;


public class Token {
	@Test
    public  void testMethod1() {
        try {
            String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODQ1NjQxMTQuODU1MzIyOCwidXNlcm5hbWUiOiJta2cyNDMwMDFAZ21haWwuY29tIiwidG9rZW5faWQiOiI2NDQwZGI5MjEzMWRlNjhhNDQ4ZTJhYmQifQ.cecOiRnajy0YKgb9Sc5GKQchSW85Vi8VIy35mu2_RlI";
            String version = "v2";
            String apiUrl = "https://harmony-stg.optiq.ai/api/v1/clusters";

            // Build the request URL with token and version inputs
            URL url = new URL(apiUrl + "?version=" + version);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);

            // Read the response from the API
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            StringBuilder sb = new StringBuilder();
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
            System.out.println(sb.toString());

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






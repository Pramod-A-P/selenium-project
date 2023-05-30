package com.herokuapp.theinternet;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.testng.annotations.Test;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class DeleteID {
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void testDeleteServices() throws InterruptedException {
	    String[] ids = {"64549522c40ce5b90ebea6dd"};

	    try {
	        deleteServices(ids); // create an instance of the practice class and call deleteServices() on it
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	//"6454aa23c40ce5b90ebea725","6454ba7cc40ce5b90ebea77e","6454bceec40ce5b90ebea78a"
		
		public void deleteServices(String[] ids) throws IOException, InterruptedException {
		   

		    // http request
		    var url1 = "https://harmony-stg.optiq.ai";

	        var client = HttpClient.newBuilder().build();
	        var request = HttpRequest.newBuilder()
	                .GET()
	                .uri(URI.create(url1))
	                .build();

	        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
	        System.out.println(response.statusCode());
	        System.out.println(response.body());

		    OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
		    MediaType mediaType = MediaType.parse("text/plain");

		    for (String id : ids) {
		        RequestBody body = RequestBody.create(mediaType, "");
		        Request deleteRequest = new Request.Builder()
		                .url("https://harmony-stg.optiq.ai//api/v1/clusters/" + id)
		                .method("DELETE", body)
		                .addHeader("version", "v2")
		                .addHeader("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODQ1NjQxMTQuODU1MzIyOCwidXNlcm5hbWUiOiJta2cyNDMwMDFAZ21haWwuY29tIiwidG9rZW5faWQiOiI2NDQwZGI5MjEzMWRlNjhhNDQ4ZTJhYmQifQ.cecOiRnajy0YKgb9Sc5GKQchSW85Vi8VIy35mu2_RlI")
		                .build();
		        Response deleteResponse = okHttpClient.newCall(deleteRequest).execute();
		        System.out.println("Deleted service with id: " + id);
		    }
		} 
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		public class DeleteSingleId {			
			@Test
		public void callAPIforClusterDeleting() throws IOException, InterruptedException {
		    var url = "https://harmony-stg.optiq.ai/";

		    // http request
		    var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

		    var client = HttpClient.newBuilder().build();
		    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		    System.out.println(response.statusCode());
		    System.out.println(response.body());

		    OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
		    MediaType mediaType = MediaType.parse("text/plain");
		    RequestBody body = RequestBody.create(mediaType, "");
		    Request deleteRequest = new Request.Builder()
		        .url("https://harmony-stg.optiq.ai//api/v1/clusters/64549522c40ce5b90ebea6dd")
		        .method("DELETE", body)
		        .addHeader("version", "v2")
		        .addHeader("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODQ1NjQxMTQuODU1MzIyOCwidXNlcm5hbWUiOiJta2cyNDMwMDFAZ21haWwuY29tIiwidG9rZW5faWQiOiI2NDQwZGI5MjEzMWRlNjhhNDQ4ZTJhYmQifQ.cecOiRnajy0YKgb9Sc5GKQchSW85Vi8VIy35mu2_RlI")
		        .build();
		    Response deleteResponse = okHttpClient.newCall(deleteRequest).execute();
		}
			
		
	
	
	
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}}

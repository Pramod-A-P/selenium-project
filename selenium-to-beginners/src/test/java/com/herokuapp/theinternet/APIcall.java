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

public class APIcall {

	
	
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
	        .url("https://harmony-stg.optiq.ai//api/v1/clusters/644928c8330aba8a82ad97ca")
	        .method("DELETE", body)
	        .addHeader("version", "v2")
	        .addHeader("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODQ1NjQxMTQuODU1MzIyOCwidXNlcm5hbWUiOiJta2cyNDMwMDFAZ21haWwuY29tIiwidG9rZW5faWQiOiI2NDQwZGI5MjEzMWRlNjhhNDQ4ZTJhYmQifQ.cecOiRnajy0YKgb9Sc5GKQchSW85Vi8VIy35mu2_RlI")
	        .build();
	    Response deleteResponse = okHttpClient.newCall(deleteRequest).execute();
	}
		
		
		
		@Test
		public void callAPIforEnvironmentDeleting() throws IOException, InterruptedException {
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
		    		.url("https://harmony-stg.optiq.ai//api/v1/environments/64491170330aba8a82ad97c8")
		    		  .method("DELETE", body)
		    		  .addHeader("version", "v2")
		    		  .addHeader("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODI1NzYxNDUuOTk0Mzc1NSwidXNlcm5hbWUiOiJta2cyNDMwMDFAZ21haWwuY29tIiwidG9rZW5faWQiOiI2NDIyODYxMTg2YWI4MTQ0NzVhOTQwYTgifQ.jr9bRsS7SFxTEF9A6jqWvDJjxhY-FUCNM-75VTQmWmc")
		    		  .build();
		    Response deleteResponse = okHttpClient.newCall(deleteRequest).execute();
		}		
		
		
		public void deleteService() throws IOException, InterruptedException {
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
			    		.url("https://harmony-stg.optiq.ai//api/v1/service/6417fa94e2e6b5c1a6013c51")
			    		  .method("DELETE", body)
			    		  .addHeader("version", "v2")
			    		  .addHeader("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODIxNDgwNzQuMjE4OTQ0OCwidXNlcm5hbWUiOiJta2cyNDMwMDFAZ21haWwuY29tIiwidG9rZW5faWQiOiI2NDFiZmRlYTQzNzI5YzhhZDM5OGRlMWMifQ.r8wYuSZMcjTPA6vU-2MCcXAsISiZDVt--JYUTsP6ecU")
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
	
	
}

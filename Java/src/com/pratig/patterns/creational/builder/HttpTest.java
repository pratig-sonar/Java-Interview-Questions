package com.pratig.patterns.creational.builder;

public class HttpTest {

	public static void main(String[] args) {
//		HttpClient httpClient = new HttpClient("GET", "http://test", null, null, null, null);
		HttpClient client = new HttpClient.HttpClientBuilder()
				.method("POST")
				.secure("pratig", "sonar")
				.build();
		System.out.println(client);
	}

}

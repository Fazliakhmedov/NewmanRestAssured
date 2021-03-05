package com.Conduct;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class First {

	@Test
	public void Conduct() {
		 Response response =  RestAssured.given().accept("application/vnd.github.scarlet-witch-preview+json").header("Authorization","27d3662ae864c85664988ec17c9b35368b6bd9d9")
		.when().get("https://api.github.com/codes_of_conduct");
		response.prettyPrint();
		int responseCode = response.getStatusCode();
		System.out.println(responseCode);
		Assert.assertEquals(200, responseCode);
		
		
}
}
package com.vyom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class TC001_GET_Request {

	@Test
	void getUserDetails() {
		
		baseURI="https://reqres.in/api/users";
		
		RequestSpecification requestSpecification= given();
		Response response=requestSpecification.request(Method.GET, "/2");
		String resposeBody=response.getBody().asString();
		System.out.println("Response Body:"+resposeBody);
		
		int statusCode=response.getStatusCode();
		System.out.println("Status Code: "+statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		String statusLine=response.getStatusLine();
		System.out.println("Status Line : "+statusLine);
		
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
}

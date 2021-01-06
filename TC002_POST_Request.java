package com.vyom.qa.testcases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class TC002_POST_Request {

	@Test
	void registerUser() {
		
		baseURI="https://reqres.in/api";
		
		RequestSpecification requestSpecification= given();
		
		JSONObject requestParams=new JSONObject();
		requestParams.put("email", "rohan@gmail.com");
		//requestParams.put("job", "engineer");
		
		//requestSpecification.header("Content-Type","application/json");
		requestSpecification.body(requestParams.toJSONString());
		
		Response response=requestSpecification.request(Method.POST,"/register");
		
		String resposeBody=response.getHeader("Content-Type");
		System.out.println("Response Body:"+resposeBody);
		
		Assert.assertEquals(resposeBody, "application/json; charset=utf-8");
		/*
		 * int statusCode=response.getStatusCode();
		 * System.out.println("Status Code: "+statusCode);
		 * 
		 * Assert.assertEquals(statusCode, 400);
		 * 
		 * String statusLine=response.getStatusLine();
		 * System.out.println("Status Line : "+statusLine);
		 * 
		 * Assert.assertEquals(statusLine, "HTTP/1.1 400 Bad Request");
		 * 
		 * System.out.println("Get:"+response.jsonPath().get("error"));
		 * 
		 * Assert.assertEquals(response.jsonPath().get("error"), "Missing password");
		 */
		
		
	}
}

package com.vyom.qa.testcases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_PUSH_Request {

	@Test
	void getUserDetails() {
		
		baseURI="https://reqres.in/api/users";
		
	}
}

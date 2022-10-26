package com.dt.api.tests;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

//import static io.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

@Test
public class testExample {
	
	
	
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmluZGh5YXJAYnl0ZXJpZGdlLmNvbSIsImZpcnN0TmFtZSI6IlZpbmRoeWEiLCJsYXN0TmFtZSI6IlJhamVuZGVyIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjU3Mzc0ODcsImV4cCI6MTY2NTc0MTA4N30.dcu_y1THdP74hS_2C5Kt8xnLr1qHKEnt9WFuQchy1Lg";
	
	/*
	 * public void test_1() { Response response =
	 * get("https://petstore.swagger.io/v2/store/inventory");
	 * System.out.println(response.getStatusCode());
	 * System.out.println(response.getTime());
	 * System.out.println(response.getBody().toString());
	 * System.out.println(response.getStatusLine());
	 * System.out.println(response.getHeader("content-type"));
	 * 
	 * int actualstatusCode = response.getStatusCode();
	 * assertEquals(actualstatusCode, 200); response.getStatusCode();
	 * response.getTime();
	 * 
	 * 
	 * }
	 */
	
	@Test
	public void testGet() {
		baseURI = "https://api-qa.dthreaddev.com/api";
		Response response = given().headers("Authorization","bearer "+token, "accept" ,"application/json")
		.get("/users/invites").andReturn();
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getTime());
		 System.out.println(response.getBody().toString());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getHeader("content-type"));
		 assertEquals(response.getStatusCode(),200);
		//.then()
		//.statusCode(200);
	}
	
	@Test
	public void testPost() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("", "");
		map.put("", "");
		System.out.println(map);
		JSONObject request = new JSONObject();
		request.put("", "");
		request.put("", "");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		baseURI="";
		given()
		.header("Authorization","bearer "+token,"accept" ,"application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("")
		.then()
		.statusCode(200);
		
}
	
	public void testPUT()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("", "");
		map.put("", "");
		System.out.println(map);
		JSONObject request = new JSONObject();
		request.put("", "");
		request.put("", "");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		baseURI="";
		given()
		.header("Authorization","bearer "+token,"accept" ,"application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("")
		.then()
		.statusCode(200);
	}
	
	public void testPATCH() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("", "");
		map.put("", "");
		System.out.println(map);
		JSONObject request = new JSONObject();
		request.put("", "");
		request.put("", "");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		baseURI="";
		given()
		.header("Authorization","bearer "+token,"accept" ,"application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("")
		.then()
		.statusCode(200);
		
	}
	public void testDELETE() {
		when()
		.delete("")
		.then()
		.statusCode(200)
		.log().all();
	}
}

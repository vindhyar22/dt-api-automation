package com.dt.api.users.post;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.dt.api.main.Config;

import io.restassured.http.ContentType;

public class testPOST_AcceptInvitation {
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmluZGh5YXJAYnl0ZXJpZGdlLmNvbSIsImZpcnN0TmFtZSI6IlZpbmRoeWEiLCJsYXN0TmFtZSI6IlJhamVuZGVyIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjU3NDYwNzcsImV4cCI6MTY2NTc0OTY3N30.Vn2ZMBsSBcCIgU4OTOSQa8ijGfMe19kAcns5fIQSwt8";
	@SuppressWarnings("unchecked")
	@Test
	public void testPost001() throws FileNotFoundException, IOException {
		
		JSONObject request = new JSONObject();
		request.put("roleId", "e441ad2a-8d55-471c-ba2b-992bb8d3e171");
		request.put("propertyId", "db1acab2-9e53-45b2-a9ca-84b51f7aa517");
		request.put("isAccepted", "true");
		//System.out.println(request);
		System.out.println(request.toJSONString());
		
		baseURI="https://api-qa.dthreaddev.com/api";
		given()
		.header("Authorization","bearer "+Config.getToken(),"accept" ,"application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/users/acceptinvitation")
		.then()
		.statusCode(401);
		
}


}

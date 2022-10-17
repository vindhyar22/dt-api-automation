package com.dt.api.users.get;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.response.Response;

public class testGET_UserInvites {
	
	@Test
	public void testGet() throws FileNotFoundException, IOException {
		baseURI = Endpoints.baseURI;
		Response response = given().headers("Authorization","bearer "+Config.getToken(), "accept" ,"application/json").log().all()
		.get(Endpoints.userInvites).andReturn();
		 assertEquals(response.getStatusCode(),200);
		
	}

}
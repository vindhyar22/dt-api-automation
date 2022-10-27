package com.dt.api.zones.delete;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testDELETE_zone {

	JSONObject request = new JSONObject();
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		baseURI=Endpoints.baseURI;	
	}
	
	@Test
	public void testDELETE001() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " +Config.getToken())
				.contentType(ContentType.JSON).log().all().when().delete(Endpoints.deletezone, Config.getzoneID())
				.then().statusCode(400).log().all();
	}

}
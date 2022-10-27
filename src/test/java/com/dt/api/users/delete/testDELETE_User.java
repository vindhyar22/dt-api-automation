package com.dt.api.users.delete;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testDELETE_User {

	JSONObject request = new JSONObject();

	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		baseURI = Endpoints.baseURI;
	}

	@Test
	public void testDELETE001() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + Config.getToken())
				.contentType(ContentType.JSON).log().all().when()
				.delete(Endpoints.deleteuser, Config.getemailID(), Config.getpropertyID()) /// users/{email}/{propertyId}","vindhyar@byteridge.com","ab41414a-da06-425d-bda7-3912d1aef1a6
				.then().statusCode(400).log().all();

	}

}

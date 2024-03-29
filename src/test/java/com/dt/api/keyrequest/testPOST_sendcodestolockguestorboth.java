package com.dt.api.keyrequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.ConfigAuth;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testPOST_sendcodestolockguestorboth extends Baseclass {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
	
		request.put("deviceId", Config.getdeviceID());
		request.put("action", Config.getaction());
		logger.info(request.toJSONString());	
	}
	
	@Test
	public void testPost001() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.resendkeycode,ConfigAuth.getkeyId1()).then()
				.statusCode(202).log().all();

	}
	  
}

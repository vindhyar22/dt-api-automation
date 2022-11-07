package com.dt.api.devices.post;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testPOST_adddevicesforzone extends Baseclass {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("zoneId", Config.getzoneID());
		request.put("devices", Config.getdevices());
		request.put("propertyId", Config.getpropertyID());
		request.put("protocolId", Config.getprotocolId());
		baseURI=Endpoints.baseURI;
		logger.info(request.toJSONString());	
	}
	
	@Test
	public void testPost001() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.adddevicesforzone).then()
				.statusCode(201).log().all();

	}
}

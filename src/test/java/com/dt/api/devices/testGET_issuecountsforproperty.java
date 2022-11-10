package com.dt.api.devices;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class testGET_issuecountsforproperty extends Baseclass {

	@Test
	public void testGet001() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + Config.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.issuecountsforproperty, Config.getpropertyID()).andReturn();
		ResponseBody body= response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}
}
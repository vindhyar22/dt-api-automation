package com.dt.api.zones.get;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class testGET_zonecountinproperty extends Baseclass {


	@SuppressWarnings("rawtypes")
	@Test
	public void testGetissues() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " +Config.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.zonecountinproperty, Config.getpropertyID()).andReturn(); //summary need to be add
		ResponseBody body= response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}


}
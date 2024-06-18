package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class createStudentStringPayloadTest extends TestBase {
	
	@DisplayName("Create a new student through the POST request payload as String")
	@Test
	void createNewStudent() {
		
		String payload = "{\"firstName\":\"Murphy\",\"lastName\":\"Holmes\",\"email\":\"faucibus.orci12.luctus@Duisac.net\",\"programme\":\"Financial Analysis\",\"courses\":[\"Accounting\",\"Statistics\"]}";
		RestAssured.given()
				.when()
				.contentType(ContentType.JSON)
				.when()
				.body(payload)
				.post()
				.then()
				.statusCode(201);
		
		
		
	}

}

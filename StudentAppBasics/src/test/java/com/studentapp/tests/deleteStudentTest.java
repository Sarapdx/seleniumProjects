package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class deleteStudentTest extends TestBase{
	
	@DisplayName("Delete Student from the system")
	@Test
	void deleteStudent() {
		
		RestAssured.given()
					.when()
					.contentType(ContentType.JSON)
					.delete("/105")
					.then()
					.statusCode(204);
	}

}

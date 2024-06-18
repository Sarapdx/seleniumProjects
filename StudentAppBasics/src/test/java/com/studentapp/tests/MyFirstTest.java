package com.studentapp.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;
// import static io.restassured.response.Response.*;

public class MyFirstTest extends TestBase{
	
	private void styles() {
		
//		RestAssured.given(); //Preparing request
//					.queryParam("key","value");
//					.get(url)
//					.post()
//		RestAssured.when()
//		.then();
		
//		RestAssured.given()
//					.except()
//					.when();
	}
	
//	@DisplayName("Getting all the list of students from the database")
//	@Test
//	public void getAllStudents() {
//		RequestSpecification requestSpec =   RestAssured.given();
//		Response res =   requestSpec.get("/list");
//		res.prettyPrint();
//		ValidatableResponse val = res.then();
//		val.statusCode(200);
//		
//	}
//	
	@DisplayName("Getting all the list of students from the database")
	@Test
	public void getAllStudentsgiven() {
		
		
//		RestAssured.given()
//				   .when()
//				   .get("http://localhost:1235/student/list")
//				   .then()
//				   .statusCode(200);
//		
//		RestAssured.given()
//		          .expect()
//		          .statusCode(200)
//		          .when()
//		          .get("http://localhost:1235/student/list");
		
//			given()
//		   .when()
//		   .get("http://localhost:1235/student/list")
//		   .then()
//		   .statusCode(200);
		
	}
	
	// @Disabled
	@DisplayName("Getting single CS students from the database")
	@Test
	void getSingleStudentDetail() {
		
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("programme", "Computer Science");
		params.put("limit", 1);
		
		Response res = 	(Response) RestAssured.given()
//				.queryParam("programme", "Computer Science")
//				.queryParam("limit", 1)
			//	.queryParam("programme", "Computer Science","limit", 1)
				.queryParams(params)
				.when()
				.get("/list");
				
		
		 res.prettyPrint();
		
	}
	
	@DisplayName("Get the first sudent through id")
	@Test
	public void getTheFirstStudent() {
		
		Response res = (Response) RestAssured.given()
								.pathParam("id",2)
								.when()	
								.get("/{id}");
		res.prettyPrint();
		
	}
}

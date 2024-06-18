package com.studentapp.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;
import com.studentapp.model.StudentPayloadObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class updateStudentObjectPayloadTestPatch extends TestBase {
	
	@DisplayName("Create a new student through the Patch request")
	@Test
	void createNewStudent() {
		
		StudentPayloadObject stu = new StudentPayloadObject();
		Faker fake = new Faker();
		
//		List<String> courses = new ArrayList<String>();
//		courses.add("Java");
//		courses.add("C#");
//		
//		
//		stu.setFirstName(fake.name().firstName());
//		stu.setLastName(fake.name().lastName());
		stu.setEmail(fake.internet().emailAddress());
//		stu.setProgramme("Computer Science");
//		stu.setCourses(courses);
		
				
		RestAssured.given()
				.when()
				.contentType(ContentType.JSON)
				.when()
				.body(stu)
				.patch("/105")
				.then()
				.statusCode(200);
		
		
		
	}

}

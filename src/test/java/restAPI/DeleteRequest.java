package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

	@Test
	public void test() {
		
RestAssured.baseURI = "http://localhost:3000/employees";
		
		RequestSpecification request = RestAssured.given();
		
		
		
		Response response = request.delete("/delete/2");
				
		String responsebody  = response.getBody().asString();
		
		System.out.println(responsebody);


	}
}

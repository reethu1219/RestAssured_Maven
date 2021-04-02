package restAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestwithParam {
	

	@Test

	//Run | debug
	
public void test1() {
		
		RestAssured.baseURI = "https://localhost:3000/employees";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.param("id","2").get();
		
		String responsebody = response.getBody().asString();
		
		System.out.println("Response Body:" +responsebody);
		
		//checking response code
		
		int responsecode = response.getStatusCode();
		
		Assert.assertEquals(200,responsecode);
		
		//checking the response headers
		
		String contentType = response.header("Content-Type");
		Assert.assertEquals("application/json; charset=utf-8", contentType );
		
		//checking name in the response
		
		Assert.assertTrue(responsebody.contains("pankaj"));
		
		//checking the exact node
		
		JsonPath jpath = response.jsonPath();
		
		List <String> name = jpath.get("name");
		
	   Assert.assertTrue(name.get(0).contains("pankaj"));
		
	}



}

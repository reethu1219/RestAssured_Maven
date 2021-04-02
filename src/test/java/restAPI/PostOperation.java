package restAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostOperation {
	/*** Ways to give body to the request- postman
	 * //String based input
	  //JSON Object based input
	  //hashmap based input
	  //file based input
	 */
	
	
	Map<String, Object> map = new HashMap<>();
	
	//@Test
	public void  test1() {
		
		map.put("firstName", "reetha");
		map.put("lastName", "reetha123");
		map.put("salary", 10000);
		map.put("email", "reetha@abc.com");
		
		RestAssured.given()
		.baseUri("http://localhost:8088/")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(map)
		.when()
		.post("employees")
		.then()
		.statusCode(201)
		.log()
		.body();
		
		
	}
	
	//file based input
	@Test
	public void test2() throws IOException {
		String jsonfile = new String(Files.readAllBytes(Paths.get("input.json")));
		   RestAssured.given()
           .baseUri("http://localhost:8088/")
           .contentType(ContentType.JSON)
           .accept(ContentType.JSON)
           .body(jsonfile)
           .when()
           .post("employees")
           .then()
           .statusCode(201)
           .log()
           .all();
	}

}

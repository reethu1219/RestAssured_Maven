package restAPIBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequestBDD {
	

	 @Test
    
		public void test1() {
			
			RestAssured.given()
					   .baseUri("http://localhost:3000/employees")
					   .contentType(ContentType.JSON)
					   .accept(ContentType.JSON)
					   .body("{\r\n"
							   + "    \"name\": \"rekha\",\r\n"
							   + "    \"salary\": \"2000\"\r\n"
							   +"	}")
					   .when()
					   .put("/update/4")
					   .then()
					   .statusCode(201)
					   .body("name", Matchers.equalTo("reetha"))
					   .body("salary", Matchers.equalTo("2000"))
					   .log()
					   .all();

					   
		
	 }

}

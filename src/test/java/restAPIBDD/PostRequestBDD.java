package restAPIBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequestBDD {
	

		 @Test
	     
			public void test1() {
				
				RestAssured.given()
						   .baseUri("http://localhost:3000/employees")
						   .contentType(ContentType.JSON)
						   .accept(ContentType.JSON)
						   .body("{\r\n"
								   + "    \"name\": \"reetha\",\r\n"
								   + "    \"salary\": \"1000\"\r\n"
								   +"}")
						   .when()
						   .post("/create")
						   .then()
						   .statusCode(201)
						   .body("[0].name", Matchers.equalTo("reetha"))
						   .log()
						   .all();

						   
			
		 }

}

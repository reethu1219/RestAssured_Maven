package restAPIBDD;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseLogSpec;

public class GetRequestBDD {

	 @Test
     
		public void test1() {
			
			RestAssured.given()
					   .baseUri("http://localhost:3000/employees")
					   .queryParam("id","1")
					   .when()
					   .get()
					   .then()
					   .statusCode(200) //201
					   .log() 
					   .body();
					   //.body("[0].name",Matchers.equalTo("reetha"))
						//.body("[0].salary",Matchers.equalTo("10000"));
					  // .all()
					 
			
	 
			
			
			
			
		}

	
	
}

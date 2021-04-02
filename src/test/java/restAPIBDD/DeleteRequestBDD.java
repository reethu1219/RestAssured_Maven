package restAPIBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequestBDD {

	
	 @Test
     
		public void test1() {
			
			RestAssured.given()
					   .baseUri("http://localhost:3000/employees")
					   .when()
					   .delete("/delete/11")
					   .then()
					   .statusCode(200) //201
					   .log() 
					   .all();
					   //.body("[0].name",Matchers.equalTo("reetha"))
						//.body("[0].salary",Matchers.equalTo("10000"));
					  
					 
			
	 
			
			
			
			
		}

}

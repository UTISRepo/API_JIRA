package org.test.jira.IssueAPI;

import static io.restassured.RestAssured.given;

import org.jira.Base.BaseTest;
import org.jira.utilis.APIConfigResp;
import org.junit.Test;

import io.restassured.specification.ResponseSpecification;

public class Dummy extends BaseTest {
	
	
	String Endpoint= "/api/v1/employee/1";
	String response;
	
	@Test
	public void Dummy()
	{
		
		response=
		         given().baseUri("http://dummy.restapiexample.com")
		         .spec(requestSpec)
						.header("Content-Type","application/json")
						//.body(data.CreateIssuePayload(keyvalue, name))
				.when()
			       		.get(Endpoint)
			    .then()
			    .spec(responseSpec)
			    		//.statusCode(APIConfigResp.CREATED_RESPONSE_CODE)
			    		.extract().asString();
		    
		   
	}

}

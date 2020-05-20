package org.test.jira.IssueAPI;

import static org.testng.Assert.assertEquals;

import org.jira.Base.BaseTest;
import org.jira.utilis.APIConfigResp;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteIssue extends BaseTest {

	//String endpoint="/rest/api/2/issue/{issueKey}";
    //String issuekey="AP-10";
	String endpoint="/rest/api/2/issue/{IssueKey}";
	String issueKey;
	
    
    @Test
    public void DeleteIssueTest()
    {
    	    	
    	                given()
    	                        .spec(requestSpec)
    	                        //.pathParam("issueKey", issuekey)
    	                        .pathParam("IssueKey",CreateIssue.issueKey)
    	                .when()
    	                        .delete(endpoint)
    	                .then()
    	                        .spec(responseSpec)
    	                        .statusCode(APIConfigResp.DELETE_RESPONSE_CODE);
    	                        
    	                
                      assertEquals(APIConfigResp.DELETE_RESPONSE_CODE, 204);
    	                        
    	                
    	
    }
}

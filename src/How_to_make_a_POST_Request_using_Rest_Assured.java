import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class How_to_make_a_POST_Request_using_Rest_Assured 
{
	
	
	@Test
	public void Post() throws JSONException
	{		
		RestAssured.baseURI ="https://reqres.in/";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Virender"); 
		requestParams.put("job", "Software Engineer");

		request.body(requestParams.toString());
		Response response = request.post("/api/users");

		int statusCode = response.getStatusCode();
		//Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		//Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}

}

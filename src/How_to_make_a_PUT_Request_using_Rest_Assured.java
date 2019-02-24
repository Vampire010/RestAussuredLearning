import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class How_to_make_a_PUT_Request_using_Rest_Assured
{
	@Test
	public void PUT() throws JSONException
	{		
		RestAssured.baseURI ="https://reqres.in/";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Virender"); 
		requestParams.put("job", "Software Engineer");

		request.body(requestParams.toString());
		Response response = request.put("/api/users/2");

		int statusCode = response.getStatusCode();
		//Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		//Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}


}

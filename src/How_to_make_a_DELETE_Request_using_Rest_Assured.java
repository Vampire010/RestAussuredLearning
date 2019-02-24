import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class How_to_make_a_DELETE_Request_using_Rest_Assured 
{
	@Test
	public void Delete() throws JSONException
	{		
		RestAssured.baseURI ="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.delete("/api/users/2");

		
		
		//System.out.print(successCode);
	}
}

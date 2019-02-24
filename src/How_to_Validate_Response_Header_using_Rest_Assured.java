import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class How_to_Validate_Response_Header_using_Rest_Assured 
{
	
	
	@Test
	public void GetEmployeeDetails()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("/employees");
		 
		 // Reader header of a give name. In this line we will get
		 // Header named Content-Type
		 String contentType = response.header("Content-Type");
		 Assert.assertEquals(contentType /* actual value */, "application/json" /* expected value */);
		 
		 // Reader header of a give name. In this line we will get
		 // Header named Server
		 String serverType =  response.header("Server");
		 Assert.assertEquals(serverType /* actual value */, "nginx/1.12.1" /* expected value */);
		 
		 // Reader header of a give name. In this line we will get
		 // Header named Content-Encoding
		 String contentEncoding = response.header("Content-Encoding");
		 Assert.assertEquals(contentEncoding /* actual value */, "gzip" /* expected value */);
	}

}

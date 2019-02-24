import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class How_to_Print_all_the_Headers_from_HTTP_Response 
{

	@Test
	public void GetEmployeeDetails()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("/employees");
		 
		 // Get all the headers. Return value is of type Headers.
		 // Headers class implements Iterable interface, hence we
		 // can apply an advance for loop to go through all Headers
		 // as shown in the code below
		 Headers allHeaders = response.headers();
		 
		 // Iterate over all the Headers
		 for(Header header : allHeaders)
		 {
		 System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		 }
	}
	
}

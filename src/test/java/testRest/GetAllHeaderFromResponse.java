package testRest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetAllHeaderFromResponse 
{
	
	@Test
	void getUserDetails()
	{
		Response response=RestAssured.get("https://gorest.co.in/public/v2/users/3908");
		String data=response.asString();
	//	System.out.println(data);	
		
		int a=response.getStatusCode();
	//	System.out.println("Status code is: "+a);	
		Assert.assertEquals(a, 200);
		
		Headers all=response.headers();
		for (Header H: all)
		{
			System.out.println(H.getName()+"  "+H.getValue());
			System.out.println();
		}
	}

}

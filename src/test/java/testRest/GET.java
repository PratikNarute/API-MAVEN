package testRest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET 
{
	
	@Test
	void getUserDetails()
	{
	  String uri ="https://gorest.co.in/public/v2/users";
	  String token ="Bearer 141e4cb017e7f2cc28b5cae5933de43e3bb38af71cd5c0cb22934ee2c0257890";
	  
	  RequestSpecification request = RestAssured.given();
	  Response response= request.header("Authorization",token).contentType("application/json").get(uri);
	  
	  int a=response.getStatusCode();
	  System.out.println(a);
	  
	  String data=response.asPrettyString();	
	  System.out.println(data);
	  Assert.assertEquals(a , 200);
		
	}
	

	

	

	
	


}

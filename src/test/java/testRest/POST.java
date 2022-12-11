package testRest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST 
{	
	@Test (enabled=false)
	public void postUserData3()
	{
		String uri ="https://gorest.co.in/public/v2/users";
		String token="Bearer 141e4cb017e7f2cc28b5cae5933de43e3bb38af71cd5c0cb22934ee2c0257890";
		
		JSONObject json =new JSONObject();
		json.put("name", "prajwal");
		json.put("gender", "male");
		json.put("email", "prajwal1997@gmail.com");
		json.put("status", "active");
		
		
		String body=json.toJSONString();	
			
		RequestSpecification request = RestAssured.given();
		Response response = request.header("Authorization", token).contentType("application/json").body(body).post(uri);
		
		int a =response.getStatusCode();
		System.out.println(a);	
		
		String data=response.asPrettyString();	
		System.out.println(data);
		
	}
	
	@Test
	public void postUserData4()
	{
		String uri ="https://gorest.co.in/public/v2/users";
		String token="Bearer 141e4cb017e7f2cc28b5cae5933de43e3bb38af71cd5c0cb22934ee2c0257890";
		String body = "{\"name\":\"rameshwari\",\"email\":\"rameshwari@gmail.com\",\"gender\":\"female\",\"status\":\"active\"}";
		
		RequestSpecification request = RestAssured.given();
		Response response = request.header("Authorization", token).contentType("application/json").body(body).post(uri);
		
		int a =response.getStatusCode();
		System.out.println(a);	
		
		String data=response.asPrettyString();	
		System.out.println(data);
		
	}
	
	

}

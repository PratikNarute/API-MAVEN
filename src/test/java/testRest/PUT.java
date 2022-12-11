package testRest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT 
{
	@Test (enabled= false)
	public void putUserData()
	{
		String uri ="https://gorest.co.in/public/v2/users/5734";
		String token="Bearer 141e4cb017e7f2cc28b5cae5933de43e3bb38af71cd5c0cb22934ee2c0257890";
		
		
		JSONObject json =new JSONObject();
		json.put("name", "praj");
		json.put("gender", "male");
		json.put("email", "prajwal1997@gmail.com");
		json.put("status", "active");
		
		String body=json.toJSONString();	
			
		RequestSpecification request = RestAssured.given();
		Response response = request.header("Authorization", token).contentType("application/json").body(body).put(uri);
		
		int a =response.getStatusCode();
		System.out.println(a);	
		
		String data=response.asPrettyString();	
		System.out.println(data);
	}
	
	@Test
	public void putUserData1()
	{
		String uri ="https://gorest.co.in/public/v2/users/5734";
		String token="Bearer 141e4cb017e7f2cc28b5cae5933de43e3bb38af71cd5c0cb22934ee2c0257890";
		String body = "{\"id\":5734,\"name\":\"prajwal\",\"email\":\"prajwal2002@gmail.com\",\"gender\":\"male\",\"status\":\"active\"}";
			
			
		RequestSpecification request = RestAssured.given();
		Response response = request.header("Authorization", token).contentType("application/json").body(body).patch(uri);
		
		int a =response.getStatusCode();
		System.out.println(a);	
		
		String data=response.asPrettyString();	
		System.out.println(data);
	}

}

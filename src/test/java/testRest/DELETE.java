package testRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETE
{
	@Test
	void deleteUserData()
	{
		String uri = "https://gorest.co.in/public/v2/users/5727";
		String token ="Bearer 141e4cb017e7f2cc28b5cae5933de43e3bb38af71cd5c0cb22934ee2c0257890";
		String body = "{\"id\":5613,\"name\":\"prajwal\",\"email\":\"prajwal1997@gmail.com\",\"gender\":\"male\",\"status\":\"active\"}";
		
		
		RequestSpecification request=RestAssured.given();
		Response response = request.header("Authorization", token).contentType("application/json").body(body).delete(uri);
		
		int a= response.getStatusCode();
		System.out.println(a);
		
		String data = response.asPrettyString();
		System.out.println(data);
	}

}

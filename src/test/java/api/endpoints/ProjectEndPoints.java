package api.endpoints;

import io.restassured.response.*;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.utilities.ReadCookie;
import api.utilities.ReadProperties;

//This class is created to perform CRUD operations i.e. Create, Retrieve/Read, Update and Delete

public class ProjectEndPoints 
{
	
		/*public static Response createContact(User payload)
		{
			Response response = given()
				.contentType("application/json")
				.cookie("")
				.header("method","POST")
				.header("scheme", "https")
				.headers("accept-language","en-US,en;q=0.9") */
				//.accept("application/json, text/plain, */*")
			/*	.body(payload)	
			.when()
				.post(Routes.create_contact);
			
			return response;
				
		}*/
		
		public static Response readProjects()
		{
			
			String url = ReadProperties.getURL().getString("get_projects");
			
			//String test = ReadCookie.getCookie();
			Response response =  given()
					.accept("application/json, text/plain, */*")
					.header("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36")
					.header("accept-language","en-US,en;q=0.9")
					.header("Content-Type","application/json")
					.header("priority","u=1, i")
					.cookie(ReadCookie.getCookie())
					.body("{\"query\":{\"order\":[[\"updated_at\",\"DESC\"],[\"job_number\",\"DESC\"]],\"page\":1,\"limit\":50,\"stage\":[\"Open\"]},\"type\":\"my-projects\"}")
					.when()
					
					//.post(Routes.get_projects); //Use this when want to fetch api from routes.java file 
					
					.post(url); //fetch url from properties file
					
			return response;
		}
		
		
	
}

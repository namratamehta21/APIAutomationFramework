package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import api.endpoints.ProjectEndPoints;
import api.utilities.RetryAnalyzer;
import io.restassured.response.Response;

public class GetProjectsTest 
{
	public Logger logger;
	
	@BeforeClass
	public void setup()
	{
		logger = LogManager.getLogger(this.getClass());
	}
	
	@Test(priority=1, retryAnalyzer = RetryAnalyzer.class)
	public void getProjectsDetail()	{
		logger.info("***********Fetching details of projects**********");
		Response response =ProjectEndPoints.readProjects();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200); 

		
		String result = response.getBody().asString();
		System.out.println("Response body is : "+result);
		
		logger.info("***********Received details of projects**********");
	}

}

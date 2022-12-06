package jira.chain;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassImpl {

	public static RequestSpecification request = null;
	public static Response response = null;
	public static String id = null;
	public static String key = null;
	
	@BeforeTest
	public static void setup()
	{
		RestAssured.baseURI = "https://venkateshapi.atlassian.net/rest/api/2/issue";
		RestAssured.authentication = RestAssured.preemptive().basic("venkigemail@gmail.com", "LOwV3v4lEhwGcjYJhhGKF90E");
		
		request = RestAssured.given()
				 .contentType(ContentType.JSON)
				 .log().headers();
	}
	
	@AfterTest
	public static void responseLog()
	{
		response.then().log().all();
	}
}
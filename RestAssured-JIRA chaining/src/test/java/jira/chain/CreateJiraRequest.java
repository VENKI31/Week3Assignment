package jira.chain;

import java.io.File;

import org.testng.annotations.Test;

public class CreateJiraRequest extends BaseClassImpl {

	@Test
	public void createJiraRequest()
	{
		File file = new File("./src/test/resources/createjira.json");
		
		request.body(file);
		
		response = request.post();
		
		response.then().assertThat().statusCode(201);
		
		id = response.jsonPath().get("id");
		key = response.jsonPath().get("key");
		
	}
}
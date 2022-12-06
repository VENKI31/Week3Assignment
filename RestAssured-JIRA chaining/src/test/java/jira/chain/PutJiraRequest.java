package jira.chain;

import java.io.File;

import org.testng.annotations.Test;

public class PutJiraRequest extends BaseClassImpl {

	@Test(dependsOnMethods = {"jira.chain.CreateJiraRequest.createJiraRequest"})
	public void putJiraRequest()
	{
		File file = new File("./src/test/resources/putjira.json");
		
		request.body(file);
		
		response = request.put(id);
		
		response.then().assertThat().statusCode(204);
	}
}
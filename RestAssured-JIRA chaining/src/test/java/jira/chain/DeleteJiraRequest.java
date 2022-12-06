package jira.chain;

import org.testng.annotations.Test;

public class DeleteJiraRequest extends BaseClassImpl {

	@Test(dependsOnMethods = {"jira.chain.PutJiraRequest.putJiraRequest"})
	public void deleteJiraRequest()
	{		
		response = request.put(id);
		
		response.then().assertThat().statusCode(204);
		
		response.then().assertThat().statusLine("HTTP/1.1 204 No Content");
	}
}
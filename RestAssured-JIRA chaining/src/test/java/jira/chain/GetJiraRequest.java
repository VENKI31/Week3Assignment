package jira.chain;

import org.testng.annotations.Test;

public class GetJiraRequest extends BaseClassImpl {

	@Test(dependsOnMethods = {"jira.chain.DeleteJiraRequest.deleteJiraRequest"})
	public void getJiraRequest()
	{		
		response = request.put(id);
		
		response.then().assertThat().statusCode(204);
	}
}
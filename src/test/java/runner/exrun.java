package runner;

import cucumber.api.junit.Cucumber;

public class exrun {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="Features" , glue="definitions", tags= {"@smoke"})
	
	public class exrun {
		
	}

}

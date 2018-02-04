package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="F:\\workspace-eclipse\\CucumberTest\\src\\main\\java\\feature\\login.feature",
		glue={"stepDefinition"},
		plugin= {"pretty","html:test-output"} //instead of format using plugin cos geting dreprecated 
		)

public class TestRunner {
	
	
			
			
			
	

}

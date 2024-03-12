package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\testNGcucumber\\src\\test\\resources\\login\\login.feature",
		glue = "steps"
		)

public class loginrunner extends AbstractTestNGCucumberTests{

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/features/Login.feature",
		                    "src/test/java/features/CreateAccount.feature",
		                    "src/test/java/features/EditAccount.feature"},
							glue= {"stepDefinition","hooks"},
							publish = true,
							monochrome= true)
public class LeaftapsRunner extends AbstractTestNGCucumberTests{

}

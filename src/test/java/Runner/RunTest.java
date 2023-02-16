package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	
	features="src/test/resources/Bussiness_Logic",
	glue="Mapping",
	plugin="pretty"
	//monochrome=true
)
public class RunTest {
	

}

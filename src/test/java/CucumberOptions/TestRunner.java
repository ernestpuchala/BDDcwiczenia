package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "M:/programowanie/BDD/src/test/java/Features", glue = "Steps")

public class TestRunner {

}

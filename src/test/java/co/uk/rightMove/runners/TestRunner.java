package co.uk.rightMove.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/co/uk/rightMove/features"},
        glue = {"co/uk/rightMove/stepDefs", "co/uk/rightMove/hooks"},
        publish = true
)
public class TestRunner

{
}

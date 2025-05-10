package shop.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
@IncludeEngines("cucumber")
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "shop.stepdefinitions",
        tags = "@login",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@Cucumber
public class CucumberTestSuite {
}

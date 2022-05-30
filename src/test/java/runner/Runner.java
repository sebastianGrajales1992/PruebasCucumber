package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    tags = "@Banco",
    plugin = { "html:target/cucumber-html-report.html",
    "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
    "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
    monochrome = true
)
public class Runner {
    
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }

}

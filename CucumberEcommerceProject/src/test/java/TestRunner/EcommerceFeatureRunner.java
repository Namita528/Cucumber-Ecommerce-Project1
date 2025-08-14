package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/features/AddToCart.feature"},
    glue = {"classpath:stepdefinition"},
    plugin = {"html:target/cucumber-reports.html"}
)
public class EcommerceFeatureRunner extends AbstractTestNGCucumberTests{

}

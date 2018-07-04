package stepPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(

        features="src/test/resources/Feature",
        glue="stepPack",
       //tags= {"@XpathFile, @BMI, @FundTrasfer, @OurWebSite" },
        //tags= {"@XpathFile" },
        
       
        monochrome=true

)

public class TestRunner extends AbstractTestNGCucumberTests{
	

}
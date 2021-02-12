package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class	)

@CucumberOptions(
		
		features="feature",
		glue= {"StepDefenition"	}//,plugin={"com.cucumber.listener.ExtentCucumberFormatter:output/sanCucumreport.html"}
			//format= {"pretty"},
		    //monochrome=true
				
		)
public class testRunner {

}

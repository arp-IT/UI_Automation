package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	public static void main(String[] args) throws Exception {
		
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
    
    // create ExtentReports and attach reporter(s)
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(htmlReporter);

    // creates a toggle for the given test, adds all log events under it    
    ExtentTest test1 = extent.createTest("Google Search Test", "This is a test to validate Google Search Funictionality");

    // log(Status, details)
    test1.log(Status.INFO, "This step shows usage of log(status, details)");

    // info(details)
    test1.info("This step shows usage of info(details)");
    
    // log with snapshot
    test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    
    // test with snapshot
    test1.addScreenCaptureFromPath("screenshot.png");
    
    // calling flush writes everything to the log file
    extent.flush();
		
		

	}

}

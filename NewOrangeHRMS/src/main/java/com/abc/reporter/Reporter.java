package com.abc.reporter;

import com.abc.commonfunctionality.browser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter {
	 public static ExtentReports report;
	 public ExtentTest extenttest;
	 
public void generateReport() {
    
	 report=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("F:\\java eclipse\\OrangeHrms\\Result//Result.html");
	
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("Title - OrangeHRMS AUTOMATION");
	spark.config().setReportName("My Client -OrangeHRMS ");
	report.attachReporter(spark);
	
	// ISKE BAD CREATE TEST ... 
	// EXTENT TEST RETURN TYPE MILEGA
	// EXTENT TEST SE LOG METHOD CALL HOGI... FOR TEST STEPS
	}

	public void createTest(String TestCaseDescription) 
	{
		extenttest=report.createTest(TestCaseDescription);
	}
	public void pass(String testStep) 
	{
		extenttest.log(Status.PASS,testStep); //test.log(Status.PASS,testStep);
	}

	public void fail(String testStep)
	{
		extenttest.log(Status.FAIL,testStep);//test.log(Status.FAIL,testStep);
	}


}
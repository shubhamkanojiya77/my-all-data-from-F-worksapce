package com.gotobuy.reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter {
	 public static ExtentReports report;
	 
	 
public void generateReport() {
    
	 report=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter(".Result/Result.html");
	
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("my automated page");
	spark.config().setReportName("HSBC BANK");
	report.attachReporter(spark);
	
	// ISKE BAD CREATE TEST ... 
	// EXTENT TEST RETURN TYPE MILEGA
	// EXTENT TEST SE LOG METHOD CALL HOGI... FOR TEST STEPS
	}

}

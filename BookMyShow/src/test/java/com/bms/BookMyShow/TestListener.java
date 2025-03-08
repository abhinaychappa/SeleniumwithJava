package com.bms.BookMyShow;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener {
	private ExtentReports extent = ExtentReportManager.getInstance();
    private ExtentTest test;
	
	public void onStart(ITestContext context) {	
		System.out.println("Test Execution Started : "+context.getName());
	}
	
	public void onFinish(ITestContext context) {	
		ExtentReportManager.flushReports();
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed : "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		
		//Take a screenshot
		System.out.println("Test Failed : "+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped : " + result.getName());
    }

}

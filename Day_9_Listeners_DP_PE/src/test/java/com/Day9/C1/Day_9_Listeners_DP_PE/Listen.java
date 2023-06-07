package com.Day9.C1.Day_9_Listeners_DP_PE;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener{
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test Started . . ." + result.getName());
	}
	public void onTestSucess(ITestResult result) 
	{
		System.out.println("Test Success . . ." + result.getName());
	}
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Failed . . ." + result.getName());
	}
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Skipped . . ." + result.getName());
	}
	public void onTestFinished(ITestContext result) 
	{
		System.out.println("Test Finished . . ." + result.getName());
	}

}

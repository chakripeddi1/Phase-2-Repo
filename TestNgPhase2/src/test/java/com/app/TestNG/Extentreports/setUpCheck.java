package com.app.TestNG.Extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class setUpCheck {
	
	
	
	
	public void extentdemo()
	{
		// create an object to initiate Extent report engine
		
		ExtentReports ex = new ExtentReports();
		
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\sonal\\Workspace2-git\\ATE-Phase2-Selenium-TestNG\\extentReport\\report.html");
		
		// attach ExtentReports object to ExtentSparkReporter object
		
		ex.attachReporter(sparkreporter);
		ex.flush();  // generates report in given location
		
	}
	
	// OR
	
	@Test
	public void extentDemo2() throws IOException
	{
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		ex.flush(); 
		
		// automatically open the report for you on your desktop browser
		
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		
	}
	

}
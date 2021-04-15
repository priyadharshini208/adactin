package org.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilityClass.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.files",dryRun=false,tags= {"@sanity"}
,plugin= {"pretty",
		"json:target\\reports\\adactin.json",
		"junit:target\\reports\\output.xml",
"rerun:src\\test\\resources\\Rerunn\\failed.txt"})
public class runnerClass {
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvnReport(System.getProperty("user.dir")+"\\target\\reports\\adactin.json");

	}
	
}
 
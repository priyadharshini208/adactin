package org.files;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilityClass.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources",glue="org.files",dryRun=false,tags= {"@sanity"},plugin= {"pretty",
		"json:target\\reports\\adac.json",
"rerun:src\\test\\resources\\Rerunn\\failed.txt"})
public class ReRunnerClasss {
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvnReport(System.getProperty("user.dir")+"target\\reports\\output.json");

	}
	
}

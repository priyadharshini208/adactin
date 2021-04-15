package org.utilityClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JvmReport {

	public static  void generateJvnReport(String jsonpath) {
		
File f= new File(System.getProperty("user.dir")+"\\target\\reports\\jvmReport");

Configuration con = new Configuration(f, "adactin");

con.addClassifications("browser name", "chrome");
con.addClassifications("platform", "windows 10");
 List<String> li=new ArrayList<String>();
 li.add(jsonpath);
 ReportBuilder r=new ReportBuilder(li, con);
 r.generateReports();
	}
}

package org.utilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Workbook w;
	
public static void launchBrowser() {
	 WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();

}

public static void loadUrl(String url) {
	
	 driver.get(url);
}

public static void applyWaitTimeForAllLocs() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

public static void removeAllCookies() {
	driver.manage().deleteAllCookies();
}

public static void closeBrowser() {
	driver.quit();
}

public static void takeSnap(String filename) throws IOException {
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\King\\eclipse-workspace\\Sample4\\ScreenShots\\"+filename+".png");
	FileUtils.copyFile(src, dest);
}

public static void sendKeys(WebElement element,String text) {
	element.sendKeys(text);

}
public static void btnClick(WebElement element) {
	element.click();

}
public static Map<String, String> excelRead(String username,String password ) throws IOException {
	Map<String,String> map = new LinkedHashMap<String, String>();
	File file= new File("C:\\Users\\King\\eclipse-workspace\\Sample4\\adact.xlsx");
	FileInputStream fin= new FileInputStream(file);
	 w= new XSSFWorkbook(fin);
	 Sheet sheet = w.getSheet("booking");
	 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		if (username.equals(password)) {
			Row headerRow = sheet.getRow(0);
			Row requiredRow = sheet.getRow(i);
			for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
				Cell heading = headerRow.getCell(j);
				Cell data = requiredRow.getCell(j);
				String txtHeading = heading.getStringCellValue();
				String txtData = data.getStringCellValue();
				map.put(txtHeading, txtData);
			}
		}
	}
	return map;

}







}





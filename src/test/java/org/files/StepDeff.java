package org.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.repository.LoginPojo;
import org.utilityClass.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDeff extends BaseClass{
	public static LoginPojo l;
	
@Given("user is in adactin booking page")
public void user_is_in_adactin_booking_page() {
	System.out.println("start");
	
}
@Given("user is in adactin home page")
public void user_is_in_adactin_home_page() {
	launchBrowser();
	loadUrl("https://adactinhotelapp.com/");
}
@When("user enters valid {string} and valid {string}")
public void user_enters_valid_and_valid(String user, String pass, DataTable d) throws IOException {
	
	List<String> li = d.asList();
	String username = li.get(0);
	String password = li.get(1);
	
	l=new LoginPojo();
	sendKeys(l.getTxtEmail(), username);
	sendKeys(l.getTxtPass(), password);
	
}

@When("user clicks login button")
public void user_clicks_login_button() {
	WebElement btnlogin = driver.findElement(By.id("login"));
	btnlogin.click();
}
@When("user selects{string},{string},{string},{string},{string},{string} and click search button")
public void user_selects_and_click_search_button(String string, String string2, String string3, String string4, String string5, String string6) {
	 l=new LoginPojo();
	   sendKeys(l.getLoct(), string);
	   sendKeys(l.getHott(), string2);
	   sendKeys(l.getRtype(), string3);
	   sendKeys(l.getRno(), string4);
	   sendKeys(l.getAdrom(), string5);
	   sendKeys(l.getChild(), string6);
	   l.getSearch().click();
	   
}



@When("user selects the hotel and clicks continue")
public void user_selects_the_hotel_and_clicks_continue() {
	
	l.getRadio().click();
    l.getContn().click();
}

@When("user enters {string},{string},{string},{string},{string},{string},{string},{string} and click booknow")
public void user_enters_and_click_booknow(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	 sendKeys(l.getFirst(), string);
	   sendKeys(l.getLast(), string2);
	   sendKeys(l.getAddres(), string3);
	   sendKeys(l.getCardno(), string4);
	   sendKeys(l.getCardtype(), string5);
	   sendKeys(l.getMnth(), string6);
	   sendKeys(l.getYear(), string7);
	   sendKeys(l.getCvv(), string8);
	   l.getBooking().click();
	   Thread.sleep(5000);
}



@Then("user in confirmation page")
public void user_in_confirmation_page() throws IOException, InterruptedException {
	takeSnap("booked");
	System.out.println("ORDER NO: "+l.getOrderno().getAttribute("value"));
	Thread.sleep(3000);
	btnClick(l.getLogged());

 
}



}

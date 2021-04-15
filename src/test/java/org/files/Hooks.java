package org.files;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks  {
	@Before("@sanity")
	public void beforeSanity() {
	System.out.println("Sanity Scenario starts...");

	}
	@After("@sanity")
	public void afterSanity() {
		System.out.println("Sanity Scenario ends....");

	}
	 
}

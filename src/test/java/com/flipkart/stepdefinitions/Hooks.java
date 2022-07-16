package com.flipkart.stepdefinitions;

import org.junit.After;
import org.junit.Before;

import com.flipkart.resources.CommonActions;

public class Hooks extends CommonActions {
	CommonActions ca=new CommonActions();
	@Before
	public void browserLaunch() {
		ca.browserLaunch("https://www.flipkart.com/");
	}
	
	@After
	public void browserQuit() {
		driver.quit();
	}
}

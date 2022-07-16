package com.flipkart.stepdefinitions;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobileValidationPage;
import com.flipkart.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MobileValidationStepsExtends extends CommonActions{
	
	CommonActions ca=new CommonActions();
	MobileValidationPage m=new MobileValidationPage();

	static long startTime;
	static String name1;
	static String Title;
	static String mn;

	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
	String url="https://www.flipkart.com/";
	   ca.browserLaunch(url);
	}


	@Given("user login by entering valid crendentials")
	public void user_login_by_entering_valid_crendentials() {
		 try {
			 ca.button(m.getCloseIcon());
		 } catch (Exception e){
		 }
	}

	@When("user search mobile")
	public void user_search_mobile() {		 
		mn="realme";
		ca.insertText(m.getSearchBox(), mn);	 
		 
		 ca.button(m.getSearchClick());
	}

	@When("user click on the mobile name")
	public void user_click_on_the_mobile_name() {
		WebElement mobileName =driver.findElement(By.xpath("(//div[contains(text(),'"+mn+"')])[1]"));
		 name1 = mobileName.getText();
		 System.out.println(name1);
		 
		 ca.button(mobileName);
	}

	@Then("user validate the mobile names")
	public void user_validate_the_mobile_names() {
		ca.windowHandling();
	WebElement mobilename2 =driver.findElement(By.xpath("//span[contains(text(),'"+mn+"')]"));
	String name2=mobilename2.getText();
	System.out.println(name2);
 	Title= driver.getTitle();
 	//Assert.assertEquals(name1, name2);
 	if(name1.equals(name2)) { 
		System.out.println("pass");
	} else {
		System.out.println("fail");
	}
	}
	
	@When("user search mobile by one dim list")
	public void user_search_mobile_by_one_dim_list(DataTable dataTable) {

		List<String> datas = dataTable.asList();
		mn=datas.get(0);
		ca.insertText(m.getSearchBox(), mn);	 
		 
		 ca.button(m.getSearchClick());
	}


@When("user search mobile by one dim map")
public void user_search_mobile_by_one_dim_map(DataTable dataTable) {
    Map<String, String> datas = dataTable.asMap(String.class,String.class);

    mn=datas.get("1");
    ca.insertText(m.getSearchBox(), mn);	 
	 
	  ca.button(m.getSearchClick());
}
@When("user search mobile {string}")
public void user_search_mobile(String phone) {
	mn=phone;
	ca.insertText(m.getSearchBox(), mn);	 
	 
	 ca.button(m.getSearchClick());

}
}
























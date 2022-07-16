package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class MobileValidationPage extends CommonActions {
	CommonActions ca=new CommonActions();
	public MobileValidationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement closeIcon;
	
	@FindBy(name = "q")
	private WebElement searchBox ;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchClick ;

	public WebElement getSearchClick() {
		return searchClick;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
}

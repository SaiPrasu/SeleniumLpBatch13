package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages {
	@FindBy(linkText = "Create Account")
	WebElement createaccount;

	@FindBy(xpath = "//input[starts-with(@name,'passwd')]")
	WebElement password;

	@FindBy(xpath = "//input[starts-with(@name,'confirm_passwd')]")
	WebElement confirmpassword;

	WebDriver driver;

	public RediffPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setcreateaccount() {
		createaccount.click();
	}

	public void setpassword(String input1) {
		password.sendKeys(input1);
	}

	public void setconfirmpassword(String input2) {
		confirmpassword.sendKeys(input2);
	}

}

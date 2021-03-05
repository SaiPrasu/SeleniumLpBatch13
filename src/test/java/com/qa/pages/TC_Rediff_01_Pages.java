
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_Rediff_01_Pages {
	@FindBy(linkText = "Create Account")
	WebElement createaccount;

	@FindBy(xpath = "//*[starts-with(@name,'name')][@maxlength='61']")
	WebElement name;

	@FindBy(xpath = "//*[starts-with(@name,'login')]")
	WebElement emailid;

	@FindBy(xpath = "//*[@value='Check availability']")
	WebElement ava_button;

	@FindBy(xpath = "//*[starts-with(@name,'DOB_Day')]/option[@value='15']")
	WebElement day;;

	@FindBy(xpath = "//*[starts-with(@name,'DOB_Month')]/option[@value='08']")
	WebElement month;

	@FindBy(xpath = "//*[starts-with(@name,'DOB_Year')]/option[@value='1992']")
	WebElement year;

	@FindBy(xpath = "//*[starts-with(@name,'gender')][@value='f']")
	WebElement gender;

	@FindBy(xpath = "//*[@id='country']/option[@label='India']")
	WebElement country;

	@FindBy(xpath = "//*[starts-with(@name,'city')]/option[@label='Bangalore']")
	WebElement city;

	WebDriver driver;

	public TC_Rediff_01_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setcreateaccount() {
		createaccount.click();
	}

	public void setname(String input) {
		name.sendKeys(input);
	}

	public void setemail(String input) {
		emailid.sendKeys(input);
	}

	public void setavabutton() {
		ava_button.click();
	}

	public void setday() {
		day.click();
	}

	public void setmonth() {
		month.click();
	}

	public void setyear() {
		year.click();
	}

	public void setgender() {
		gender.click();
	}

	public String setcountry() {
		return country.getText();
	}

	public void setcity() {
		city.click();
	}

}

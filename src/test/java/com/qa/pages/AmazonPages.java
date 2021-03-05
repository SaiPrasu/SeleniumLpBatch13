package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {

	WebDriver driver;

	// Fetch the locator of an element
	// Store the locator in a reference variable of type WebElement
	// create the user defined methods to define certain user events to be performed

	@FindBy(id="twotabsearchtextbox")
	@CacheLookup
	WebElement searchTextBox;

	@FindBy(id="nav-search-submit-button")
	@CacheLookup
	WebElement magnifierButton;

	@FindBy(name="url")
	@CacheLookup
	WebElement Category;
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> ItemNames;

	public AmazonPages(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this );		
	}

	public List<WebElement> getAllItemNames() {
		return  ItemNames;
		
	}
	
	public void setsearchTextBoxInput(String input) {
		searchTextBox.sendKeys(input);
	}

	public void setmagnifierButtonClick() {
		magnifierButton.click();
	}

	public boolean getmagnifierButtonEnabled() {
		return magnifierButton.isEnabled();
	}


	public void setCategory(String input) {

		Select CategorySelect = new Select(Category);
		CategorySelect.selectByVisibleText(input);	

	}

	public List<WebElement> getCategoryAllOptions() {

		Select CategorySelect = new Select(Category);
		return CategorySelect.getOptions();
	}

	public List<WebElement> getAllFooterElements() {
		// TODO Auto-generated method stub
		return null;
	}


}

package com.qa.pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoSuggest {

	WebDriver driver;
	
	@FindBy(name = "q")
	@CacheLookup
	WebElement searchBox;

	@FindAll(@FindBy(className = "UUbT9"))
	@CacheLookup
	List<WebElement> suggestList;

	
	
	public AutoSuggest(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this );		
	}

	public void setSearchBox(String input) {
		searchBox.clear();
		searchBox.sendKeys(input);
	}

	public List<WebElement> getSuggestList() {
		return suggestList;
	}

	
	

	
}
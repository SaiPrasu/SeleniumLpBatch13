package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEventPages {
	
	@FindBy(xpath = "//input[@checked='checked'][@name='groupName']")
	WebElement buttonIsDefaultSelected;
	
	@FindBy(xpath = "//input[@name='groupName'][@value='Mon']")
	WebElement monDayIsSelected;
	
	@FindBy(name = "red")
	WebElement red;
	
	@FindBy(name = "yellow")
	WebElement yellow;
	
	@FindBy(name = "orange")
	WebElement orange;
	
	WebDriver driver;
	public  UserEventPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean setButtonIsDefaultSelected() {
		return buttonIsDefaultSelected.isSelected();
	}
	public void setMonDayIsSelected() {
		monDayIsSelected.click();
	}
	public boolean setYellow() {
	   return yellow.isSelected();
	}
	public void setOrange() {
		orange.click();
	}
	public boolean setRed() {
		return red.isSelected();
	}
	public void setRed1() {
		red.click();
	}

}
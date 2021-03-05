package com.qa.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.TC_Rediff_01_Pages;

public class TC_Rediff_001_TestScripts extends TestBase {
	@Test
	public void rediffPageLink() throws InterruptedException {
		TC_Rediff_01_Pages rediffOR = new TC_Rediff_01_Pages(driver);

		// 3.click on create account
		rediffOR.setcreateaccount();

		// 4.check if the page is navigated to registration page
		String input = "register";
		String url = driver.getCurrentUrl();
		if (url.contains(input))
			Reporter.log("The page is navigated to registration page");
		else
			Reporter.log("The page is not navigated to registration page");

		// 5.enter full name as Kim Smith
		rediffOR.setname("smith kim");

		// 6.enter the email id as test@test.com
		rediffOR.setemail("test@test.com");

		// 7.click on check availblity button
		rediffOR.setavabutton();

		// 8.select dob: 15 aug 1992
		rediffOR.setday();
		rediffOR.setmonth();
		rediffOR.setyear();

		// 9.select the gender as female
		rediffOR.setgender();

		// 10.check if default value is India
		String Defaults = "India";
		String text = rediffOR.setcountry();
		if (text.equals(Defaults))
			Reporter.log("YES,default value is India");
		else
			Reporter.log("NO,default value is India");

		// 11.select the city as Bangalore
		rediffOR.setcity();
	}
}

package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_Amazon_003 extends AmazonTestBase{


	AmazonPages AmazonOR = new AmazonPages(driver);

	@Test(priority=1)
	public void footerLinks() {
		AmazonPages AmazonOR = new AmazonPages(driver);
		List<WebElement> allFooterElements = AmazonOR.getAllFooterElements();
		for(WebElement link: allFooterElements) {
			Reporter.log(link.getText(),true);
		}

	}

}
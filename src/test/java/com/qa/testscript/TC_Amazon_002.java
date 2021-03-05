package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_Amazon_002 extends AmazonTestBase{

	
	@Test(priority=2)
	public void searchItem() throws InterruptedException {
		AmazonPages AmazonOR = new AmazonPages(driver);
		Thread.sleep(5000);
		//2.  Select "Books" as category
		AmazonOR.setCategory("Books");
		

		String input = "Da vinci Code";
		//  3. Type the item name as "Da vinci code" in the search text box.
		AmazonOR.setsearchTextBoxInput(input);

		//4. Click on the magnifier button
		AmazonOR.setmagnifierButtonClick();

		//5. Check if the title of the page has search term
		String title = driver.getTitle();
		//System.out.println(title);
		Reporter.log(title);

		if(title.contains(input)) {
			//System.out.println("Test Passed");
			Reporter.log("Test is passed");
		}else {
			//System.out.println("Test failed");
			Reporter.log("Test is failed");
		}

		//6. Get all the book name and print
		List<WebElement> allItemNames = AmazonOR.getAllItemNames();
		//System.out.println("Total no. of items loaded are :" + allItemNames.size());
		Reporter.log("Total no. of items loaded are :" + allItemNames.size());

		for(WebElement item : allItemNames) {
			//	System.out.println(item.getText());
			Reporter.log(item.getText());
		}


	}


	@Test(priority=1)
	public void checkTitle() {
		String title = driver.getTitle();
		Reporter.log(title);

		if(title.contains("Amazon")) {
			Reporter.log("Test is passed");
		}else {
			Reporter.log("Test is failed");
		}



	}

	
}
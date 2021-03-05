package com.qa.testscript;

	

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;

    import com.qa.pages.AmazonPages;

	public class Amazon_testng {
	@Test	

		public void amazon() {

			
			System.setProperty("webdriver.chrome.driver","F:\\seleniumsoftwares\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			AmazonPages AmazonOR = new AmazonPages(driver);
			//1. Open URL --> "https://www.amazon.in/"
			driver.get("https://www.amazon.in/");
			
			//2.  Select "Books" as category
			AmazonOR.setCategory("Books");
			
			String input = "Da vinci Code";
		//  3. Type the item name as "Da vinci code" in the search text box.
			AmazonOR.setsearchTextBoxInput(input);
			
			//4. Click on the magnifier button
			AmazonOR.setmagnifierButtonClick();
			
			//5. Check if the title of the page has search term
			String title = driver.getTitle();
			System.out.println(title);

			if(title.contains(input)) {
				System.out.println("Test Passed");
			}else {
				System.out.println("Test failed");
			}
					
			//6. Get all the book name and print
			List<WebElement> allItemNames = AmazonOR.getAllItemNames();
			System.out.println("Total no. of items loaded are :" + allItemNames.size());
			
			for(WebElement item : allItemNames) {
				System.out.println(item.getText());
			}
			
		}

	}




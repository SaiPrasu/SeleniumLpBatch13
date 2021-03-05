package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AmazonSample_002 {

	public static void main(String[] args) throws InterruptedException {

		// Chrome browser should be opened

		// System.setProperty("webdriver.chrome.driver",
		// "D:\\\\Virtusa\\\\Testing\\\\Drivers\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1. Open URL --> "https://www.amazon.in/"
		driver.get("https://www.amazon.in/");

		// 2. Select "Books" as category
		Select Category = new Select(driver.findElement(By.id("searchDropdownBox")));
		Category.selectByVisibleText("Books"); // Books
		Thread.sleep(2000);

		// 3. Type the item name as "Da vinci code" in the search text box.
		String input = "Da vinci Code";
		WebElement SearchInput = driver.findElement(By.id("twotabsearchtextbox"));
		SearchInput.sendKeys(input);
		Thread.sleep(2000);

		// 4. Click on the magnifier button
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);

		// 5. Check if the title of the page has search term
		String title = driver.getTitle();
		System.out.println(title);

		if (title.contains(input)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}

		// 6. Get all the book name and print
		List<WebElement> Items = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		// total no. of items loaded on the page
		int count = Items.size();
		System.out.println("Total no. of items loaded are : " + count);

		// fetch the text of each element.
		for (WebElement item : Items) {
			System.out.println(item.getText()); // text present on the element --> Return String value
		}

		// Close the browser instance
		driver.close();
	}

}

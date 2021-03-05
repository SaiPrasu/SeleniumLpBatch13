package com.qa.testscript;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;
	//import com.qa.pages.TC_Rediff_01_Pages;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class TestBase {
		
		public static WebDriver driver;
	
		
		
		@Parameters({"Browser","Url"})
		@BeforeClass
		public void setUp(String browser,String Url) {
			if(browser.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			}
			
		
			driver.get(Url);
		}
		@AfterClass
		public void tearDown() {
			//12.close browser
			driver.close();
		}


}

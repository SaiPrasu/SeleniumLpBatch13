package com.qa.pages;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class EbayPages {
		@FindBy(linkText = "Register")
		WebElement register;
		
		@FindBy(id="firstname")
		WebElement firstname;
		
		@FindBy(id="lastname")
		WebElement lastname;
		
		@FindBy(id="Email")
		WebElement email;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="showpassword")
		WebElement showpassword_checkbox;
		
		WebDriver driver;
		public  EbayPages(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void setregister() {
			register.click();
		}
		public void setfirstname(String input) {
			firstname.sendKeys(input);
		}
		public void setlastname(String input) {
			lastname.sendKeys(input);
		}
		public void setemail(String input) {
			email.sendKeys(input);
		}
		public void setpassword(String input) {
			password.sendKeys(input);
		}
		public void setshowpassword_checkbox() {
			showpassword_checkbox.click();
		}
	}



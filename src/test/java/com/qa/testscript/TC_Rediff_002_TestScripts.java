package com.qa.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.RediffPages;

public class TC_Rediff_002_TestScripts extends TestBase {

	@Test

	public void rediffPageLink() throws InterruptedException {
		RediffPages rediffPage = new RediffPages(driver);

		// 3.click on createaccount link
		rediffPage.setcreateaccount();

		// 4.enter data in password field
		String pass1 = "password";
		rediffPage.setpassword(pass1);

		// 5.enter data in re-enter password field
		String pass2 = "password";
		rediffPage.setconfirmpassword(pass2);

		// 6.compare the data in password & reenter password field are same

		if (pass1.equals(pass2)) {
			Reporter.log("passwords are same");
		} else {
			Reporter.log("passwords are not same");
		}

	}
}
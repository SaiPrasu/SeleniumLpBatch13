package com.qa.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.UserEventPages;

public class UserEventScripts extends TestBase {
	
	@Test
	public void chechButtons() throws InterruptedException {
		UserEventPages userEventPages=new UserEventPages(driver);
		 
		//3.check if wednesday radio button is selected by default under radiobutton selection
		Boolean input=userEventPages.setButtonIsDefaultSelected();
		if(input.equals(true)) {
			Reporter.log("wednesday is selected");
		}
		else {
			Reporter.log("Defaultly wednesday is not selected");
		}
		
		//4.select monday radio button
		userEventPages.setMonDayIsSelected();
		Thread.sleep(2000);
		
		//5.check if red and yellow radio button are selected .if deselect red and select orange 
		Boolean red=userEventPages.setRed();
		Boolean yellow=userEventPages.setYellow();
		if((red.equals(true))&&(yellow.equals(true))){
			userEventPages.setRed1();
			Thread.sleep(2000);
			userEventPages.setOrange();
			Thread.sleep(2000);
		}	
	}

}
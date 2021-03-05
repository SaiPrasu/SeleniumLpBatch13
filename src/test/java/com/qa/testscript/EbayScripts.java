package com.qa.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.qa.pages.EbayPages;


public class EbayScripts extends TestBase {
	@Test
	public void ebayPage(){
				EbayPages ebayPageOR=new EbayPages(driver);
				
				//3.click on register link
				ebayPageOR.setregister();
				
				//4.enter the first name as "Smith"
				ebayPageOR.setfirstname("Smith");;
				
				//5.enter the last name as "kim"
				ebayPageOR.setlastname("Kim");
				
				//6.enter emailid as test@test.com
				ebayPageOR.setemail("test@test.com");
				
				//7.enter password "mercury"
				ebayPageOR.setpassword("mercury");
				
				//8.select enable show check box
				ebayPageOR.setshowpassword_checkbox();			
	}
	@Test
	public void checkTitle() {
		String title = driver.getTitle();
		Reporter.log(title);

		if(title.contains("ebay")) {
			Reporter.log("Test is passed");
		}else {
			Reporter.log("Test is failed");
		}
	}	
	
}

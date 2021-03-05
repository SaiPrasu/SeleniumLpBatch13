package com.qa.testscript;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.AutoSuggest;
import com.qa.utility.ExcelUtility;

public class AutoSuggestScript extends TestBase {

	@Test(dataProvider="getData")
	public void searchItem(String input) throws InterruptedException {

		AutoSuggest googleOR = new AutoSuggest(driver);
		Thread.sleep(5000);
		
		//String input = "Automation";
		//  1. Type the input name as "Automation" in the search text box.
		googleOR.setSearchBox(input);

	
		//2. Get all the suggestions and print
		List<WebElement> allItemNames = googleOR.getSuggestList();
		
		Reporter.log("Total no. of items loaded are :" + allItemNames.size());

		for(WebElement item : allItemNames) {
		
			Reporter.log(item.getText());
		}

		
		//3. Check if the title of the page has search term = "Testing"
		String title = driver.getTitle();
		
		Reporter.log(title);

		if(title.contains("Testing")) {
		
			Reporter.log("Test is passed");
			
		}else {
		
			Reporter.log("Test is failed");
		}

		
	}
//	@DataProvider
//	public Object[] getsData() {
//		
//		Object[] data = new Object[3];
//		// input
//		data[0] = "Automation";
//		data[1] = "Testing";
//		data[2] = "Selenium";
//		
//		return data;
//	}
	@DataProvider
	public Object[][] getData() {
		Object data[][]=testData("F:\\Eclipse\\SeleniumLpBatch13\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx","Sheet1");
		return data;
	}
	
	public static Object[][] testData(String filePath,String sheetName) {
		ExcelUtility eUtil=new ExcelUtility(filePath,sheetName);
		int rowCount=eUtil.getRowCount();
		int colCount=eUtil.getCellCount();
		
		Object data[][]=new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData=eUtil.getCelData(i, j);
				
				data[i-1][j]=cellData;
			}	
		}
		return data;
	}


}
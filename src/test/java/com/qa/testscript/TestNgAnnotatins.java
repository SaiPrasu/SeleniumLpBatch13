package com.qa.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotatins {
	
	@Test(priority=0)
	public void addPayee(){
		System.out.println("add details of payee");
		Assert.assertTrue(false);
	}
	
	
	@Test(priority=1,invocationCount=3,dependsOnMethods="addpayee")
	public void FundTransfer(){
		System.out.println("I am FundTransfer");
	}
	@Test(priority=2,groups="Bill payment")
	public void UtilityBillPayment(){
		System.out.println("I am UtilitybillPayment");
	}
	@Test(priority=3)
	public void CreditCardBillPayment() {
		System.out.println("I am CreditCardBillPayment");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("I am Login Method");
		
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("I am LogOut Method");
	}
	@BeforeClass
	public void setup() {
		System.out.println("Launch URL");
	}
	@AfterClass
	public void teardown() {
		System.out.println("clearing data");
	}
	
	@BeforeTest
	
	public void precndition() {
		System.out.println("starting the code");
	}
	
	@AfterTest
	public void postconditions() {
		System.out.println("stopping the method");
	}
	
	@Test(priority=4,groups="Insurance",enabled=false)
	public void payInsurance() {
		System.out.println("pay insurance method");
	}
	@Test(priority=5,groups="Insurance",enabled=false)
	public void carInsurance1() {
		System.out.println("car insurance method");
	}
	
	@Test(priority=6)
	public void mutualFund() {
		System.out.println("mutualfund method");
	}
	@BeforeGroups("Insurance")
	public void preinstructions() {
		System.out.println("pre Instructions");
	}
	@AfterGroups
	public void postinstructions() {
		System.out.println("post instructions");
	}
	
}

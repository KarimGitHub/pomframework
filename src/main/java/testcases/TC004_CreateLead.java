package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String compnyname, String firstname,String lastname) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCrmsfa()
		.clickLeadtab()
		.clickCreateLead()
		.enterCompanyName(compnyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreatelead_Button()
		.verify_CreatedLead();
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004_CreateLead";
		browserName="firefox";
		testCaseName="Create Lead";
		testDescription="CreateLead in Opentaps using POM framework";
	}

	
	
	
	
	
	
}

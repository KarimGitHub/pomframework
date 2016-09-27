package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String firstName,String industry) throws Exception{

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCrmsfa()
		.clickLeadtab()
		.clickFindLeads()
		.enterFirsttName(firstName)
		.click_Findleads_Button()
		.click_First_Matchinglead()
		.click_Edit_Button()
		.select_Industry_From_Dropdown(industry)
		.click_Update_Button()
		.verify_Updated_Industry(industry);
	}                          
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005_EditLead";
		browserName="firefox";
		testCaseName="Edit Lead";
		testDescription="EditLead in Opentaps using POM framework";
	}

	
	
	
	
	
	
}

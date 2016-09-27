package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC007_MergeLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String leadName1, String leadName2,String searchResult) throws Exception{

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCrmsfa()
		.clickLeadtab()
		
		.clickMergeLeads()
		.parentWindow()
		
		.click_From_Lead_Img()
		.childWindow()
		.EnterFirstname_For_Merge(leadName1)
		.click_Findleads_Button()
		.getText_Of_FirstMatchinglead_For_Merge()
		.click_FirstMatchinglead_For_Merge()
		.parentWindow()
		
		.click_To_Lead_Img()
		.childWindow()
		.EnterFirstname_For_Merge(leadName2)
		.click_Findleads_Button()
		.click_FirstMatchinglead_For_Merge()
		
		.parentWindow()
		.click_Merge_Button()
		.accept_Alert()
		
		.clickFindLeads()
		.enterText_Of_FirstMatchinglead_For_Merge()
		.click_Findleads_Button()
		.verify_Lead_matches(searchResult);
		
}	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC007_MergeLead";
		browserName="chrome";
		testCaseName="Merge Lead";
		testDescription="MergeLead in Opentaps using POM framework";
	}

	
}

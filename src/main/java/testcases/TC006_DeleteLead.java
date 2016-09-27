package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC006_DeleteLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String leadId, String viewLeadTitle,String leadMatch) throws Exception{

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCrmsfa()
		.clickLeadtab()
		.clickFindLeads()
		.enterLeadId(leadId)
		.click_Findleads_Button()
		.get_Firstlead_Text()
		.click_First_Matchinglead()
		.verify_Viewlead_Title(viewLeadTitle)
	    .click_Delete_Button()
	    .clickFindLeads()
	    .enterLeadId(leadId)
	    .click_Findleads_Button()
	    .verify_Lead_matches(leadMatch);
	
	}                          
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006_DeleteLead";
		browserName="firefox";
		testCaseName="Delete Lead";
		testDescription="DeleteLead in Opentaps using POM framework";
	}

	
	
	
	
	
	
}

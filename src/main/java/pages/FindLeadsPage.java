package pages;

import utils.Reporter;
import wrappers.GenericWrappers;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{
 
	public FindLeadsPage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Leads Page", "FAIL");
	}	

	public FindLeadsPage enterFirsttName(String data) throws Exception
	{
		Thread.sleep(5000);
			enterByXpath(prop.getProperty("FindLeadsPage.enterFirsttName.xpath"), data);
			return this;
	}

	//----------------------------This method can also used for MergeLead -------------------------//
	public FindLeadsPage enterLeadId(String data) throws Exception
	{
		Thread.sleep(5000);
			enterByXpath(prop.getProperty("FindLeadsPage.enterLeadId.xpath"), data);
			return this;		
	}
	
	public FindLeadsPage verify_Lead_matches(String data)
	{
		verifyTextByXpath(prop.getProperty("FindLeadsPage.VerifyLeadMatches.xpath"), data);
		return this;
	}
	
	//----------------------------This method is also used by MergeLead -------------------------// 
	public FindLeadsPage click_Findleads_Button()
	{
		clickByXpath(prop.getProperty("FindLeadsPage.FindLeadsButton.xpath"));
		return this;
	}
	
	
	public ViewLead click_First_Matchinglead()
	{
		clickByXpath(prop.getProperty("FindLeadsPage.FirstleadLink.xpath"));
		return new ViewLead();
	}
	
	public FindLeadsPage get_Firstlead_Text()
	{
		getTextByXpath(prop.getProperty("FindLeadsPage.FirstleadId.xpath"));
		return this;
	}
	
	public FindLeadsPage enterText_Of_FirstMatchinglead_For_Merge() throws Exception
	{
		Thread.sleep(3000);
		write_The_Gettext(prop.getProperty("FindLeadsPage.enterLeadId.xpath"));
		return this;
	}
	
}


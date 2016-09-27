package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	public MyLeadsPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	


// click create lead
	// return new create lead();
	
	public CreateLeadPage clickCreateLead()
	{
		clickByLink(prop.getProperty("MyLeadsPage.Createlead.Link"));
		return new CreateLeadPage();
	}


	// click find leads
		// return new Find Leads();


	public FindLeadsPage clickFindLeads()
	{
		clickByLink(prop.getProperty("MyLeadsPage.Findleads.Link"));
		return new FindLeadsPage();
	}

	public Windows_Switching clickMergeLeads()
	{
		clickByLink(prop.getProperty("MyLeadsPage.Mergeleads.Link"));
		return new Windows_Switching();
	}






}

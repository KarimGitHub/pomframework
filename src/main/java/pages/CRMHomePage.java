package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM home page Page", "FAIL");
	}	


public MyLeadsPage clickLeadtab()
{
	clickByLink(prop.getProperty("CRMHomePage.LeadTab.Link"));
	return new MyLeadsPage();
}













}

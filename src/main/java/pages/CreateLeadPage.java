package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Create Lead Page", "FAIL");
	}	


public CreateLeadPage enterCompanyName(String data)
{
	enterById(prop.getProperty("CreateLeadPage.companyname.id"), data);
	return this;
}

public CreateLeadPage enterFirstName(String data)
{
	enterById(prop.getProperty("CreateLeadPage.firstname.id"), data);
	return this;
}

public CreateLeadPage enterLastName(String data)
{
	enterById(prop.getProperty("CreateLeadPage.lastname.id"), data);
	return this;
}

public ViewLead clickCreatelead_Button()
{
	clickByXpath(prop.getProperty("CreateLeadPage.clickcrtlead.xpath"));
	return new ViewLead();
}

// enter cmpy name
//return this
	
	// enter firstnme
	//return this
	
	// enter last name
	//return this
	
	//click on create button
	// return new viewlead()











}

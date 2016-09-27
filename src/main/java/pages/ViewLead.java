package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLead extends OpentapsWrappers{

	public ViewLead() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM View Lead Page", "FAIL");
	}	

public ViewLead verify_CreatedLead(){
	getTextByXpath(prop.getProperty("ViewLead.verifyLead.xpath"));
	return this;
}


public EditLeadPage click_Edit_Button()
{
	clickByLink(prop.getProperty("ViewLead.Editbutton.Link"));
	return new EditLeadPage();
}

public ViewLead verify_Updated_Industry(String data)
{
	verifyTextByXpath(prop.getProperty("ViewLead.IndustryText.Xpath"), data);
	return this;
}

public ViewLead verify_Viewlead_Title(String data)
{
	verifyTextByXpath(prop.getProperty("ViewLead.Viewlead_Title.Xpath"), data);
	return this;
}

public MyLeadsPage click_Delete_Button()
{
	clickByLink(prop.getProperty("ViewLead.Deletebutton.Link"));
	return new MyLeadsPage();
}

public FindLeadsPage clickFindLeads()
{
	clickByLink(prop.getProperty("MyLeadsPage.Findleads.Link"));
	return new FindLeadsPage();
}

}



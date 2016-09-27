package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{

	public EditLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not opentaps CRM page", "FAIL");
	}	


public EditLeadPage select_Industry_From_Dropdown(String data)
{
	selectById(prop.getProperty("EditLeadsPage.SelectIndustry.Id"),data);
	return this;
}


public ViewLead click_Update_Button()
{
	clickByXpath(prop.getProperty("EditLeadsPage.Updatebutton.Xpath"));
	return new ViewLead();
}










}

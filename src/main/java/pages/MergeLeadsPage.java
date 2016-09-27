package pages;

import utils.Reporter;
import wrappers.GenericWrappers;
import wrappers.OpentapsWrappers;

public class MergeLeadsPage extends OpentapsWrappers{
 
	public MergeLeadsPage() {
		if(!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not Merge Lead Page", "FAIL");
	}
	
	public Windows_Switching click_From_Lead_Img() throws Exception
	{
		
			clickByXpath(prop.getProperty("MergeLeadsPage.FromLeadImg.xpath"));
			Thread.sleep(3000);
			return new Windows_Switching();
	}
	
	public Windows_Switching click_To_Lead_Img() throws Exception
	{
		clickByXpath(prop.getProperty("MergeLeadsPage.ToLeadImg.xpath"));
		Thread.sleep(3000);
		return new Windows_Switching();
	}
	
	public AlertWindow click_Merge_Button() throws Exception
	{
		Thread.sleep(3000);
		clickByLink(prop.getProperty("MergeLeadsPage.MergeButton.link"));
		
		return new AlertWindow();
	}
	
	/*public ViewLead accept_Alert() throws Exception
	{
		Thread.sleep(5000);
		alertAccept();
		Thread.sleep(5000);
		return new ViewLead();
	}
	*/
	/*public MergeLeadsPage get_Firstlead_Text()
	{
		getTextByXpath(prop.getProperty("FindLeadsPage.FirstleadId.xpath"));
		return this;
	}
	
*/	/*public ViewLead click_First_Matchinglead()
	{
		clickByXpath(prop.getProperty("FindLeadsPage.FirstleadLink.xpath"));
		return new ViewLead();
	}*/
}


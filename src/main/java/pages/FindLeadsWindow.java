package pages;

import utils.Reporter;
import wrappers.GenericWrappers;
import wrappers.OpentapsWrappers;

public class FindLeadsWindow extends OpentapsWrappers{
 
	/*public FindLeadsWindow() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Leads Window", "FAIL");
	}*/	

	public FindLeadsWindow click_Findleads_Button()
	{
		clickByXpath(prop.getProperty("FindLeadsWindow.FindLeadsButton.xpath"));
		return this;
	}
	
	public FindLeadsWindow EnterFirstname_For_Merge(String data) throws Exception
	{
		    Thread.sleep(5000);
			enterByXpath(prop.getProperty("FindLeadsWindow.EnterFirstName_For_Merge.xpath"), data);
			return this;		
	}
	
	
	public FindLeadsWindow getText_Of_FirstMatchinglead_For_Merge() throws Exception
	{
		Thread.sleep(5000);
		//getTextByXpath(prop.getProperty("FindLeadsWindow.FirstleadId.xpath"));
		getTextByXpath_to_Write(prop.getProperty("FindLeadsWindow.FirstleadId.xpath"));
		return this;
	}
	
	public Windows_Switching click_FirstMatchinglead_For_Merge() throws Exception
	{
		Thread.sleep(5000);
		clickByXpath(prop.getProperty("FindLeadsWindow.FirstleadId.xpath"));
		return new Windows_Switching();
	}
	
}


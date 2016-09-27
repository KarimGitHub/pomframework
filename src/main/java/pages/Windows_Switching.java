package pages;

import utils.Reporter;
import wrappers.GenericWrappers;
import wrappers.OpentapsWrappers;

public class Windows_Switching extends OpentapsWrappers{
 

	public MergeLeadsPage parentWindow() throws Exception
	{
		Thread.sleep(3000);
		switchToPrimary();
		Thread.sleep(3000);
		return new MergeLeadsPage();
	}
	
	public FindLeadsWindow childWindow() throws Exception
	{
		Thread.sleep(3000);
		switchToLastWindow();
		
		return new FindLeadsWindow();
	}
	
}


package pages;

import utils.Reporter;
import wrappers.GenericWrappers;
import wrappers.OpentapsWrappers;

public class AlertWindow extends OpentapsWrappers{

	
	public ViewLead accept_Alert() throws Exception
	{
		Thread.sleep(5000);
		alertAccept();
		Thread.sleep(5000);
		return new ViewLead();
	}
}


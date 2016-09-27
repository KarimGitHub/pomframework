package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import wrappers.GenericWrappers;

public class Demo_Check extends GenericWrappers
{
	
		public static String str="";
		static RemoteWebDriver driver;
		

public static void main(String args[]) throws Exception
{
	driver = new FirefoxDriver();
	 new Demo_Check()
	.gettext();
	 
	 new Demo_Check()
	.writetext();
	
	 
}

public String gettext() throws Exception
{

	driver.get("file:///D:/Sample-Html-files/form.html");
			str = driver.findElement(By.xpath("//h2[text()='ENTRY FORM']")).getText();
			System.out.println("In gettext method : " + str);
	return str;
}

public void writetext()
{
	System.out.println("In writetext method : " + str);
	driver.findElement(By.xpath("//input[@name='VolunteerName']")).sendKeys(str);
	//driver.close();
}


}

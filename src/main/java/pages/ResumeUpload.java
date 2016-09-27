package pages;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ResumeUpload {

	public ResumeUpload uploadFreshereResume() {

		FirefoxDriver driver = new FirefoxDriver();

		driver.findElementByXPath("//*[@id='basicDetailForm']/resman-uploader/div/div[1]/span[1]/input")
				.sendKeys("D:\\Personal Project Development\\Selenium Training Course Details - Completion.docx");
		
		return this;
	}

}

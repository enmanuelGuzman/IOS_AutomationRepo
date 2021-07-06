import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class MainPagePO {
	
	
    public static void clickDontAllow(IOSDriver<MobileElement> driver)
    {
    	MobileElement dontAllowBtn = (MobileElement) driver.findElementByAccessibilityId("Don’t Allow");
    	System.out.println("Click on Don't Allow Button");
		dontAllowBtn.click();
    }
	
	
	public static void clickMoreTab(IOSDriver<MobileElement> driver)
	{ 
		WebDriverWait wait = new WebDriverWait(driver, 120, 1000);
		MobileElement moreTab = (MobileElement) driver.findElementByAccessibilityId("More");
		wait.until(ExpectedConditions.elementToBeClickable(moreTab));
		System.out.println("Click on More Tab");
		
		moreTab.click();
		
	}
	
	//
	public static void clickOnboardScreenNextBtn(IOSDriver<MobileElement> driver)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Click on Next Button from Onboarding Screen");
		MobileElement nextBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/onboarding_screen_next_button");
		nextBtn.click();

	}
	
	public static void clickOnBoardScreenSkipBtn(IOSDriver<MobileElement> driver)
	{
		System.out.println("Click on Skip Button from Onboarding Screen");
		MobileElement skipBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/onboarding_screen_skip_button");
		skipBtn.click();
	}
	
	public static String getBrowseTitle(AppiumDriver<MobileElement> driver)
	{
		MobileElement browserTitleLabel = (MobileElement) driver.findElementByAccessibilityId("Browse by category");
		return browserTitleLabel.getText();
	}
	
	public static void verifPointHomePage(AppiumDriver<MobileElement> driver)
	{
		
		
		 if(getBrowseTitle(driver).trim().equals("Browse by category"))
    	 {
    		 System.out.println("Test Passed - Inside Home Page");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Inside Home Page");
    	 }
	}

	public static void clickAllow(AppiumDriver<MobileElement> driver)
	{
		System.out.println("Click on Allow Button");
		MobileElement allowBtn = (MobileElement) driver.findElementByAccessibilityId("Allow");
		allowBtn.click();
	}
	
	public static void clickGotItBnt(AppiumDriver<MobileElement> driver)
	{
		System.out.println("Click on Got It Button");
		MobileElement gotItBtn = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Got it\"]");
		gotItBtn.click();

	}
		

}

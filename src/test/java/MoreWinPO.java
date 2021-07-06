import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class MoreWinPO {
	
	
	public static void clicSettingBtn(IOSDriver<MobileElement> driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 120, 1000);
		MobileElement settingBtn = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Angi\"]/XCUIElementTyp"
				+ "eWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther"
				+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]");
		
		wait.until(ExpectedConditions.elementToBeClickable(settingBtn));
		System.out.println("Click on Setting");
		settingBtn.click();
	}
	
	
	
	
	public static String getTextMoreWin(IOSDriver<MobileElement> driver)
    {
   	 MobileElement aboutAngiBtn = (MobileElement) driver.findElementByAccessibilityId("About Angi");
   	 return aboutAngiBtn.getText();
   	 
	 
    }
	
	
    public static void VerifyMoreWin(IOSDriver<MobileElement> driver)
    {
   	 if(getTextMoreWin(driver).trim().equals("About Angi"))
   	 {
   		 System.out.println("Test Passed - Inside More Window");
   	 }
   	 else 
   	 {
   		 System.out.println("Test Failed - Inside More Window");
   	 }
   	 
    }
    
    public static void ClickHomeTab(IOSDriver<MobileElement> driver)
    {
    	
    	System.out.println("Click on Home Tab");
    	MobileElement homeTab = (MobileElement) driver.findElementByAccessibilityId("Home");
    	homeTab.click();
    	
    	
    }
	

}

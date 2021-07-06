


import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class settingWinPO {
	
	// getSettingTitle against this one
	public static String getSessionInfoTxt(IOSDriver<MobileElement> driver)
	{
		MobileElement settingWinTxt= (MobileElement) driver.findElementByAccessibilityId("Close");
		
		return settingWinTxt.getText();
	}
	
	public static void VerifySettingWin(IOSDriver<MobileElement> driver)
     {
    	 if(getSessionInfoTxt(driver).trim().equals("Close"))
    	 {
    		 System.out.println("Test Passed - Inside Setting Window");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Inside Setting Window");
    	 }
    	 
     }
	
	public static void clickEnvNetwork(IOSDriver<MobileElement> driver, String env)
	{
		
		MobileElement qaBtn = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\""+env+"\"]");
		System.out.println("Click "+env.toUpperCase()+" Env");
		qaBtn.click();
		
	}
	
	
	public static String getCurrentServer(IOSDriver<MobileElement> driver)
	{
		MobileElement currentPayHost = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Angi\"]"
				+ "/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]"
				+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField");
		return currentPayHost.getText();
	}
	
	public static void VerifyCurrentServer(IOSDriver<MobileElement> driver, String currentServer)
	{
		 if(getCurrentServer(driver).trim().equals(""+currentServer.toLowerCase()+"-api.homeadvisor.com"))
    	 {
    		 System.out.println("Test Passed - Current Server is correct");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Current Server is not correct");
    	 }
		
	}
	
	
	public static void ClickSetRandomUser(IOSDriver<MobileElement> driver)
	{
		MobileElement setRadUser = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Set random user\"]");
		setRadUser.click();
		
	}
	
	public static String getRandomUserStatus(IOSDriver<MobileElement> driver)
	{
		MobileElement randUserStatus = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Angi\"]"
				+ "/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]"
				+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField");
		return randUserStatus.getAttribute("enabled");
	}
	
	public static void VerifyRadUserCheck(IOSDriver<MobileElement> driver, String currentServer)
	{
		
		System.out.println("Enable is: " + getRandomUserStatus(driver));
		
		
		 if(getRandomUserStatus(driver).trim().equals("true"))
    	 {
    		 System.out.println("Test Passed - Established User");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Established User");
    	 }
		
	}
	
	
	public static void clickReturnBtn(IOSDriver<MobileElement> driver)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Click on Return Button");
		MobileElement returnBtn = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"More\"])[1]");
		returnBtn.click();
	}
	
	/*
	
	public static void insertZip(IOSDriver<MobileElement> driver, String zipCode)
	{
		System.out.println("Inserting ZIP Code: " + "99547");
		MobileElement zipTxt = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Angi\"]/XCUIElementTypeWindow"
				+ "[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther"
				+ "/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]/XCUIElementTypeTextField");
		zipTxt.sendKeys(zipCode);
	}*/
	


	
	

}

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSTestCase {
	
	
	private static IOSDriver driver;
	

	public static void main(String[] args) throws MalformedURLException {
	
	
		
		    new AppiumUtility();
		
		    driver = AppiumUtility.getDriver();
		    
		    MainPagePO.clickDontAllow(driver);
		    MainPagePO.clickAllow(driver);
		   /* try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		   MainPagePO.clickGotItBnt(driver);
		    MainPagePO.verifPointHomePage(driver);
		    MainPagePO.clickMoreTab(driver);
		    MoreWinPO.VerifyMoreWin(driver);
		    MoreWinPO.clicSettingBtn(driver);
		    settingWinPO.VerifySettingWin(driver);
		    settingWinPO.clickEnvNetwork(driver, "QA1");
		    settingWinPO.VerifyCurrentServer(driver, "QA1");
		    settingWinPO.ClickSetRandomUser(driver);
		    settingWinPO.VerifyRadUserCheck(driver, "");
		    settingWinPO.clickReturnBtn(driver);
		    MoreWinPO.VerifyMoreWin(driver);
		    MoreWinPO.ClickHomeTab(driver);
		   /* try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		    MainPagePO.clickGotItBnt(driver);
		    MainPagePO.verifPointHomePage(driver);
		    
		    /*
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		    AppiumUtility.close();
		
		

	}

}

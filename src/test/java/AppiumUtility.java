import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumUtility {
	
	public static IOSDriver driver;
	public AppiumUtility()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
		//cap.setCapability("udid", "34092E74-35E8-4453-9124-C0B850E60F0F");location	/Users/enmanuel.leon/eclipse-workspace/test/src/test/java
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
		cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 5000);//Check if exists some cap like this on Android
		cap.setCapability("commandTimeouts", "12000");
	
		
		cap.setCapability(MobileCapabilityType.APP, "/Users/enmanuel.leon/Desktop/HomeAdvisor.app");
		
		
		//"/Users/enmanuel.leon/Desktop/HomeAdvisor.app");
		///Users/enmanuel.leon/Library/Developer/Xcode/DerivedData/HomeAdvisor-diuguphcpnftrjfrpagqayigsuxk/Build/Products/Adhoc-iphonesimulator
		
		/*cap.setCapability("appPackage", "com.servicemagic.consumer.debug");
		cap.setCapability("appActivity", "com.servicemagic.consumer.splashscreen.Home");*/
		
		 try {
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),  cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static IOSDriver<MobileElement> getDriver()
	{
		
		return driver;
	}
	
	public static void close()
	{
		System.out.println("Closing App");
		driver.quit();
	}
	

}

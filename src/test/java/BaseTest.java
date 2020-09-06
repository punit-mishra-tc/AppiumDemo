import config.Device;
import config.ReadConfig;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.net.URL;

public class BaseTest {

    public static AndroidDriver driver;
 
    @BeforeSuite
    public void setUpDevice(){
        ReadConfig readConfig = new ReadConfig();
        Device onePlus = new Device(readConfig.getValue("platformName"), readConfig.getValue("platformVersion"),
                readConfig.getValue("deviceName"), readConfig.getValue("udid"),
                readConfig.getValue("appPackage"), readConfig.getValue("appActivity"));
        try{
            System.out.println("Loading url");
            URL url = new URL(readConfig.getValue("url"));
            driver = new AndroidDriver(url, onePlus.getDesiredCapabilities());
        }
        catch(Exception e) {
            System.out.println("Unable to create AndroidDriver");
            e.printStackTrace();
        }
    }
    
    @BeforeMethod
    public void startTestName(Method m) {
    	System.out.println("******* STARTED EXECUTING - "+m.getName()+"*******");
    }

    @AfterMethod
    public void endTestName(Method m) {
    	System.out.println("******* "+m.getName()+" - TEST CASE ENDED *******");
    }

    @AfterSuite
    public void tearDown(){
    	System.out.println("Quitting the driver");
        driver.quit();
    }

}

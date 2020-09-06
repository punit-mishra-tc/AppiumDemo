package config;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Device {

    private DesiredCapabilities desiredCapabilities;

    public Device(String mobileOS, String osVersion, String name, String deviceId, String packageName, String activityName){
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", mobileOS);
        desiredCapabilities.setCapability("platformVersion", osVersion);
        desiredCapabilities.setCapability("deviceName", name);
        desiredCapabilities.setCapability("udid", deviceId);
        desiredCapabilities.setCapability("appPackage", packageName);
        desiredCapabilities.setCapability("appActivity", activityName);
    }

    public DesiredCapabilities getDesiredCapabilities(){
         return desiredCapabilities;
    }

}

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AutomationDemo {
	
	AndroidDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		AutomationDemo obj = new AutomationDemo();
		obj.setUp();
		obj.signUp();
		obj.fillUpForm();
		obj.verifyUserProfile();
	}
	
	public void setUp() throws Exception{
		System.out.println("Setting up desiredCapabilities");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10.0");
		capabilities.setCapability("deviceName", "Oneplus5");
		capabilities.setCapability("udid", "192.168.0.179:5555");
		capabilities.setCapability("appPackage", "com.example.demoapp");
		capabilities.setCapability("appActivity", "com.example.demoapp.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		System.out.println("Done");
	}
	
	public void signUp() {
		AndroidElement signUpBtn = (AndroidElement)driver.findElement(By.id("com.example.demoapp:id/signUp"));
		signUpBtn.click();

		AndroidElement firstName = (AndroidElement)driver.findElement(By.id("com.example.demoapp:id/firstName"));
		AndroidElement lastName = (AndroidElement)driver.findElement(By.id("com.example.demoapp:id/lastName"));
		AndroidElement userName = (AndroidElement)driver.findElement(By.id("com.example.demoapp:id/username"));
		AndroidElement password = (AndroidElement)driver.findElement(By.id("com.example.demoapp:id/password"));

		firstName.sendKeys("Punit");
		lastName.sendKeys("Mishra");
		userName.sendKeys("punit");
		password.sendKeys("1234");
		signUpBtn.click();

	}

	public void fillUpForm() {
		AndroidElement userName = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/username"));
		AndroidElement password = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/password"));
		AndroidElement rememberMe = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/rememberMe"));
		AndroidElement login = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/login"));
		
		userName.sendKeys("admin");
		password.sendKeys("1234");
		login.click();

		userName.sendKeys("punit");
		password.sendKeys("1234");
		rememberMe.click();
		login.click();
		
	}

	public void verifyUserProfile() {
		AndroidElement header = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/header"));
		AndroidElement firstName = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/firstName"));
		AndroidElement lastName = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/lastName"));

		System.out.println(header.getText());
		System.out.println(firstName.getText());
		System.out.println(lastName.getText());
	}
}

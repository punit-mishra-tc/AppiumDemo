# AppiumDemo

<img width="1011" alt="login" src="https://user-images.githubusercontent.com/46274358/90629843-a8bc0c00-e23d-11ea-941c-0775ed6bd389.png">

* This is a sample form to have a basic understanding how automation scripts work.
  Valid credentials are - 
  * Username - admin
  * Password - 1234
  For every valid/invalid login, toast message is displayed
  
* QA's tasks - 
  * Attempt for verification using **invalid** credentials
  * Attempt for verification using **valid** credentials
  
* Script explaination - 

1. Open AutomationDemo.java file.
   This is the main method. Program execution starts from this point 
   
   public static void main(String[] args) throws Exception {
		AutomationDemo obj = new AutomationDemo();
		obj.setUp();
		obj.fillUpForm();
	}
    
    setUp() method
    1.1. This is used to set up the desiredCapabilities which are to be used by a device
         desriredCapabilities are in format of key-value pairs to demonstrate the properties for a device. Refer - http://appium.io/docs/en/writing-running-appium/caps/ for more info.
    1.2. Here we are setting up these capabilities - 
         capabilities.setCapability("platformName", "Android");
		     capabilities.setCapability("platformVersion", "10.0");
		     capabilities.setCapability("deviceName", "Oneplus5");
		     capabilities.setCapability("udid", "192.168.0.179:5555");
		     capabilities.setCapability("appPackage", "com.example.demoapp");
		     capabilities.setCapability("appActivity", "com.example.demoapp.MainActivity");
    1.3. Ensure to change the value of "udid" & "platformVersion" as per the device that you are running the scripts on. 
    
    
         
         

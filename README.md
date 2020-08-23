# AppiumDemo
<pre>
<img width="727" alt="Sign Up" src="https://user-images.githubusercontent.com/46274358/90983699-a9caa180-e58d-11ea-8b48-8cec71e19ea2.png">
</pre>
* Create Account
<pre>
<img width="727" alt="Sign In" src="https://user-images.githubusercontent.com/46274358/90983826-8e13cb00-e58e-11ea-9fec-e0a0044c8d14.png">
</pre>
* Sign In
* This is a sample form to have a basic understanding how automation scripts work.
  Valid credentials are - 
  * Username - admin
  * Password - 1234 <br/>
  For every valid/invalid login, toast message is displayed <br/>
  
* QA's tasks - 
  * Attempt for verification using **invalid** credentials
  * Attempt for verification using **valid** credentials
  
* Script explaination - 

1. Open AutomationDemo.java file.<br/>
   This is the main method. Program execution starts from this point<br/> 
   <br/>   
<img width="325" alt="Screenshot 2020-08-23 at 10 31 02 PM" src="https://user-images.githubusercontent.com/46274358/90984069-67569400-e590-11ea-81b4-8975e4eca38b.png">
    <br/>
<pre>
    setUp() method<br/>
    1.1. This is used to set up the desiredCapabilities which are to be used by a device<br/>
         desriredCapabilities are in format of key-value pairs to demonstrate the properties for a device. Refer - http://appium.io/docs/en/writing-running-appium/caps/ for more info.<br/>
    1.2. Here we are setting up these capabilities - <br/>
         capabilities.setCapability("platformName", "Android");<br/>
		     capabilities.setCapability("platformVersion", "10.0");<br/>
		     capabilities.setCapability("deviceName", "Oneplus5");<br/>
		     capabilities.setCapability("udid", "192.168.0.179:5555");<br/>
		     capabilities.setCapability("appPackage", "com.example.demoapp");<br/>
		     capabilities.setCapability("appActivity", "com.example.demoapp.MainActivity");<br/>
    1.3. Ensure to change the value of "udid" & "platformVersion" as per the device that you are running the scripts on. <br/>
    </pre>
    
    
         
         

# Getting Started with Appium Automation Scripts
<details>
  <summary> <ins> Installation and set up </ins></summary>
  
* [Java Installed](https://www.java.com/en/download/help/mac_install.xml) </br>  
* [Set up java_home, android_home in your .profile or .zsh file (default is .profile)](https://youtu.be/y6szNJ4rMZ0) </br>
  * Adb commands should work now, check using “adb devices” in terminal </br>
* Node installed </br>
  * Check if node is present using “npm -v” on terminal in mac </br>
  * [If node is not present, Install node](https://nodejs.org/en/download/) </br>
* [Appium installed (Preferably Appium Desktop)](http://appium.io/) </br>
  * Launch Appium </br>
  * Run Appium Server in default settings and check if the server is running or not. </br>
* [Appium-doctor (optional)](https://www.npmjs.com/package/appium-doctor) </br>
  * Run “appium-doctor --android” in your terminal to check if all dependencies related to Android are installed </br>
* IDE present </br>
  * [Eclipse](https://www.eclipse.org/downloads/) or [IntelliJ](https://www.jetbrains.com/idea/download/#section=mac) </br>
  </details>

<details>
	<summary> <ins> Sample Form app </ins> </summary>
	
* This is a sample app created with basic UI Elements in it.
* Install app-debug.apk from the [here](https://github.com/punitm03/AppiumDemo/blob/master/app-debug.apk)
</br>
### Screenshots
<p align = "center">Create Account</p>
<img width="727" align = "center" alt="Sign Up" src="https://user-images.githubusercontent.com/46274358/90983699-a9caa180-e58d-11ea-8b48-8cec71e19ea2.png"></br>
</br>
<p align = "center">Sign In</p>
<img width="727" align = "center" alt="Sign In" src="https://user-images.githubusercontent.com/46274358/90983826-8e13cb00-e58e-11ea-9fec-e0a0044c8d14.png">

### Test Cases 
* Check if user is able to sign up by providing the details
* Check if error is shown if incorrect user credentials are passed
* Check if "Log in" button is disabled if user enters incorrect credentials 5 times
* Check if user is able to login to the app using the correct credentials and verify the First Name and Last Name in the app

</details>

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
    
    
         
         

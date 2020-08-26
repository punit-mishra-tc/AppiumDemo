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
* Screenshots from the app can be found here ⬇
<div align="center">
<p><ins>Create Account</ins></p>
<img width="727" align = "center" alt="Sign Up" src="https://user-images.githubusercontent.com/46274358/90983699-a9caa180-e58d-11ea-8b48-8cec71e19ea2.png">
</div> 
<div align="center">
<br/><br/>
<p> <ins>Sign In </ins></p>
<img width="727" align = "center" alt="Sign In" src="https://user-images.githubusercontent.com/46274358/90983826-8e13cb00-e58e-11ea-9fec-e0a0044c8d14.png">
</div>

### Test Cases 
* Check if user is able to sign up by providing the details
* Check if error is shown if incorrect user credentials are passed
* Check if "Log in" button is disabled if user enters incorrect credentials 5 times
* Check if user is able to login to the app using the correct credentials and verify the First Name and Last Name in the app
</details>

<details>
	<summary> <ins> First Automation Script </ins> </summary>
	
* QA's tasks - 
  * Attempt for verification using **invalid** credentials
  * Attempt for verification using **valid** credentials		
* Script explaination - 
	* Open [AutomationDemo.java](https://github.com/punitm03/AppiumDemo/blob/master/src/main/java/AutomationDemo.java) file.
   This is the main method. Program execution starts from this point
<div align="center">   
<img width="325" alt="Screenshot 2020-08-23 at 10 31 02 PM" src="https://user-images.githubusercontent.com/46274358/90984069-67569400-e590-11ea-81b4-8975e4eca38b.png">
	<br/>
</div>


* setUp() method - 
  * This is used to set up the desiredCapabilities which are to be used by a device
  * desiredCapabilities are in format of key-value pairs to demonstrate the properties for a test device. [Refer here](http://appium.io/docs/en/writing-running-appium/caps/) for more info.
  * Here we are setting up these capabilities - 	
	
```java
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("platformVersion", "10.0");
capabilities.setCapability("deviceName", "Oneplus5");
capabilities.setCapability("udid", "192.168.0.179:5555");
capabilities.setCapability("appPackage", "com.example.demoapp");
capabilities.setCapability("appActivity", "com.example.demoapp.MainActivity");
```

* signUp() method - 
  * This method navigates the user to Sign Up page and allows them to create a new user account here.
  * All the UI elements are initialised here like -
```java
AndroidElement firstName = (AndroidElement)driver.findElement(By.id("com.example.demoapp:id/firstName"));
AndroidElement lastName = (AndroidElement)driver.findElement(By.id("com.example.demoapp:id/lastName"));
```
  * Elements are initialised using the id locator. For more info about locators [refer here](https://kobiton.com/book/chapter-4-appium-locator-finding-strategies/)
  * Actions are performed on the UI elements in order - 

```java
signUpBtn.click(); // From Home page, click on Sign Up button
firstName.sendKeys("Punit"); // In Sign Up page, enter "Punit" in First Name field
lastName.sendKeys("Mishra"); // Enter "Mishra" in Last Name field
userName.sendKeys("punit"); // Enter "punit" in userName field
password.sendKeys("1234"); // Enter "1234" in password field
signUpBtn.click(); // Click on Sign Up button to create the user account
```


</details>    
         
         

# Getting Started with Appium
<details>
  <summary> <ins> Installation and set up </ins></summary>
	
* For windows users, click [here](https://www.youtube.com/watch?v=x-hBpgM5je8&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=3)  
* For Mac Users, continue with the below steps - 
* Install Java  
  * Check if java is installed, by running ```java -version``` in terminal
  * If output is "command not found", then click [here](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) to download JAVA JDK and then install the file
  * Run ```java -version``` & ```javac -version``` again to check if java is installed properly
  </br></br>
  <img align = "center" width="1002" alt="Java_version" src="https://user-images.githubusercontent.com/46274358/91602477-0c0a1480-e989-11ea-9097-92f0c8b9c8e6.png"> </br>
* Set up environment variables - java_home in your .profile or .zsh file (default is .profile) by clicking [here](https://youtu.be/y6szNJ4rMZ0)
  * Run ```echo $JAVA_HOME``` in terminal
  * If no output is displayed then
    * Go to the location where JAVA is installed on your system by copying ```cd /Library/Java/JavaVirtualMachines/``` and then click TAB (↹) button on your keyboard for autofill. Continue the address by adding ```/Contents/Home```. </br>
    An example for this would be </br>
    <img align = "center" width="1001" alt="cd" src="https://user-images.githubusercontent.com/46274358/91605493-2b577080-e98e-11ea-8644-6cfbd1b1ee12.png"> </br>
    * Enter ```pwd``` and copy the output. Output can be </br>
    <img align = "center" width="1001" alt="pwd" src="https://user-images.githubusercontent.com/46274358/91605506-2eeaf780-e98e-11ea-9925-c5d9f70233ec.png">
    </br>
    This is the path where java is installed on your system
    
    * Open .bash_profile in your editor by 
    ```open ~/.bash_profile```
    * Do not modify any existing lines, just add the line </br>
	```export JAVA_HOME =``` paste the path you copied before
    * Add PATH
	```PATH=$JAVA_HOME/bin:$PATH```
    * Now save the file and close the editor
  * Run ```echo $JAVA_HOME``` in terminal again, output should be </br>
  <img align = "center" width="999" alt="java_home" src="https://user-images.githubusercontent.com/46274358/91604947-3e1d7580-e98d-11ea-96f2-77f8e9c815fa.png">
  </br></br>
* Install HomeBrew
  * Open terminal and run this command - </br>
  
  ```
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"
  ```
* Node installation
  * Check if node is present by running ``` node -v ``` on terminal
  * If output is "command not found", then run ``` brew install node ``` command on terminal or [Download & Install node](https://nodejs.org/en/download/)
  * Appium is built on node, hence node should be installed properly before proceeding ahead
  * Check if node is finally installed by running the command ``` node -v ``` again. </br> </br>
  <img align = "center" width="1013" alt="Check Node Version" src="https://user-images.githubusercontent.com/46274358/91595084-94d08280-e980-11ea-94ee-a2dc42bfb76d.png"> 
  </br>
* Install Appium by clicking [here](http://appium.io/)  (Preferably Appium Desktop, since this has GUI for better understanding)
  * Download and install appium.dmg file
  * Launch Appium
  </br> 
  <div align="left">
  <img width="605" alt="Launch Appium" src="https://user-images.githubusercontent.com/46274358/91595120-a1ed7180-e980-11ea-9fa5-d1fddd763976.png"> 
  </div> </br>
  
  
  
  * Run Appium Server in default settings by clicking **Start Server** button without making any changes to HOST and PORT. 
  * Once clicked, output should be ```Appium REST http interface listener started on 0.0.0.0:4723 ```. </br>
  Congratulations you have set up Apppium on your system 👏👏👏 </br> </br>
  <div align="left">
  <img width="605" alt="Running Successfully" src="https://user-images.githubusercontent.com/46274358/91595107-9e59ea80-e980-11ea-8c34-cbbf37edb930.png">
  </div> </br>
  

* Install appium-doctor (optional)
  * Appium-doctor is used to check if all dependencies related to appium are installed and if paths are provided correctly 
  * Install appium-doctor either by clickig [here](https://www.npmjs.com/package/appium-doctor) or running ```npm install appium-doctor -g``` in terminal
  * Run ```appium-doctor --android``` in your terminal. Here we are passing the argument as android since we are more focussed on Android automation at the moment
  * For more info refer [Github page for Appium-doctor](www.github.com/appium/appium-doctor)
  * Ensure that you don't see any error messages
  </br> </br>
  <div align="center">
  <img width="1007" alt="Appium-doctor" src="https://user-images.githubusercontent.com/46274358/91595776-b4b47600-e981-11ea-9c72-8de9127cce2a.png">
  </div>
* Install IDE
  * Choose ECLIPSE by clicking [here](https://www.eclipse.org/downloads/) or IntelliJ by clicking [here](https://www.jetbrains.com/idea/download/#section=mac)
* Download and extract android-sdk by clicking [here](https://dl.google.com/android/repository/commandlinetools-mac-6609375_latest.zip), skip if ```adb devices``` works for you . [Refer](https://www.youtube.com/watch?v=BEF-d1xjV4Q&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=6)
  * Open terminal and go to the directory where android-sdk was extracted using ```cd 'path to android sdk'/tools/bin
  * Copy and run ```sdkmanager "platform-tools" "platforms;android-28"```
  * platform-tools directory should be extracted and present in the location where you have downloaded android sdk
  * Set environment variables for ANDROID_HOME & PATH
    * Open .bash_profile in your editor by 
    ```open ~/.bash_profile```
    * Do not modify any existing lines, just add the line </br>
	```export ANDROID_HOME =``` paste the path you android sdk is present
    * Add PATH
	```PATH=${PATH}:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools```
	```export PATH```
    * Now save the file and close the editor
    * Run ```Echo $ANDROID_HOME``` </br></br>
<img align = "center" width="1003" alt="ANDROID_HOME" src="https://user-images.githubusercontent.com/46274358/91608190-b0448900-e992-11ea-808e-1204c3ab2d42.png"></br></br>
    * Run ```PATH``` to get this in the output </br></br>
<img align = "center" width="1003" alt="PATH" src="https://user-images.githubusercontent.com/46274358/91608194-b33f7980-e992-11ea-908e-98938d619d21.png">
</br></br>
    * Adb commands should work now, check using ```adb devices``` in terminal
  
  </details>

<details>
	<summary> <ins> Sample Form app </ins> </summary>
	
* This is a sample app created with basic UI Elements in it.
* Install app-release.apk from the [here](https://github.com/punitm03/AppiumDemo/blob/master/app-release.apk)
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
  * Create a new user account
  * Attempt for verification using **invalid** credentials
  * Attempt for verification using **valid** credentials		
* Script explaination - 
	* Open [AutomationDemo.java](https://github.com/punitm03/AppiumDemo/blob/master/src/main/java/FirstScript/AutomationDemo.java) file.
   This is the main method. Program execution starts from this point
<div align="center">   
<img width="414" alt="Screenshot 2020-08-29 at 12 42 17 AM" src="https://user-images.githubusercontent.com/46274358/91606845-84c09f00-e990-11ea-8bae-6814d8829582.png">
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
* 
  * In this example, elements are initialised using the id locator. For more info about locators [refer here](https://kobiton.com/book/chapter-4-appium-locator-finding-strategies/)
  * Actions are performed on the UI elements in chronological order - 

```java
signUpBtn.click(); // From Home page, click on Sign Up button
firstName.sendKeys("Punit"); // In Sign Up page, enter "Punit" in First Name field
lastName.sendKeys("Mishra"); // Enter "Mishra" in Last Name field
userName.sendKeys("punit"); // Enter "punit" in userName field
password.sendKeys("1234"); // Enter "1234" in password field
signUpBtn.click(); // Click on Sign Up button to create the user account
```

* fillUpForm() method - 
  * This method fills up the sign in form with valid and invalid credentials to check the behavior.
  * Actions performed in choronolical order for Invalid userName are -
```java
userName.sendKeys("admin"); // Enter "admin" as username
password.sendKeys("1234"); // Enter "1234" as password
login.click(); // Click on login button
```
* 
  * Actions perfomed for valid user are -  
```java
userName.sendKeys("punit"); // Enter "1234" as username
password.sendKeys("1234"); // Enter "1234" as password
login.click(); // Click on login button
```

* verifyUserProfile() method - 
  * This method verifies the First Name and Last Name which has been used to login to the account.
  * There are no action perfomed on the elements, we are just caputuring the data from the First Name and Last Name field and printing those values to the console.
  
```java
System.out.println(header.getText());
System.out.println(firstName.getText());
System.out.println(lastName.getText());
```

</details>

<details>
	<summary> <ins> Framework Design </ins> </summary>
		
* The framework is designed on **PAGE OBJECT MODEL** design pattern where you have seperate folders for pages and tests
* The pages folder 
  * It consists of seperate pages (like ```HomePage.java``` & ```SignUpPage.java```) 
  * Each page's elements (like "Sign Up" & "Sign In" buttons) are defined in their respective classes and the actions to be perfomed on those elements (like click() & type() methods) are also defined in the same class
* The test classes
  * It consists of test scripts for each seperate pages (like ```HomePageTest.java``` & ```SignUpPageTest.java```)
  * Each test class has the actions to be perfomed in chronological order
<div align="center">
<img width="616" alt="Screenshot 2020-08-26 at 4 17 13 PM" src="https://user-images.githubusercontent.com/46274358/91294739-9e5abe80-e7b7-11ea-9cbc-5352a8b2af17.png">
</div>
</details>
         
         

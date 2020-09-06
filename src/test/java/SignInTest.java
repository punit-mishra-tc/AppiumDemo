import config.ReadConfig;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.SignInScreen;
import pages.SignUpScreen;

public class SignInTest extends BaseTest{

    SignInScreen signInScreen;
    SignUpScreen signUpScreen;
    HomeScreen homeScreen;
    ReadConfig readConfig;

    @BeforeClass(alwaysRun = true)
    public void initDriver(){
        signInScreen = new SignInScreen(driver);
        signUpScreen = new SignUpScreen(driver);
        homeScreen = new HomeScreen(driver);
        readConfig = new ReadConfig();
    }

    @Test (groups = "InvalidLogin")
    public void loginWithInvalidCredentials() throws Exception{
    	System.out.println("Entering values");
    	signInScreen.login(readConfig.getValue("UserName"), readConfig.getValue("Password"));
        System.out.println(signInScreen.getToastMessage());
        Thread.sleep(2000);
        System.out.println(signInScreen.getToastMessage());
    }

    @Test (dependsOnGroups = "ValidAccount")
    public void loginWithValidCredentials () throws InterruptedException {
        signInScreen.login(readConfig.getValue("UserName"), readConfig.getValue("Password"));
        System.out.println(signInScreen.getToastMessage());
        Thread.sleep(2000);
        Assert.assertTrue(signInScreen.getToastMessage().contains("Login Success"));

        if(signInScreen.getToastMessage().contains("Login Success")) {
            System.out.println(homeScreen.getHeaderText());
            System.out.println(homeScreen.getFirstName());
            System.out.println(homeScreen.getLastName());

            Assert.assertEquals(homeScreen.getFirstName(), readConfig.getValue("FirstName"));
            Assert.assertEquals(homeScreen.getLastName(), readConfig.getValue("LastName"));
        }
        else{
            System.out.println("Sign up failed");
        }
    }
    
}

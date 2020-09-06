import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ReadConfig;
import pages.HomeScreen;
import pages.SignInScreen;
import pages.SignUpScreen;

public class SignUpTest extends BaseTest{

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
    
    @Test (dependsOnGroups = "InvalidLogin")
    public void createInvalidAccount() throws InterruptedException {
        signInScreen.clickSignUp();
        signUpScreen.createAccount("", "","","");
        System.out.println(signUpScreen.getToastMessage());
        Assert.assertEquals(signUpScreen.getToastMessage(), "1 or more field is empty");
        Thread.sleep(2000);
    }

    @Test (dependsOnMethods = "createInvalidAccount", groups = "ValidAccount")
    public void createValidAccount() {
        try{
            if(signUpScreen.getHeaderText().contains("Create Account")){
                signUpScreen.createAccount(readConfig.getValue("FirstName"), readConfig.getValue("LastName"),
                        readConfig.getValue("UserName"), readConfig.getValue("Password"));
                System.out.println(signInScreen.getToastMessage());
                Assert.assertTrue(signInScreen.getToastMessage().contains(readConfig.getValue("accountSuccessfullyCreated")));
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println("Sign-up button clicked in Sign in page");
            signInScreen.clickSignUp();
            createValidAccount();
        }
    }
}

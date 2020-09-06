package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class SignUpScreen extends BaseScreen{

    private  @AndroidFindBy(id = "com.example.demoapp:id/firstName")
    AndroidElement firstNameField;

    private @AndroidFindBy(id = "com.example.demoapp:id/lastName")
    AndroidElement lastNameField;

    private @AndroidFindBy(id = "com.example.demoapp:id/username")
    AndroidElement userNameField;

    private @AndroidFindBy(id = "com.example.demoapp:id/password")
    AndroidElement passwordField;

    private @AndroidFindBy(id = "com.example.demoapp:id/signUp")
    AndroidElement signUpBtn;

    public SignUpScreen(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickOnSignUpButton(){
        clickElement(signUpBtn);
    }

    public void createAccount(String firstNameText, String lastNameText, String userNameText, String passwordText){
        enterText(firstNameField, firstNameText);
        enterText(lastNameField, lastNameText);
        enterText(userNameField, userNameText);
        enterText(passwordField, passwordText);
        clickOnSignUpButton();
        System.out.println("Trying to create account with\n"
        		+ "FirstName - "+firstNameText+"\n"
        				+ "LastName - "+lastNameText+"\n"
        				+ "UserName - "+userNameText+"\n"
        				+ "Password - "+passwordText);
    }


}

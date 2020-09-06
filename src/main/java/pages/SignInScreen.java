package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignInScreen extends BaseScreen{

    private @AndroidFindBy(id = "com.example.demoapp:id/header")
    AndroidElement header;

    private @AndroidFindBy(id = "com.example.demoapp:id/username")
    AndroidElement usernameField;

    private @AndroidFindBy(id = "com.example.demoapp:id/password")
    AndroidElement passwordField;

    private @AndroidFindBy(id = "com.example.demoapp:id/rememberMe")
    AndroidElement rememberMe;

    private @AndroidFindBy(id = "com.example.demoapp:id/login")
    AndroidElement signIn;

    private @AndroidFindBy(id = "com.example.demoapp:id/signUp")
    AndroidElement signUp;

    public AndroidDriver driver;

    public SignInScreen(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void login(String userName, String password){
        enterText(usernameField, userName);
        enterText(passwordField, password);
        clickElement(rememberMe);
        clickSignIn();
        System.out.println("Trying logging in as\n"
        		+ "UserName - "+userName+"\n"
        				+ "Password - "+password);
    }

    public void clickRememberMe(){
        clickElement(rememberMe);
    }

    public void clickSignIn(){
        clickElement(signIn);
    }

    public void clickSignUp(){
        clickElement(signUp);
    }
}

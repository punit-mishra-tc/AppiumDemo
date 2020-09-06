package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends BaseScreen {

    private @AndroidFindBy(id = "com.example.demoapp:id/header")
    AndroidElement pageHeader;

    private @AndroidFindBy(id = "com.example.demoapp:id/firstName")
    AndroidElement firstNameField;

    private @AndroidFindBy(id = "com.example.demoapp:id/lastName")
    AndroidElement lastNameField;

    public HomeScreen(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getFirstName(){
        return firstNameField.getText();
    }

    public String getLastName(){
        return lastNameField.getText();
    }

}

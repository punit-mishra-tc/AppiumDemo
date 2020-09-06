package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseScreen {

    public AndroidDriver driver;
    public static WebDriverWait wait;

    BaseScreen(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void clickElement(AndroidElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void enterText(AndroidElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public String getToastMessage(){
        AndroidElement toast = (AndroidElement) driver.findElement(By.xpath("//android.widget.Toast[1]"));
        return toast.getText();
    }

    public String getHeaderText() {
        AndroidElement header = (AndroidElement) driver.findElement(By.id("com.example.demoapp:id/header"));
        return header.getText();
    }

}

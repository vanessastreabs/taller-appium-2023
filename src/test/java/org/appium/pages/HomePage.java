package org.appium.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    //Elementos
    @AndroidFindBy (id= "com.androidsample.generalstore:id/nameField")
    WebElement nameField;
    //-------------------------------------------------------------------------------------------------------//

    //Métodos    
    public void enterName(String name){
        typeElement(nameField, name);
    }

    public void selectCountry(String countryName) {
        WebElement country = driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"" + countryName + "\"))"));
        country.click();
    }

}

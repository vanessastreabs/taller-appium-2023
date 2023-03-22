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
    @AndroidFindBy (id= "com.androidsample.generalstore:id/spinnerCountry")
    WebElement countryDropDown;
    @AndroidFindBy (id= "com.androidsample.generalstore:id/radioFemale")
    WebElement femaleRadioBtn;
    @AndroidFindBy (id= "com.androidsample.generalstore:id/radioMale")
    WebElement maleRadioBtn;
    @AndroidFindBy (id= "com.androidsample.generalstore:id/btnLetsShop")
    WebElement letsShopBtn;
    //-------------------------------------------------------------------------------------------------------//

    //Métodos    
    public void enterName(String name){
        typeElement(nameField, name);
    }

    public void selectCountry(String countryName) {
        tapElement(countryDropDown);
        WebElement country = driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"" + countryName + "\"))"));
        country.click();
    }

    public void selectGender(String gender){
        if (gender == "Male"){
            tapElement(maleRadioBtn);
        } else {
            tapElement(femaleRadioBtn);
        }
    }

    public void tapLetsShop(){
        tapElement(letsShopBtn);
    }
    
}

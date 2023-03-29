package org.appium.pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CartPage extends BasePage{
    public CartPage(AndroidDriver driver) {
        super(driver);
    }
    
    //Elementos
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Cart']")
    WebElement cartPageTitle;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
    WebElement productAdded;

    //-------------------------------------------------------------------------------------------------------//

    //Métodos    
    public String getProductAddedText(){
        cartPageTitle.isDisplayed();
        return productAdded.getText();
    }
}

package org.appium.pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CartPage extends BasePage{
    public CartPage(AndroidDriver driver) {
        super(driver);
    }
    
    //Elementos
    @AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
    WebElement productAdded;

    //-------------------------------------------------------------------------------------------------------//

    //Métodos    
    public void validateProduct(String productName){
        String addedProductName = productAdded.getText();
        Assert.assertEquals(addedProductName,productName);
    }
}

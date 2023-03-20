package org.appium.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    public ProductsPage(AndroidDriver driver) {
        super(driver);
    }

    //Elementos

    //-------------------------------------------------------------------------------------------------------//

    //Métodos    

    public void selectProduct(String productName){
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"" + productName + "\"))"));
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + productName + "\"]/..//*[@text=\"ADD TO CART\"]")).click();
    }

}

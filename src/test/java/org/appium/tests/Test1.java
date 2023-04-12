package org.appium.tests;

import org.appium.pages.HomePage;
import org.testng.annotations.Test;

public class Test1 extends TestBase{

    @Test
    public void testOne(){
        HomePage homePage = new HomePage(driver);

        homePage.enterName("Felipe");

    }
}
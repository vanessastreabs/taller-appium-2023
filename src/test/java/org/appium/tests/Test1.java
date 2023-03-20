package org.appium.tests;

import org.appium.pages.CartPage;
import org.appium.pages.HomePage;
import org.appium.pages.ProductsPage;
import org.testng.annotations.Test;

public class Test1 extends TestBase{

    @Test
    public void testOne(){
        HomePage homePage = new HomePage(driver);
        homePage.enterName("Felipe");
        homePage.selectCountry("Austria");
        homePage.selectGender("Male");
        homePage.tapLetsShop();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.selectProduct("PG 3");
        productsPage.tapCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.validateProduct("PG 3");
    }
}
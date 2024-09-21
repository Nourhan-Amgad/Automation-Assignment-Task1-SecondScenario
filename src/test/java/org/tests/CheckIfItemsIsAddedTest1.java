package org.tests;

import org.openqa.selenium.WebDriver;
import org.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils.BrowserAction;
import org.utils.BrowserFactory;
import org.utils.JsonFileManager;

import java.io.FileNotFoundException;

public class CheckIfItemsIsAddedTest1 {
    //variables
    WebDriver driver;
    NavBarPage navBarPage;
    JsonFileManager jsonFileManager;
    TodaysDealPage todaysDealPage;
    FilterPage filterPage;
    ItemPage itemPage;
    AddedToCartPage addedToCartPage;
    //Tests
    @Test
    public void todaysDealTest(){
        navBarPage.openTodaysDeal();
        todaysDealPage.selectsSeeMoreBtn();
        filterPage.selectElectronicsFilter();
        filterPage.selectTenPercentFilter();
        filterPage.selectItem();
        itemPage.selectaddToCartButton();
        Assert.assertTrue(addedToCartPage.IsInCartLabelElementExist());
    }

    //Configurations
    @BeforeMethod
    public void setUp() throws FileNotFoundException {
        jsonFileManager = new JsonFileManager("src/test/java/org/testData/CheckItemsAddedToCartTestData.json");
        driver = BrowserFactory.getBrowser(jsonFileManager.getTestData("browserName"));
        BrowserAction.navigateToUrl(driver,jsonFileManager.getTestData("url"),jsonFileManager.getTestData("ScreenWidth"),jsonFileManager.getTestData("ScreenHeight"));
        navBarPage = new NavBarPage(driver);
        todaysDealPage = new TodaysDealPage(driver);
        filterPage = new FilterPage(driver);
        itemPage = new ItemPage(driver);
        addedToCartPage = new AddedToCartPage(driver);
    }

    @AfterMethod
    public void tearDown(){
      BrowserAction.closeAllBrowserTabs(driver);
    }
}

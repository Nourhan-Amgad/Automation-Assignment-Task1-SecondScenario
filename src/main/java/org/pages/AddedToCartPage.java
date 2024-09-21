package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class AddedToCartPage {
    WebDriver driver;
    ElementActions elementActions;

    public AddedToCartPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }
    //Locators


    By inCartlabelLocator = By.xpath("//h1[@class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]");


    //Actions
    public boolean IsInCartLabelElementExist(){
        return elementActions.isElementExist(inCartlabelLocator);
    }
}

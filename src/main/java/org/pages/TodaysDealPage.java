package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class TodaysDealPage {
    //Variables
    WebDriver driver;
    ElementActions elementActions;

    public TodaysDealPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Locators
    By seeMoreBtnLocator = By.xpath("//a[text()=\"See more\"]");



    //Actions
    public void selectsSeeMoreBtn(){
        elementActions.click(seeMoreBtnLocator);
    }


}

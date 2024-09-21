package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class NavBarPage {
    //Variables
    WebDriver driver;
    ElementActions elementActions;

    public NavBarPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Locators
    By todaysDealLocator = By.xpath("//a[text()=\"Today's Deals\"]");

    //By todaysDealLocator = By.id("y3d6kj-8ikq49-c4k49r-8tgn1m");

    //Actions
    public void openTodaysDeal(){
        elementActions.click(todaysDealLocator);

    }


}

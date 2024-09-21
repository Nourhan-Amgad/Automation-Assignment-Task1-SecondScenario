package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class FilterPage {
    WebDriver driver;
    ElementActions elementActions;

    public FilterPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }
    //Locators

    By electronicsBtnLocator = By.xpath("//span[text()=\"Electronics\"]");
    By tenPercentBtnLocator= By.xpath("//span[text()='10% off or more']");
    By itemLocator = By.xpath("(//a[@data-testid=\"product-card-link\"])[1]");

    //Actions
    public void selectElectronicsFilter(){
        elementActions.click(electronicsBtnLocator);
    }

    public void selectTenPercentFilter(){
        elementActions.click(tenPercentBtnLocator);
    }
    public void selectItem(){
        elementActions.click(itemLocator);
    }


}

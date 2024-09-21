package org.pages;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.ElementActions;

public class ItemPage {
    WebDriver driver;
    ElementActions elementActions;

    public ItemPage(WebDriver driver){
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }
    //Locators


    //By addToCartBtnId = By.xpath("//input[@value=\"Add to Cart\"]");

    public void selectaddToCartButton(){
        for (int i = 2; i <= 11; i++) {
            try {
                By addToCartBtnId = By.xpath("//input[@value=\"Add to Cart\"]");


                try {
                    elementActions.click(addToCartBtnId);
                    break;

                } catch (ElementNotInteractableException e) {
                    // If "Add to Cart" button is not found, navigate back to the previous page
                    System.out.println("Add to Cart button not found for item " + i + ". Going back.");
                    driver.navigate().back();
                    By itemLocator = By.xpath("(//a[@data-testid=\"product-card-link\"])[" + i + "]");
                    elementActions.click(itemLocator);
                }

            } catch (Exception e) {
                // If the item itself is not found, skip to the next item
                System.out.println("Item not found for index " + i + ". Skipping to next.");
                driver.navigate().back();
                By itemLocator = By.xpath("(//a[@data-testid=\"product-card-link\"])[" + i + "]");
                elementActions.click(itemLocator);

            }
        }
        //elementActions.click(addToCartBtnId);
    }

}

package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameCheckout;
    @FindBy(id = "last-name")
    private WebElement lastNameCheckout;
    @FindBy(id = "postal-code")
    private WebElement postCodeCheckout;
    @FindBy(id = "continue")
    private WebElement btnContinueCheckout;
    @FindBy(id = "finish")
    private WebElement btnFinish;
    @FindBy(xpath = "//h2[@data-test='complete-header']")
    private WebElement titleThankYouForOrder;


    public void inputFirstNameCheckout(String firstName){
        clear(firstNameCheckout);
        sendKeys(firstNameCheckout, firstName);
    }
    public void inputLastNameCheckout(String lastName){
        clear(lastNameCheckout);
        sendKeys(lastNameCheckout, lastName);
    }
    public void inputPostCodeCheckout(String postCode){
        clear(postCodeCheckout);
        sendKeys(postCodeCheckout, postCode);
    }
    public void clickContinueCheckoutButton(){
        waitForElementClickable(btnContinueCheckout);
        click(btnContinueCheckout);
    }
    public void clickFinishButton(){
        waitForElementClickable(btnFinish);
        click(btnFinish);
    }
    public String getTitleThankYouForOrder(){

        return getText(titleThankYouForOrder);
    }

}

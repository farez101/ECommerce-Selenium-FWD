package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P12_createOrder {

    public WebElement getShoppingCart (){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
    }
    public WebElement getAgreementCheckbox (){
        return Hooks.driver.findElement(By.id("termsofservice"));
    }

    public WebElement getCheckoutBtn (){
        return Hooks.driver.findElement(By.id("checkout"));
    }
    public WebElement getBillingAddressContinueBtn (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));
    }
    public WebElement getDeliveryMethodContinueBtn (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
    }
    public WebElement getPaymentMethodContinueBtn (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button"));
    }
    public WebElement getPaymentInformationContinueBtn (){
        return Hooks.driver.findElement( By.xpath("//*[@id=\"payment-info-buttons-container\"]/button"));
    }
    public WebElement getConfirmButton (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button"));
    }
    public WebElement getMessageOfOrder (){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"section order-completed\"] > div[class=\"title\"]"));
    }
    public Select getCountry(){
        Select country = new Select(Hooks.driver.findElement(By.id("BillingNewAddress_CountryId")));
        return country;
    }
    public WebElement getCity (){
        return Hooks.driver.findElement(By.name("BillingNewAddress.City"));
    }
    public WebElement getAddress1 (){
        return Hooks.driver.findElement(By.name("BillingNewAddress.Address1"));
    }
    public WebElement getZipCode (){
        return Hooks.driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
    }
    public WebElement getPhone (){
        return Hooks.driver.findElement(By.name("BillingNewAddress.PhoneNumber"));
    }
}

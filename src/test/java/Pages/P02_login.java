package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement getLoginURL(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement getLoginEMail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement getLoginPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement getLoginBtn(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement getMyAccountTab(){
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement getLoginFail(){
        return  Hooks.driver.findElement(By.className("message-error"));
    }

}

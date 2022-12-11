package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_passwordReset {

    public WebElement getEmailForPasswordReset(){
        return Hooks.driver.findElement(By.className("email"));
    }
    public WebElement getForgetPasswordLink(){
        return Hooks.driver.findElement(By.className("forgot-password"));
    }
    public WebElement getRecoverBtn(){
        return Hooks.driver.findElement(By.name("send-email"));
    }
    public WebElement getRecoverPasswordMessage(){
        return Hooks.driver.findElement(By.className("content"));
    }


}

package Pages;
import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    public WebElement registerLink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement getEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
public WebElement getFirstName(){
    return Hooks.driver.findElement(By.id("FirstName"));
}

public WebElement getLastName(){
    return Hooks.driver.findElement(By.id("LastName"));
}
    public WebElement getPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement getConfirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement getRegisterBtn(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public Select getDay(){
        Select day = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        return day;
    }
    public Select getMonth(){
        Select month = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        return month;
    }
    public Select getYear(){
        Select year = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        return year;
    }
    public WebElement getMaleButton(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement getRegisterResult(){
      return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}

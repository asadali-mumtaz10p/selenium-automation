package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    WebDriver driver;
    public By userName = new By.ById("user-name");
    public By password = new By.ByXPath("//input[@type='password']");
    public By SubmitBtn = new By.ByXPath("//*[@id=\"login-button\"]");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void loginUser(String username,String passWord){
        WebElement userName = driver.findElement(this.userName);
        WebElement password = driver.findElement(this.password);
        WebElement submitBtn = driver.findElement(this.SubmitBtn);
        userName.sendKeys(username);
        password.sendKeys(passWord);
        submitBtn.click();
    }
}

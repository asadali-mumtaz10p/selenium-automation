package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.Login;

public class FirstTest {

    WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @Test(description = "Verify login with username and password")
    public void googleSearch() {
        Login loginPg = new Login(driver);
        loginPg.loginUser("standard_user","secret_sauce");
        String expectedTitle = "Swag Labs";
        String title = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedTitle, "Swag Labs");
        softAssert.assertAll();
        if (title.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Not a match");
        }
    }
    }


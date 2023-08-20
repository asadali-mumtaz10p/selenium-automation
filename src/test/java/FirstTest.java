import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstTest {
    WebDriver driver;
    ChromeOptions options;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        this.options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }
    @Test
    public void googleSearch() throws InterruptedException {
        String pageTitle = driver.getTitle();
        String pageURL = driver.getCurrentUrl();
        WebElement searchBar = driver.findElement(By.id("APjFqb"));
        if(pageTitle.equals("Google") && pageURL.equals("https://www.google.com/")){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        searchBar.sendKeys("10pearls");
        searchBar.submit();
        if(pageTitle.equals("Google")){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        WebElement searchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3"));
        searchResult.click();
        if(pageURL.equals("10pearls.com")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("FAIL");
        }
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(3000);
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
    }


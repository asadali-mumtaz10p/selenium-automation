import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver;
    @Test
    public void googleSearch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form ");
        WebElement Elements1 = driver.findElement(By.xpath("//div[text()='Elements']"));
        WebElement FirstName = driver.findElement(By.xpath("//form[position()=1]//input[@id=\"firstName\"]"));
        WebElement LastName = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']"));
        WebElement email = driver.findElement(By.xpath("//input[contains(@id ,'userEmail')]"));
        WebElement Mobile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[4]/div[2]/input"));
        WebElement gender = driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//input[@value='Male']"));
        Actions actions = new Actions(driver);
        Elements1.click();
        Thread.sleep(2000);
        FirstName.sendKeys("Asad");
        LastName.sendKeys("Ali");
        email.sendKeys("asad123@abc.com");
        actions.moveToElement(gender).click().build().perform();
        Mobile.sendKeys("03123456789");
    }
}
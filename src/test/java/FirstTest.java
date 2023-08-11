import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FirstTest {

    WebDriver driver;
    @Test
    public void googleSearch() {
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\asad.mumtaz\\OneDrive - 10Pearls\\Documents\\Data BackUp\\Data BackUp\\Selenium Java\\chromedriver_win32");
//
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }
    }


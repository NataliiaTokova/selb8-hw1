import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework4Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        //System.setProperty("webdriver.gecko.driver", "/usr/bin");
        WebDriver driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Homework4Test() {
        driver.navigate().to("https://www.youtube.com/");
      //  driver.navigate().to("https://www.youtube.com/");
    }

    @After
    public void stop() {
        driver.quit();
   //     driver.quit();
        driver = null;
    }
}
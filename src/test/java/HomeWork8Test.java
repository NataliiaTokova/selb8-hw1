import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class HomeWork8Test {
        private WebDriver driver;
        private WebDriverWait wait;

        @Before
        public void start() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
        }

        @Test
        public void myFirstTest() {
            driver.navigate().to("http://localhost/litecart/");
            List<WebElement> products = driver.findElements(By.cssSelector("li[class*='product']"));

            for (WebElement li: products) {
                Assert.assertEquals(1, li.findElements(By.cssSelector("div[class*='sticker']")).size());
            }
        }

        @After
        public void stop() {
            driver.quit();
            driver = null;
        }
    }
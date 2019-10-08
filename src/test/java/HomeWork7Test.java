import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomeWork7Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(new CharSequence[]{"admin"});
        driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"admin"});
        driver.findElement(By.name("login")).click();

        WebElement menu = driver.findElement(By.id("box-apps-menu"));
        List<String> hrefList = new ArrayList<>();

        for (WebElement link: menu.findElements(By.tagName("a"))) {
            hrefList.add(link.getAttribute("href"));
        }

        for (String url: hrefList) {
            System.out.println(url);
            driver.navigate().to(url);
            driver.findElement(By.tagName("h1"));
        }
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}

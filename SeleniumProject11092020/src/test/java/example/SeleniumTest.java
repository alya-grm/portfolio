package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTest {
    WebDriver driver;
    @Test
    public void testMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\markova\\OneDrive\\Рабочий стол\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("batman");
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);
        List<WebElement> elements = driver.findElements(By.cssSelector("div.rc"));
        for (WebElement el: elements) {
            System.out.println(el.getText());
        }
    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

}

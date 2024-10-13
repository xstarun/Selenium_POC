package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.util.List;

public class UsingAutocomplete {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        //driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
        /** Example for Visibility of Elements located by**/
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("Selenium");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println("Auto Suggest List ::" + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().equals("selenium interview questions")) {
                list.get(i).click();
                break;
            }
        }
        driver.close();
        driver.quit();
    }
}
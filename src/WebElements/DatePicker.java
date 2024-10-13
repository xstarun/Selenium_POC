package WebElements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
public class DatePicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

       WebElement datePicker = driver.findElement(By.id("datepicker"));
       datePicker.sendKeys("03/03/2025");
        datePicker.sendKeys(Keys.RETURN);

        driver.quit();



    }
}



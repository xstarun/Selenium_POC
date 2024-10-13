package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");

        //way1 -id

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        //way2-xpath full

        WebElement checkbox2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/input"));
        checkbox2.click();

        //way3-xpath

        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]"));
        checkbox3.click();


        driver.quit();



    }
}


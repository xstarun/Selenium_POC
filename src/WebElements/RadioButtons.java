package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

       //way1 -id

        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();

        //way2-css

        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();

        //way3-xpath

        WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radiobutton3.click();


        driver.quit();



    }
}


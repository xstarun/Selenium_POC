import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class keyboardInput {
    public static void main(String[] args) {
        //Path for chrome webdriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Path for firefox webdriver
        //  System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        //driver.findElement(By.name("q")).sendKeys("Selenium");

        driver.navigate().back();
        driver.navigate().forward();

        driver.close();
        driver.quit();



    }




}

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
        driver.get("https://formy-project.herokuapp.com/keypress");
        //driver.findElement(By.name("q")).sendKeys("Selenium");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys( "Tarun Sharma");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        //driver.navigate().back();
        //driver.navigate().forward();

        driver.close();
        driver.quit();



    }




}

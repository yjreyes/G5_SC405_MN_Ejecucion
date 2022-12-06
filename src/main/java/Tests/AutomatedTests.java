package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTests {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:\\Installation Project\\Project\\SeleniumTestProject\\src\\main\\resources\\Drivers\\chromeDriver.exe");

        //Initialize browser
        WebDriver driver= new ChromeDriver();

        //Open 6pm
        driver.get("https://www.6pm.com/");

        //Maximize browser

        driver.manage().window().maximize();
        driver.quit();


    }
}

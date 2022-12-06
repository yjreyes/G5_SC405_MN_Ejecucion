package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialNetworks {

    private WebDriver driver;
    By instagramLinkLocator = By.linkText("https://www.instagram.com/shop6pm/");

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.6pm.com/");
    }

    @Test
    public void instagramApp ()  {
    driver.findElement(instagramLinkLocator).click();
    //Thread.sleep(40000);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}

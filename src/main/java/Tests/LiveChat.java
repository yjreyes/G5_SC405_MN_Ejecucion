package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiveChat {
    private WebDriver driver;

    By liveChatLocator = By.className("s-z");
    By nameLocator = By.className("chat-cust-name");
    By emailLocator= By.id("emailInput");
    By startChatLocator = By.className("chat-flow-start");
    By endChatSelector = By.className("chat-flow-closer");
    By yesBtnSelector = By.className("chat-flow-yes-button");
    By closeBtnSelector = By.className("chat-flow-thank-you-close-button");

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.6pm.com/");
    }
    @Test
    public void instagramApp () throws InterruptedException {
        driver.findElement(liveChatLocator).click();
        Thread.sleep(2000);
        driver.findElement(nameLocator).sendKeys("Christian");
        driver.findElement(emailLocator).sendKeys("christian19scorp@hotmail.com");
        driver.findElement(startChatLocator).click();
        Thread.sleep(30000);
        driver.findElement(endChatSelector).click();
        driver.findElement(yesBtnSelector).click();
        driver.findElement(closeBtnSelector).click();

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}

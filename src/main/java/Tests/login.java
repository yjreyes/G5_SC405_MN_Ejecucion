package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    private WebDriver driver;
//Esto que se crea aqui son los localizadores
    By registerLinkLocator = By.linkText("Log In or Register");

    By registerLinkLocator2 = By.id("createAccountSubmit");
    By registerImageLocator = By.xpath("//img[@src='https://m.media-amazon.com/images/G/01/6pm/logos/6pm-Logo-1x._CB485946284_.png']");
    By usernameLocator = By.id("ap_customer_name");
    By emailLocator = By.id("ap_email");
    By passwordLocator = By.id("ap_password");
    By passwordConfirmLocator = By.id("ap_password_check");
    By registerBtnLocator = By.id("continue");

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.6pm.com/");
    }

    @Test
    public void registerUser() throws InterruptedException {
        driver.findElement(registerLinkLocator).click();
        driver.findElement(registerLinkLocator2).click();
        Thread.sleep(2000);
        if (driver.findElement(registerImageLocator).isDisplayed()){
            driver.findElement(usernameLocator).sendKeys("Christian");
            driver.findElement(emailLocator).sendKeys("christian19scorp@hotmail.com");
            driver.findElement(passwordLocator).sendKeys("admin123");
            driver.findElement(passwordConfirmLocator).sendKeys("admin123");
            driver.findElement(registerBtnLocator).click();
        }else{
            System.out.println("Pagina de registro no fue encontrada");
        }

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}

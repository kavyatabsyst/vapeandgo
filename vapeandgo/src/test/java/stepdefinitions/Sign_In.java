package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_In {
    public static WebDriver driver;

    @Given("^vapeand link$")
    public void vapeand_link() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
    }

    @When("^click on Accounttt$")
    public void click_on_Account() throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
    }

    @And("^Enter signin email \"([^\"]*)\"$")
    public void Enter_signin_email(String esssm) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(esssm);
    }
    @And("^Enter vapesignin password \"([^\"]*)\"$")
    public void Enter_vapesignin_password(String esssp) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(esssp);
    }
    @And("^Click vapesignin$")
    public void Click_vapesignin () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
    }
    
}

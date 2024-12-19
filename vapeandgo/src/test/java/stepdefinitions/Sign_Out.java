package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_Out {
    public static WebDriver driver;

    @Given("^vapeeeand link$")
    public void vapeeeand_link() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
    }

    @When("^cliiick on Accounttt$")
    public void cliiick_on_Accounttt() throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
    }

    @And("^Ennter signin email \"([^\"]*)\"$")
    public void Ennter_signin_email(String ssm) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(ssm);
    }
    @And("^Ennter vapesignin password \"([^\"]*)\"$")
    public void Ennter_vapesignin_password(String ep) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(ep);
    }
    @And("^Cliiick vapesignin$")
    public void Cliiick_vapesignin () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
    }
    @And("^cliiick again account$")
    public void cliiick_again_account () throws InterruptedException {
        Thread.sleep(1000);
        WebElement mouseover = driver.findElement(By.xpath("(//span[@class='lable ml-0'])[1]"));
    	Actions act=new Actions(driver);
    	act.moveToElement(mouseover).perform();
    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='Sign out'])[1]"));
    	act.click(a).perform();
    	
    }

}

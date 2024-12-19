package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
     public static WebDriver driver;

    @Given("vape link")
    public void vape_link() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
    }

    @When("click on Account")
    public void click_on_Account() throws InterruptedException {
        Thread.sleep(1000);  // Consider using WebDriverWait instead
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
    }

    @And("Enter first name {string}")
    public void Enter_first_name(String vfn) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys(vfn);
    }

    @And("Enter last name {string}")
    public void Enter_last_name(String vln) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys(vln);
    }

    @And("Enter date of birth {string}")
    public void Enter_date_of_birth(String edob) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='D.O.B'])[1]")).sendKeys(edob);
    }

    @And("Enter vapeemail {string}")
    public void Enter_vapeemail(String vem) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Email'])[1]")).sendKeys(vem);
    }

    @And("Enter signin password {string}")
    public void Enter_signin_password(String essp) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='new-password'])[1]")).sendKeys(essp);
    }

    @And("Enter confirm password {string}")
    public void Enter_confirm_password(String ecp) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Confirm Password'])[1]")).sendKeys(ecp);
    }

    @And("click vaperegister")
    public void click_vaperegister() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]")).click();
    }
}

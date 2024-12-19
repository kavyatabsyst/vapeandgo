package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Wishlist {
    public static WebDriver driver;

    @Given("^vapeand linnk$")
    public void vapeand_linnk() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
    }

    @When("^click on Accounnttt$")
    public void click_on_Accounnt() throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
    }

    @And("^Enter signinn email \"([^\"]*)\"$")
    public void Enter_signinn_email(String esssm) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(esssm);
    }
    @And("^Enter vapesigninn password \"([^\"]*)\"$")
    public void Enter_vapesignin_password(String esssp) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(esssp);
    }
    @And("^Click vapesigninn$")
    public void Click_vapesigninn () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
    }
    @And("^click more new products$")
    public void click_more_new_products () throws InterruptedException {
    	Thread.sleep(1000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='btn btn-success font-weight-bold'])[1]")).click();
    }
    @And("^select  a product$")
    public void select_a_product () throws InterruptedException {
    	Thread.sleep(1000);
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='Apple Ice Nic Salt E-Liquid by Unreal Ice 10ml'])[1]")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
    }
    
    @And("^select flavour$")
    public void select_flavour () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='5mg'])[1]")).click();
    }
    @And("^select quantittty$")
    public void select_quantittty () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[contains(@class,'fi-rs-plus')])[1]")).click(); //plus to minus when we want to  decrease the quantity
    }
    
    @And("^click  wishlist icon$")
    public void click_wishlist_icon () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@aria-label='Add To Wishlist'])[1]")).click();
    }
    @And("^wishlist another product$")
    public void wishlist_nother_product () throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(text(),'Pink Bubba Nic Salt E-Liquid by Bar Juice 5000 10m')])[1]")).click();
        Thread.sleep(1000);
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='5mg'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@aria-label='Add To Wishlist'])[1]")).click();
    }
    
    @And("^see the selected item in wishlist$")
    public void see_the_selected_item_in_wishlist() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        // Scroll up by 1000 pixels
        js7.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='lable'][normalize-space()='Wishlist'])[1]")).click();
        
    }
    @And("^delete productt$")
    public void delete_productt () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@class='btn bg-danger w-100 mb-2 remove-from-wishlist-btn'][normalize-space()='Remove'])[2]")).click();
    }
    @And("^close wishlist page$")
    public void close_wishlist_page () throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
    

}

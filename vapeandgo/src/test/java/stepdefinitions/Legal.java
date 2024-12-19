package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Legal {
    public static WebDriver driver;

	
    @Given("^vapeand lllinkk$")
    public void vapeand_lllinkk() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
    }

    @When("^click on Accccoounttt$")
    public void click_on_Accccoounttt() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
    }

    @And("^Enter signin emmaaail \"([^\"]*)\"$")
    public void Enter_signin_emmaaail(String embail) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(embail);
    }

    @And("^Enter vapesignin pppasswoord \"([^\"]*)\"$")
    public void Enter_vapesignin_pppasswoord(String prd) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(prd);
    }

    @And("^Clicck vapesigniiin$")
    public void Clicck_vapesigniiin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
    }
    
    @And("^click about us$")
    public void click_about_us() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Scroll down the page slowly
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
            Thread.sleep(500); // Wait for 500 milliseconds between scrolls
        }

        // Scroll to the specific "About Us" section
        WebElement aboutUsSection = driver.findElement(By.xpath("//a[normalize-space()='About Us']"));
        js.executeScript("arguments[0].scrollIntoView(true);", aboutUsSection);
        aboutUsSection.click();
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
        
        // Scroll down the page slowly
        for (int i = 0; i < 10; i++) {
            js1.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
            Thread.sleep(500); // Wait for 500 milliseconds between scrolls
        }// Click on the "About Us" link
    }
        @And("^backkk$")
        public void  backkk() throws InterruptedException {
            Thread.sleep(1000);
            driver.navigate().back();
        }
        @And("^click terms and condition$")
        public void click_terms_and_condition() throws InterruptedException {
            Thread.sleep(1000);
            JavascriptExecutor js8 = (JavascriptExecutor) driver;
            js8.executeScript("window.scrollBy(0,1500)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//a[normalize-space()='Terms and Conditions'])[1]")).click();
            Thread.sleep(1000);
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            
            // Scroll down the page slowly
            for (int i = 0; i < 10; i++) {
                js2.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
                Thread.sleep(500); // Wait for 500 milliseconds between scrolls
            }
        }
        @And("^click cookies&privacy and policy$")
        public void click_cookiesprivacy_and_policy() throws InterruptedException {
            Thread.sleep(1000);
            JavascriptExecutor js9 = (JavascriptExecutor) driver;
            js9.executeScript("window.scrollBy(0,1500)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//a[normalize-space()='Cookies & Privacy Policy'])[1]")).click();
            Thread.sleep(1000);
            JavascriptExecutor js3 = (JavascriptExecutor) driver;
            
            // Scroll down the page slowly
            for (int i = 0; i < 10; i++) {
                js3.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
                Thread.sleep(500); // Wait for 500 milliseconds between scrolls
            }
        }
        @And("^click terms of use$")
        public void click_terms_of_use() throws InterruptedException {
            Thread.sleep(1000);
            JavascriptExecutor js11 = (JavascriptExecutor) driver;
            js11.executeScript("window.scrollBy(0,1500)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//a[normalize-space()='Terms of Use'])[1]")).click();
            Thread.sleep(1000);
            JavascriptExecutor js4 = (JavascriptExecutor) driver;
            
            // Scroll down the page slowly
            for (int i = 0; i < 10; i++) {
                js4.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
                Thread.sleep(500); // Wait for 500 milliseconds between scrolls
            }
        }
        
        @And("^click product warranty$")
        public void click_product_warranty() throws InterruptedException {
            Thread.sleep(1000);
            JavascriptExecutor js13 = (JavascriptExecutor) driver;
            js13.executeScript("window.scrollBy(0,1500)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//a[normalize-space()='Product Warranty'])[1]")).click();
            Thread.sleep(1000);
            JavascriptExecutor js5 = (JavascriptExecutor) driver;
            
            // Scroll down the page slowly
            for (int i = 0; i < 10; i++) {
                js5.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
                Thread.sleep(500); // Wait for 500 milliseconds between scrolls
            }
        }
        @And("^click medical infomation$")
        public void click_medical_infomation() throws InterruptedException {
            Thread.sleep(1000);
            JavascriptExecutor js14 = (JavascriptExecutor) driver;
            js14.executeScript("window.scrollBy(0,1500)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//a[normalize-space()='Medical Infomation Disclaimer'])[1]")).click();
            Thread.sleep(1000);
            JavascriptExecutor js6 = (JavascriptExecutor) driver;
            
            // Scroll down the page slowly
            for (int i = 0; i < 10; i++) {
                js6.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
                Thread.sleep(500); // Wait for 500 milliseconds between scrolls
            }
        }
        @And("^click recycling$")
        public void click_recycling() throws InterruptedException {
            Thread.sleep(1000);
            JavascriptExecutor js15 = (JavascriptExecutor) driver;
            js15.executeScript("window.scrollBy(0,1500)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//a[normalize-space()='Recycling And Sustainability'])[1]")).click();
            Thread.sleep(1000);
            JavascriptExecutor js7 = (JavascriptExecutor) driver;
            
            // Scroll down the page slowly
            for (int i = 0; i < 10; i++) {
                js7.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
                Thread.sleep(500); // Wait for 500 milliseconds between scrolls
            }
        }
        
}

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

public class Help_Center {
    public static WebDriver driver;

    @Given("^vvapeand linkkk$")
    public void vvapeand_linkkk() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }
    @When("^cclick onnn AAccount$")
    public void cclick_onnn_AAccount() throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
     
    }
    @And("^eenter sign-inn email \"([^\"]*)\"$")
    public void eenter_signinn_email(String etmaill) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(etmaill);
    }

    @And("^eenter sign-inn password \"([^\"]*)\"$")
    public void eenter_signinn_password(String paasssword) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(paasssword);
    }

    @And("^cclick sign-innn$")
    public void cclick_signinnn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
    }
    
    @And("^click contact us$")
    public void click_contact_us() throws InterruptedException {
    	Thread.sleep(1000);
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(text(),'Contact')])[1]")).click();
    }
    @And("^Enter contactfirstname \"([^\"]*)\"$")
    public void Enter_contactfirstname(String cnfn) throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='First Name*'])[1]")).sendKeys(cnfn);
    }
    @And("^Enter contact lastname \"([^\"]*)\"$")
    public void Enter_contact_lastname(String cnln) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Last Name*'])[1]")).sendKeys(cnln);
    }
    @And("^Enter contactemail \"([^\"]*)\"$")
    public void Enter_contactemail(String cnen) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Your Email*'])[1]")).sendKeys(cnen);
    }
    @And("^Enter contact sub \"([^\"]*)\"$")
    public void Enter_contact_sub(String cnssn) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Subject*'])[1]")).sendKeys(cnssn);
    }
    @And("^Enter contact message \"([^\"]*)\"$")
    public void Enter_contact_message(String cnmmn) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//textarea[@placeholder='Message'])[1]")).sendKeys(cnmmn);
    }
    @And("^click send message$")
    public void click_send_message() throws InterruptedException {
          WebElement submitButton = driver.findElement(By.xpath("(//button[normalize-space()='Send message'])[1]"));
          submitButton.click();
            
        }
    @And("^back mainpage$")
    public void back_mainpage() throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().back();
    }
    @And("^click Faq$")
    public void click_Faq() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='FAQ'])[1]")).click();
        
    }
    @And("^click returns$")
    public void click_returns() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='Returns'])[1]")).click();
        
    }
    @And("^click shipping$")
    public void click_shipping() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='Shipping'])[1]")).click();
        
    }
    @And("^click guides$")
    public void click_guides() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='Guides'])[1]")).click();
        
    }
    @And("^click blog$")
    public void click_blog() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='Blog'])[1]")).click();
        Thread.sleep(1000);
        JavascriptExecutor js71 = (JavascriptExecutor) driver;
        
        // Scroll down the page slowly
        for (int i = 0; i < 10; i++) {
            js71.executeScript("window.scrollBy(0, 200);"); // Scroll down by 200 pixels
            Thread.sleep(500); // Wait for 500 milliseconds between scrolls
        }
    }
        
        
}

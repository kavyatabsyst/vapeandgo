package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkout {
    public static WebDriver driver;

    @Given("^vapeand linkkk$")
    public void vapeand_linkkk() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }
    @When("^click onnn AAccount$")
    public void click_onnn_AAccount() throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
    
    }
    @And("^enter sign-inn email \"([^\"]*)\"$")
    public void enter_sign_inn_email(String emaill) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(emaill);
    }

    @And("^enter sign-inn password \"([^\"]*)\"$")
    public void enter_sign_inn_password(String passsword) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(passsword);
    }

    @And("^click sign-innn$")
    public void click_sign_innn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
    }
    
    
    @Given("^click on cart$")
    public void click_on_cart() throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='lable'][normalize-space()='Cart'])[1]")).click();
    
    }
    @And("^select quantityyyyyy$")
    public void select_quantityyyyyy() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[contains(@class,'fi-rs-plus')])[1]")).click(); 
    }
    
    @And("^click checkout$")
    public void click_checkout() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='Checkout'])[1]")).click(); 
    }
    @And("^Enter checkout mail \"([^\"]*)\"$")
    public void Enter_checkout_mail(String echm) throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_email'])[1]")).sendKeys(echm);
    }
    @And("^Enter checkout firstname \"([^\"]*)\"$")
    public void Enter_checkout_firstname(String ecfn) throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_first_name'])[1]")).sendKeys(ecfn);
    }
    @And("^Enter checkout secondname \"([^\"]*)\"$")
    public void Enter_checkout_secondname(String ecsn) throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_last_name'])[1]")).sendKeys(ecsn);
    }
    @And("^select country$")
    public void select_country() throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("(//select[@id='billing_details-billing_custa_country'])[1]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("UKRAINE");
    }
        
    @And("^enter dob \"([^\"]*)\"$")
    public void enter_dob(String edobb) throws InterruptedException {
    Thread.sleep(1000);
    WebElement dobField = driver.findElement(By.xpath("(//input[@id='dob_required_product'])[1]"));
        dobField.clear();
        dobField.sendKeys(edobb);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//main[@class='main']//section[1]")).click();
    
    }
    @And("^company name \"([^\"]*)\"$")
    public void company_name(String ecmpn) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_company'])[1]")).sendKeys(ecmpn);
    }
    @And("^Enter addressline1 \"([^\"]*)\"$")
    public void Enter_addressline1(String eadd) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_address_line_1'])[1]")).sendKeys(eadd);
    }
    @And("^Enter addressline2 \"([^\"]*)\"$")
    public void Enter_addressline2(String eadd2) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_address_line_2'])[1]")).sendKeys(eadd2);
    }
    @And("^Enter city name \"([^\"]*)\"$")
    public void Enter_city_name(String eccn) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_city'])[1]")).sendKeys(eccn);
    }
    @And("^Enter country name \"([^\"]*)\"$")
    public void Enter_country_name(String econ) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_state'])[1]")).sendKeys(econ);
    }
    @And("^Enter postcode name \"([^\"]*)\"$")
    public void Enter_postcode_name(String epsn) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_postcode'])[1]")).sendKeys(epsn);
    }
    @And("^Enter checkout no \"([^\"]*)\"$")
    public void Enter_checkout_no(String eckno) throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='billing_details-billing_custa_phone_no1'])[1]")).sendKeys(eckno);
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        
    }
    @And("^Enter card no \"([^\"]*)\"$")
    public void Enter_card_no(String ecn) throws InterruptedException {
        driver.switchTo().frame("braintree-hosted-field-number");
        WebElement cardNumberField = driver.findElement(By.id("credit-card-number"));
        cardNumberField.clear();
        Thread.sleep(1000);
        cardNumberField.sendKeys(ecn);
        driver.switchTo().defaultContent();
    }

}

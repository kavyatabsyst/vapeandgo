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

public class Navigation_Test {
    public static WebDriver driver;
		@Given("^vapeand lllink$")
	    public void vapeand_lllink() {
	        System.setProperty("webdriver.http.factory", "jdk-http-client");
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://vpg-store.floverfy.com/");
	        driver.manage().window().maximize();
	    }

	    @When("^click on Accccounttt$")
	    public void click_on_Accccounttt() throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
	    }

	    @And("^Enter signin emaaail \"([^\"]*)\"$")
	    public void Enter_signin_emaaail(String eeemail) throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(eeemail);
	    }

	    @And("^Enter vapesignin pppassword \"([^\"]*)\"$")
	    public void Enter_vapesignin_pppassword(String pattssword) throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(pattssword);
	    }

	    @And("^Click vapesigniiin$")
	    public void Click_vapesigniiin() throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
	    }
	    @And("^mousehover vapekits$")
	    public void mousehover_vapekits() throws InterruptedException {
	    	 Thread.sleep(1000);
	    	 Actions act = new Actions(driver);
	    	 WebElement vapeKitsMenu = driver.findElement(By.xpath("(//a[normalize-space()='Vape Kits'])[1]"));
	    	 act.moveToElement(vapeKitsMenu).perform();
	    	 Thread.sleep(1000);
	    	 WebElement shopByBrandMenu = driver.findElement(By.xpath("(//a[normalize-space()='Disposable Pod Kits'])[1]"));
	         act.moveToElement(shopByBrandMenu).perform();
	         Thread.sleep(1000);
	         WebElement elfBarOption = driver.findElement(By.xpath("(//a[normalize-space()='Elfbar Elfa'])[1]"));
	         act.moveToElement(elfBarOption).click().perform();
	    }

	    @And("^navigate back$")
	    public void navigate_back () throws InterruptedException {
	        Thread.sleep(1000);
	        driver.navigate().back();
	    }
	    
	    @And("^mousehover disposable vapes$")
	    public void mousehover_disposable_vapes () throws InterruptedException {
	        Thread.sleep(1000);
	        WebElement mouseover = driver.findElement(By.xpath("(//a[normalize-space()='Disposable Vapes'])[2]"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(mouseover).perform();
	    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='SKE Crystal Bar'])[1]"));
	    	act.click(a).perform();
	    	
	    }
	    @And("^mousehover eliquids$")
	    public void mousehover_eliquids () throws InterruptedException {
	        Thread.sleep(1000);
	        WebElement mouseover = driver.findElement(By.xpath("(//a[normalize-space()='E-Liquids'])[1]"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(mouseover).perform();
	    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='Berry Fruits'])[1]"));
	    	act.click(a).perform();
	    	
	    }
	    @And("^mousehover nic salts$")
	    public void mousehover_nic_salts () throws InterruptedException {
	        Thread.sleep(1000);
	        WebElement mouseover = driver.findElement(By.xpath("(//a[normalize-space()='Nic Salts'])[2]"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(mouseover).perform();
	    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='Frooti Tooti'])[1]"));
	    	act.click(a).perform();
	    	
	    }
	    @And("^mousehover coils&tanks$")
	    public void mousehover_coilstanks () throws InterruptedException {
	        Thread.sleep(1000);
	        WebElement mouseover = driver.findElement(By.xpath("(//a[normalize-space()='Coils & Tanks'])[1]"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(mouseover).perform();
	    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='Freemax'])[1]"));
	    	act.click(a).perform();
	    	
	    }
	    @And("^mousehover podes$")
	    public void mousehover_podes () throws InterruptedException {
	        Thread.sleep(1000);
	        WebElement mouseover = driver.findElement(By.xpath("(//a[normalize-space()='Pods & Accessories'])[1]"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(mouseover).perform();
	    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='Replacement Glass'])[1]"));
	    	act.click(a).perform();
	    	
	    }
	    
	    @And("^mousehover new$")
	    public void mousehover_new () throws InterruptedException {
	        Thread.sleep(1000);
	        WebElement mouseover = driver.findElement(By.xpath("(//a[normalize-space()='Pods & Accessories'])[1]"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(mouseover).perform();
	    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='Vape Kits'])[2]"));
	    	act.click(a).perform();
	    	
	    }
	    @And("^mousehover nicotine$")
	    public void mousehover_nicotine () throws InterruptedException {
	        Thread.sleep(1000);
	        WebElement mouseover = driver.findElement(By.xpath("(//a[normalize-space()='Nicotine Pouches'])[1]"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(mouseover).perform();
	    	WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='Strong'])[1]"));
	    	act.click(a).perform();
	    	
	    }
	    
	    @And("^click all brands$")
	    public void click_all_brands() throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//a[normalize-space()='All Brands'])[1]")).click();
	    }
	    @And("^click sale$")
	    public void click_sale() throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//a[normalize-space()='Sale'])[1]")).click();
	    }
	    @And("^selectIQOS$")
	    public void selectIQOS() throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("(//a[normalize-space()='IQOS'])[1]")).click();
	    }
		
}

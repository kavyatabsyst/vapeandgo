package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class User_Profile {
    public static WebDriver driver;

    @Given("^vape a linnk$")
    public void vape_a_linnk() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vpg-store.floverfy.com/");
        driver.manage().window().maximize();
    }

    @When("^click on Acc$")
    public void click_on_Acc() throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='header-action-icon-2'])[1]")).click();
    }

    @And("^Enter sig email \"([^\"]*)\"$")
    public void Enter_sig_email(String eum) throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]")).sendKeys(eum);
    }
    @And("^Enter vapesig password \"([^\"]*)\"$")
    public void Enter_vapesig_password(String eup) throws InterruptedException {
    Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sign-in-password'])[1]")).sendKeys(eup);
    }
    @And("^Click vapesig$")
    public void Click_vapesig () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
    }
    @And("^select my account$")
    public void select_my_account() throws InterruptedException {
    Thread.sleep(1000);
    WebElement mouseover = driver.findElement(By.xpath("(//span[@class='lable ml-0'])[1]"));
    Actions act=new Actions(driver);
    act.moveToElement(mouseover).perform();
    WebElement a=driver.findElement(By.xpath("(//a[normalize-space()='My Account'])[1]"));
    act.click(a).perform();
    
    }

@And("^click basic details edit$")
public void  click_basic_details_edit() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//i[@class='fi-rs-edit edit-icon'])[1]")).click();
}
@And("^edit firstname \"([^\"]*)\"$")
public void edit_firstname(String effnn) throws InterruptedException {
    Thread.sleep(1000);
    WebElement frstname = driver.findElement(By.xpath("(//input[@id='cp_edit_bd-cust_first_name'])[1]"));
    frstname.clear();
    frstname.sendKeys(effnn); 
    
}
@And("^edit second name \"([^\"]*)\"$")
public void edit_second_name(String essnn) throws InterruptedException {
    Thread.sleep(1000);
    WebElement lastname = driver.findElement(By.xpath("(//input[@id='cp_edit_bd-cust_last_name'])[1]"));
    lastname.clear();
    lastname.sendKeys(essnn);
    
}
@And("^edit mobile number \"([^\"]*)\"$")
public void edit_mobile_number(String embnn) throws InterruptedException {
    Thread.sleep(1000);
    WebElement mobb = driver.findElement(By.xpath("(//input[@id='cp_edit_bd-cust_mobile'])[1]"));
    mobb.clear();
    mobb.sendKeys(embnn);
    
}
@And("^click basic save$")
public void  click_basic_save() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
}
@And("^click change password butt$")
public void  click_change_password_butt() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[normalize-space()='Change Password'])[1]")).click();
}

@And("^Enter currnt pass \"([^\"]*)\"$")
public void Enter_currnt_pass (String ecpp) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@placeholder='Enter Current Password'])[1]")).sendKeys(ecpp);
}

@And("^Enter new pass \"([^\"]*)\"$")
public void Enter_new_pass(String enwp) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]")).sendKeys(enwp);
}
@And("^Enter confirm passworddd \"([^\"]*)\"$")
public void Enter_confirm_password(String ecp) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@name='cpassword'])[1]")).sendKeys(ecp);
}
@And("^click sub$")
public void  click_sub() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@id='change_password-form_submit'])[1]")).click();
}

//add shipping address


@And("^click shipp add$")
public void  click_shipp_add() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[1]")).click();
}
@And("^manage address add$")
public void  manage_address_add() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@data-bs-target='#customer_adresses_add_modal'])[1]")).click();
}
@And("^enter firssst name \"([^\"]*)\"$")
public void enter_first_name(String effnn) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_first_name'])[1]")).sendKeys(effnn);
}

@And("^Enter lassst name \"([^\"]*)\"$")
public void Enter_last_name(String elln) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_last_name'])[1]")).sendKeys(elln);
}
@And("^enter company name \"([^\"]*)\"$")
public void enter_company_name(String ecmpn) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_company'])[1]")).sendKeys(ecmpn);
} 
@And("^enter addresss1 \"([^\"]*)\"$")
public void enter_addresss1(String eadd1) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_address_line_1'])[1]")).sendKeys(eadd1);
} 
@And("^enter addresss2 \"([^\"]*)\"$")
public void enter_addresss2(String eadd2) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_address_line_2'])[1]")).sendKeys(eadd2);
} 
@And("^Enter city namee \"([^\"]*)\"$")
public void Enter_city_namee(String ectyn) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_city'])[1]")).sendKeys(ectyn);
}
@And("^enter postcode \"([^\"]*)\"$")
public void enter_postcode(String posttt) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_postcode'])[1]")).sendKeys(posttt);
}
@And("^select countryyy$")
public void  select_countryyy() throws InterruptedException {
    Thread.sleep(1000);
    WebElement dropdown = driver.findElement(By.xpath("(//select[@id='customer_adresses_add-custa_country'])[1]"));
    Select select = new Select(dropdown);
    select.selectByVisibleText("UKRAINE");
}
@And("^Enter state name \"([^\"]*)\"$")
public void Enter_state_name(String state) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_state'])[1]")).sendKeys(state);
}
@And("^Enter shippnum1 \"([^\"]*)\"$")
public void Enter_shippnum1 (String ship) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_phone_no1'])[1]")).sendKeys(ship);
}
@And("^shippnum2 \"([^\"]*)\"$")
public void shippnum2  (String ship) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_phone_no2'])[1]")).sendKeys(ship);
}
@And("^enter shipping email \"([^\"]*)\"$")
public void enter_shipping_email(String shipee) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_add-custa_email'])[1]")).sendKeys(shipee);
}
@And("^Click coustomer add submit$")
public void  Click_coustomer_add_submit() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@id='customer_adresses_add-form_submit'])[1]")).click();
}
@And("^click setting icon$")
public void  click_setting_icon() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//i[@class='fi-rs-settings edit-icon'])[1]")).click();
}
@And("^click shippaddress edit$")
public void  click_shippaddress_edit() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//i[@class='fi-rs-edit text-warning'])[1]")).click();
}


@And("^edit firssst name \"([^\"]*)\"$")
public void edit_firssst_name(String shipeenn) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_first_name'])[1]")).sendKeys(shipeenn);
}
@And("^edit lassst name \"([^\"]*)\"$")
public void edit_lassst_name(String edln) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_last_name'])[1]")).sendKeys(edln);
}
@And("^edit company name \"([^\"]*)\"$")
public void edit_company_name(String edcn) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_company'])[1]")).sendKeys(edcn);
}
@And("^edit addresss1 \"([^\"]*)\"$")
public void edit_addresss1(String edadddd) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_address_line_1'])[1]")).sendKeys(edadddd);
}
@And("^edit addresss2 \"([^\"]*)\"$")
public void edit_addresss2(String edaddd2) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_address_line_2'])[1]")).sendKeys(edaddd2);
}
@And("^edit city namee \"([^\"]*)\"$")
public void edit_city_namee(String ecccff) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_city'])[1]")).sendKeys(ecccff);
}
@And("^edit postcode \"([^\"]*)\"$")
public void edit_postcode(String eddpo) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_postcode'])[1]")).sendKeys(eddpo);
}
@And("^edit state name \"([^\"]*)\"$")
public void edit_state_name(String esnn) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_state'])[1]")).sendKeys(esnn);
}

@And("^edit shippnum1 \"([^\"]*)\"$")
public void edit_shippnum1(String eshn1) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_phone_no1'])[1]")).sendKeys(eshn1);
}

@And("^edit shippnum2 \"([^\"]*)\"$")
public void edit_shippnum2(String eshipp2) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_phone_no2'])[1]")).sendKeys(eshipp2);
}

@And("^edit shipping email \"([^\"]*)\"$")
public void edit_shipping_email(String eshippmm) throws InterruptedException {
    Thread.sleep(1000);
    WebElement edemail = driver.findElement(By.xpath("(//input[@id='customer_adresses_edit-custa_email'])[1]"));
    edemail.clear();
    edemail.sendKeys(eshippmm);
    
}

@And("^edit submitttt$")
public void  edit_submitttt() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@id='customer_adresses_edit-form_submit'])[1]")).click();
}

@And("^delete shipping addr$")
public void  delete_shipping_addr() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//i[@class='fi-rs-trash text-danger'])[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[normalize-space()='Yes, Delete it!'])[1]")).click();
}
@And("^close manage  Address$")
public void  close_manage_Address() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
}
@And("^click orders$")
public void  click_orders() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[contains(@class,'my-account-nav-item-text')][normalize-space()='Orders'])[2]")).click();
}
@And("^click wishlist in prof$")
public void  click_wishlist_in_prof() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[contains(@class,'my-account-nav-item-text')][normalize-space()='Wishlist'])[2]")).click();
}
@And("^click points$")
public void  click_points() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[contains(@class,'my-account-nav-item-text')][normalize-space()='Points'])[2]")).click();
}
@And("^click helpcnter$")
public void  click_helpcnter() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[contains(@class,'my-account-nav-item-text')][normalize-space()='Helpcenter'])[2]")).click();
}
}

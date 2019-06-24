package usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite {
	WebDriver d;
	String baseUrl="https://massagefolio.com/";
	String providerMail="hari.protracked@gmail.com";
	String clientMail="hari1.protracked@gmail.com";
	String pPSW="123456";
	String cPSW="123456";
	String searchPhrase="rejuvenate";
	
	@Test(priority=1)
  public void search() throws InterruptedException {
	  d.findElement(By.id("location_picker")).clear();
	    d.findElement(By.id("location_picker")).sendKeys("washington");
	    Thread.sleep(2000);;
	    d.switchTo().activeElement().sendKeys(""+Keys.DOWN);
	    d.switchTo().activeElement().click();
	    d.findElement(By.xpath("//*[@id=\"pills-place\"]/form/div/div[1]/div[1]/button[2]")).click();
	    d.findElement(By.id("select2-category_id-container")).click();
	    d.switchTo().activeElement().sendKeys(searchPhrase);
	    Thread.sleep(3000);
	    d.switchTo().activeElement().sendKeys("" + Keys.ENTER);
	    d.findElement(By.xpath("//*[@id=\"lc-details-home\"]/div/div/div/nav/ol[1]/li/a")).click();
	  
  }
	@Test(priority=2)
	public void providerLogin() throws Exception {
		d.findElement(By.xpath("//*[@id=\"lcnavbar\"]/div/div[2]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    d.findElement(By.id("login_email")).sendKeys(providerMail);
	    d.findElement(By.id("signinpasswords")).sendKeys(pPSW);
	    d.findElement(By.id("login_modal_form_submit")).click();
	    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[3]/a")).click();
	    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[4]/a")).click();
	    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[5]/a")).click();
	    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[6]/a")).click();
	    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[7]/a")).click();
	    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[8]/a")).click();
	    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[1]/div/div/a")).click();
//	    d.findElement(By.xpath("//*[@id=\"lc-details-home\"]/div/div/div/nav/ol[1]/li/a")).click();
	    
	}
	@Test(priority=3)
	public void clientLogin() throws Exception {
		d.findElement(By.xpath("//*[@id=\"lcnavbar\"]/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.id("login_email")).sendKeys(clientMail);
		d.findElement(By.id("signinpasswords")).sendKeys(cPSW);
		d.findElement(By.id("login_modal_form_submit")).click();
		Thread.sleep(3000);
	}
	@Test(priority=4)
		public void adminLogin() throws Exception {
        d.get("https://adminusa.solutioncorp.com/login");	    
	    d.findElement(By.id("email")).sendKeys("superadmin@solutioncorp.com");
		d.findElement(By.id("password")).sendKeys("123456");
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div[1]/div/div/div/div[2]/div/form/div[5]/div/button")).click();
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[2]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[3]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[4]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[5]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[6]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[6]/ul/li[1]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[6]/ul/li[2]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[6]/ul/li[3]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[6]/ul/li[4]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[7]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[7]/ul/li[1]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[8]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[8]/ul/li[1]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[8]/ul/li[2]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[9]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[9]/ul/li[1]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[9]/ul/li[2]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[9]/ul/li[3]")).click();Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[3]/div/div[2]/ul/li[10]")).click();Thread.sleep(3000);

	}
  @BeforeMethod
  public void beforeMethod() {
	  d= new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    d.get(baseUrl);
  }

  @AfterMethod
  public void afterMethod() {
	  d.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test Begins");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test Ends");
  }

}

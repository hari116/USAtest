package usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClientLogin {
	
	protected static String baseUrl="https://staging.usatherapist.com/";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)d;

		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to(baseUrl);

		d.findElement(By.xpath("//*[@id=\"lcnavbar\"]/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.id("login_email")).sendKeys(" protracked.aiswarya@gmail.com");
		d.findElement(By.id("signinpasswords")).sendKeys("123456");
		d.findElement(By.id("login_modal_form_submit")).click();
		/*
		 * Actions action = new Actions(d); WebElement we
		 * =d.findElement(By.xpath("//*[@id=\"lcnavbar\"]/div/div[2]/ul/li/a/i"));
		 * we.click(); Thread.sleep(2000);
		 * action.moveToElement(we).moveToElement(d.findElement(By.xpath(
		 * "(//a[contains(@href, 'https://staging.usatherapist.com/profile/dashboard')])[2]"
		 * ))).click().build().perform();
		 */	
//		js.executeScript("console.log('test message')");		 
//		js.executeScript("console.log($('.login-side .navbar-nav .nav-item .sub-menu li:eq(0) a'))");		 
		//js.executeScript("$('.login-side .navbar-nav .nav-item .sub-menu li:eq(0) a').click()");	
		d.navigate().to("https://staging.usatherapist.com/profile/dashboard");
		
		d.quit();
	}

}

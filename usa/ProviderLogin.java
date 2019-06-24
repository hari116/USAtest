/**
 * 
 */
package usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author hari
 *
 */
class ProviderLogin {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver d= new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    d.get("https://staging.usatherapist.com/");
		    
		    d.findElement(By.xpath("//*[@id=\"lcnavbar\"]/div/div[2]/ul/li[2]/a")).click();
		    Thread.sleep(2000);
		    d.findElement(By.id("login_email")).sendKeys("hari.p.rotracked@gmail.com");
		    d.findElement(By.id("signinpasswords")).sendKeys("123456");
		    d.findElement(By.id("login_modal_form_submit")).click();
		    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[3]/a")).click();
		    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[4]/a")).click();
		    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[5]/a")).click();
		    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[6]/a")).click();
		    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[7]/a")).click();
		    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[8]/a")).click();
		    d.findElement(By.xpath("//*[@id=\"lcd-nav-accordion\"]/li[1]/div/div/a")).click();
		    d.findElement(By.xpath("//*[@id=\"lc-details-home\"]/div/div/div/nav/ol[1]/li/a")).click();
		    
		    
		    d.quit();

	}

}

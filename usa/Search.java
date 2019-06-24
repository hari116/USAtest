package usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Search {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		    WebDriver d= new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    d.get("https://staging.usatherapist.com/");
		    
		    d.findElement(By.id("location_picker")).clear();
		    d.findElement(By.id("location_picker")).sendKeys("washington");
		    Thread.sleep(2000);;
		    d.switchTo().activeElement().sendKeys(""+Keys.DOWN);
		    d.switchTo().activeElement().click();
		    d.findElement(By.xpath("//*[@id=\"pills-place\"]/form/div/div[1]/div[1]/button[2]")).click();
		    d.findElement(By.id("select2-category_id-container")).click();
		    d.switchTo().activeElement().sendKeys("heaven");
		    Thread.sleep(3000);
		    d.switchTo().activeElement().sendKeys("" + Keys.ENTER);
		    d.findElement(By.xpath("//*[@id=\"lc-details-home\"]/div/div/div/nav/ol[1]/li/a")).click();
		     
		    d.close();
		   
			}


}

package usa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class admin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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

}

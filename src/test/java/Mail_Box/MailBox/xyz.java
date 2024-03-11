package Mail_Box.MailBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Sveltetech\\Driver\\chromedriver.exe");
	 
         WebDriver driver = new ChromeDriver();
         driver.get("http://37.120.234.16:3002/");
         driver.manage().window().maximize();
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("default-01")).sendKeys("anjali");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//em[@class='icon-circle icon ni ni-plus']")).click();
	}

}

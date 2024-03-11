package Mail_Box.MailBox;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Inbox {
	
	
	 
      public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Sveltetech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://37.120.234.16:3005");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("tejas");  // put the Username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456"); // put the password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click the login  button
		Thread.sleep(3000);
		
		WebElement comp = driver.findElement(By.xpath("(//span[@class='sidebar-name'])[1]")); // click the compose mail 
		comp.click();
		Thread.sleep(2000);
		
		WebElement compose =driver.findElement(By.xpath("//input[@placeholder='To']"));
		compose.click();
		Thread.sleep(1000);
		
		WebElement ACC=driver.findElement(By.xpath("//div[contains(text(),'ACC')]"));
		ACC.click();
		driver.findElement(By.xpath("(//label[@for='branch-72'][normalize-space()='AS-ACC'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@for='branch-73'][normalize-space()='GG-ACC'])[2]")).click();
		ACC.click();
		Thread.sleep(2000);
		
		
		WebElement Station = driver.findElement(By.xpath("(//div[normalize-space()='FF-FFF'])"));
		Station.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[normalize-space()='FF-FFF'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='DD-DDD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='BB-BBB']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='EE-EEE']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='AA-AAA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='JD-JJJ']")).click();
		Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("this mail is Auto generated ");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//iframe[@id='mytextarea_ifr']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='nonzero'])[2]")).sendKeys("rtfyugwd");
	    
	   // JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement Element =
				driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		
	    
	    
//	    WebElement testbox= driver.findElement(By.xpath("//iframe[@id='mytextarea_ifr']"));
//			   testbox.sendKeys("I made myself a snowball "
//	    		+ "As perfect as could be "
//	    		+ "I thought I'd keep it as a pet "
//	    		+ "And let it sleep with me."
//	    		+ "I made it some pajama And a pillow for its head."
//	    		+ "Then last night it ran away,"
//	    		+ "But first it wet the bed.");
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.xpath("//div[@class='frequent_addresses_button'][normalize-space()='BB-BBB']")).click(); 
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[normalize-space()='AA-AAA']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[normalize-space()='US-KKK']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mm");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='other-branch']//li//div//li//label[@for='branch-13'][normalize-space()='MM-MMM']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Announcement For ");
//		Thread.sleep(5000);
//		
//        driver.findElement(By.xpath("//iframe[@id='mytextarea_ifr']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//*[name()='svg'])[3]")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//iframe[@id='mytextarea_ifr']")).sendKeys("Mail ");
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement Element = driver.findElement(By.xpath("//button[normalize-space()='Send']"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		Thread.sleep(5000);
	    //div[@id='loading']
		//iframe[@id='mytextarea_ifr']
		
//		driver.findElement(By.xpath("//iframe[@id='mytextarea_ifr']")).click();
//	    Thread.sleep(5000);
	    
//		driver.findElement(By.xpath("//iframe[@id='mytextarea_ifr']")).sendKeys("this mail is automate" );
		 
	   // WebElement file = 
	   // 		driver.findElement(By.xpath("//em[@class='icon ni ni-clip-v']")).click();
		//file.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\CTA");
		//System.out.println("File is uploaded successfully");
		
		//driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
	
		
		//WebElement ddown = driver.findElement(By.xpath("//div[@id='loading']"));
		//Select select = new Select(ddown);
		//select.selectByValue("//div[@class='tox-edit-area']");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//em[@class='icon ni ni-user-alt']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='button']")).click();
       // driver.close();
	}

}
 
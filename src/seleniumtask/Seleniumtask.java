package seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtask {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/#google_vignette");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("firstname")).sendKeys("Jasna");
		driver.findElement(By.id("lastname")).sendKeys("NS");

		driver.findElement(By.id("email_address")).sendKeys("nsjesna@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pswd4demo@2025");
		driver.findElement(By.id("password-confirmation")).sendKeys("Pswd4demo@2025");

		Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[title='Create an Account']")).click();
		Thread.sleep(2000);


		//driver.close();
	}

}

package googleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Exefiles/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		// WaitStatement.pageLoad(driver, 20);

		driver.findElement(By.id("identifierId")).sendKeys("jyoti@kandooit.co");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("kandooit2908");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\":3f\"]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(":92")).sendKeys("himanshu.upreti@revinfotech.com");
		driver.findElement(By.name("subjectbox")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id(":9n")).sendKeys("Hii, Its for testing purpose");
		Thread.sleep(4000);
		driver.findElement(By.id(":8a")).click();

	}
}

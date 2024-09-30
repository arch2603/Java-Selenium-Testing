import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Archie\\Documents\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromeDriver.get("https://rahulshettyacademy.com/locatorspractice/");
		chromeDriver.findElement(By.id("inputUsername")).sendKeys("rahul");
		chromeDriver.findElement(By.name("inputPassword")).sendKeys("password");
		chromeDriver.findElement(By.className("signInBtn")).click();
		System.out.println(chromeDriver.findElement(By.cssSelector("p.error")).getText());
		
		chromeDriver.findElement(By.linkText("Forgot your password?")).click();
		chromeDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		chromeDriver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("johnny@gmail.com");
		chromeDriver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		chromeDriver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("elanta@mydomain.com");
		//chromeDriver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("0211613891");
		chromeDriver.findElement(By.xpath("//form/input[3]")).sendKeys("0211613891");
		//chromeDriver.close();

	}

}

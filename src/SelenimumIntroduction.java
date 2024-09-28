import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class SelenimumIntroduction implements WebDriver {

	public static void main(String[] args) {
		
		//invoking the browser
		//Chrome Driver
		//Chromedriver.exe -> Chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chrome-win64\\chrome.exe");
//		ChromeDriver chromeDriver = new ChromeDriver();
//		chromeDriver.get("https://rahulshettyacademy.com");
//		System.out.println(chromeDriver.getTitle());
//		System.out.println(chromeDriver.getCurrentUrl());
//		chromeDriver.close();
		
		//Firefox launch
		//geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Archie\\Documents\\geckodriver_x64\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		

	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public @Nullable String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @Nullable String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @Nullable String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}

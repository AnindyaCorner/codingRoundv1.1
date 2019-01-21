package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sun.javafx.PlatformUtil;

public abstract class BaseTest implements Autoconstant {
	
	public WebDriver driver;
	static {
		if (PlatformUtil.isMac()) {

			System.setProperty(chrome_key, chrome_value_mac);

		}
		if (PlatformUtil.isWindows()) {

			System.setProperty(chrome_key, chrome_value_windows);

		}
		if (PlatformUtil.isLinux()) {

			System.setProperty(chrome_key, chrome_value_linux);

		}
	}
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		
	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.quit();
		
	}
	
	public void waitFor(int durationInMilliSeconds) {

		try {

			Thread.sleep(durationInMilliSeconds);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
	
}


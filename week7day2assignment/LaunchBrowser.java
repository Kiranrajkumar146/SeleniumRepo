package week7day2assignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public RemoteWebDriver driver;
	
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void launch(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			ChromeOptions cp = new ChromeOptions();
			cp.addArguments("--disblenotifications" );
		}
		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			EdgeOptions ed = new EdgeOptions();
			ed.addArguments("--disblenotifications");
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
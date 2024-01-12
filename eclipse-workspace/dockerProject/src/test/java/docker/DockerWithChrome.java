package docker;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;

public class DockerWithChrome {

	public static void main(String[] args) throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("browserVersion", "115");
		chromeOptions.setCapability("platformName", "Windows 10.0");
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, chromeOptions);
		driver.get("http://www.google.com");
		driver.quit();
		  
		
		
		 // DesiredCapabilities dc= DesiredCapabilities.chrome();
			/*
			 * URL url = new URL("http://localhost:4444/wd/hub"); RemoteWebDriver driver =
			 * new RemoteWebDriver(url,cap);
			 * driver.get("http://opensource-demo.orangehrmlive.com");
			 * System.out.println("Title:"+ driver.getTitle()); driver.quit();
			 */
	}

}

package TestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabLaunchTest {


@Test(priority=1)
public void addTest()
{
	System.out.println("add mehod");
	System.out.println("test2");
	System.out.println("test3");
}

@Test(priority=2)

public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//executables//chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://toolsqa.com/automation-practice-form/");
}

	}



package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.HomePage;
import Objects.LoginPage;
import Utils.exceldataprovider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScenario {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void before() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://admin.ppsidev.net/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="testdata1",dataProviderClass=exceldataprovider.class)
	public void PublishPPI(String username,String password)
	{
		HomePage hm=new HomePage(driver);
		hm.home();
		LoginPage log=new LoginPage(driver);
		log.signin();
	}
	
	
	@AfterMethod
	public void aftertest()
	{
		driver.quit();
	}

}

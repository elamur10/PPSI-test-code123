package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
    By username=By.xpath("//input[@id='userNameInput']");
    By password=By.xpath("//input[@id='passwordInput']");
    By signin=By.xpath("//span[@id='submitButton']");
    
   
    public void signin()
    {
    	driver.findElement(username).sendKeys("testadminppsi@ifood.test");
    	driver.findElement(password).sendKeys("iFood1234!");
    	driver.findElement(signin).click();
    }
    	
}

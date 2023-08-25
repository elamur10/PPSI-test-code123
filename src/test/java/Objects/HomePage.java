package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By home=By.xpath("//div[@class='idp adprovider']//span[@class='largeTextNoWrap indentNonCollapsible']");
	
	public void home()
	{
		driver.findElement(home).click();
	}

}

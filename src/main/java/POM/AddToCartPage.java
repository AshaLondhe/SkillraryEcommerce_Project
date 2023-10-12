package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	// https://demoapp.skillrary.com/category.php?category=testing
	
	//declaration
	@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[2]")
	private WebElement plusIcon;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	
	private WebElement addtocart;
	
	//initialization
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	public WebElement  getPlusIcon() {
		return plusIcon;
		
	}
	
	public void addToCart() {
		addtocart.click();
		
	}

}

//Completed 
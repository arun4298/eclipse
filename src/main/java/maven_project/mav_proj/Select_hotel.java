package maven_project.mav_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public WebDriver driver;
	@FindBy(name="radiobutton_0")
	private WebElement button;
	
	@FindBy(name="continue")
	private WebElement button_continue;

	public WebElement getButton() {
		return button;
	}

	public WebElement getButton_continue() {
		return button_continue;
	}
public Select_hotel(WebDriver driver1) {
this.driver=driver1;
PageFactory.initElements(driver, this);
}
}

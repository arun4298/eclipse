package maven_project.mav_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirm {
public WebDriver driver;

@FindBy(name="search_hotel")
private WebElement confirm;

@FindBy(name="my_itinerary")
private WebElement iternary;

@FindBy(name="logout")
private WebElement logout;

public WebElement getIternary() {
	return iternary;
}
public WebElement getLogout() {
	return logout;
}
public WebElement getConfirm() {
	return confirm;
	

}
public Booking_confirm(WebDriver driver1) {
	this.driver=driver1;
PageFactory.initElements(driver, this);
}
}

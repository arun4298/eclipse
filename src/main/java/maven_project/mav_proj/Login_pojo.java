package maven_project.mav_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pojo {
	public WebDriver driver;
	@FindBy(name="username")
	private static WebElement id;

	@FindBy(name="password")
	private static WebElement password;

	@FindBy(name="login")
	private static WebElement login;

	public static WebElement getId() {
		return id;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLogin() {
		return login;
	}



	public Login_pojo(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	}
}

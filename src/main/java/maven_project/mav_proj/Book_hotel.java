package maven_project.mav_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	public WebDriver driver;
	@FindBy(name="first_name")
private WebElement first_name;
	
	@FindBy(name="last_name")
private WebElement last_name;
	
	@FindBy(name="address")
private WebElement add;
	
	@FindBy(name="cc_num")
private WebElement card;
	
	@FindBy(name="cc_type")
	private WebElement card_type;
	
	@FindBy(id="cc_exp_month")
private WebElement exp_month;
	
	@FindBy(name="cc_exp_year")
private WebElement exp_year;
	
	@FindBy(name="cc_cvv")
private WebElement cvv;
	
	@FindBy(name="book_now")
private WebElement book;

	
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getExp_month() {
		return exp_month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public Book_hotel(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	}




}

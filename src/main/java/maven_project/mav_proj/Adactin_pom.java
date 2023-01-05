package maven_project.mav_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Adactin_pom {
	public static WebDriver driver;
	private Search_hotel sh_pom;
	private Select_hotel sel_pom;
private Login_pojo login_pom;
private Book_hotel bh_pom;
private Booking_confirm bc_pom;

public Search_hotel getSh_pom() {
	Search_hotel search=new Search_hotel(driver);
	return sh_pom;
}
public Select_hotel getSel_pom() {
	Select_hotel select=new Select_hotel(driver);
	return sel_pom;
}
public Login_pojo getLogin_pom() {
	Login_pojo log=new Login_pojo(driver);
	return login_pom;
}
public Book_hotel getBh_pom() {
	Book_hotel book=new Book_hotel(driver);
	return bh_pom;
}
public Booking_confirm getBc_pom() {
	Booking_confirm confirm=new Booking_confirm(driver);
	return bc_pom;
}
public Adactin_pom(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
}
}

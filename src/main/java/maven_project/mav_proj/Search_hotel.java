package maven_project.mav_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	public WebDriver driver;
@FindBy(name="location")
private WebElement location;

@FindBy(name="hotels")
private WebElement hotel;

@FindBy(name="room_type")
private WebElement room_type;

@FindBy(name="room_nos")
private WebElement no_of_rooms;

@FindBy(name="datepick_in")
private WebElement check_in;

@FindBy(name="datepick_out")
private WebElement check_out;

@FindBy(name="adult_room")
private WebElement adult_room;

@FindBy(name="child_room")
private WebElement child_room;

@FindBy(name="Submit")
private WebElement Search;

public WebElement getSearch() {
	return Search;
}

public WebElement getChild_room() {
	return child_room;
}

public void setChild_room(WebElement child_room) {
	this.child_room = child_room;
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoom_type() {
	return room_type;
}

public WebElement getNo_of_rooms() {
	return no_of_rooms;
}
public  Search_hotel(WebDriver driver1) {
this.driver=driver1;
PageFactory.initElements(driver, this);
}

public WebElement getCheck_in() {
	return check_in;
}

public WebElement getCheck_out() {
	return check_out;
}
}

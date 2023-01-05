package maven_project.mav_proj;

public class Login_runner extends Base_class{

	public static void main(String[] args) {
		setproperty();
		maximize();
		Login_pojo login=new Login_pojo(driver);
		url_launch("https://adactinhotelapp.com/");
		waiting(10);
		sendkeys(login.getId(), "arunarjun4298");
		sendkeys(login.getPassword(), "9841595069");
		click(login.getLogin());
		
		//search_hotel
		Search_hotel sh=new Search_hotel(driver);
		drop_down(sh.getLocation(), "value", "New York");
		drop_down(sh.getHotel(), "value", "Hotel Creek");
		drop_down(sh.getRoom_type(), "value", "Super Deluxe");
		clear(sh.getCheck_in());
sendkeys(sh.getCheck_in(), "02/01/2023");
clear(sh.getCheck_out());
sendkeys(sh.getCheck_out(), "07/01/2023");
drop_down(sh.getNo_of_rooms(), "text", "2 - Two");
drop_down(sh.getChild_room(), "text", "2 - Two");
click(sh.getSearch());
waiting(10);

//select_hotel
Select_hotel sel=new Select_hotel(driver);
click(sel.getButton());
click(sel.getButton_continue());
waiting(10);

//book_hotel
Book_hotel bh= new Book_hotel(driver);
sendkeys(bh.getFirst_name(), "arun");
sendkeys(bh.getLast_name(), "arjun");
sendkeys(bh.getAdd(), "balaji nagar, ambattur,ch-53");
sendkeys(bh.getCard(), "7234567899876543");
drop_down(bh.getCard_type(), "text", "Other");
drop_down(bh.getExp_month(), "value", "12");
drop_down(bh.getExp_year(), "value", "2022");
sendkeys(bh.getCvv(), "555");
click(bh.getBook());
waiting(20);

//Confirm_booking
Booking_confirm bc=new Booking_confirm(driver);
click(bc.getLogout());
waiting(10);

	}

}

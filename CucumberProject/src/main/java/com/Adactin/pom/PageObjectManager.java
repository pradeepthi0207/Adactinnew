package com.Adactin.pom;

import org.openqa.selenium.WebDriver;

import com.Adactin.pom.LoginPage;
import com.Adactin.pom.SearchHotel_Page;
import com.Adactin.pom.SelectHotelPage;

public class PageObjectManager {
	
	public static WebDriver driver;
	public PageObjectManager(WebDriver driver2){
		this.driver=driver2;
	}
	public LoginPage log;
	public LoginPage getlog() {
    if(log==null) {
	 log=new LoginPage(driver);
	}
	return log;
	}
	
	public SearchHotel_Page search;
	public SearchHotel_Page getsearch() {
		if(search==null) {
			search=new SearchHotel_Page(driver);
		}
		return search;
	}
	
	public SelectHotelPage select;
	public SelectHotelPage getselect() {
		if(select==null) {
			select= new SelectHotelPage(driver);
		}return select;
	}
	
	public BookingPage booking;
		public BookingPage getBooking() {
			if(booking==null) {
				booking=new BookingPage(driver);
			}
		return booking;
	}
		
		public Logout logout;
		public Logout getLogout() {
			if(logout==null) {
				logout=new Logout(driver);
			}
			return logout;
		}
	
}


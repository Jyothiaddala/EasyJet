package easyjetstepdefs;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.Bookingpage;
import com.qa.pages.Homepage;
import com.qa.util.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Flightbooking extends Testbase{
	
	Homepage homepage;
	Bookingpage bookings;

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		openurl();
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		homepage = new Homepage();
		homepage.validateHomepage();
	}

	@Then("^user clicks on oneway$")
	public void user_clicks_on_oneway() throws Throwable {
		homepage = new Homepage();
		homepage.tickOneWay();		
		Thread.sleep(2000);

	}

	@Then("^user enters flights details$")
	public void user_enters_flights_details() throws Throwable {
		homepage=new Homepage();
		homepage.selectOrigin();
		
		homepage.enterOriginCountry();
		Thread.sleep(2000);
		homepage.selectDestin();
		homepage.enterDestinCountry();
		Thread.sleep(2000);
		homepage.popUpWindow();
		Thread.sleep(2000);
		
	}

	@Then("^user selects the departing date$")
	public void user_selects_the_departing_date() throws Throwable {
		homepage=new Homepage();
		homepage.clickoncalender();
		homepage.selectdeptdate();
	}

	@Then("^user clicks on show flights$")
	public void user_clicks_on_show_flights() throws Throwable {
		homepage=new Homepage();
		homepage.clickonshowflights();

	}

	@Then("^user select the flight$")
	public void user_select_the_flight() throws Throwable {
		bookings=new Bookingpage();
		bookings.selectflight();
//		String mainWindow = driver.getWindowHandle();
//
//		Set<String> handles = driver.getWindowHandles();
//		for (String handle : handles) {
//			if (!handle.equals(mainWindow)) {
//				driver.switchTo().window(handle);
//				break;
//			}
//		}
//		  Thread.sleep(3000);
//          WebElement price = driver
//				.findElement(By.xpath("//a[@class='Button Itinerary__selectButton Button--fill Button--select']"));
//
//		List<WebElement> wb = price
//				.findElements(By.xpath("//a[@class='Button Itinerary__selectButton Button--fill Button--select']"));
//
//		wb.get(1).click();

	}

	@Then("^user clicks Nextseats$")
	public void user_clicks_Nextseats() throws Throwable {
//        Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(10000);
		bookings=new Bookingpage();
	     bookings.clickonnextseat();

		
	}

	@Then("^user navigates to seatselection$")
	public void user_navigates_to_seatselection() throws Throwable {
       bookings= new Bookingpage();
       bookings.clickonskipseat();
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(10000);


    }

	@Then("^user fills passengerdetails$")
	public void user_fills_passengerdetails() throws Throwable {
		Thread.sleep(5000);
		
		bookings=new Bookingpage();
		bookings.selecttitle();
		bookings.firstname();
		bookings.latsname();
		bookings.selectdob();
		bookings.selectdom();
		bookings.selectdoy();



	}

}

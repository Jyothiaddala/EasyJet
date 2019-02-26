package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testbase;

public class Homepage extends Testbase {

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='checkbox-label-text']")
	WebElement oneWay;

	@FindBy(xpath = "//input[@name='origin']")
	WebElement origin;
	@FindBy(xpath = "//span[contains(text(),'Netherlands')]")
	WebElement origincountry;
	@FindBy(xpath = "//input[@name='destination']")
	WebElement destination;
	@FindBy(xpath = "//span[contains(text(),'Spain')]")
	WebElement destinationcountry;
	@FindBy(id = "close-drawer-link")
	WebElement popup;
	@FindBy(xpath = "//span[@class='calendar']")
	WebElement selectcalender;

	@FindBy (xpath="//a[@ej-child-click-event = 'OnSelect(2019, 3, 1)']")
	WebElement selectdate;
	@FindBy (xpath="//button[@class='ej-button rounded-corners arrow-button search-submit search-submit-worldwide']")
	WebElement showflight;

	public String validateHomepage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Home | easyJet.com", title);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return title;
	}

	public void tickOneWay() {
		oneWay.click();
	}

	public void selectOrigin() {
		origin.clear();
		origin.sendKeys("Amsterdam");
	}

	public void enterOriginCountry() {
		origincountry.click();

	}

	public void selectDestin() {
		destination.clear();
		destination.sendKeys("Madrid");
	}

	public void enterDestinCountry() {
		destinationcountry.click();
	}

	public void popUpWindow() {
		popup.click();
	}

	public void clickoncalender() {
		selectcalender.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectdeptdate() {
		selectdate.click();
	}
	
	public void clickonshowflights() {
		
		showflight.click();
	}
	

}

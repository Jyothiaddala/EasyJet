package com.qa.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.Testbase;

public class Bookingpage extends Testbase {
	public Bookingpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='Button FormNavigator__btn FormNavigator__btn--forward']")
	WebElement seat;
	@FindBy(xpath = "//button[@class='Button FormNavigator__btn FormNavigator__btn--forward']")
	WebElement skipseat;


	@FindBy(id = "firstName1")
	WebElement FN;
	@FindBy(id = "lastName1")
	WebElement LN;
	
	public void selectflight()
	{
		String mainWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          WebElement price = driver
				.findElement(By.xpath("//a[@class='Button Itinerary__selectButton Button--fill Button--select']"));

		List<WebElement> wb = price
				.findElements(By.xpath("//a[@class='Button Itinerary__selectButton Button--fill Button--select']"));

		wb.get(1).click();
	}


	public void clickonnextseat() throws Exception {
		 Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		seat.click();
	}

	public void clickonskipseat() throws Exception {
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(10000);

		skipseat.click();
	}

	public void selecttitle() {
		Select title = new Select(driver.findElement(By.id("firstNameDropdown1")));

		title.selectByVisibleText("Mrs.");
	}

	public void firstname() {
		FN.sendKeys("Jyothi");
	}

	public void latsname() {
		LN.sendKeys("addala");
	}

	public void selectdob() {
		Select date = new Select(driver.findElement(By.id("dateOfBirth1.d")));

		date.selectByVisibleText("11");
	}

	public void selectdom() {
		Select month = new Select(driver.findElement(By.id("dateOfBirth1.m")));

		month.selectByVisibleText("2");

	}

	public void selectdoy() {
		Select year = new Select(driver.findElement(By.id("dateOfBirth1.y")));

		year.selectByVisibleText("1988");

	}
}

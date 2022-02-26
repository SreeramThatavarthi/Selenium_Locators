package com.sreeram.mavenExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sreeram.pages.CheckBox;
import com.sreeram.pages.DatePicker;
import com.sreeram.pages.DropDown;
import com.sreeram.pages.Form;
import com.sreeram.pages.Modal;
import com.sreeram.pages.Scroll;

public class Locators {
	public static void main(String[] args) 
	{
		
		//linking chrome driver
		System.setProperty("webdriver.chrome.driver","/Users/drivers/chromedriver.exe");
		
		
		//creating a new session of driver
		WebDriver driver=new ChromeDriver();
		
		
		//navigating to formy-project website
		driver.get("https://formy-project.herokuapp.com/datepicker");

		
		//This method uses Class Locator
		DatePicker date=new DatePicker();
		date.getDate(driver);
		
		
		//This method uses ID Locator
		Modal modal=new Modal();
		modal.execModal(driver);
		
		
		//This method uses css selector
		CheckBox check=new CheckBox();
		check.execCheckBox(driver);
		
		
		//This method uses multiple css selectors
		Form form=new Form();
		form.execForm(driver);

		
		//This method uses XPath locator
		DropDown ac=new DropDown();
		ac.execDropDown(driver);

		
		
		//explicit wait
			WebDriverWait wait=new WebDriverWait(driver,10);
			
		/* ----------------- Navigating using Link Text ------------------*/


			WebElement HomePage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("FORMY")));
			HomePage.click();
			
			
		/* ----------------- Navigating using Partial Link Text ------------------*/


			WebElement partialLink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Scroll")));
			partialLink.click();
			
			
		//This method will find the element by scrolling
			Scroll scroll=new Scroll();
			scroll.execAction(driver);

		
		//Quitting a driver
		driver.quit();
		
	}
}

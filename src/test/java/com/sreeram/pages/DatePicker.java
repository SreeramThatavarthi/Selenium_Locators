package com.sreeram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
	
	public void getDate(WebDriver driver)
	{

		/*------------------Date Picking using class locator---------------------*/
		WebElement date=driver.findElement(By.className("form-control"));
		
		date.sendKeys("02/25/2022");
	}
}

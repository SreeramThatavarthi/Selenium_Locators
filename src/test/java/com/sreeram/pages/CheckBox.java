package com.sreeram.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	
	public void execCheckBox(WebDriver driver)
	{
		/*------------------Check the boxes using CSS Selectors---------------------*/

		
		//navigating to checkbox page
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		//finding element by id
		WebElement check1=driver.findElement(By.cssSelector("#checkbox-1"));
		check1.click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}

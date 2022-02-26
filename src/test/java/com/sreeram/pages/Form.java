package com.sreeram.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form {

	public void execForm(WebDriver driver) {
		
		
		/*----------------------  Filling and submitting a form using multiple CSS Attributes  ----------------------*/
		
		//navigating to page keypress
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		//finding element by tag and type
		WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
		input.sendKeys("User");
		
		
		//finding element by multiple classes
		WebElement button=driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg"));
		button.click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}

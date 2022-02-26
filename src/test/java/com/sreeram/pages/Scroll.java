package com.sreeram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public void execAction(WebDriver driver)
	{
		
		WebElement name=driver.findElement(By.id("name"));
		
		//creating Actions object to scroll to particular element
		Actions actions=new Actions(driver);
		actions.moveToElement(name);
		name.sendKeys("User1");
		
		//sending keys without using WebElement
		driver.findElement(By.id("date")).sendKeys("25/02/22");
		
	}

}

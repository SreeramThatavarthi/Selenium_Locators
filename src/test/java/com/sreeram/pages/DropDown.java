package com.sreeram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown {
	public void execDropDown(WebDriver driver)
	{
		
		//navigating to dropdwon page
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		
		//finding the element using xpath locator
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
		menu.click();
		
		//finding the element using xpath locator
		WebElement autoSelectItem=driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		
		autoSelectItem.click();

	}
}

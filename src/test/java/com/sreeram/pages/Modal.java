package com.sreeram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal {
	
	public void execModal(WebDriver driver)
	{
		/*------------------Opening and Closing Modal using ID locator---------------------*/
		
		
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement openModal=driver.findElement(By.id("modal-button"));
		openModal.click();
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		//waiting for modal to open
		WebElement closeModal=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("close-button")));
		
		//closing modal
		closeModal.click();
		
	}
}

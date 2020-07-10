package com.ozow.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ozow.qa.base.TestBase;

public class Calculator extends TestBase {
	
	String val1=prop.getProperty("Value1");
	String val2=prop.getProperty("Value2");
	static String ops=prop.getProperty("operation");
	static String Result;
	
	@FindBy(xpath="//input[@name='number1']")
	WebElement value1;
	@FindBy(xpath="//*[@id=\"calc-form\"]/div/div/div[2]/select")
	WebElement dropdown;
	@FindBy(xpath="//input[@name='number2']")
	WebElement value2;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//span[@id='answer']")
	WebElement result;
	
	public Calculator()
	{
	PageFactory.initElements(driver, this);
	
	}
	
	
	public void addition() throws InterruptedException {
		// TODO Auto-generated method stub
		value1.sendKeys(val1);
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		value2.sendKeys(val2);
		submit.click();
		Thread.sleep(2000);
		
		
		
	}
	public  void subtraction() throws InterruptedException {
		// TODO Auto-generated method stub
		value1.sendKeys(val1);
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		value2.sendKeys(val2);
		submit.click();
		Thread.sleep(2000);
		
		
	}
	public void multiplication() throws InterruptedException {
		// TODO Auto-generated method stub
		value1.sendKeys(val1);
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		value2.sendKeys(val2);
		submit.click();
		Thread.sleep(2000);
		
		
		
	}
	public void divison() throws InterruptedException {
		// TODO Auto-generated method stub
		value1.sendKeys(val1);
		Select s=new Select(dropdown);
		s.selectByIndex(3);
		value2.sendKeys(val2);
		submit.click();
		Thread.sleep(2000);
		 
		
		
	}

	

	public void call_any_ops(String operation) throws InterruptedException {
		// TODO Auto-generated method stub
		switch(ops){
		
		case "A":
			addition();
			break;
		case "S" :
			subtraction();
			break;
		case "M" :
			multiplication();
			break;				
		case "D" :
			divison();
			break;
	
	}
	}

	public String showresult() {
		// TODO Auto-generated method stub
	   return result.getText();
		
	}
	


	public String title() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
 
	
	

}

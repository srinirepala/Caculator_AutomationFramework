package com.ozow.qa.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ozow.qa.base.TestBase;

import com.ozow.qa.pages.Calculator;
import com.ozow.qa.utils.TestUtil;
import com.ozow.qa.utils.WebEventListener;

public class CalculatorTest extends TestBase {

	public static Calculator calculator;
	public static TestUtil testutil;
	public static EventFiringWebDriver e_driver;

	public static WebEventListener eventListener;

	public CalculatorTest() {
		super();
	}

	@BeforeMethod
	public void setUP() throws InterruptedException {
		initialization();
		calculator = new Calculator();
		testutil = new TestUtil();
		String operation = null;
		calculator.call_any_ops(operation);

	}

	@Test
	public void operationsTest() {
		String Result = calculator.showresult();

		// System.out.println(Result);
		Assert.assertEquals(Result, "6");

	}

	@Test
	public void titleTest() {
		String title = calculator.title();
		Assert.assertEquals(title, "Simple Calculator");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

package com.backbase.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	

@FindBy(xpath="//input[@type='text']")
public WebElement EmailTextBox;

@FindBy(xpath="//input[@type='password']")
public WebElement PasswordTextBox;

@FindBy(xpath="//button[@type='submit']")
public WebElement SubmitBtn;


}

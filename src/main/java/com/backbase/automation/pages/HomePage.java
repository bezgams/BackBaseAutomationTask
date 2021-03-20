package com.backbase.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	@FindBy(xpath="/html/body/app-root/app-settings/div/div/div/div/button")
	public WebElement signOutLink;
	


	@FindBy(linkText = "Sign in")
	public  WebElement signIn;

	@FindBy(xpath = "//i[@class=\"ion-compose\"]")
	public  WebElement newPost;


	@FindBy(css = "body > app-root > app-navbar > nav > div > ul > li:nth-child(4) > a")
	public  WebElement settings;

}

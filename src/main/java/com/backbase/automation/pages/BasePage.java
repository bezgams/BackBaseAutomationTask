package com.backbase.automation.pages;

import com.backbase.automation.base.Base;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage() {
		PageFactory.initElements(Base.driver, this);
	}

}

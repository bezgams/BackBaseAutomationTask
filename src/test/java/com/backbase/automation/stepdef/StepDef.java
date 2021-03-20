package com.backbase.automation.stepdef;

import com.backbase.automation.base.Base;
import com.backbase.automation.implementaion.Implementation;
import com.backbase.automation.utils.Elements;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef{
	Implementation impl=new Implementation();
	Elements element=new Elements();
	
	@Given("^I navigate to Application$")
	public void i_NavigateToApplication() throws Throwable {
		Base.navigateToApplicationUrl();
	}
	
	@And("^I login into the Application$")
	public void doLoginToApplication(){
		impl.doLogin();
	}

	@And("^I clicked profile and ReadMore$")
	public void clickedProfileAndReadMore(){
		impl.clickedProfileandReadMore();
	}

	@And("^I read details in the post$")
	public void readDetailsInThePost(){
		impl.readArticleDetails();
	}

	@And("^I entered details in the post$")
	public void EnteredDetailsInThePost(){
		impl.doCreateArticle();
	}

	@Then("I logged out")
	public  void logOut(){
		impl.doLogOut();
	}

	@And("^I edited details in the post$")
	public void editedDetailsInThePost(){
		impl.editArticleDetails();
	}


	@And("I deleted details in the post$")
   public void deletedDetails(){
           impl.deleteArticle();
			}
	

	@And("^I click on signout$")
	public void verifyElementInHomePage() throws InterruptedException{
		Thread.sleep(1000);
		impl.doLogOut();
	}
	
	
	
	
	
	

}

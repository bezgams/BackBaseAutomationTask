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
	
	@Given("^I navigate and login to BaseBack website$")
	public void i_NavigateToApplication() throws Throwable {
		Base.navigateAndLoginToBackBaseSite();
	}
	
	@And("^I login into the BBlog website$")
	public void doLoginToApplication(){
		impl.doLogintoBBLogSite();
	}

	@And("^I click on  my profile and ReadMore button for created article$")
	public void clickedProfileAndReadMore(){
		impl.clickedProfileandReadMore();
	}

	@And("^I read the article details$")
	public void readDetailsInThePost(){
		impl.readArticleDetails();
	}

	@And("^I create an article$")
	public void EnteredDetailsInThePost(){
		impl.doCreateArticle();
	}

	@Then("I logged out")
	public  void logOut(){
		impl.doLogOut();
	}

	@And("^I edit the created article details$")
	public void editedDetailsInThePost(){
		impl.editArticleDetails();
	}


	@And("I delete the created article$")
   public void deletedDetails(){
           impl.deleteArticle();
			}
	


	
	
	
	
	

}

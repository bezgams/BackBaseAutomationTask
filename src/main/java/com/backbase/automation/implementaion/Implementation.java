package com.backbase.automation.implementaion;

import com.backbase.automation.base.Base;
import com.backbase.automation.pages.HomePage;
import com.backbase.automation.pages.LoginPage;
import com.backbase.automation.pages.PostPage;
import com.backbase.automation.pages.ProfilePage;
import com.backbase.automation.utils.Elements;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;


public class Implementation extends Elements{
	public static Logger log=Logger.getLogger(Implementation.class);
	LoginPage loginPo=new LoginPage();
	HomePage homePo=new HomePage();
	PostPage postPage = new PostPage();
	ProfilePage profilePage = new ProfilePage();

	public void doLogin() {

		try {
			Thread.sleep(3000);
			clickObject(homePo.signIn, "SignIn");
			SendInput(loginPo.EmailTextBox, Base.reader.getUserName(), "UserName");
			SendInput(loginPo.PasswordTextBox, Base.reader.getPassword(), "Password");
			clickObject(loginPo.SubmitBtn, "Submit");
			Thread.sleep(3000);

		}catch (InterruptedException e){
         log.error("Getting exception while logging to BBlog site and error message is: "+e.getMessage());
		}

	}

	public void doCreateArticle() {

		try {
			clickObject(homePo.newPost, "NewPost");
			Thread.sleep(3000);
			SendInput(postPage.articleTitle, "Test Article Title", "Test Article Title");
			SendInput(postPage.articleAbout, "Test Article About", "Test Article About");
			SendInput(postPage.articleInMarkDown, "Test Article Mark Down", "Test Article Mark down");
			SendInput(postPage.articleTags, "Test Article Tags", "Test Article Tags");
			clickObject(postPage.publishArticle,"Publish Article");
			Thread.sleep(3000);
			SendInput(postPage.posttextarea,"post text area","post text area");
			clickObject(postPage.postComment,"post Comment");
		}catch (InterruptedException e){
			log.error("Getting exception while creating article in BBlog site and error message is: "+e.getMessage());
		}

	}

	public  void clickedProfileandReadMore(){
		try {
			Thread.sleep(3000);
			clickObject(profilePage.profile, "ProfilePage");
			Thread.sleep(3000);
			clickObject(profilePage.ReadMore, "ReadMore");
		}catch (InterruptedException e){
			log.error("Getting exception while navigating profile in BBlog site and error message is: "+e.getMessage());
		}
	}

  public  void deleteArticle(){
	  try {

		  Thread.sleep(3000);
		  clickObject(profilePage.deletePost,"deletepost");
	  }catch (InterruptedException e){
		  log.error("Getting exception while deleting article in BBlog site and error message is: "+e.getMessage());
	  }

  }

    public  void readArticleDetails(){
		try {
			Thread.sleep(3000);
			clickObject(profilePage.editArticle, "Edit Article");
			Thread.sleep(5000);
			log.info("article Title "+postPage.articleTitle.getText()+"article About "+postPage.articleAbout.getText()+"article Mark Down "+postPage.articleInMarkDown.getText()+"article tags "+postPage.articleTags.getText());
		}catch (InterruptedException e){

			log.error("Getting exception while reading article in BBlog site and error message is: "+e.getMessage());
		}
	}
	public  void editArticleDetails(){
		try {
			Thread.sleep(3000);
			clickObject(profilePage.editArticle,"Edit Article");
			Thread.sleep(3000);
			postPage.articleTitle.clear();
			postPage.articleTags.clear();
			postPage.articleInMarkDown.clear();
			postPage.articleAbout.clear();
			SendInput(postPage.articleTitle, "Test Edit Article Title", "Test Edit Article Title");
			SendInput(postPage.articleAbout, "Test Edit Article About", "Test Edit Article About");
			SendInput(postPage.articleInMarkDown, "Test Edit Article Mark Down", "Test Edit Article Mark down");
			SendInput(postPage.articleTags, "Test Edit Article Tags", "Test EditArticle Tags");
			clickObject(postPage.publishArticle,"Publish  Edit Article");
			Thread.sleep(3000);
			SendInput(postPage.posttextarea,"post Edit text area","post  Edit text area");
			clickObject(postPage.postComment," Edit post Comment");


		}catch (InterruptedException e){
			log.error("Getting exception while editing article in BBlog site and error message is: "+e.getMessage());
		}

	}

	   public void doLogOut(){
		   try {

			   Thread.sleep(2000);
			   clickObject(homePo.settings, "Settings");
			   Thread.sleep(2000);
			   JavascriptExecutor js = (JavascriptExecutor) Base.driver;
			   js.executeScript("arguments[0].scrollIntoView();", homePo.signOutLink);
			   clickObject(homePo.signOutLink, "signOutLink");
		   }catch (InterruptedException e){
			   log.error("Getting exception while doing logout from BBlog site and error message is: "+e.getMessage());
		   }
	}

	

}

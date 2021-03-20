package com.backbase.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends  BasePage {

    @FindBy(css = "body > app-root > app-navbar > nav > div > ul > li:nth-child(2) > a")
    public WebElement profile;

    @FindBy(xpath = "//a[@class='preview-link']/span")
    public WebElement ReadMore;

    @FindBy(css="body > app-root > app-article > div > div.banner > div > app-article-meta > div > span:nth-child(3) > a")
    public  WebElement editArticle;

    @FindBy(css="body > app-root > app-article > div > div.container.page > div.article-actions > app-article-meta > div > span:nth-child(3) > button")
    public  WebElement deletePost;
}



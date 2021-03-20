package com.backbase.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage  extends BasePage {


    @FindBy(css = "body > app-root > app-article-editor > div > div > div > div > app-dynamic-form > form > app-input:nth-child(1) > fieldset > input")
    public WebElement articleTitle;
    @FindBy(css="body > app-root > app-article-editor > div > div > div > div > app-dynamic-form > form > app-input:nth-child(2) > fieldset > input")
    public WebElement articleAbout;

    @FindBy(css="body > app-root > app-article-editor > div > div > div > div > app-dynamic-form > form > app-textarea > fieldset > textarea")
    public WebElement articleInMarkDown;

    @FindBy(css="body > app-root > app-article-editor > div > div > div > div > app-dynamic-form > form > app-input:nth-child(4) > fieldset > input")
    public WebElement articleTags;

    @FindBy(xpath = "//button[contains(text(),'Publish Article')]")
    public WebElement publishArticle;

    @FindBy(css="body > app-root > app-article > div > div.container.page > div:nth-child(4) > div > app-add-comment > div > app-dynamic-form > form > app-textarea > fieldset > textarea")
    public  WebElement posttextarea;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public  WebElement postComment;



}

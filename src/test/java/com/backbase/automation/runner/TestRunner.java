package com.backbase.automation.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/BackBase.feature"}, glue={"classpath:com.backbase.automation.stepdef","classpath:com.backbase.automation.base"}, plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner {

}

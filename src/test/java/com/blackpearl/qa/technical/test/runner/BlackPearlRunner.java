package com.blackpearl.qa.technical.test.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;

@RunWith(CucumberWithSerenity.class)
@ComponentScan({"com.*"})
@CucumberOptions(
        features = {"src/test/resources/features"},
        dryRun = false,
//        tags = "@QATechnicalTest",
        glue = {"com.blackpearl.qa.technical.test.glue"})

public class BlackPearlRunner {


}

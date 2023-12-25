package com.blackpearl.qa.technical.test.glue;

import com.blackpearl.qa.technical.test.appconfig.BlackPearlConfig;
import com.blackpearl.qa.technical.test.browserUtill.OpenChromeBrowser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;

public class blackPearlQaTechnicalTestStefDef {
    WebDriver browser;
    @Autowired
    OpenChromeBrowser openChromeBrowser;
    @Autowired
    BlackPearlConfig blackPearlConfig;
    protected SoftAssertions softAssertions = new SoftAssertions();


    @When("Load the login page.")
    public void load_the_login_page() {
        openChromeBrowser.openChromeBrowser();
        browser.get(blackPearlConfig.getGetNeraPerla());

    }

    @Then("Interact with the interface to change to the username\\/password version of the login page.")
    public void interact_with_the_interface_to_change_to_the_username_password_version_of_the_login_page() {
        WebElement userNameAndPassword = browser.findElement(By.xpath(blackPearlConfig.getUserNameAndPassword()));
        FluentWait<WebDriver> wait = new FluentWait<>(browser)
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofMillis(6000))
                .ignoring(ElementNotInteractableException.class);
        wait.until(d -> {
            userNameAndPassword.click();
            return true;
        });

    }
    @Then("Input the username and password into their corresponding fields.")
    public void input_the_username_and_password_into_their_corresponding_fields() {
        WebElement userNameField = browser.findElement(By.xpath(blackPearlConfig.getUserNameField()));
        FluentWait<WebDriver> waitUserName = new FluentWait<>(browser)
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofMillis(6000))
                .ignoring(ElementNotInteractableException.class);
        waitUserName.until(d -> {
            userNameField.sendKeys(blackPearlConfig.getUserName());
            return true;
        });
        WebElement PasswordField = browser.findElement(By.xpath(blackPearlConfig.getPasswordField()));
        FluentWait<WebDriver> waitPassword = new FluentWait<>(browser)
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofMillis(6000))
                .ignoring(ElementNotInteractableException.class);
        waitPassword.until(d -> {
            PasswordField.sendKeys(blackPearlConfig.getPassword());
            return true;
        });

    }
    @Then("Click the login button to proceed to the logged-in state.")
    public void click_the_login_button_to_proceed_to_the_logged_in_state() {
        WebElement loginButton = browser.findElement(By.xpath(blackPearlConfig.getLoginButton()));
        FluentWait<WebDriver> waitLoginButton = new FluentWait<>(browser)
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofMillis(6000))
                .ignoring(ElementNotInteractableException.class);
        waitLoginButton.until(d -> {
            loginButton.click();
            return true;
        });

    }
    @Then("Check that there is a loaded user number on the dashboard.")
    public void check_that_there_is_a_loaded_user_number_on_the_dashboard() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(browser,  Duration.ofMinutes(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blackPearlConfig.getWelcomeHeader())));
        WebElement loadedUser = browser.findElement(By.xpath(blackPearlConfig.getWelcomeHeader()));
        softAssertions.assertThat("Welcome Aakash").as("").isEqualTo(loadedUser.getText());
        WebElement loadedUserEmail = browser.findElement(By.xpath(blackPearlConfig.getUserEmail()));
        softAssertions.assertThat(blackPearlConfig.getUserName()).as("").isEqualTo(loadedUserEmail.getText());

    }


}

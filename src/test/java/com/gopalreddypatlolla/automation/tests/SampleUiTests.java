package com.gopalreddypatlolla.automation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gopalreddypatlolla.automation.base.BaseUiTest;

public class SampleUiTests extends BaseUiTest {

    /*@BeforeMethod
    public void loadPage() {
        openLocalPage("pages/sample-form.html");
    }

    @Test(description = "Verify the sample page title and heading are displayed")
    public void shouldLoadLocalSamplePage() {
        Assert.assertEquals(driver.getTitle(), "Sample Selenium Test Page");
        Assert.assertEquals(driver.findElement(By.id("mainHeading")).getText(), "Sample Selenium Test Page");
    }

    @Test(description = "Verify text can be entered into the name field")
    public void shouldEnterTextIntoNameField() {
        WebElement nameField = driver.findElement(By.id("name"));

        nameField.clear();
        nameField.sendKeys("Gopal Reddy");

        Assert.assertEquals(nameField.getAttribute("value"), "Gopal Reddy");
    }

    @Test(description = "Verify the newsletter checkbox can be selected")
    public void shouldToggleSubscriptionCheckbox() {
        WebElement subscribeCheckbox = driver.findElement(By.id("subscribe"));

        Assert.assertFalse(subscribeCheckbox.isSelected());
        subscribeCheckbox.click();

        Assert.assertTrue(subscribeCheckbox.isSelected());
    }

    @Test(description = "Verify a value can be selected from the country dropdown")
    public void shouldSelectCountryFromDropdown() {
        WebElement countryDropdown = driver.findElement(By.id("country"));
        countryDropdown.findElement(By.cssSelector("option[value='India']")).click();

        Assert.assertEquals(countryDropdown.getAttribute("value"), "India");
    }

    @Test(description = "Verify the submit button displays the confirmation message and list items are present")
    public void shouldDisplayConfirmationMessageAfterButtonClick() {
        driver.findElement(By.id("name")).sendKeys("Automation User");
        driver.findElement(By.id("submitButton")).click();

        WebElement resultMessage = driver.findElement(By.id("result"));
        List<WebElement> features = driver.findElements(By.cssSelector("#featureList li"));

        Assert.assertEquals(resultMessage.getText(), "Thanks, Automation User!");
        Assert.assertEquals(features.size(), 3);
    }*/

    int a=100, b= 25;
    @Test
    public void addOperation(){
        System.out.println("Addition of a and b is: "+(a+b));
    }

    @Test
    public void subOperation(){
        System.out.println("Subtraction of a and b is: "+(a-b));
    }

    @Test
    public void multiplicationOperation(){
        System.out.println("Multiplication of a and b is: "+(a*b));
    }

    @Test

    public void divisionOperation() {
        System.out.println("Division of a and b is: " + (a / b));
    }

    @Test
    public void modulusOperation() {
        System.out.println("Modulus of a and b is: " + (a % b));
    }

    @Test
    public void exponentiationOperation() {
        System.out.println("Exponentiation of a and b is: " + Math.pow(a, b));
    }

    @Test
    public void incrementOperation() {
        a++;
        System.out.println("Incremented value of a is: " + a);
    }
}


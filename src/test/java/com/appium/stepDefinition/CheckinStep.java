package com.appium.stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.Hooks;
import org.junit.Assert;

public class CheckinStep {

    public static AppiumDriver<MobileElement> appiumDriver = Hooks.setUp();

    @Given("User open cicle app3")
    public void userOpenCicleApp3() throws InterruptedException {
        MobileElement iconCicle = appiumDriver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Cicle Staging\"]");
        iconCicle.click();
        Thread.sleep(2000);
    }

    @When("Click test big project3")
    public void ClickTest3() throws InterruptedException {
        MobileElement testBigProject = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Test']");
        testBigProject.click();
        Thread.sleep(2000);
    }
    @And("Click checkin")
    public void clickCheckin() throws InterruptedException {
        MobileElement checkIn = appiumDriver.findElementByXPath("//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup");
        checkIn.click();
        Thread.sleep(2000);
    }

    @And("Click button plus checkin")
    public void clickButtonPlusCheckin() {
        MobileElement btnPlus = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
        btnPlus.click();
    }

    @And("Input question {string}")
    public void inputQuestionQuestionHowAreYou(String question) {
        MobileElement inptQuestion = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Type your question']");
        inptQuestion.sendKeys(question);
    }

    @And("Select day often want to ask")
    public void selectDayOftenWantToAsk() {
        MobileElement selectDay1 = appiumDriver.findElementByXPath("//android.widget.ScrollView[@index='3']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='4']/android.widget.TextView[@text='Mon']");
        selectDay1.click();
        MobileElement selectDay2 = appiumDriver.findElementByXPath("//android.widget.ScrollView[@index='3']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='10']/android.widget.TextView[@text='Sun']");
        selectDay2.click();
    }


    @And("Click button START COLLECTING ANSWER")
    public void clickButtonSTARTCOLLECTINGANSWER() {
        MobileElement btnStart = appiumDriver.findElementByXPath("//android.widget.TextView[@text='START COLLECTING ANSWERS']");
        btnStart.click();
    }

    @Then("Should succesfully create checkin")
    public void shouldSuccesfullyCreateCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Create question successful']").isDisplayed());
    }

    @And("Add member you want to notifed")
    public void addMemberYouWantToNotifed() {
        MobileElement addMember = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Who do you wanna be notified?']");
        addMember.click();
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Select Member']").click();
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='rizal']").click();
    }

    @Then("Should succesfully create checkin with add notifed")
    public void shouldSuccesfullyCreateCheckinWithAddNotifed() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Create question successful']").isDisplayed());
    }

    @And("Select {int} day often want to ask")
    public void selectDayOftenWantToAsk(int arg0) {
        MobileElement selectDay2 = appiumDriver.findElementByXPath("//android.widget.ScrollView[@index='3']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='10']/android.widget.TextView[@text='Sun']");
        selectDay2.click();

    }

    @Then("Should succesfully create checkin with inquiries for {int} days")
    public void shouldSuccesfullyCreateCheckinWithInquiriesForDays(int arg0) {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Create question successful']").isDisplayed());
    }

    @And("Click icon <")
    public void clickIcon() throws InterruptedException {
        //appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView").click();
        MobileElement icnBack = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView");
        icnBack.click();
        icnBack.click();
        Thread.sleep(2000);
    }

    @Then("Should succes cancel create checkin")
    public void shouldSuccesCancelCreateCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.View[@text='Test']").isDisplayed());
    }

    @And("Click checkin want to update")
    public void clickCheckinWantToUpdate() {
        MobileElement Update = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Test12e']");
        Update.click();
    }

    @And("Click checkin want to update2")
    public void clickCheckinWantToUpdate2() throws InterruptedException {
        MobileElement Update2 = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup");
        Update2.click();
        Thread.sleep(2000);
    }

    @And("Click pencil icon")
    public void clickPencilIcon() {
        MobileElement icnPencil = appiumDriver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]");
        icnPencil.click();
    }

    @And("Edit checkin")
    public void editCheckin() throws InterruptedException {
        MobileElement editQuestion = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Test12e']");
        editQuestion.clear();
        editQuestion.sendKeys("Tester Aprijal");
        Thread.sleep(2000);
    }

    @Then("Should succesfully update checkin")
    public void shouldSuccesfullyUpdateCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Update question successful']").isDisplayed());
    }

    @Then("Should succes cancel update checkin")
    public void shouldSuccesCancelUpdateCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.View[@text='Test']").isDisplayed());
    }

    @And("Click checkin want to comment")
    public void clickCheckinWantToComment() {
       appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup").click();
    }

    @And("Input new comment {string}")
    public void inputNewCommentTester(String coment) {
        MobileElement inputComment = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Add new comment...']");
        inputComment.clear();
        inputComment.sendKeys(coment);
    }


    @And("Click button send")
    public void clickButtonSend() {
        MobileElement btnSend = appiumDriver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.widget.TextView");
        btnSend.click();
    }

    @Then("Should succesfully add comment checkin")
    public void shouldSuccesfullyAddCommentCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]").isDisplayed());
    }

    @And("Click Add comment")
    public void clickAddComment() throws InterruptedException {
        MobileElement addComment = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Add new comment...']");
        addComment.click();
        Thread.sleep(2000);
    }

    @And("Click icon B")
    public void clickIconB() {
        MobileElement icnBold = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup");
        icnBold.click();
    }

    @And("Input coment")
    public void inputComent() {
        MobileElement inputComent = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Add new comment...']");
        inputComent.sendKeys("Test123");
    }

    @Then("Should succesfully add comment bold in checkin")
    public void shouldSuccesfullyAddCommentBoldInCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]").isDisplayed());
    }

    @And("Add member")
    public void addMember() {
     MobileElement addMember = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView");
     addMember.click();

    }

    @And("Input and search name member checkin")
    public void inputAndSearchNameMemberCheckin() {
        MobileElement searchMember = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Search']");
        searchMember.sendKeys("Ugik");
    }

    @And("Click name member checkin")
    public void clickNameMemberCheckin() {
        MobileElement nameMember = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Ugik Meirawan']");
        nameMember.click();
    }

    @Then("Should succesfully add member checkin")
    public void shouldSuccesfullyAddMemberCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Ugik Meirawan']").isDisplayed());
    }

    @And("Click icon X checkin")
    public void clickIconXCheckin() {
        MobileElement iconX = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup");
        iconX.click();
    }

    @And("Add member checkin")
    public void addMemberCheckin() {
        MobileElement addMember = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]");
        addMember.click();
    }

    @Then("Should successfully cancel add member")
    public void shouldSuccessfullyCancelAddMember() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Test']").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @And("Without select day")
    public void withoutSelectDay() {
        appiumDriver.findElementByXPath("//android.widget.ScrollView[@index='3']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='4']/android.widget.TextView[@text='Mon']").click();
    }

    @Then("Should failed create checkin")
    public void shouldFailedCreateCheckin() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView").isDisplayed());
    }

    @And("Click checkin want to comment wtihout input anything")
    public void clickCheckinWantToCommentWtihoutInputAnything() {
        appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup").click();
        MobileElement ciComment = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Add new comment...']");
        ciComment.click();
    }

    @Then("Shouldn't show up the submit button")
    public void shouldnTShowUpTheSubmitButton() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.widget.TextView").isEnabled());
    }

    @And("Click add new comment")
    public void clickAddNewComment() {
        MobileElement addComment = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Add new comment...']");
        addComment.click();
    }

    @And("Click icon pictures")
    public void clickIconPictures() {
        MobileElement iconPictures = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup");
        iconPictures.click();
    }

    @And("Click button Batal")
    public void clickButtonBatal() {
        MobileElement btnBatal = appiumDriver.findElementByXPath("//android.widget.Button[@text='Batal']");
        btnBatal.click();
    }

    @Then("Should faield upload pictures and show alert")
    public void shouldFaieldUploadPicturesAndShowAlert() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Failed to attach image, please try again']").isEnabled());
    }

    @And("Click icon videos")
    public void clickIconVideos() {
        MobileElement iconVideos = appiumDriver.findElementByXPath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup");
        iconVideos.click();
    }

    @Then("Should faield upload videos and show alert")
    public void shouldFaieldUploadVideosAndShowAlert() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView").isEnabled());
    }
}

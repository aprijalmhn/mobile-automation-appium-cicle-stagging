package com.appium.stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.Hooks;
import org.junit.Assert;

public class BoardStep {

    public static AppiumDriver<MobileElement> appiumDriver = Hooks.setUp();

    @Given("User open cicle app2")
    public void userOpenCicleApp2() throws InterruptedException {
        MobileElement iconCicle = appiumDriver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Cicle Staging\"]");
        iconCicle.click();
        Thread.sleep(2000);
    }

    @When("Click test big project2")
    public void ClickTest2() throws InterruptedException {
        MobileElement testBigProject = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Test']");
        testBigProject.click();
        Thread.sleep(2000);
    }

    @And("Click board")
    public void clickBoard() throws InterruptedException {
        MobileElement Board = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Board']");
        Board.click();
        Thread.sleep(2000);

    }

    @And("Click button plus")
    public void clickButtonPlus() throws InterruptedException {
        MobileElement BtnPlus = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='5']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']");
        BtnPlus.click();
        Thread.sleep(2000);
    }

    @And("Click add list")
    public void clickAddList() {
        MobileElement AddList = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Add List']");
        AddList.click();
    }

    @And("Input list name")
    public void inputListName() {
        MobileElement inputListName = appiumDriver.findElementByXPath("//android.widget.EditText[@index='2']");
        inputListName.sendKeys("Tester3");
    }

    @And("Click button ADD")
    public void clickButtonADD() {
        MobileElement BtnAdd = appiumDriver.findElementByXPath("//android.widget.TextView[@text='ADD']");
        BtnAdd.click();
    }

    @Then("Should succes add list")
    public void shouldSuccesAddList() {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Sekolah QA Team']").click();
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Proggres']").isDisplayed());

    }

    @And("Click add card")
    public void clickAddCard() {
        MobileElement AddCard = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Add Card']");
        AddCard.click();
    }

    @And("Input card name")
    public void inputCardName() {
        MobileElement inputCardName = appiumDriver.findElementByXPath("//android.widget.EditText[@index='2']");
        inputCardName.sendKeys("BigProject");
    }

    @And("Select list")
    public void selectList() {
        MobileElement selectList = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Please Select...']");
        selectList.click();
        MobileElement List = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Proggres']");
        List.click();
    }

    @Then("Should succes add card")
    public void shouldSuccesAddCard() {
        appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']").click();
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Proggres']").isDisplayed());
    }

    @And("Click button icon X")
    public void clickButtonIconX() {
        MobileElement BtnX = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']");
        BtnX.click();
    }

    @Then("Should succes cancel add card")
    public void shouldSuccesCancelAddCard() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Proggres']").isDisplayed());
    }

    @And("Click card")
    public void clickCard() throws InterruptedException {
        MobileElement Card = appiumDriver.findElementByXPath("//android.widget.TextView[@text='BigProjectAM']");
        Card.click();
        Thread.sleep(3000);
    }

    @And("Click card2")
    public void clickCard2() throws InterruptedException {
        MobileElement Card2 = appiumDriver.findElementByXPath("//android.widget.TextView[@text='BigProject1']");
        Card2.click();
        Thread.sleep(3000);
    }

    @And("Add members")
    public void addMembers() throws InterruptedException {
        MobileElement AddMember = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='11']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
        AddMember.click();
        Thread.sleep(3000);
    }

    @And("Search and select name member")
    public void searchAndSelectNameMember() {
        MobileElement Search = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Select Member']");
        Search.click();
        MobileElement Select = appiumDriver.findElementByXPath("//android.widget.TextView[@text='rizal']");
        Select.click();
    }

    @Then("Should succesfully add member")
    public void shouldSuccesfullyAddMember() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='rizal']").isDisplayed());
    }

    @And("Click icon X")
    public void clickIconX() {
        MobileElement iconX = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']");
        iconX.click();
    }

    @Then("Should succesfully cancel add member")
    public void shouldSuccesfullyCancelAddMember() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='11']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']").isDisplayed());
    }

    @And("Click due date")
    public void clickDueDate() {
        MobileElement dueDate = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Set due date']");
        dueDate.click();
    }

    @And("Set date")
    public void setDate() {
        MobileElement setDate = appiumDriver.findElementByXPath("//android.view.View[@content-desc=\"29 Maret 2023\"]");
        setDate.click();
    }

    @And("Click button OKE")
    public void clickButtonOKE() {
        MobileElement btnOke = appiumDriver.findElementByXPath("//android.widget.Button[@text='OKE']");
        btnOke.click();
    }

    @And("Set the time")
    public void setTheTime() {
        MobileElement setTime = appiumDriver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"10\"]");
        setTime.click();
        appiumDriver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"30\"]").click();
    }

    @And("Click button OKE2")
    public void clickButtonOKE2() {
        MobileElement btnOke2 = appiumDriver.findElementByXPath("//android.widget.Button[@text='OKE']");
        btnOke2.click();
    }

    @Then("Should succesfully set due date")
    public void shouldSuccesfullySetDueDate() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Add new Headquarter']").isDisplayed());
    }

    @And("Click button REMOVE due date")
    public void clickButtonREMOVE() {
        MobileElement removeDate = appiumDriver.findElementByXPath("//android.widget.TextView[@text='REMOVE']");
        removeDate.click();
    }

    @Then("Should succesfully remove due date")
    public void shouldSuccesfullyRemoveDueDate() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='MOVE']").isDisplayed());
    }

    @And("Click button BATAL")
    public void clickButtonBATAL() {
        MobileElement btnBatal = appiumDriver.findElementByXPath("//android.widget.Button[@text='BATAL']");
        btnBatal.click();
    }

    @Then("Should succesfully cancel due date")
    public void shouldSuccesfullyCancelDueDate() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Set due date']").isDisplayed());
    }

    @And("Click button plus label")
    public void clickButtonPlusLabel() throws InterruptedException {
        MobileElement btnPlus = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='6']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='1']");
        btnPlus.click();
        Thread.sleep(2000);
    }

    @And("Click icon X label")
    public void clickIconXLabel() {
        MobileElement icnX = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']");
        icnX.click();
    }

    @And("Input label name")
    public void inputLabelName() {
        MobileElement inptName = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Tempat kumpul seluruh Siswa dan Instruktur Sekolah QA Batch 17']");
        inptName.click();
        appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.widget.EditText[@index='2']").sendKeys("Tester1");
    }

    @And("Select color")
    public void selectColor() {
        MobileElement selectColor = appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='9']");
        selectColor.click();
    }

    @And("Click button SEND")
    public void clickButtonSEND() {
        MobileElement btnSend = appiumDriver.findElementByXPath("//android.widget.TextView[@text='SEND']");
        btnSend.click();
    }

    @Then("Should succesfully add label")
    public void shouldSuccesfullyAddLabel() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='MOVE']").isDisplayed());
    }

    @Then("Should succesfully cancel add label")
    public void shouldSuccesfullyCancelAddLabel() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Select Label']").isDisplayed());
    }

    @And("Click button select label")
    public void clickButtonSelectLabel() {
        MobileElement btnSelectLabel = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Select Label']");
        btnSelectLabel.click();
    }

    @And("Click button test label")
    public void clickButtonTesterLabel() {
        MobileElement btnTesterLabel = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Label']");
        btnTesterLabel.click();
    }

    @And("Select label")
    public void selectLabel() {
        MobileElement selectLabel = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Label']");
        selectLabel.click();
    }

    @Then("Should succesfully select label")
    public void shouldSuccesfullySelectLabel() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Label']").isDisplayed());
    }

    @And("Click button label")
    public void clickButtonLabel() {
        MobileElement btnLabel = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Label']");
        btnLabel.click();
    }

    @Then("Should succesfully cancel select label")
    public void shouldSuccesfullyCancelSelectLabel() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Select Label']").isDisplayed());
    }

    @Then("Should succesfully remove label")
    public void shouldSuccesfullyRemoveLabel() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Label']").isDisplayed());
    }

    @And("Click button MOVE")
    public void clickButtonMOVE() {
        MobileElement btnMove = appiumDriver.findElementByXPath("//android.widget.TextView[@text='MOVE']");
        btnMove.click();
    }

    @And("Click list")
    public void clickList() {
        MobileElement List = appiumDriver.findElementByXPath("//android.widget.TextView[@text='List']");
        List.click();
    }

    @And("Select list2")
    public void selectList2() {
        MobileElement selectList = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Bakclog']");
        selectList.click();
    }

    @Then("Should succesfully move card")
    public void shouldSuccesfullyMoveCard() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='MOVE']").isDisplayed());
    }

    @And("Click textfield close")
    public void clickTextfieldClose() {
        MobileElement close = appiumDriver.findElementByXPath("//android.widget.TextView[@text='close']");
        close.click();
    }

    @Then("Should succesfully cancel move card")
    public void shouldSuccesfullyCancelMoveCard() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='BigProjectAM']").isDisplayed());
    }

    @Then("Should failed add list and show alert")
    public void shouldFailedAddListAndShowAlert() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Please fill in the List name']").isDisplayed());
    }

    @Then("Should failed add card and show alert")
    public void shouldFailedAddCardAndShowAlert() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Please fill in the Card name']").isDisplayed());
    }

    @Then("Should failed add label")
    public void shouldFailedAddLabel() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']").isDisplayed());
    }


    @Then("Should failed move card and show alert")
    public void shouldFailedMoveCardAndShowAlert() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']").isDisplayed());
    }

    @And("Add new comment wihout filling anything")
    public void addNewCommentWihoutFillingAnything() {
        MobileElement addComment = appiumDriver.findElementByXPath("//android.webkit.WebView[@text='RN Rich Text Editor']");
        addComment.click();
    }

    @Then("Should not be able to send messages")
    public void shouldNotBeAbleToSendMessages() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='12']/android.view.ViewGroup[@index='1']/android.widget.TextView").isEnabled());
    }
}


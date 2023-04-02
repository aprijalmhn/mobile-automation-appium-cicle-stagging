package com.appium.stepDefinition;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.Hooks;
import org.junit.Assert;

public class ChatStep {

    public static AppiumDriver<MobileElement> appiumDriver = Hooks.setUp();

    @Given("User open cicle app")
    public void userOpenCicleApp() throws InterruptedException {
        MobileElement iconCicle = appiumDriver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Cicle Staging\"]");
        iconCicle.click();
        Thread.sleep(2000);
    }

    @When("Click test big project")
    public void ClickTest() throws InterruptedException {
        MobileElement testBigProject = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Test']");
        testBigProject.click();
        Thread.sleep(2000);
    }

    @And("Click group chat")
    public void ClickGroupChat() {
        MobileElement groupChat = appiumDriver.findElementByXPath("//android.widget.TextView[@text='Group Chat']");
        groupChat.click();

    }

    @And("Input letter message")
    public void InputLetterMessage() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("Tester");
    }

    @And("Send message")
    public void sendMessage()  {
        MobileElement btnSend = appiumDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView");
        btnSend.click();
    }

    @Then("Should succes send message")
    public void shouldSuccessSendMessage() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Tester']").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @And("Input number message")
    public void inputNumberMessage() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("1234567890");
    }

    @And("Input symbol message")
    public void inputSymbolMessage() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("!@#$%^&*");
    }

    @And("Input language message")
    public void inputLanguageMessage() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("السلام عليكم");
    }

    @And("Input letter and number message")
    public void inputLetterAndMessage() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("Tester123");
    }

    @And("Input letter, number and symbol message")
    public void inputLetterNumberAndSymbolMessage() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("Tester123!@#$%^&*");
    }

    @And("Input emot message")
    public void inputEmotMessage() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("😀😄😆");
    }

    @And("Input and search name member")
    public void inputAndSearchNameMember()  {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Select Member (1 selected)']").click();
        appiumDriver.findElementByXPath("//android.widget.EditText[@text='Search']").sendKeys("rizal");
    }

    @And("Click name member")
    public void clickOrCeklisNameMember() {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='rizal']").click();
    }

    @And("Cick icon @")
    public void cickIcon() {
        appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]").click();
    }

    @And("Click button X")
    public void clickButtonX() {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Sekolah QA Team']").click();
    }


    @And("Click member")
    public void clickMember() {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='rizal']").click();
    }

    @Then("Should succes mention member")
    public void shouldSuccesMentionMember() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='rizal']").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @And("Send chat")
    public void sendChat() {
        appiumDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]").click();
    }

    @Then("Should failed to send message")
    public void shouldFailedToSendMessage() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @And("Input message of more than {int} words")
    public void inputMessageOfMoreThanWords(int arg0) {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").sendKeys("Novel adalah salah satu genre karya sastra yang berbentuk prosa. Kisah di dalam novel merupakan hasil karya imajinasi yang membahas tentang permasalahan kehidupan seseorang atau berbagai tokoh. Cerita di dalam novel dimulai dengan munculnya persoalan yang dialami oleh tokoh dan diakhiri dengan penyelesaian masalahnya. Novel memiliki cerita yang lebih rumit dibandingkan dengan cerita pendek. Tokoh dan tempat yang diceritakan di dalam novel sangat beragam dan membahas waktu yang lama dalam penceritaan.[1] Penokohan di dalam novel menonjolkan watak dan sifat setiap pelaku dalam kisah yang diceritakan. Novel terdiri dari bab dan sub-bab tertentu sesuai dengan kisah ceritanya.\n" +
                "Penulis novel disebut novelis atau ceritawan.Genre novel digambarkan memiliki \"sejarah yang berkelanjutan dan komprehensif selama sekitar dua ribu tahun\".[2] Pandangan ini melihat novel berawal dari Yunani dan Romawi Klasik, abad pertengahan, awal roman modern, dan tradisi novella. Novella adalah suatu istilah dalam bahasa Italia untuk menggambarkan cerita singkat, yang dijadikan istilah dalam bahasa Inggris saat ini sejak abad ke-18. Ian Watt, sejarawan sastra Inggris, menuliskan dalam bukunya The Rise of The Novel (1957) bahwa novel pertama muncul pada awal abad ke-18.");
    }

    @And("Click icon attachment")
    public void clickIconAttachment() {
        appiumDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"send\"]/android.view.ViewGroup/android.widget.TextView").click();
    }

    @And("Do not fill anything")
    public void doNotFillAnything() {
        appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").isDisplayed();
    }

    @Then("Should succes cancel mention member")
    public void shouldSuccesCancelMentionMember() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc=\"Type a message...\"]").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @Then("Should failed to send message and not show button send message")
    public void shouldFailedToSendMessageAndNotShowButtonSendMessage() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='14']/android.widget.TextView[@index='2']").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @And("Click gallery")
    public void clickGallery() {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Gallery']").click();
    }

    @And("Select {int} pictures")
    public void selectPictures(int arg0) {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Pilih tindakan']").click();
    }

    @And("Upload file")
    public void uploadFile() {
        appiumDriver.findElementByXPath("//android.widget.Button[@text='Batal']").click();
    }

    @Then("Should failed to upload pictures")
    public void shouldFailedToUploadPictures(){
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='5']/android.view.ViewGroup[@index='1']/android.widget.TextView").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @And("Click document")
    public void clickDocument() {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Document']").click();
    }

    @And("Select {int} videos and upload file videos")
    public void selectVideosAndUploadFileVideos(int arg0) {
        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Pilih tindakan']").click();
    }

    @Then("Should failed to upload videos")
    public void shouldFailedToUploadVideos() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.widget.TextView[@text='Failed upload video']").isDisplayed());
        appiumDriver.terminateApp("staging.cicle");
    }

    @And("Upload apk file")
    public void uploadApkFile() {
        appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='4']").click();
    }

    @Then("Should failed to upload file")
    public void shouldFailedToUploadFile() {
        Assert.assertTrue(appiumDriver.findElementByXPath("//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']").isDisplayed());
    }

}




import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/dokter/dr-patrianef-spbkv')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('rumah sakit/booking logged in/button_Login  Daftar Baru'))

WebUI.waitForElementVisible(findTestObject('rumah sakit/booking logged in/input_Alamat E-Mail_email'), 5)

WebUI.setText(findTestObject('rumah sakit/booking logged in/input_Alamat E-Mail_email'), 'kuning@color.com')

WebUI.setText(findTestObject('rumah sakit/booking logged in/input_Kata Sandi_password'), '123sehatQ!')

WebUI.click(findTestObject('rumah sakit/booking logged in/button_Masuk'))

WebUI.delay(3)

while (WebUI.verifyElementPresent(findTestObject('Object Repository/dokter new/booking logged in/jadwal praktek section header'), 5, FailureHandling.OPTIONAL) == true) {
	a = '/html/body/div[1]/main/div[1]/div/div/div/div[2]/div[2]/div/div/div[4]/div/div/div[3]/div['+GlobalVariable.counter+']/div[3]/a'
	TestObject schedulebooking = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		a, true)
	
	if (WebUI.verifyElementClickable(schedulebooking, FailureHandling.OPTIONAL) == true) {
		WebUI.click(schedulebooking)
	} else if (GlobalVariable.counter != 8) {
		(GlobalVariable.counter)++
	} else {
	break}
}

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('rumah sakit/booking logged in/div_Buat Janji Dokter'), 5)

GlobalVariable.counter = 1

WebUI.closeBrowser()
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

WebUI.navigateToUrl(GlobalVariable.target + 'sehatq.com/dokter/dr-ar-widjaja-spb')

WebUI.waitForPageLoad(3)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('dokter new/booking not login/input_View Map_date'), 1)

WebUI.click(findTestObject('dokter new/booking not login/input_View Map_date'))

WebUI.click(findTestObject('Object Repository/dokter new/booking not login/th_Juli 2019'))

WebUI.click(findTestObject('Object Repository/dokter new/booking not login/i_Mg_fa fa-chevron-right'))

WebUI.click(findTestObject('Object Repository/dokter new/booking not login/span_Jan'))

WebUI.click(findTestObject('Object Repository/dokter new/booking not login/td_6'))

WebUI.click(findTestObject('Object Repository/dokter new/booking not login/a_1830 - Selesai'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('rumah sakit/booking not login/login pop up'))

WebUI.closeBrowser()


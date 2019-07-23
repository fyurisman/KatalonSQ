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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/kontak')

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/kontak kami/input_PT. SehatQ Harsana Emedi'), 'Automated kontak kami test')

WebUI.setText(findTestObject('Object Repository/kontak kami/input_PT. SehatQ Harsana Emedi_15'), 'test@email.com')

WebUI.setText(findTestObject('Object Repository/kontak kami/input_PT. SehatQ Harsana Emedi_25'), '123456789')

WebUI.setText(findTestObject('Object Repository/kontak kami/textarea_Apa yang ingin kamu t'), 'Please ignore this message :)')

WebUI.click(findTestObject('Object Repository/kontak kami/button_Kirim'))

WebUI.verifyElementPresent(findTestObject('Object Repository/kontak kami/span_Pertanyaan anda sudah dik'), 5)

WebUI.closeBrowser()


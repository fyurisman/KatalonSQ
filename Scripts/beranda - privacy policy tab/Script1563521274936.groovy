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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/kebijakan-privasi')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/dokter new/detail view map/privacy policy/a_English'))

a = WebUI.getText(findTestObject('Object Repository/dokter new/detail view map/privacy policy/h1_Privacy Policy'))

WebUI.verifyMatch(a, 'Privacy Policy', false)

WebUI.click(findTestObject('Object Repository/dokter new/detail view map/privacy policy/a_Bahasa Indonesia'))

WebUI.delay(2)

b = WebUI.getText(findTestObject('Object Repository/dokter new/detail view map/privacy policy/h1_Kebijakan Privasi'))

WebUI.verifyMatch(b, 'Kebijakan Privasi', false)

WebUI.closeBrowser()

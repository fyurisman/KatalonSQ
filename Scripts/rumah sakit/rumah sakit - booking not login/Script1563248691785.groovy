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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/faskes/rumah-sakit-abdi-waluyo')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('rumah sakit/booking not login/div_Kandungan'))

WebUI.click(findTestObject('rumah sakit/booking not login/pilih tanggal'))

WebUI.click(findTestObject('rumah sakit/booking not login/th_Juli 2019'))

WebUI.click(findTestObject('rumah sakit/booking not login/th_Mg_next'))

WebUI.click(findTestObject('rumah sakit/booking not login/span_Jan'))

WebUI.click(findTestObject('rumah sakit/booking not login/td_6'))

WebUI.click(findTestObject('rumah sakit/booking not login/a_1700 - 2000'))

WebUI.waitForElementVisible(findTestObject('rumah sakit/booking not login/login pop up'), 5)

WebUI.verifyElementVisible(findTestObject('rumah sakit/booking not login/login pop up'))

WebUI.closeBrowser()


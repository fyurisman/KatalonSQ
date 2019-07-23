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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

/**
 * test province suggetion from location field in search bar
 * */
WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/faskes')

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('rumah sakit/searchbar_input_Cari Lokasi Faskes'), 'dki')

WebUI.waitForElementPresent(findTestObject('rumah sakit/location field suggestion'), 5)

WebUI.click(findTestObject('rumah sakit/location field suggestion'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('rumah sakit/a_Dki Jakarta'), 5)

not_run: WebUI.closeBrowser()


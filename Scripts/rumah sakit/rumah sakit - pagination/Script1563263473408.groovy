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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/faskes/rumah-sakit?qLat=-6.1899739&qLang=106.82355899999999&qProv=DKI+Jakarta')

WebUI.waitForPageLoad(5)

while (WebUI.verifyElementPresent(findTestObject('rumah sakit/pagination/a_next'), 3, FailureHandling.OPTIONAL) == true){

	WebUI.click(findTestObject('rumah sakit/pagination/a_next'))
	
	WebUI.waitForPageLoad(3)
	
	}

while (WebUI.verifyElementPresent(findTestObject('rumah sakit/pagination/a_prev'), 3, FailureHandling.OPTIONAL) == true){
	
	WebUI.click(findTestObject('rumah sakit/pagination/a_prev'))
	
	WebUI.waitForPageLoad(3)
	
	}

WebUI.closeBrowser()
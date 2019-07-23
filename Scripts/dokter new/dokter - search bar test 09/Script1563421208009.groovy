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
 * input invalid name and valid location to the search field
 * */
WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/dokter')

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('dokter new/searchbar_input_Cari Dokter_keyword'), 'adfadfaadfasd')

WebUI.setText(findTestObject('dokter new/searchbar_input_Cari Dokter_region'), 'medan')

WebUI.click(findTestObject('rumah sakit/searchbar_button_Cari'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementNotPresent(findTestObject('dokter new/a_Prof. dr. A. Afif Siregar Sp'), 5)

not_run: WebUI.closeBrowser()


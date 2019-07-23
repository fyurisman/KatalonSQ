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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

/**
 * test enter button without input shows all HCF in listing
 * */
WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/faskes')

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject('rumah sakit/searchbar_input_Cari Nama Faskes'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('rumah sakit/breadcrumbs_span_Cari Faskes'), 5)

not_run: WebUI.closeBrowser()


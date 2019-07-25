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

WebUI.navigateToUrl(GlobalVariable.target + 'sehatq.com/')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/login regis/login google/button_Login  Daftar Baru'))

WebUI.waitForElementVisible(findTestObject('Object Repository/login regis/login google/input_Alamat E-Mail_email'), 5)

WebUI.click(findTestObject('Object Repository/login regis/login google/a_Sign in with Google'))

WebUI.setText(findTestObject('Object Repository/login regis/login google/input_sehatq.com_identifier'), 'felix.yurisman@sehatq.com')

WebUI.click(findTestObject('Object Repository/login regis/login google/span_Berikutnya'))

WebUI.waitForElementVisible(findTestObject('login regis/login google/input_google pass'), 5)

WebUI.setEncryptedText(findTestObject('login regis/login google/input_google pass'), 'Mz5h43mX6kUTLTQ7rovVfw==')

WebUI.click(findTestObject('Object Repository/login regis/login google/span_Berikutnya'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('login regis/login button'), 5)

a = WebUI.getText(findTestObject('login regis/login button'))

WebUI.verifyMatch(a, 'Hi, Felix', false)

WebUI.closeBrowser()


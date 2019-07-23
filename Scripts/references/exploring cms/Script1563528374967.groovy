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

WebUI.navigateToUrl('https://stg.sehatq.com/admin/login')

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('Object Repository/cms/Page_SehatQ - Admin Login/input_E-Mail Address_email'), 'felix@latitudevp.com')

WebUI.setEncryptedText(findTestObject('Object Repository/cms/Page_SehatQ - Admin Login/input_Password_password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('cms/Page_SehatQ - Admin Login/button_Login'))

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl('https://stg.sehatq.com/admin/article/edit/633')

WebUI.waitForPageLoad(30)

WebUI.comment(WebUI.getText(findTestObject('cms/Page_SehatQ/body_Jangan berkecil hati jika')))

WebUI.closeBrowser()


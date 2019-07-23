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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/')

WebUI.waitForPageLoad(5)

int rng = Math.random() * 100000000

randomemail = (('test@' + rng) + '.com')

WebUI.click(findTestObject('Object Repository/login regis/regis/button_Login  Daftar Baru'))

WebUI.waitForElementVisible(findTestObject('Object Repository/login regis/regis/input_Alamat E-Mail_email'), 5)

WebUI.click(findTestObject('Object Repository/login regis/regis/button_Daftar'))

WebUI.waitForElementVisible(findTestObject('login regis/regis/input_Nama_name'), 5)

WebUI.setText(findTestObject('Object Repository/login regis/regis/input_Nama_name'), 'Automated registration test')

WebUI.setText(findTestObject('Object Repository/login regis/regis/input_Email_email'), randomemail)

WebUI.setEncryptedText(findTestObject('Object Repository/login regis/regis/input_Kata Sandi_password'), 'VU1orW/zbPMAsSeA5V5+EA==')

WebUI.selectOptionByValue(findTestObject('Object Repository/login regis/regis/select_Tanggal'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/login regis/regis/select_Bulan'), '1', true)

WebUI.setText(findTestObject('Object Repository/login regis/regis/input_Tahun Lahir_bod-tahun'), '1990')

WebUI.click(findTestObject('Object Repository/login regis/regis/i_Prev_fas fa-chevron-circle-r'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/login regis/regis/label_Rajin Olahraga'))

WebUI.click(findTestObject('Object Repository/login regis/regis/label_Perlu Refreshing'))

WebUI.click(findTestObject('Object Repository/login regis/regis/label_Jaga Makan'))

WebUI.click(findTestObject('Object Repository/login regis/regis/label_Rutin Banget'))

WebUI.click(findTestObject('Object Repository/login regis/regis/i_Prev_fas fa-chevron-circle-r'))

WebUI.waitForElementVisible(findTestObject('login regis/regis/label_MPASI'), 5)

WebUI.click(findTestObject('Object Repository/login regis/regis/label_MPASI'))

WebUI.click(findTestObject('Object Repository/login regis/regis/label_PerkembanganBayi'))

WebUI.click(findTestObject('Object Repository/login regis/regis/label_LatihanOtak'))

WebUI.click(findTestObject('Object Repository/login regis/regis/button_Register'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('login regis/login button'), 5)

a = WebUI.getText(findTestObject('login regis/login button'))

WebUI.verifyMatch(a, 'Hi, Automated', false)

WebUI.closeBrowser()


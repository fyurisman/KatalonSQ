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

WebUI.callTestCase(findTestCase('404 checker by sitemap/404 checker by sitemap - login steps'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.target + 'sehatq.com/pemesanan/dokter?date=2020-01-11&day=Sabtu&rs=1650&person=425&time=16%3A00+-+17%3A30')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/booking page/span_Booking untuk orang lain'))

WebUI.click(findTestObject('Object Repository/booking page/span_Orang Tua'))

WebUI.click(findTestObject('Object Repository/booking page/span_Perempuan'))

WebUI.click(findTestObject('Object Repository/booking page/span_Baru'))

WebUI.click(findTestObject('Object Repository/booking page/span_Pribadi'))

WebUI.setText(findTestObject('Object Repository/booking page/input__user_name'), 'Anak')

WebUI.click(findTestObject('Object Repository/booking page/td_7'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/booking page/input_Alamat_user_address'), 'Alamat')

WebUI.click(findTestObject('Object Repository/booking page/span_-- Pilih KotaKabupaten --'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/booking page/span_-- Please select --'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/booking page/textarea_Keluhan_keluhan'), 'This is automated booking test, please ignore this booking')

WebUI.click(findTestObject('Object Repository/booking page/span_Saya telah membaca dan me'))

WebUI.click(findTestObject('Object Repository/booking page/button_Book Now'))

WebUI.click(findTestObject('Object Repository/booking page/a_Lihat My Booking'))

WebUI.waitForPageLoad(3)

WebUI.closeBrowser()


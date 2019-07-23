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

WebUI.navigateToUrl('https://www.sehatq.com/dokter')

WebUI.waitForPageLoad(30)

for (int j = 1; j < 3; j++) {
    a = ('/html/body/div[4]/main/div[2]/div/div/div[1]/div/div/div/form/div/div[2]/div[3]/div[2]/div/div/div['+j)
	
	for (int k = 1; k < 5; k++) {
	
	b = (a+']/div['+k+']/label')		
	
    WebUI.click(findTestObject('dokter old/Jadwal Checkbox/div_Jadwal'))

    TestObject cb = new TestObject('cb').addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, b, 
        true)

    WebUI.check(cb)

    WebUI.click(findTestObject('dokter old/button_Cari Sekarang'))

    WebUI.waitForPageLoad(30)

    WebUI.comment((WebUI.getText(findTestObject('dokter old/Jadwal Checkbox/div_Jadwal')) + ' = ') + WebUI.getText(
            findTestObject('dokter old/div_Total 584 dokter ditemukan')))

    WebUI.click(findTestObject('dokter old/button_Ulangi Pencarian'))

    WebUI.waitForPageLoad(30)
}}

WebUI.closeBrowser()


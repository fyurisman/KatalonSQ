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

for (int i = 1; i < 25; i++) {
    a = (('/html/body/div[4]/main/div[2]/div/div/div[1]/div/div/div/div/div[1]/form/div/div[2]/div[1]/div[2]/div/div[' + 
    i) + ']/label')

    WebUI.click(findTestObject('dokter old/Spesialisasi Radio/div_Spesialisasi'))

    TestObject radio = new TestObject('radio').addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        a, true)

    WebUI.check(radio)

    WebUI.click(findTestObject('dokter old/button_Cari Sekarang'))

    WebUI.waitForPageLoad(30)

    WebUI.comment((WebUI.getText(findTestObject('dokter old/Spesialisasi Radio/div_Spesialisasi')) + ' = ') + WebUI.getText(
            findTestObject('dokter old/div_Total 584 dokter ditemukan')))

    WebUI.click(findTestObject('dokter old/button_Ulangi Pencarian'))

    WebUI.waitForPageLoad(30)
}

WebUI.closeBrowser()


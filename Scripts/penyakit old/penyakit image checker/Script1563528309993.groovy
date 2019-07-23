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

WebUI.navigateToUrl('https://www.sehatq.com/penyakit/ablasi-retina')

WebUI.waitForPageLoad(30)

int i = 1

while (WebUI.verifyElementPresent(findTestObject('penyakit/Page_Ablasi Retina  Definisi gejala/a_Penyakit Selanjutnya'), 
    30, FailureHandling.OPTIONAL) == true) {
    if (WebUI.verifyElementPresent(findTestObject('penyakit/Page_Ablasi Retina  Definisi gejala/img_Terakhir ditinjau oleh dr.'), 
        30, FailureHandling.OPTIONAL) == true) {
    } else {
        CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1', i, 1, WebUI.getUrl())

        i++
    }
    
    WebUI.click(findTestObject('penyakit/Page_Ablasi Retina  Definisi gejala/a_Penyakit Selanjutnya'))

    WebUI.waitForPageLoad(30)
}

WebUI.closeBrowser()


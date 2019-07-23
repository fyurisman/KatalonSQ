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

WebUI.navigateToUrl('https://dev.sehatq.com/obat/acarbose')

for (int i = 0; i < 223; i++) {
    if (WebUI.verifyElementPresent(findTestObject('Pagination/canonical'), 30, FailureHandling.OPTIONAL) == true) {
        //WebUI.comment('a')
        //WebUI.comment(WebUI.getAttribute(findTestObject('Pagination/canonical'), 'href'))
    } else {
        WebUI.comment('error canonical ' + WebUI.getUrl())
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Pagination/next'), 30, FailureHandling.OPTIONAL) == true) {
        //WebUI.comment('a')
        //WebUI.comment(WebUI.getAttribute(findTestObject('Pagination/next'), 'href'))
    } else {
        WebUI.comment('error next ' + WebUI.getUrl())
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Pagination/previous'), 30, FailureHandling.OPTIONAL) == true) {
        //WebUI.comment('a')
        //WebUI.comment(WebUI.getAttribute(findTestObject('Pagination/previous'), 'href'))
    } else {
        WebUI.comment('error previous ' + WebUI.getUrl())
    }
    
    WebUI.verifyElementPresent(findTestObject('obat/Page_Vitamin B9  Fungsi cara pemaka/a_Obat Selanjutnya'), 30)

    WebUI.click(findTestObject('obat/Page_Vitamin B9  Fungsi cara pemaka/a_Obat Selanjutnya'))

    WebUI.waitForPageLoad(30)
}

WebUI.closeBrowser()


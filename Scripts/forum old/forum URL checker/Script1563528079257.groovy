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

WebUI.navigateToUrl('https://stg.sehatq.com/forum?page=39')

WebUI.waitForPageLoad(30)

while (WebUI.verifyElementPresent(findTestObject('forum/Page_SehatQ  Tanya dokter/a_Next'), 0, FailureHandling.OPTIONAL) == 
true) {
    for (int i = 1; i < 11; i++) {
        WebUI.click(findTestObject('forum/Page_SehatQ  Tanya dokter/div_forum question ' + i))

        if (WebUI.verifyElementPresent(findTestObject('forum/Page_SehatQ logo/img'), 30, FailureHandling.OPTIONAL) == 
        true) {
        } else {
            WebUI.comment(WebUI.getUrl())
        }
        
        WebUI.back()

        WebUI.waitForPageLoad(30)
    }
    
    WebUI.click(findTestObject('forum/Page_SehatQ  Tanya dokter/a_Next'))

    WebUI.waitForPageLoad(30)
}

for (int i = 1; i < 11; i++) {
    WebUI.click(findTestObject('forum/Page_SehatQ  Tanya dokter/div_forum question ' + i))

    if (WebUI.verifyElementPresent(findTestObject('login homepage/Page_SehatQ - Asisten Kesehatan And (1)/logo sehatq'), 
        0, FailureHandling.OPTIONAL) == true) {
    } else {
        WebUI.comment(WebUI.getUrl())
    }
    
    WebUI.back()

    WebUI.waitForPageLoad(30)
}

WebUI.closeBrowser()


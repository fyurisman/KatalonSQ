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

/**works only at headless browser*/
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.target + 'sehatq.com/')

WebUI.waitForPageLoad(10)

/**enter desired query*/
WebUI.setText(findTestObject('Object Repository/search result/Page_SehatQ - Asisten Kesehatan And/input_SehatQ  Asisten Kesehata'), 
    'kantuk')

//%20a for all
WebUI.click(findTestObject('Object Repository/search result/Page_SehatQ - Asisten Kesehatan And/button_SehatQ  Asisten Kesehat'))

WebUI.waitForPageLoad(10)

while (WebUI.verifyElementVisible(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Disease'), 
    FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Disease'), FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Disease'), 
        1, FailureHandling.STOP_ON_FAILURE)
}

while (WebUI.verifyElementVisible(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Drug'), 
    FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Drug'), FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Drug'), 
        1, FailureHandling.STOP_ON_FAILURE)
}

while (WebUI.verifyElementVisible(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Article'), 
    FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Article'), FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Article'), 
        1, FailureHandling.STOP_ON_FAILURE)
}

while (WebUI.verifyElementVisible(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Doctor'), 
    FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Doctor'), FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Doctor'), 
        1, FailureHandling.STOP_ON_FAILURE)
}

while (WebUI.verifyElementVisible(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Hospital'), 
    FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Hospital'), FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Object Repository/search result/Page_SehatQ - Pencarian/button_Load More Hospital'), 
        1, FailureHandling.STOP_ON_FAILURE)
}

def uerel = []

def exep = []

int i = 1

uerel += WebUI.getAllLinksOnCurrentPage(false, exep)

for (int x = 0; x < uerel.size; x++) {
    //	WebUI.comment(uerel[x])
    def z = []

    z += (uerel[x])

    if (WebUI.verifyLinksAccessible(z, FailureHandling.OPTIONAL) == true) {
    } else {
        CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1', i, 1, uerel[x])

        i++
    }
}

WebUI.closeBrowser()

WebUI.waitForPageLoad(0)


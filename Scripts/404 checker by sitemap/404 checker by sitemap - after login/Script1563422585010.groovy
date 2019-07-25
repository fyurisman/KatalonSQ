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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

WebUI.navigateToUrl(sitemap)

WebUI.waitForPageLoad(5)

def uerel = []

uerel += WebUI.getAllLinksOnCurrentPage(false, [])

for (int x = 1; x < uerel.size; x++) {
    def z = []

    z += (uerel[x])

    if (WebUI.verifyLinksAccessible(z, FailureHandling.OPTIONAL) == true) {
    } else {
        CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'(GlobalVariable.excelresult, GlobalVariable.counter, 1, WebUI.getUrl())

        CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'(GlobalVariable.excelresult, GlobalVariable.counter, 2, uerel[x])

        (GlobalVariable.counter)++
    }
}

not_run: WebUI.closeBrowser()


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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/faskes/cari-faskes?keyword=mitra+keluarga&region=')

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

def array1 = []

for (int i = 1; i < 9; i++) {
    a = (('/html/body/div[4]/main/div[1]/section[2]/div/div/div[2]/div/div[2]/div[' + i) + ']/div/div[2]/div/div[1]/h5/a')

    TestObject hospitalname = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        a, true)

    array1 += WebUI.getText(hospitalname //    WebUI.comment(WebUI.getText(hospitalname))
        )
}

WebUI.waitForElementClickable(findTestObject('rumah sakit/sort_button_A - Z'), 5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('rumah sakit/sort_button_A - Z'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Object Repository/rumah sakit/sort drop down/a_Z -A'), 5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/rumah sakit/sort drop down/a_Z -A'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('rumah sakit/sort_button_A - Z'), 5)

WebUI.click(findTestObject('rumah sakit/sort_button_A - Z'))

WebUI.waitForElementClickable(findTestObject('Object Repository/rumah sakit/sort drop down/a_Z -A'), 5)

WebUI.click(findTestObject('Object Repository/rumah sakit/sort drop down/a_Z -A'))

def array2 = []

for (int i = 1; i < 9; i++) {
    a = (('/html/body/div[4]/main/div[1]/section[2]/div/div/div[2]/div/div[2]/div[' + i) + ']/div/div[2]/div/div[1]/h5/a')

    TestObject hospitalname = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        a, true)

    array2 += WebUI.getText(hospitalname //	WebUI.comment(WebUI.getText(hospitalname))
        )
}

array1 = array1.reverse()

String result1 = array1.join(', ')

String result2 = array2.join(', ')

WebUI.verifyMatch(result1, result2, false)

WebUI.comment(result1)

WebUI.comment(result2)

not_run: WebUI.closeBrowser()


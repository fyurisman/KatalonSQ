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

/**
 * can only running on normal browser (not headless)*/

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/dokter/cari-dokter?qGender=&qSort=asc&qLat=&qLang=&qLoc=&qKec=&qProv=&keyword=bagus&region=')

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

def array1 = []

for (int i = 1; i < 11; i++) {
    a = (('/html/body/div[4]/main/div[1]/section[3]/div/div/div[2]/div/div[2]/div[1]/div[' + i) + ']/div/div[2]/div/div[2]/span/span/span')

    TestObject doctordistance = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        a, true)

    array1 += Float.valueOf(WebUI.getText(doctordistance))

//    WebUI.comment(WebUI.getText(doctordistance))
}

WebUI.waitForElementClickable(findTestObject('dokter new/sort_div_A - Z'), 5)

WebUI.click(findTestObject('dokter new/sort_div_A - Z'))

WebUI.waitForElementClickable(findTestObject('dokter new/sort dropdown/a_Jarak Terdekat'), 5)

WebUI.click(findTestObject('dokter new/sort dropdown/a_Jarak Terdekat'))

def array2 = []

for (int i = 1; i < 11; i++) {
    a = (('/html/body/div[4]/main/div[1]/section[3]/div/div/div[2]/div/div[2]/div[1]/div[' + i) + ']/div/div[2]/div/div[2]/span/span/span')

    TestObject doctordistance = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        a, true)

    array2 += Float.valueOf(WebUI.getText(doctordistance))

//    WebUI.comment(WebUI.getText(doctordistance))
}

array1.sort()

String result1 = array1.join(', ')

String result2 = array2.join(', ')

WebUI.verifyMatch(result1, result2, false)

//WebUI.comment(result1)
not_run: WebUI.closeBrowser()


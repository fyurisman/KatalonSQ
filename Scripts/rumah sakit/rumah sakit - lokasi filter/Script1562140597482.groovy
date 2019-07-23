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
import java.util.Scanner as Scanner

/**
 * can only running on normal browser (not headless)*/

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/faskes/cari-faskes?keyword=&region=')

WebUI.waitForPageLoad(5)

a = '/html/body/div[4]/main/div[1]/section[2]/div/div/div[1]/div/div[2]/form/div/div/div[2]/div/ul/li[1]/a'

TestObject hospitallocation = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    a, true)

for (int i = 1; i < 4; i++) {
	currenturl = WebUI.getUrl()
    filter = WebUI.getText(hospitallocation)
    lokasi = filter.substring(filter.indexOf('(') + 1, filter.indexOf(')'))

    WebUI.click(hospitallocation)

    WebUI.waitForPageLoad(5)

    total = WebUI.getText(findTestObject('rumah sakit/total counter by css'))

//    if (WebUI.verifyMatch(lokasi, total, false, FailureHandling.OPTIONAL) == true){
//	} else {
//	WebUI.comment(currenturl)
//	WebUI.comment(filter)
//	}
}

WebUI.closeBrowser()


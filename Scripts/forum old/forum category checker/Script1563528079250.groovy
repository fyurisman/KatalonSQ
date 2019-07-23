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

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sehatq.com/forum')

WebUI.waitForPageLoad(30)

int x = 1

for (int i = 2; i < 13; i++) {
	
	a = (('/html/body/div[4]/main/div[2]/div/div/div[1]/div/div/div/div/ul/li[' + i) + ']/a') //side bar

	TestObject dynamicObject = new TestObject('dynamicObject').addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		a, true)

	WebUI.click(dynamicObject)
	
	WebUI.waitForPageLoad(30)

while (WebUI.verifyElementPresent(findTestObject('forum/Page_SehatQ  Tanya dokter/a_Next'), 0, FailureHandling.OPTIONAL) == 
true) {
    for (int k = 1; k < 11; k++) {
        WebUI.click(findTestObject('forum/Page_SehatQ  Tanya dokter/div_forum question ' + k))
		
//		CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 1, WebUI.getText(a)) //side category		
		CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 2, WebUI.getUrl()) //url
		CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 3, WebUI.getText(findTestObject('forum/Page_Kepanasan saat hamil mengapa/ol_bread crumbs'))) //bread crumbs
		CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 4, WebUI.getText(findTestObject('forum/Page_Kepanasan saat hamil mengapa/h1_question title'))) //question title
		x++
		
        WebUI.back()

        WebUI.waitForPageLoad(30)
    }
    
    WebUI.click(findTestObject('forum/Page_SehatQ  Tanya dokter/a_Next'))

    WebUI.waitForPageLoad(30)
}

title = '/html/body/div[4]/main/div[2]/div/div/div[2]/div[1]/div[2]/div'

WebDriver driver = DriverFactory.getWebDriver()

eleCount = driver.findElements(By.xpath(title)).size()

for (int j = 1; j < eleCount+1; j++) {
    WebUI.click(findTestObject('forum/Page_SehatQ  Tanya dokter/div_forum question ' + j))
	
//	CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 1, WebUI.getText(a)) //side category
	CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 2, WebUI.getUrl()) //url
	CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 3, WebUI.getText(findTestObject('forum/Page_Kepanasan saat hamil mengapa/ol_bread crumbs'))) //bread crumbs
	CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1',x, 4, WebUI.getText(findTestObject('forum/Page_Kepanasan saat hamil mengapa/h1_question title'))) //question title
	x++
    
    WebUI.back()

    WebUI.waitForPageLoad(30)
}}

WebUI.closeBrowser()


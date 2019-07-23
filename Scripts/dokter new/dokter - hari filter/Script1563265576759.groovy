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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/dokter/anak')

WebUI.waitForPageLoad(3)

for (x = 1; x<3; x++){
	
for (i = 1; i<8; i++){
	
	a = '/html/body/div[4]/main/div[1]/section[3]/div/div/div[1]/div/div[2]/form/div/div/div[4]/div/div['+i+']/label/span'
	
		TestObject doctordays = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
			a, true)
		
	WebUI.check(doctordays)
	
	WebUI.delay(5)
	
	}
}
WebUI.closeBrowser()
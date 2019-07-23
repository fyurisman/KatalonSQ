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

WebUI.navigateToUrl(GlobalVariable.target+'sehatq.com/forum')

WebUI.waitForPageLoad(5)

def uerellisting = []

uerellisting += WebUI.getAllLinksOnCurrentPage(false, [])

for (int x = 1; x < uerellisting.size; x++) {
    def z = []

    z += (uerellisting[x])

    if (WebUI.verifyLinksAccessible(z, FailureHandling.OPTIONAL) == true) {
    } else {
        CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1', GlobalVariable.counter, 1, WebUI.getUrl())

        CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1', GlobalVariable.counter, 2, uerellisting[x])

        (GlobalVariable.counter)++
    }
}

b = '//*[@id="dropdownMenuLink"]'
TestObject categorybutton = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
	b, true)

for (int i = 1; i < 6; i++) {
	a = '/html/body/div[4]/main/div[1]/div[1]/div/div/div[1]/div/div/a['+i+']'
	TestObject forumcategory = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		a, true)
	WebUI.waitForElementPresent(categorybutton, 5)
	WebUI.click(categorybutton)
	WebUI.waitForElementPresent(forumcategory, 5)
	WebUI.click(forumcategory)
	WebUI.waitForPageLoad(5)
	
	def uereldetail = []
	
	uereldetail += WebUI.getAllLinksOnCurrentPage(false, [])
	
	for (int x = 1; x < uereldetail.size; x++) {
		def z = []
	
		z += (uereldetail[x])
	
		if (WebUI.verifyLinksAccessible(z, FailureHandling.OPTIONAL) == true) {
		} else {
			CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1', GlobalVariable.counter, 1, WebUI.getUrl())
	
			CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1', GlobalVariable.counter, 2, uereldetail[x])
	
			(GlobalVariable.counter)++
		}
	}
}

WebUI.closeBrowser()


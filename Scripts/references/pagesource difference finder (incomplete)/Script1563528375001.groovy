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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://stg.sehatq.com/artikel/hidup-sehat/cara-alami-mencegah-gigi-berlubang')

WebDriver driver = DriverFactory.getWebDriver()

def a = []

'Get source code of current page'
a += driver.getPageSource()

WebUI.navigateToUrl('https://www.sehatq.com/artikel/hidup-sehat/detil/cara-alami-mencegah-gigi-berlubang')

a += driver.getPageSource()

WebUI.closeBrowser()

if (a[0] == a[1]){
	
	WebUI.comment('no difference')

	} else{
	WebUI.comment('difference found')
	}



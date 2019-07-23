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

Mobile.startApplication('C:\\Users\\Felix Y\\Downloads\\sehatq-android-may-2-fix.apk', true)

if (Mobile.verifyElementExist(findTestObject('Object Repository/mobile loading screens/disclaimer button'), 0, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Object Repository/mobile loading screens/disclaimer button'), 0)
}

//if (Mobile.verifyElementExist(findTestObject('mobile loading screens/lewati login button'), 0, FailureHandling.OPTIONAL) == 
//true) {
//    Mobile.tap(findTestObject('mobile loading screens/lewati login button'), 0)
//}

Mobile.tap(findTestObject('mobile loading screens/android.widget.TextView2 - Artikel'), 0)

Mobile.tap(findTestObject('mobile loading screens/android.widget.TextView11 - Anda Bisa Mencegah Gigi Berlubang dengan Cara Alami Ini'), 
    0)

Mobile.closeApplication()


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

Mobile.startApplication('kobiton-store:31241', true)

Mobile.tap(findTestObject('mobile loading screens/android.widget.TextView0 - No account yet Create one'), 0)

Mobile.setText(findTestObject('mobile login test/android.widget.EditText0'), 'test1', 0)

Mobile.setText(findTestObject('mobile login test/android.widget.EditText1'), 'address1', 0)

Mobile.setText(findTestObject('mobile login test/android.widget.EditText2'), 'email@test.com', 0)

Mobile.setText(findTestObject('mobile login test/android.widget.EditText3'), '08123456789', 0)

Mobile.setText(findTestObject('mobile login test/android.widget.EditText4'), 'password', 0)

Mobile.setText(findTestObject('mobile login test/android.widget.EditText5'), 'password', 0)

Mobile.closeApplication()


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

CustomKeywords.'com.database.mysql.connectDB'('root', '')
//CustomKeywords.'com.database.mysql.connectDB'('adminSQL', 'My5QLCdr312#!@#')

//def a = CustomKeywords.'com.database.mysql.executeQuery'("SELECT * FROM `doctors` WHERE doctors_sex = 'F'")
def a = CustomKeywords.'com.database.mysql.executeQuery'('SELECT COUNT(doctors_id) FROM `doctors` WHERE doctors_sex = "M"')

int i = 1

while (a.next()) {
    Object print = a.getObject('COUNT(doctors_id)')
	
	String b = String.valueOf(print) //change string to integer

    CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('KR1', i, 1, b)//change b to print for string
	
	i++
}

CustomKeywords.'com.database.mysql.closeDatabaseConnection'()


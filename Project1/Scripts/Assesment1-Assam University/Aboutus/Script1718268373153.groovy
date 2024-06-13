import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.apsc.nic.in/index.asp#latest-advt')

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_About Us'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_The Commission'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_About Us'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_Vision and Mission'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_About Us'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_Historical Perspective'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_About Us'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_Duties and Functions'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_About Us'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_Honble Chairpersons (Past)'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_About Us'))

WebUI.click(findTestObject('Object Repository/AssamUniversity/Page_Assam Public Service Commission/a_Honble Members(Past)'))

WebUI.closeBrowser()


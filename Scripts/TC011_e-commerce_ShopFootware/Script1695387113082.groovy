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

WebUI.navigateToUrl('https://yourlogo.geiger.com/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Shop by Product'), 0)

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Shop by Product'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Apparel'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Apparel'))

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Apparel'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Accessories'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Accessories'), 'Accessories')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Accessories'))

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Accessories'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Footwear'), 0)

WebUI.takeScreenshotAsCheckpoint('CheckPoint007')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Footwear'), 'Footwear')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Footwear'))

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Footwear'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Footwear  Cathy Bell  Madison Conradis/h1_Footwear'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Footwear  Cathy Bell  Madison Conradis/h1_Footwear'), 'Footwear')

WebUI.takeScreenshotAsCheckpoint('CheckPoint0045')

WebUI.closeBrowser()


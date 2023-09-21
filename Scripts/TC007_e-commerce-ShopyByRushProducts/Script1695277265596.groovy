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

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Cathy Bell  Madison Conradis/input_E-Mail Address_email'), 'howardroark@mailsac.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Cathy Bell  Madison Conradis/input_Password_password'), 
    '3D1MqupY0ePn4ZXQXrt/deiXnF3Gko9O')

WebUI.click(findTestObject('Object Repository/Page_Login  Cathy Bell  Madison Conradis/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Rush Products'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_24 Hour Rush Products  Cathy Bell  Mad_197b85/h1_24 Hour Rush Products'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_24 Hour Rush Products  Cathy Bell  Mad_197b85/h1_24 Hour Rush Products'), 
    '24 Hour Rush Products')

WebUI.closeBrowser()


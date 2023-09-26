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

WebUI.takeScreenshotAsCheckpoint('SecondCheckPoint')

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Cathy Bell  Madison Conradis/input_E-Mail Address_email'), 'howardroark@mailsac.com')

WebUI.click(findTestObject('Object Repository/Page_Login  Cathy Bell  Madison Conradis/form_E-Mail Address  Password   Remember Me_bc8fac'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Cathy Bell  Madison Conradis/input_Password_password'), 
    '3D1MqupY0ePn4ZXQXrt/deiXnF3Gko9O')

WebUI.click(findTestObject('Object Repository/Page_Login  Cathy Bell  Madison Conradis/button_Log In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Shop by Product'), 'Shop by Product')

WebUI.takeScreenshotAsCheckpoint('ThirdCheckPoint')

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Shop by Product'))

WebUI.takeScreenshotAsCheckpoint('FourthCheckPoint')

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Health  Wellness'))

WebUI.takeScreenshotAsCheckpoint('FifthCheckPoint')

WebUI.click(findTestObject('Object Repository/Page_Cathy Bell  Madison Conradis/a_Thermometers'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Thermometers  Cathy Bell  Madison Conradis/li_Thermometers'))

WebUI.takeScreenshotAsCheckpoint('SixthCheckPoint')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Thermometers  Cathy Bell  Madison Conradis/a_Health  Wellness'))

WebUI.takeScreenshotAsCheckpoint('FirstCheckPoint', [])

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Thermometers  Cathy Bell  Madison Conradis/a_Home'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Thermometers  Cathy Bell  Madison Conradis/h1_Thermometers'))

WebUI.closeBrowser()


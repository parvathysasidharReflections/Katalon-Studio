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

WebUI.navigateToUrl('https://thinking-tester-contact-list.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/Page_Contact List App/input_here_email'), 'howardroark@mailsac.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Contact List App/input_here_password'), '3D1MqupY0ePn4ZXQXrt/deiXnF3Gko9O')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Contact List App/button_Submit'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Contact List App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Contact List App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_My Contacts/h1_Contact List'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_My Contacts/h1_Contact List'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Contacts/h1_Contact List'), 'Contact List')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_My Contacts/button_Add a New Contact'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_My Contacts/button_Add a New Contact'))

WebUI.click(findTestObject('Object Repository/Page_My Contacts/button_Add a New Contact'))

WebUI.click(findTestObject('Object Repository/Page_Add Contact/input_First Name_firstName'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Contact/h1_Add Contact'), 'Add Contact')

WebUI.rightClick(findTestObject('Object Repository/Page_Add Contact/h1_Add Contact'))

WebUI.closeBrowser()


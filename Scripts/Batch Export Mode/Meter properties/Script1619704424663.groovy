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

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(findTestObject('Object Repository/Page_Log in to Keycloak/input_Username or email_username'), GlobalVariable.fsight_login)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Keycloak/input_Password_password'), 'n/iH/HO9iVbUUZghK8+ZWg==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Keycloak/input_Password_login'))

WebUI.delay(3)

WebUI.verifyElementNotPresent(findTestObject('Predict_Page/Meter_Properties_block'), 1)

WebUI.click(findTestObject('Predict_Page/filter_Meter'))

WebUI.click(findTestObject('Predict_Page/choose_meter_1071'))

WebUI.click(findTestObject('Predict_Page/filter_Meter'))

WebUI.verifyElementVisible(findTestObject('Predict_Page/Meter_Properties_block'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Predict_Page/edit_Meter_Properties'))

WebUI.click(findTestObject('Predict_Page/button_Close_meterPV_capacity'))

WebUI.click(findTestObject('Predict_Page/edit_Meter_Properties'))

WebUI.sendKeys(findTestObject('Predict_Page/input_meterPV_capacity'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Predict_Page/input_meterPV_capacity'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Predict_Page/input_meterPV_capacity'), '-')

WebUI.verifyElementNotClickable(findTestObject('Predict_Page/button_Save_meterPV_capacity'))

WebUI.takeFullPageScreenshotAsCheckpoint('Modal Capacity:Validation for \'-\'', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Predict_Page/input_meterPV_capacity'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Predict_Page/input_meterPV_capacity'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Predict_Page/input_meterPV_capacity'), '20')

WebUI.click(findTestObject('Predict_Page/button_Save_meterPV_capacity'))

WebUI.verifyElementText(findTestObject('Predict_Page/pv_capacity_value'), '20 kWp', FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('Value 20 was added')

WebUI.click(findTestObject('Predict_Page/filter_Date_rightArrow'))

WebUI.verifyElementText(findTestObject('Predict_Page/pv_capacity_value'), '20 kWp')

WebUI.takeFullPageScreenshotAsCheckpoint('Value is displayed in another day')


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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://andrey-wami.fsight.io/griddly-ui/')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Keycloak/input_Password_password'), 'n/iH/HO9iVbUUZghK8+ZWg==')
//
//WebUI.setText(findTestObject('Object Repository/Page_Log in to Keycloak/input_Username or email_username'), 'fsightadmin')
//
//WebUI.click(findTestObject('Object Repository/Page_Log in to Keycloak/input_Password_login'))

WebUI.click(findTestObject('Predict_Page/input_Date_input-calendar'))

WebUI.click(findTestObject('Predict_Page/button_February_Calendar__monthArrowWrapper -left'))

WebUI.delay(1)

WebUI.click(findTestObject('Predict_Page/button_February_Calendar__monthArrowWrapper -left'))

WebUI.click(findTestObject('Predict_Page/div_7'))

WebUI.click(findTestObject('Predict_Page/div_7'))

WebUI.click(findTestObject('Predict_Page/div_MeterMeter'))

WebUI.delay(1)

WebUI.click(findTestObject('Predict_Page/input (1)'))

WebUI.click(findTestObject('Predict_Page/div_MeterMeter'))

WebUI.delay(1)

WebUI.click(findTestObject('Predict_Page/BatchExpertMode_Button'))

WebUI.verifyElementVisible(findTestObject('Predict_Page/AddTag_Button')) //checking visible this button

WebUI.delay(1)

WebUI.uploadFileWithDragAndDrop(findTestObject('Predict_Page/Upload_file'), '/Users/wamiwamisoftware/Downloads/withoutforecast.csv') //upload csv
WebUI.delay(2)

WebUI.click(findTestObject('Predict_Page/ExpertMode_Button_Save'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Upload batch expert mode if there is a forecast or not')

//clear part
WebUI.click(findTestObject('Predict_Page/BatchExpertMode_Button'))

WebUI.click(findTestObject('Predict_Page/span_Delete'))

WebUI.click(findTestObject('Predict_Page/ExpertMode_Button_Save'))


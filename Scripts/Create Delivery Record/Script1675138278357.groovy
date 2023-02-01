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

WebUI.callTestCase(findTestCase('Login Sucessful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Create Delivery Record/click on Project'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Create Delivery Record/span_Fabrication'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/span_Records'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Create Delivery Record/Create Delivery Record button'))

WebUI.setText(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/input_Delivery Order No_orderNumber'), 
    '123')

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/input_Delivery Order Date_orderDatetime'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/a_Today'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/div_Select who will verify this delivery record'))

WebUI.setText(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/input_Select who will verify this delivery _9224c2'), 
    'blake')

WebUI.waitForElementPresent(findTestObject('Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/div_Blake Kinsley'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/div_Blake Kinsley'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/span_Add Components'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/span_Concrete Spun Pile_sc-oKZaW fcxlXg fal_ea81c5'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/span_Concrete Spun Pile_sc-oKZaW fWOJWr fas_e9ac08'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/span_Concrete Spun Pile_sc-oKZaW fcxlXg fal_ea81c5'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/button_Add Selected'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/div_Click here to start signing'))

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/canvas_Clear Signature_signatureCanvas'))

WebUI.verifyElementPresent(findTestObject('Page_Hubble.Build_Login/Create Delivery Record/First Delivert Record'), 0)

WebUI.click(findTestObject('Object Repository/Page_Hubble.Build_Login/Create Delivery Record/Page_Hubble.Build/button_Submit'))


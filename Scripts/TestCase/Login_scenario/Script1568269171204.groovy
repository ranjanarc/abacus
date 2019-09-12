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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.10.86.62/Abacus.Manager.Web/Login/Index')

WebUI.click(findTestObject('Object Repository/Page_Abacus - Login/input_Username_loginOptions'))

WebUI.setText(findTestObject('Object Repository/Page_Abacus - Login/input_Support_txtUserName'), 'ranjanp')
Thread.sleep(2000)
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Abacus - Login/input_Support_form-control'), 'jQ9v4sDH63o=')
Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/Page_Abacus - Login/button_Login'))
Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/Page_Abacus - Dashboard/a_Logout'))
Thread.sleep(2000)
WebUI.closeBrowser()


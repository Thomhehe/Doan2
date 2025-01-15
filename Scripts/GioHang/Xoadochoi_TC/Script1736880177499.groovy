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

WebUI.navigateToUrl('https://kidsland.vn/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('GioHang/GioHang_Xoadochoi/Page_Cha thy Website  chi tr em no nhiu  nh_d805e3/img_sp'), 
    0)

WebUI.click(findTestObject('Object Repository/GioHang/GioHang_Xoadochoi/Page_Cha thy Website  chi tr em no nhiu  nh_d805e3/img_sp'))

WebUI.click(findTestObject('Object Repository/GioHang/GioHang_Xoadochoi/Page_B  chi Tomica Town Gas Station ENEOS  _d86e62/button_Thm vo gi'))

WebUI.click(findTestObject('Object Repository/GioHang/GioHang_Xoadochoi/Page_B  chi Tomica Town Gas Station ENEOS  _d86e62/i_Thanh ton_lni lni-close'))

WebUI.click(findTestObject('Object Repository/GioHang/GioHang_Xoadochoi/Page_B  chi Tomica Town Gas Station ENEOS  _d86e62/i_onl sale_lni lni-shopping-basket'))

WebUI.click(findTestObject('Object Repository/GioHang/GioHang_Xoadochoi/Page_B  chi Tomica Town Gas Station ENEOS  _d86e62/i__lni lni-close'))

WebUI.verifyTextPresent('Giỏ hàng trống, vào đây tiếp tục mua sắm.', false)

WebUI.closeBrowser()


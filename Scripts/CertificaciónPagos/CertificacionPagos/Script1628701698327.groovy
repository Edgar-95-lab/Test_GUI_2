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

CustomKeywords.'com.metodos.ImplementacionGUI.LoginPuebla'()

WebUI.click(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/a_Certificacin de Pagos'))

WebUI.click(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/a_Certificacion de Pagos'))

WebUI.setText(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/input_ID del vehculo_form-control valid'), 
    '7704302')

WebUI.setText(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/input_Ao del pago_form-control valid'), 
    '2020')

WebUI.click(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/button_Consultar'))

WebUI.delay(3)

WebUI.click(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/button_Limpiar'))

println('Al hacer clic en el botón limpiar muestra este componente en lugar del resultado esperado...')

WebUI.verifyElementNotInViewport(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/span_Almacn'), 
    0)

CustomKeywords.'com.metodos.ImplementacionGUI.refreshBrowser'()

WebUI.delay(3)

WebUI.click(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/a_Certificacin de Pagos'))

WebUI.click(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/a_Certificacion de Pagos'))

WebUI.setText(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/input_ID del vehculo_form-control valid'), 
    '7704302')

WebUI.setText(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/input_Ao del pago_form-control valid'), 
    '2021')

WebUI.click(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/button_Consultar'))

println('Se esperaba algún resultado o cuadro de diálogo mostrando el error...')

WebUI.verifyElementInViewport(findTestObject('Repo_CertificaciónPagos/Page_Sistema de Control Vehicular/div_Descripcin de la Cuenta'), 
    0)


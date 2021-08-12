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

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/a_Cobros'))

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/a_Cobro de Fotoinfracciones'))

WebUI.setText(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/input_Placa_vchPlacaConsulta'), 'TYH9191')

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(3)

println('Muestra el mensaje: No se encontraron resultados, sin embargo se muestra información por detrás...')

WebUI.verifyElementNotInViewport(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/div_Datos del Vehculo'), 
    0)

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/Page_Sistema de Control Vehicular/button_CONTINUAR'))

WebUI.setText(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/input_Placa_vchPlacaConsulta'), 'SK41024')

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(3)

println('Muestra el mensaje: No se encontraron resultados, sin embargo se muestra información por detrás...')

WebUI.verifyElementNotInViewport(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/div_Datos del Vehculo'), 
    0)

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/Page_Sistema de Control Vehicular/button_CONTINUAR'))

WebUI.setText(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/Page_Sistema de Control Vehicular/input_Folio Infraccion_iFolioInfraccion'), 
    '10420220')

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(3)

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/Page_Sistema de Control Vehicular/button_Limpiar'))

WebUI.setText(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/input_Placa_vchPlacaConsulta'), 'TYH9191')

WebUI.click(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/button_Buscar'))

WebUI.delay(3)

println('Muestra el mensaje: No se encontraron resultados, sin embargo se muestra información por detrás...')

WebUI.verifyElementNotInViewport(findTestObject('Repo_Cobros/Page_Sistema de Control Vehicular/Page_Sistema de Control Vehicular/div_Datos de infraccionesSeleccionar Todo'), 
    0)


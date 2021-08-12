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

WebUI.click(findTestObject('Repo_MovimientosTécnicos/Page_Sistema de Control Vehicular/a_Movimientos Tcnicos'))

WebUI.click(findTestObject('Repo_MovimientosTécnicos/Page_Sistema de Control Vehicular/a_Etiquetamientos'))

WebUI.click(findTestObject('Repo_MovimientosTécnicos/Page_Sistema de Control Vehicular/a_Claves Especiales'))

WebUI.setText(findTestObject('Repo_MovimientosTécnicos/Page_Sistema de Control Vehicular/input_Control del Vehculo_ControlVehiculo'), 
    '45784200')

WebUI.click(findTestObject('Repo_MovimientosTécnicos/Page_Sistema de Control Vehicular/button_Consultar'))

WebUI.delay(5)

println('El campo: Número de Operación, se encuentra vacío...')

WebUI.verifyElementNotInViewport(findTestObject('Repo_MovimientosTécnicos/Page_Sistema de Control Vehicular/button_Limpiar'), 
    0)


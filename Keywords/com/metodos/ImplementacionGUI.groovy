package com.metodos
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

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

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class ImplementacionGUI {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Verifica que el texto en el elemento no se encuentre vacío 
	 * @param to Katalon test object
	 */
	@Keyword
	def Element_Text(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			
			if(to.toString().trim().equals('')) {
				KeywordUtil.markFailed('El campo: ' + to + ' Se encuentra vacío')
			}else {
				KeywordUtil.markPassed('Contenido del objeto: ' + element.toString())
				KeywordUtil.markPassed("Elemento verificado con éxito")
			}
			
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
		

		
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * Método para el logeo en Local
	 */
	@Keyword
	public void Login() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://localhost:44379/')

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/a_Ingresar'))

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputUsuario'), 'PRACTICANTES123')

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputPass'), 'practicantes123.')

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/button_Entrar'))

		WebUI.verifyElementInViewport(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/a_Sistema'), 0)
	}

	/**
	 * Método para el logeo en Pueblatest
	 */
	@Keyword
	public void LoginPuebla() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://scvpueblatest.intecproof.com/')

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/a_Ingresar'))

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputUsuario'), 'PRUEBASCV7')

		WebUI.setText(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/input_Ingresar_inputPass'), 'PRUEBASCV123*')

		WebUI.click(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/button_Entrar'))

		WebUI.verifyElementInViewport(findTestObject('Repo_Login/Page_Sistema de Control Vehicular/a_Sistema'), 0)
	}
}
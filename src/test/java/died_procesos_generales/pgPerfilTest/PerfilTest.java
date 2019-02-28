package died_procesos_generales.pgPerfilTest;

import objectDriver.OpenPages;
import io.qameta.allure.*;
import objectDriver.Constans;
import tests.BaseTest;
import died_procesos_generales.pgForgotPassPage.ForgotPassPage;
import died_procesos_generales.pgLoginPage.LoginPage;
import died_procesos_generales.pgPerfilPage.PerfilPage;
import utils.excelutils.ExcelUtil;
import utils.extentreports.ExtentTestManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Perfil Tests")

public class PerfilTest extends BaseTest {
	
	Constans obj  = new Constans();


	@BeforeTest
	public void setupTestData() throws Exception {
		
	  System.out.println("************ Setup Test Level Data ******************");
	  ExcelUtil.setExcelFileSheet("Perfil");	
	}
	
	@Test (priority=0)
	
	public void PerfilCaseTest01()throws Exception {

	//extentreports Description
	ExtentTestManager.getTest().setDescription("Modificando Campos Obligatorios");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  PerfilPage  PerfilPage   =   new   PerfilPage(driver, wait);
		  ForgotPassPage ForgotPassPage = new ForgotPassPage(driver,wait);
		  
		  
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  LoginPage.loginToUsually(ExcelUtil.getRowData(1));
		  Thread.sleep(500);
		  PerfilPage.ModPassword(ExcelUtil.getRowData(1));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(1,6));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(1,7));
		  Thread.sleep(1000);
		  LoginPage.loginToNewPass(ExcelUtil.getRowData(1));
		  Thread.sleep(500);
		  PerfilPage.ModEmail(ExcelUtil.getRowData(1));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(1,9));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(1,10));
		  Thread.sleep(500);
		  OpenPage.goToYopmail();
		  Thread.sleep(1000);
		  PerfilPage.ConfirmaModEmail(ExcelUtil.getRowData(1));
		  Thread.sleep(1000);
		  PerfilPage.ModCell(ExcelUtil.getRowData(1));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(1,13));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(1,14));
		  PerfilPage.ConfirmaModCell();
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(1,15));
		  Thread.sleep(500);
		 // LoginPage.loginToClose();	 
		  ExcelUtil.setRowNumber(1);
		  //Set Test Status Column number to 
		  ExcelUtil.setColumnNumber(43);
    }
	
	@Test (priority=1)
	
	public void PerfilCaseTest02()throws Exception {

	//extentreports Description
	ExtentTestManager.getTest().setDescription("Agregar  campos opcionales del perfil de usuario");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  PerfilPage  PerfilPage   =   new   PerfilPage(driver, wait);
		  ForgotPassPage ForgotPassPage = new ForgotPassPage(driver,wait);
		  
		  
		  OpenPage.goToN12();
		  Thread.sleep(500);
		//  LoginPage.loginToUsually(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  PerfilPage.AgrTelf(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(2,9));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(2,10));
		  Thread.sleep(1000);
		  PerfilPage.AgrDirec(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(2,23));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(2,24));
		  Thread.sleep(1000);
		  PerfilPage.AgrCelAlt(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(2,29));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(2,30));
		  Thread.sleep(1000);
		  PerfilPage.AgrEmailAlt(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(2,32));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(2,33));
		  Thread.sleep(1000);
		  PerfilPage.AgrContRef(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(2,35));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(2,36));
		  Thread.sleep(1000);

		//  LoginPage.loginToClose();	 
		  ExcelUtil.setRowNumber(2);
		  //Set Test Status Column number to 
		  ExcelUtil.setColumnNumber(43);
    }
	
	
	@Test (priority=2)
	
	public void PerfilCaseTest03()throws Exception {

	//extentreports Description
	ExtentTestManager.getTest().setDescription("Modificar  campos opcionales del perfil de usuario");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  PerfilPage  PerfilPage   =   new   PerfilPage(driver, wait);
		  ForgotPassPage ForgotPassPage = new ForgotPassPage(driver,wait);
		  
		  
		  OpenPage.goToN12();
		  Thread.sleep(500);
		//  LoginPage.loginToUsually(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  PerfilPage.ModTelf(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(3,9));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(3,10));
		  Thread.sleep(1000);
		  PerfilPage.ModDirec(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(3,23));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(3,24));
		  Thread.sleep(1000);
		  PerfilPage.ModCelAlt(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(3,29));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(3,30));
		  Thread.sleep(1000);
		  PerfilPage.ModEmailAlt(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(3,32));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(3,33));
		  Thread.sleep(1000);
		  PerfilPage.ModContRef(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(3,35));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(3,36));
		  Thread.sleep(1000);

		 // LoginPage.loginToClose();	 
		  ExcelUtil.setRowNumber(3);
		  //Set Test Status Column number to 
		  ExcelUtil.setColumnNumber(43);
    }
	

	@Test (priority=3)
	
	public void PerfilCaseTest04()throws Exception {

	//extentreports Description
	ExtentTestManager.getTest().setDescription("Eliminar  campos opcionales del perfil de usuario");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  PerfilPage  PerfilPage   =   new   PerfilPage(driver, wait);
		  ForgotPassPage ForgotPassPage = new ForgotPassPage(driver,wait);
		  
		  
		  OpenPage.goToN12();
		  Thread.sleep(500);
		//  LoginPage.loginToUsually(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  PerfilPage.DelTelf(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(4,9));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(4,10));
		  Thread.sleep(1000);
		  PerfilPage.DelDirec(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(4,23));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(4,24));
		  Thread.sleep(1000);
		  PerfilPage.DelCelAlt(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(4,29));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(4,30));
		  Thread.sleep(1000);
		  PerfilPage.DelEmailAlt(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(4,32));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(4,33));
		  Thread.sleep(1000);
		  PerfilPage.DelContRef(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage01(ExcelUtil.getCellData(4,35));
		  Thread.sleep(500);
		  PerfilPage.verifyMessage02(ExcelUtil.getCellData(4,36));
		  Thread.sleep(1000);

		 // LoginPage.loginToClose();	 
		  ExcelUtil.setRowNumber(4);
		  //Set Test Status Column number to 
		  ExcelUtil.setColumnNumber(43);
    }
	
	
	
}

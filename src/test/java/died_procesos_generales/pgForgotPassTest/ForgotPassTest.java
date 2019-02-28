package died_procesos_generales.pgForgotPassTest;

import objectDriver.OpenPages;
import io.qameta.allure.*;
import objectDriver.Constans;
import tests.BaseTest;
import died_procesos_generales.pgForgotPassPage.ForgotPassPage;
import died_procesos_generales.pgLoginPage.LoginPage;
import utils.excelutils.ExcelUtil;
import utils.extentreports.ExtentTestManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Forgot Tests")

public class ForgotPassTest extends BaseTest {
	
	Constans obj  = new Constans();


	@BeforeTest
	public void setupTestData() throws Exception {
		
	  System.out.println("************ Setup Test Level Data ******************");
	  ExcelUtil.setExcelFileSheet("OlvidoContraseña");	
	}
	
	/* ===========================================PAGINA PRINCIPAL======================================== */
	
	@Test (priority=0)
	
	public void ForgotPassCaseTest01()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario recupera con Email");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
      LoginPage LoginPage = new LoginPage (driver,wait);
	  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
	 
	  OpenPage.goToN12();
	  Thread.sleep(500);
	  ForgotPassPage.ForgotPassEmail(ExcelUtil.getRowData(2));
	  Thread.sleep(500);
	  // Verifique el mensaje 
	  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(2,7));
	  Thread.sleep(500);
	  OpenPage.goToYopmail();
	  Thread.sleep(500);
	  ForgotPassPage.ConfirmaEmail(ExcelUtil.getRowData(2));
	  // Verifique el mensaje 
	  Thread.sleep(1000);
	  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(2,8));
	  Thread.sleep(500);
	  OpenPage.goToN12();
	  LoginPage.loginToUsually(ExcelUtil.getRowData(2));
	  Thread.sleep(500);
	  ForgotPassPage.verifyMessage02(ExcelUtil.getCellData(2,11));
	  LoginPage.loginToClose();
	  ExcelUtil.setRowNumber(2);
	  //Set Test Status Column number to 9
	  ExcelUtil.setColumnNumber(9);
	  

	
	}
	
   @Test (priority=1)
	
	public void ForgotPassCaseTest02()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario recupera con Mensaje de Texto");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
      LoginPage LoginPage = new LoginPage (driver,wait);
	  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
	 
	  OpenPage.goToN12();
	  Thread.sleep(500);
	  ForgotPassPage.ForgotPassCel(ExcelUtil.getRowData(3));
	  Thread.sleep(500);
	  // Verifique el mensaje 
	  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(3,7));
	  Thread.sleep(500);
	  ForgotPassPage.ConfirmaSms(ExcelUtil.getRowData(3));
	  // Verifique el mensaje 
	  Thread.sleep(1000);
	  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(3,8));
	  Thread.sleep(500);
	  OpenPage.goToN12();
	  LoginPage.loginToUsually(ExcelUtil.getRowData(2));
	  Thread.sleep(500);
	  ForgotPassPage.verifyMessage02(ExcelUtil.getCellData(3,11));
	  LoginPage.loginToClose();
	  ExcelUtil.setRowNumber(3);
	  //Set Test Status Column number to 9
	  ExcelUtil.setColumnNumber(9);
	 	
	} 
	
	
	   @Test (priority=2)
		
		public void ForgotPassCaseTest03()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("No se envia Documento de identidad");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  // documento vacio
		  ForgotPassPage.SendNull02(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage03(ExcelUtil.getCellData(4,5));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(4);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	   @Test (priority=3)
		
		public void ForgotPassCaseTest04()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("No se envia Captcha");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
          OpenPage.goToN12();
		  Thread.sleep(500);
		  // captcha vacio
		  ForgotPassPage.SendNull01(ExcelUtil.getRowData(5));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage04(ExcelUtil.getCellData(5,6));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(5);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	
	   
	   @Test (priority=4)
		
		public void ForgotPassCaseTest05()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription(" No se envia Documento de indentidad ni Captcha");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
          OpenPage.goToN12();
		  Thread.sleep(500);
		  // documento y captcha vacios
		  ForgotPassPage.SendNull01(ExcelUtil.getRowData(6));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage03(ExcelUtil.getCellData(6,5));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage04(ExcelUtil.getCellData(6,6));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(6);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	
	   @Test (priority=5)
		
		public void ForgotPassCaseTest06()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Usuario con menos de 8 digitos");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.SendNull02(ExcelUtil.getRowData(7));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage03(ExcelUtil.getCellData(7,5));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(7);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	   @Test (priority=6)
		
		public void ForgotPassCaseTest07()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Usuario No registrado");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.SendNull02(ExcelUtil.getRowData(8));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(8,7));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(8);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	   @Test (priority=7)
		
		public void ForgotPassCaseTest08()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Captcha Incorrecto");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.Send03(ExcelUtil.getRowData(9));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(9,7));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(9);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	   @Test (priority=8)
		
		public void ForgotPassCaseTest09()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Usuario Sin Email");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.Send04(ExcelUtil.getRowData(10));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(10,8));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(10);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	   @Test (priority=9)
		
		public void ForgotPassCaseTest10()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Usuario Sin Celular");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.Send05(ExcelUtil.getRowData(11));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(11,8));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(11);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	   
	   @Test (priority=10)
		
		public void ForgotPassCaseTest11()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Usuario con Email invalido");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.ForgotPassEmail(ExcelUtil.getRowData(12));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(12,8));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(12);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	   @Test (priority=11)
		
		public void ForgotPassCaseTest12()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Usuario con Celular invalido");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.Send05(ExcelUtil.getRowData(13));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(13,8));
		  Thread.sleep(500);
		  ExcelUtil.setRowNumber(13);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);
		 	
		} 
	   
	
	
	

}

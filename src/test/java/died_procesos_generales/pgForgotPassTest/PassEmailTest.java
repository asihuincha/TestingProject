package died_procesos_generales.pgForgotPassTest;

import objectDriver.OpenPages;
import io.qameta.allure.*;
import objectDriver.Constans;
import tests.BaseTest;
import died_procesos_generales.pgForgotPassPage.ForgotPassPage;
import died_procesos_generales.pgForgotPassPage.PassEmailPage;
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

public class PassEmailTest extends BaseTest {

	Constans obj  = new Constans();


	@BeforeTest
	public void setupTestData() throws Exception {
		
	  System.out.println("************ Setup Test Level Data ******************");
	  ExcelUtil.setExcelFileSheet("OlvidoContraseñaEmail");	
	}
	
	
	
	/* ===========================PAGINA RESTABLECER CONTRASEÑA POR EMAIL=============================== */	
	

	   @Test (priority=0)
		
		public void EmailPassCaseTest01()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription(" contraseña igual a la ultima por Email");	
		  
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
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(2,8));
		  ExcelUtil.setRowNumber(2);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);

		 	
		} 
	   
		
	   @Test (priority=1)
		public void EmailPassCaseTest02()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription(" contraseña solo letras por Email");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.ResPassEmail(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(3,8));
		  ExcelUtil.setRowNumber(3);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);

		} 
		
		
	   @Test (priority=2)
		public void EmailPassCaseTest03()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("contraseña solo numeros por Email");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.ResPassEmail(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(4,8));
		  ExcelUtil.setRowNumber(4);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);

		} 
		
		
	   @Test (priority=3)
		public void EmailPassCaseTest04()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("contraseña menor a 8 digitos por Email");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.ResPassEmail(ExcelUtil.getRowData(5));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(5,8));
		  ExcelUtil.setRowNumber(5);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);	 

		} 
	   
		
	   @Test (priority=4)
		public void EmailPassCaseTest05()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("No se envia contraseña Nueva");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.NuResPassEmail(ExcelUtil.getRowData(6));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(6,8));
		  ExcelUtil.setRowNumber(6);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);	 

		}
	   
	   
	   @Test (priority=5)
		public void EmailPassCaseTest06()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("No se envia Confirmacion de  contraseña Nueva");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.CoResPassEmail(ExcelUtil.getRowData(7));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(7,8));
		  ExcelUtil.setRowNumber(7);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);	 

		}
	
	   @Test (priority=6)
		public void EmailPassCaseTest07()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Captcha incorrecto");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.CapInPassEmail(ExcelUtil.getRowData(8));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(8,8));
		  ExcelUtil.setRowNumber(8);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);	 

		}
	   
	   
	   @Test (priority=7)
		public void EmailPassCaseTest08()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Contraseña es diferente a confirmar contraseña");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.CoResPassEmail(ExcelUtil.getRowData(9));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(9,8));
		  ExcelUtil.setRowNumber(9);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);	 

		}
	   
	   
	   
	   @Test (priority=8)
		public void EmailPassCaseTest09()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Captcha No enviado");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassEmailPage  PassEmailPage = new PassEmailPage(driver, wait);
		 
		  Thread.sleep(500);
		  PassEmailPage.CapNullPassEmail(ExcelUtil.getRowData(10));
		  Thread.sleep(1500);
		  PassEmailPage.verifyMessage05(ExcelUtil.getCellData(10,6));
		  Thread.sleep(1500);
		  ExcelUtil.setRowNumber(10);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);	 

		}

		/*
	   @Test (priority=0)
		public void EmailPassCaseTest05()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Link caducado por Email");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	      LoginPage LoginPage = new LoginPage (driver,wait);
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToYopmail();
		  Thread.sleep(500);
		  ForgotPassPage.ResPassEmailLink(ExcelUtil.getRowData(26));
		  Thread.sleep(500);
		  ForgotPassPage.verifyMessage05(ExcelUtil.getCellData(26,11));
		  ExcelUtil.setRowNumber(26);
		  //Set Test Status Column number to 8
		  ExcelUtil.setColumnNumber(9);	

		} */
	
	
	
	
	
	
	
	
}

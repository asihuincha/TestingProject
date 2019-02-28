package died_procesos_generales.pgForgotPassTest;

import objectDriver.OpenPages;
import io.qameta.allure.*;
import objectDriver.Constans;
import tests.BaseTest;
import died_procesos_generales.pgForgotPassPage.ForgotPassPage;
import died_procesos_generales.pgForgotPassPage.PassCellPage;
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


public class PassSmsTest extends BaseTest{
	
  
	Constans obj  = new Constans();


	@BeforeTest
	public void setupTestData() throws Exception {
		
	  System.out.println("************ Setup Test Level Data ******************");
	  ExcelUtil.setExcelFileSheet("OlvidoContraseñaSMS");	
	}
	
	
	
	/* ===========================PAGINA RESTABLECER CONTRASEÑA POR SMS=============================== */	
	

	   @Test (priority=0)
		
		public void SmsPassCaseTest01()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription(" contraseña igual a la ultima por Sms");	
		  
	      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait); 	
		 
		  OpenPage.goToN12();
		  Thread.sleep(500);
		  ForgotPassPage.ForgotPassCel(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(2,7));
		  Thread.sleep(500);
		  ForgotPassPage.ConfirmaSms(ExcelUtil.getRowData(2));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(2,8));
		  ExcelUtil.setRowNumber(38);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		 	
		} 
	   
	   
		
	   @Test (priority=1)
		public void SmsPassCaseTest02()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription(" contraseña solo letras por Sms");	
		  
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.ConfSmsPass(ExcelUtil.getRowData(3));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(3,8));
		  ExcelUtil.setRowNumber(3);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		

		} 
		
		
	   @Test (priority=2)
		public void SmsPassCaseTest03()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("contraseña solo numeros por Sms");	
		  
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.ConfSmsPass(ExcelUtil.getRowData(4));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(4,8));
		  ExcelUtil.setRowNumber(4);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		
		} 
		
		
	   @Test (priority=3)
		public void SmsPassCaseTest04()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("contraseña menor a 8 digitos por Sms");	
		  
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.ConfSmsPass(ExcelUtil.getRowData(5));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(5,8));
		  ExcelUtil.setRowNumber(5);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		
		} 
	   
		
	   @Test (priority=4)
		public void SmsPassCaseTest05()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Las contraseñas ingresadas deben ser idénticas.");	
		  
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.DifSmsPass(ExcelUtil.getRowData(6));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(6,8));
		  ExcelUtil.setRowNumber(6);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		

		}
	   
	   
	   @Test (priority=5)
		public void SmsPassCaseTest06()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("No se envia la contraseña");	
		  
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.ConfSmsPass(ExcelUtil.getRowData(7));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(7,8));
		  ExcelUtil.setRowNumber(7);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		
		}
	
	   @Test (priority=6)
		public void SmsPassCaseTest07()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("No se envia la confirmacion de la contraseña");	
		  
		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.NoCofSmsPass(ExcelUtil.getRowData(8));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(8,8));
		  ExcelUtil.setRowNumber(44);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(8);		

		}
	   
	   @Test (priority=7)
		public void SmsPassCaseTest10()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Se envia contraseña con cararcteres raros");	
		  

		  ForgotPassPage  ForgotPassPage   =   new   ForgotPassPage(driver, wait);
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.ConfSmsPass(ExcelUtil.getRowData(11));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  ForgotPassPage.verifyMessage01(ExcelUtil.getCellData(11,8));
		  ExcelUtil.setRowNumber(11);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		

		}
	   
	   
	   @Test (priority=8)
		public void SmsPassCaseTest08()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("No se envia codigo de validacion");	
		  
		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.NoSendCodVal(ExcelUtil.getRowData(9));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  PassCellPage.verifyMessage06(ExcelUtil.getCellData(9,5));
		  ExcelUtil.setRowNumber(9);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		

		}
	   
	   @Test (priority=9)
		public void SmsPassCaseTest09()throws Exception {	
			
		//extentreports Description
	    ExtentTestManager.getTest().setDescription("Se envia codigo de validacion menor a 6 digitos");	
		  

		  PassCellPage PassCellPage  = new PassCellPage(driver, wait);
		  
		 
		  PassCellPage.SendCodValSix(ExcelUtil.getRowData(10));
		  Thread.sleep(500);
		  // Verifique el mensaje 
		  PassCellPage.verifyMessage06(ExcelUtil.getCellData(10,5));
		  ExcelUtil.setRowNumber(10);
		  //Set Test Status Column number to 9
		  ExcelUtil.setColumnNumber(9);		

		}
	   


}

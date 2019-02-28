package died_proceso_nombramiento.nomInscripcion.object_test;

import objectDriver.OpenPages;
import io.qameta.allure.*;
import objectDriver.Constans;
import tests.BaseTest;
import utils.excelutils.ExcelUtil;
import utils.extentreports.ExtentTestManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import died_proceso_nombramiento.nomInscripcion.objectpages.NomLoginPage;
import utils.listeners.TestListener;


@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")
public   class   NomLoginTest   extends   BaseTest   { 
	
	Constans obj  = new Constans();


	@BeforeTest
	public void setupTestData() throws Exception {
		
	  System.out.println("************ Setup Test Level Data ******************");
	  ExcelUtil.setExcelFileSheet("NombramientoData");	
	}
    
	
	
	
	@Test (priority=0)
	
	public void logInToTheSessionCaseTest01()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario y contraseña vacios");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  NomLoginPage  LoginPage   =   new   NomLoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN11();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(2));
     Thread.sleep(500);
     ExcelUtil.setRowNumber(2);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(8);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario y contraseña
     LoginPage.verifyLoginUserName(ExcelUtil.getCellData(2,4));
     Thread.sleep(500);
     LoginPage.verifyLoginPassword(ExcelUtil.getCellData(2,5));
	}
	
	
	
	
	
	@Test (priority=1)
	
	public void logInToTheSessionCaseTest02()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario menor a 8 digitos");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  NomLoginPage  LoginPage   =   new   NomLoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN11();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(3));
     Thread.sleep(500);
     //Set test row number to 2
     ExcelUtil.setRowNumber(3);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(8);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario
     LoginPage.verifyLoginUserName(ExcelUtil.getCellData(3,4));
	}
	
	
	
	@Test (priority=2)
	
	public void logInToTheSessionCaseTest03()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Captcha vacio");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  NomLoginPage  LoginPage   =   new   NomLoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN11();
     Thread.sleep(500);
     LoginPage.loginToCaptchaNull(ExcelUtil.getRowData(4));
     Thread.sleep(500);
     ExcelUtil.setRowNumber(4);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(8);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario
     LoginPage.verifyLoginCaptcha(ExcelUtil.getCellData(4,6));
	}
	
	
	
	@Test (priority=3)
	
	public void logInToTheSessionCaseTest04()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario No registrado");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  NomLoginPage  LoginPage   =   new   NomLoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN11();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(5));
     ExcelUtil.setRowNumber(5);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(8);
    
     //*************ASSERTIONS***********************
     // Verifique el mensaje 5,7
     LoginPage.verifyLoginButton(ExcelUtil.getCellData(5,7));
   //  LoginPage.verifyLoginButton( obj.Ms);
	}
	
	
	@Test (priority=4)
	
	public void logInToTheSessionCaseTest05()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario y/o contraseña incorrectos");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  NomLoginPage  LoginPage   =   new   NomLoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN11();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(6));
     ExcelUtil.setRowNumber(6);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(8);
    
     //*************ASSERTIONS***********************
     // Verifique el mensaje 6,7
     LoginPage.verifyLoginButton(ExcelUtil.getCellData(6,7));
   //  LoginPage.verifyLoginButton( obj.Ms);
	}
	
	@Test (priority=5)
	
	public void logInToTheSessionCaseTest06()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario y contraseña correctos");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  NomLoginPage  LoginPage   =   new   NomLoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN11();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(7));
     Thread.sleep(500);
     ExcelUtil.setRowNumber(7);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(8);
	}
	
	
   
} 
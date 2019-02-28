package died_procesos_generales.pgLoginTest;


import objectDriver.OpenPages;
import io.qameta.allure.*;
import objectDriver.Constans;
import tests.BaseTest;
import died_procesos_generales.pgLoginPage.LoginPage;
import utils.excelutils.ExcelUtil;
import utils.extentreports.ExtentTestManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.listeners.TestListener;


@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")
public   class   LoginTest   extends   BaseTest   { 
	
	Constans obj  = new Constans();


	@BeforeTest
	public void setupTestData() throws Exception {
		
	  System.out.println("************ Setup Test Level Data ******************");
	  ExcelUtil.setExcelFileSheet("Login");	
	}
    
	
	
	
	@Test (priority=0)
	
	public void logInToTheSessionCaseTest01()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Envio vacio todos los campos");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(1500);
     LoginPage.loginToCaptchaNull(ExcelUtil.getRowData(1));
     Thread.sleep(1500);
     ExcelUtil.setRowNumber(1);
     //Set Test Status Column number to 9
     ExcelUtil.setColumnNumber(9);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario y contraseña
     LoginPage.verifyLoginUserName(ExcelUtil.getCellData(1,5));
     Thread.sleep(500);
     LoginPage.verifyLoginPassword(ExcelUtil.getCellData(1,6));
     Thread.sleep(500);
     LoginPage.verifyLoginCaptcha(ExcelUtil.getCellData(1,7));
	}
	
	
	@Test (priority=1)
	
	public void logInToTheSessionCaseTest02()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Envio vacio el usuario");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(1500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(2));
     Thread.sleep(1500);
     ExcelUtil.setRowNumber(2);
     //Set Test Status Column number to 9
     ExcelUtil.setColumnNumber(9);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario y contraseña
     LoginPage.verifyLoginUserName(ExcelUtil.getCellData(2,5));
	}
	
	
	
	@Test (priority=2)
	
	public void logInToTheSessionCaseTest03()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Envio vacio la contraseña");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(1500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(3));
     Thread.sleep(1500);
     ExcelUtil.setRowNumber(3);
     //Set Test Status Column number to 9
     ExcelUtil.setColumnNumber(9);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario y contraseña
     LoginPage.verifyLoginPassword(ExcelUtil.getCellData(3,6));
	}
	
	
	@Test (priority=3)
	
	public void logInToTheSessionCaseTest04()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Envio vacio el Captcha");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(500);
     LoginPage.loginToCaptchaNull(ExcelUtil.getRowData(4));
     Thread.sleep(500);
     ExcelUtil.setRowNumber(4);
     //Set Test Status Column number to 9
     ExcelUtil.setColumnNumber(9);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario
     LoginPage.verifyLoginCaptcha(ExcelUtil.getCellData(4,7));
	}
	
	
	
	
	
	
	
	
	@Test (priority=4)
	
	public void logInToTheSessionCaseTest05()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario menor a 8 digitos");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(5));
     Thread.sleep(500);
     ExcelUtil.setRowNumber(5);
     //Set Test Status Column number to 9
     ExcelUtil.setColumnNumber(9);
    
     //*************ASSERTIONS***********************
     Thread.sleep(500);
     // Verifique el mensaje de usuario
     LoginPage.verifyLoginUserName(ExcelUtil.getCellData(5,5));
	}
	
	
	

	
	
	@Test (priority=5)
	
	public void logInToTheSessionCaseTest06()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario No registrado");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(6));
     ExcelUtil.setRowNumber(6);
     //Set Test Status Column number to 9
     ExcelUtil.setColumnNumber(9);
    
     //*************ASSERTIONS***********************
     // Verifique el mensaje 
     LoginPage.verifyLoginButton(ExcelUtil.getCellData(6,8));
   //  LoginPage.verifyLoginButton( obj.Ms);
	}
	
	
	@Test (priority=6)
	
	public void logInToTheSessionCaseTest07()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario y/o contraseña incorrectos");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(7));
     ExcelUtil.setRowNumber(7);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(9);
    
     //*************ASSERTIONS***********************
     // Verifique el mensaje 6,7
     LoginPage.verifyLoginButton(ExcelUtil.getCellData(7,8));
	}
	
	@Test (priority=7)
	
	public void logInToTheSessionCaseTest08()throws Exception {	
		
	//extentreports Description
    ExtentTestManager.getTest().setDescription("Usuario y contraseña correctos");	
	  
      OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
	  LoginPage  LoginPage   =   new   LoginPage ( driver , wait ) ; 	
		

     OpenPage.goToN12();
     Thread.sleep(500);
     LoginPage.loginToUsually(ExcelUtil.getRowData(8));
     Thread.sleep(500);
     ExcelUtil.setRowNumber(8);
     //Set Test Status Column number to 8
     ExcelUtil.setColumnNumber(9);
	}
	
	
   
} 
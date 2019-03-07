package died_procesos_generales.pgPerfilTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import died_procesos_generales.pgLoginPage.LoginPage;
import died_procesos_generales.pgPerfilPage.PassPerfilPage;
import died_procesos_generales.pgPerfilPage.PerfilPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import objectDriver.OpenPages;
import tests.BaseTest;
import utils.excelutils.ExcelUtil;
import utils.extentreports.ExtentTestManager;
import utils.listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Perfil Pass Tests")


public class PassPerfilTest extends BaseTest  {
	int SaltoLinea=0; //Para salto de linea
	@BeforeTest
	public void setupTestData() throws Exception {
		
	  System.out.println("************ Setup Test Level Data ******************");
	  ExcelUtil.setExcelFileSheet("PerfilPass");	
	}
	
	@Test (priority=0)	
	public void PerfilPassCaseTest01()throws Exception {
		ExtentTestManager.getTest().setDescription("Cambio contraseña perfil: Ok");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		LoginPage login = new LoginPage( driver , wait ) ;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		SaltoLinea=1;
		OpenPage.goToN12();
		login.loginToUsually(ExcelUtil.getRowData(SaltoLinea));
		Thread.sleep(500);
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));
		Thread.sleep(500);
		perfil.verifyMessage01(ExcelUtil.getCellData(SaltoLinea,7));
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,8));
		Thread.sleep(500);
		login.loginToNewPass(ExcelUtil.getRowData(SaltoLinea));	
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);		
	}
	
	@Test (priority=1)	
	public void PerfilPassCaseTest02()throws Exception {
		ExtentTestManager.getTest().setDescription("Cambio contraseña perfil: Solo letras");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		SaltoLinea=2;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;	
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));
		Thread.sleep(500);
		perfil.verifyMessage01(ExcelUtil.getCellData(SaltoLinea,7));
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,8));
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	@Test (priority=2)	
	public void PerfilPassCaseTest03()throws Exception {
		ExtentTestManager.getTest().setDescription("Cambio contraseña perfil: Solo números");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		PerfilPage perfil = new PerfilPage(driver , wait ) ;
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		 SaltoLinea=3;
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));
		Thread.sleep(500);
		perfil.verifyMessage01(ExcelUtil.getCellData(SaltoLinea,7));
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,8));
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	@Test (priority=3)	
	public void PerfilPassCaseTest04()throws Exception {
		ExtentTestManager.getTest().setDescription("Cambio contraseña perfil: Caracteres menor a 8");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		 SaltoLinea=4;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;

		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,7));		
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	@Test (priority=4)	
	public void PerfilPassCaseTest05()throws Exception {
		ExtentTestManager.getTest().setDescription("Cambio contraseña igual a la anterior");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		 SaltoLinea=5;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;	
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));
		Thread.sleep(500);
		perfil.verifyMessage01(ExcelUtil.getCellData(SaltoLinea,7));
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,8));
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	@Test (priority=5)	
	public void PerfilPassCaseTest06()throws Exception {
		ExtentTestManager.getTest().setDescription("Cambio contraseña igual al DNI");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		 SaltoLinea=6;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));		
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,7));
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	@Test (priority=6)	
	public void PerfilPassCaseTest07()throws Exception {
		ExtentTestManager.getTest().setDescription("Validación de contraseña actual vacia");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		 SaltoLinea=7;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;	
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));		
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,7));		
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	@Test (priority=7)	
	public void PerfilPassCaseTest08()throws Exception {
		ExtentTestManager.getTest().setDescription("Validación de nueva contraseña vacia");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		 SaltoLinea=8;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;	
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));		
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,7));		
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	@Test (priority=8)	
	public void PerfilPassCaseTest09()throws Exception {
		ExtentTestManager.getTest().setDescription("Validación de repetición nueva contraseña");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ; 
		 SaltoLinea=9;
		PerfilPage perfil = new PerfilPage(driver , wait ) ;	
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));		
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,7));		
		Thread.sleep(500);
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	
	@Test (priority=9)	
	public void PerfilPassCaseTest10()throws Exception {
		ExtentTestManager.getTest().setDescription("Cambio contraseña perfil: Ok");	
		OpenPages  OpenPage   =   new   OpenPages ( driver , wait ) ;
		SaltoLinea=10;		
		PerfilPage perfil = new PerfilPage(driver , wait ) ;	
		PassPerfilPage passperfil = new PassPerfilPage(driver , wait ) ; // pagina perfil
		OpenPage.goToN12();
		passperfil.ModPassword(ExcelUtil.getRowData(SaltoLinea));
		Thread.sleep(500);
		perfil.verifyMessage01(ExcelUtil.getCellData(SaltoLinea,7));
		Thread.sleep(500);
		perfil.verifyMessage02(ExcelUtil.getCellData(SaltoLinea,8));
		Thread.sleep(500);	
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);		
	}
	
	
	
	public void PrintExcelEstado(int SaltoLinea) throws Exception {
		ExcelUtil.setRowNumber(SaltoLinea);	//Set Test Status Column number to 
		ExcelUtil.setColumnNumber(12);
	}
	
	
	

}

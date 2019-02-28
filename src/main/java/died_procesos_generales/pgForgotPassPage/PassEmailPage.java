package died_procesos_generales.pgForgotPassPage;

import   io.qameta.allure.Step;

import java.util.ArrayList;

import   org.apache.poi.xssf.usermodel.XSSFRow;
import   org.testng.Assert;
import   org.openqa.selenium.By;
import   org.openqa.selenium.By.ByXPath;
import   org.openqa.selenium.WebDriver;
import   org.openqa.selenium.support.ui.WebDriverWait;
import   objectDriver.BasePages;
import   objectDriver.Constans;


public class PassEmailPage extends BasePages {

	public PassEmailPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	 //*********Web Elements********* 
	
	String   openLink = "//*[@id=\"usuario_sec_frm_login\"]/div[3]/label[2]/b/a"; // ingreso al link
	String   usernameId = "//*[@id=\"dni\"]"; //usuario //*[@id="dni"]  #dni 
	String   optionEmail = "//*[@id=\"frm_recuperar\"]/div/div[3]/div/div[1]/label/input"; // opcion de correo 
	String   captcha = "//*[@id=\"captcha_recuperar\"]"; 
	String   btnAceptar = "//*[@id=\"btn_solicita_recuperacion\"]"; 
	String   btnAtras01 = "//*[@id=\"frm_recuperar\"]/div/div[7]/b/a";
	String   btnEnviar = "//*[@id=\"enviar_solicitud\"]";
	String   messageAlert = "/html/body/div[4]/div/div/div[2]/div";
	String   btnAceptarAlert = "/html/body/div[4]/div/div/div[3]/button";
	String   refresh = "//input[@value = 'Revisa el correo']"; 
	String   linkEmail = "//*[@id=\"mailmillieu\"]/div[2]/p/a"; 
	String   passNuevoEmail = "//*[@id=\"form_password\"]";  
	String   passNuevoCoEmail = "//*[@id=\"form_repeat_password\"]";
	String   captchaCambiarEmail = "//*[@id=\"captcha_cambiar\"]"; 
	String   btnGuardarEmail = "//*[@id=\"enviar_cambio\"]"; 
	String   iframeYopmail = "ifmail";
	String   errorMensCap = "//*[@id=\"captcha_cambiar-error\"]";
	String   msjExpiro = "/html/body/div[3]/div/div/div[2]/div[2]/p";
	String   nameEmail = "login";
 
	

	
	

	
	@Step("metodo de Pagina Restablecer contraseña por Email")  
    
    public   void  ResPassEmail  (XSSFRow row) throws InterruptedException { 
		
	Constans obj = new Constans();
    		
		writeText(By.xpath(passNuevoEmail), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoEmail), row.getCell(4).toString());
        writeText(By.xpath(captchaCambiarEmail),obj.Ca);
        click(By.xpath(btnGuardarEmail));

	}
	
	@Step("metodo de Pagina Restablecer contraseña por Email - Captcha incorrecto")  
    
    public   void  CapInPassEmail  (XSSFRow row) throws InterruptedException { 
		
	Constans obj = new Constans();
    		
		writeText(By.xpath(passNuevoEmail), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoEmail), row.getCell(4).toString());
        writeText(By.xpath(captchaCambiarEmail),obj.CaI);
        click(By.xpath(btnGuardarEmail));

	}
	
	@Step("metodo de Pagina Restablecer contraseña por Email - Captcha vacio")  
    
    public   void  CapNullPassEmail  (XSSFRow row) throws InterruptedException { 
		
	Constans obj = new Constans();
    		
		writeText(By.xpath(passNuevoEmail), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoEmail), row.getCell(4).toString());
        writeText(By.xpath(captchaCambiarEmail),obj.CaV);
        click(By.xpath(btnGuardarEmail));

	}
	
	@Step("metodo de Pagina Restablecer contraseña por Email - No envia confirmacion")  
    
    public   void  CoResPassEmail  (XSSFRow row) throws InterruptedException { 
		
	Constans obj = new Constans();
    		
		writeText(By.xpath(passNuevoEmail),obj.PassVal );
		writeText(By.xpath(passNuevoCoEmail), row.getCell(4).toString());
        writeText(By.xpath(captchaCambiarEmail),obj.Ca);
        click(By.xpath(btnGuardarEmail));

	}
	
	
	@Step("Pagina Restablecer contraseña por Email - No se envia contraseña nueva")  
    
    public   void  NuResPassEmail  (XSSFRow row) throws InterruptedException { 
		
	Constans obj = new Constans();
    		
		writeText(By.xpath(passNuevoEmail), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoEmail),obj.PassVal);
        writeText(By.xpath(captchaCambiarEmail),obj.Ca);
        click(By.xpath(btnGuardarEmail));

	}
	
	
	
	
	
	@Step("metodo de Pagina Restablecer contraseña por Email Link expirado")  
    
    public   void  ResPassEmailLink  (XSSFRow row) throws InterruptedException { 
		
	Constans obj = new Constans();
    		
    	
		writeText(By.name(nameEmail), row.getCell(10).toString());
		click(By.xpath(refresh));
		Thread . sleep ( 500 ) ;
		driver.switchTo (). frame (iframeYopmail);
		Thread . sleep ( 500 ) ;
		String oldTab = driver.getWindowHandle(); 
		click(By.xpath(linkEmail));
		ArrayList<String> newTab = new ArrayList<String> (driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0)); 
	    Thread . sleep ( 500 ) ;
	}
	
	

    
    
    //Verify mensaje
    @Step("Verify username: {0} step...")   
    public void verifyMessage05 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(errorMensCap)).trim(), expectedUserNameMessage.trim());
    }
 
    
    
    
    
	
}

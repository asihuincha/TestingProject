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

public class PassCellPage extends BasePages{
	
	public PassCellPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	
	 //*********Web Elements********* 
	
	String   openLink = "//*[@id=\"usuario_sec_frm_login\"]/div[3]/label[2]/b/a"; // ingreso al link
	String   usernameId = "//*[@id=\"dni\"]"; //usuario //*[@id="dni"]  #dni 
	String   optionCel = "//*[@id=\"frm_recuperar\"]/div/div[3]/div/div[2]/label/input"; // opcion sms a celular //*[@id="frm_recuperar"]/div/div[3]/div/div[1]/label/input
	String   captcha = "//*[@id=\"captcha_recuperar\"]"; 
	String   btnAceptar = "//*[@id=\"btn_solicita_recuperacion\"]"; 
	String   btnAtras01 = "//*[@id=\"frm_recuperar\"]/div/div[7]/b/a";
	String   btnEnviar = "//*[@id=\"enviar_solicitud\"]";
	String   btnAtras02 = "//*//*[@id=\"frm_enviar_solicitud\"]/div[6]/a"; 
	String   codValSms = "//*[@id=\"frm_codigo\"]";
	String   passNuevoSms = "//*[@id=\"frm_clave\"]";
	String   passNuevoCoSms = "//*[@id=\"frm_clave_c\"]";
	String   btnGuardarSms = "//*[@id=\"btn_token_clave\"]";
	String   errorMensCap = "//*[@id=\"captcha_cambiar-error\"]";
	String   msjCodError = "//*[@id=\"frm_codigo-error\"]";
	String   CheckMos = "//*[@id=\"cb_mostrar_contrasenias_op_celular\"]";

	
   
	
	@Step("metodo para validar las contraseñas")  
    
    public   void   ConfSmsPass (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
        writeText(By.xpath(codValSms),obj.CodValI);
		writeText(By.xpath(passNuevoSms), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoSms), row.getCell(4).toString());
		click(By.xpath(CheckMos));
        click(By.xpath(btnGuardarSms));	
	}
	
	
	@Step("metodo No se envia confirmacion de contraseña")  
    
    public   void   NoCofSmsPass (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
        writeText(By.xpath(codValSms),obj.CodValI);
		writeText(By.xpath(passNuevoSms), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoSms), obj.PassNull);
		click(By.xpath(CheckMos));
        click(By.xpath(btnGuardarSms));
	}
	
	
	@Step("metodo de  contraseñas diferentes")  
    
    public   void  DifSmsPass (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
        writeText(By.xpath(codValSms),obj.CodValI);
		writeText(By.xpath(passNuevoSms), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoSms), obj.PassVal);
		click(By.xpath(CheckMos));
        click(By.xpath(btnGuardarSms));
	}
	
	@Step("metodo que no envia Codigo de validacion")  
    
    public   void   NoSendCodVal (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
        writeText(By.xpath(codValSms),obj.CodValN);
		writeText(By.xpath(passNuevoSms), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoSms), row.getCell(4).toString());
		click(By.xpath(CheckMos));
        click(By.xpath(btnGuardarSms));
	}
	
	
	@Step("metodo que envia Codigo de validacion menor a 6 digitos")  
    
    public   void   SendCodValSix (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
        writeText(By.xpath(codValSms),obj.CodValIv);
		writeText(By.xpath(passNuevoSms), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoSms), row.getCell(4).toString());
		click(By.xpath(CheckMos));
        click(By.xpath(btnGuardarSms));
	}
	
	
    //Verify mensaje
    @Step("Verify username: {0} step...")   
    public void verifyMessage06 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(msjCodError)).trim(), expectedUserNameMessage.trim());
    }

	


}

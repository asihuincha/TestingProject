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


public class ForgotPassPage extends BasePages {

	public ForgotPassPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	 //*********Web Elements********* 
	
	String   openLink = "//*[@id=\"usuario_sec_frm_login\"]/div[3]/label[2]/b/a"; // ingreso al link
	String   usernameId = "//*[@id=\"dni\"]"; //usuario //*[@id="dni"]  #dni 
	String   optionEmail = "//*[@id=\"frm_recuperar\"]/div/div[3]/div/div[1]/label/input"; // opcion de correo 
	String   optionCel = "//*[@id=\"frm_recuperar\"]/div/div[3]/div/div[2]/label/input"; // opcion sms a celular //*[@id="frm_recuperar"]/div/div[3]/div/div[1]/label/input
	String   captcha = "//*[@id=\"captcha_recuperar\"]"; 
	String   btnAceptar = "//*[@id=\"btn_solicita_recuperacion\"]"; 
	String   btnAtras01 = "//*[@id=\"frm_recuperar\"]/div/div[7]/b/a";
	String   errorMassageUsername = "//*[@id=\"dni-error\"]"; 
	String   errorMassageCaptcha = "//*[@id=\"captcha_recuperar-error\"]"; 
	String   btnEnviar = "//*[@id=\"enviar_solicitud\"]";
	String   btnAtras02 = "//*//*[@id=\"frm_enviar_solicitud\"]/div[6]/a"; 
	String   messageAlert = "/html/body/div[4]/div/div/div[2]/div";
	String   btnAceptarAlert = "/html/body/div[4]/div/div/div[3]/button";
	String   nameEmail = "login";
	String   refresh = "//input[@value = 'Revisa el correo']"; 
	String   linkEmail = "//*[@id=\"mailmillieu\"]/div[2]/p/a"; 
	String   passNuevoEmail = "//*[@id=\"form_password\"]";  
	String   passNuevoCoEmail = "//*[@id=\"form_repeat_password\"]";
	String   captchaCambiarEmail = "//*[@id=\"captcha_cambiar\"]"; 
	String   btnGuardarEmail = "//*[@id=\"enviar_cambio\"]"; 
	String   iframeYopmail = "ifmail";
	String   msjWelcome = "//*[@id=\"div_datos\"]/div/div"; 
	String   codValSms = "//*[@id=\"frm_codigo\"]";
	String   passNuevoSms = "//*[@id=\"frm_clave\"]";
	String   passNuevoCoSms = "//*[@id=\"frm_clave_c\"]";
	String   btnGuardarSms = "//*[@id=\"btn_token_clave\"]";
	String   errorMensCap = "//*[@id=\"captcha_cambiar-error\"]";
	String   msjExpiro = "/html/body/div[3]/div/div/div[2]/div[2]/p";
 
	
    
	
	@Step("metodo de recuperar contraseña con email")  
        
    public   void   ForgotPassEmail (XSSFRow row ) throws InterruptedException { 
    	
    	Constans obj = new Constans();
    	
    	click(By.xpath(openLink));
    	Thread.sleep (500);
        //Enter Username       
    	writeText(By.xpath(usernameId),row.getCell(3).toString());
    	//Enter Option correo electronico
    	Thread.sleep (500);
    	click(By.xpath(optionEmail));
        //Enter Captcha 
    	Thread.sleep (500);
        writeText(By.xpath(captcha),obj.Ca);
        //Click  Button aceptar
        Thread.sleep (500);
        click(By.xpath(btnAceptar));
        Thread.sleep(500);
        // Click en Enviar
        click(By.xpath(btnEnviar));
     
    } 
	
	@Step("metodo de recuperar contraseña con celular")  
    
    public   void   ForgotPassCel (XSSFRow row ) throws InterruptedException { 
    	
    	Constans obj = new Constans();
    	
    	click(By.xpath(openLink));
    	Thread.sleep (500);
        //Enter Username       
    	writeText(By.xpath(usernameId),row.getCell(3).toString());
    	//Enter Option mensaje de texto
    	Thread.sleep (500);
    	click(By.xpath(optionCel));
        //Enter Captcha 
    	Thread.sleep (500);
        writeText(By.xpath(captcha),obj.Ca);
        //Click  Button aceptar
        Thread.sleep (500);
        click(By.xpath(btnAceptar));
        Thread.sleep(500);
        // Click en Enviar
        click(By.xpath(btnEnviar));  
    } 
	

    
	@Step("metodo para recuperar Password por email")  
    
    public   void   ConfirmaEmail (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	
    	
		writeText(By.name(nameEmail), row.getCell(10).toString());
		click(By.xpath(refresh));
		Thread . sleep ( 500 ) ;
		/*try {
	        Thread.sleep (20000);
	        for(String winHandle: driver.getWindowHandles() ) {	
	        driver.switchTo().window(winHandle);	
	        }
	     } catch (InterruptedException e) {
	        e.printStackTrace ();
	     }*/
		
		driver.switchTo (). frame (iframeYopmail);
		Thread . sleep ( 500 ) ;
		String oldTab = driver.getWindowHandle(); 
		click(By.xpath(linkEmail));
		ArrayList<String> newTab = new ArrayList<String> (driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0)); 
	    Thread . sleep ( 500 ) ;
		writeText(By.xpath(passNuevoEmail), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoEmail), row.getCell(4).toString());
        writeText(By.xpath(captchaCambiarEmail),obj.Ca);
        click(By.xpath(btnGuardarEmail));
		
	}
	
	@Step("metodo para ingresar codigo de SMS")  
    
    public   void   ConfirmaSms (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	  
        try {
	        Thread.sleep (30000);
	     } catch (InterruptedException e) {
	        e.printStackTrace ();
	     }
        
		writeText(By.xpath(passNuevoSms), row.getCell(4).toString());
		writeText(By.xpath(passNuevoCoSms), row.getCell(4).toString());
        click(By.xpath(btnGuardarSms));
		
	}

	@Step("metodo para validar el envio de vacio (captcha vacio")  
    
    public   void   SendNull01 (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	click(By.xpath(openLink));
		writeText(By.xpath(usernameId), row.getCell(3).toString());
		writeText(By.xpath(captcha), obj.CaV);
        Thread.sleep (500);
        click(By.xpath(btnAceptar));
        Thread.sleep (500);

	}
	
	@Step("metodo para validar el envio de vacio (captcha no vacio")  
    
    public   void   SendNull02 (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	click(By.xpath(openLink));
		writeText(By.xpath(usernameId), row.getCell(3).toString());
		writeText(By.xpath(captcha), obj.Ca);
    	//Enter Option mensaje de texto
        Thread.sleep (500);
        click(By.xpath(btnAceptar));
        Thread.sleep (500);

	}	
	
	@Step("Captcha Incorrecto")  
    
    public   void   Send03 (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	click(By.xpath(openLink));
		writeText(By.xpath(usernameId), row.getCell(3).toString());
		writeText(By.xpath(captcha), obj.CaI);
        Thread.sleep (500);
        click(By.xpath(btnAceptar));
        Thread.sleep (500);

	}	
	
	@Step("metodo para usuarios Sin Email")  
    
    public   void   Send04 (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	click(By.xpath(openLink));
		writeText(By.xpath(usernameId), row.getCell(3).toString());
		writeText(By.xpath(captcha), obj.Ca);
    	//Enter Option mensaje de texto
    	Thread.sleep (500);
        click(By.xpath(btnAceptar));
        Thread.sleep (500);

	}
	
	@Step("metodo para usuarios Sin Celular")  
    
    public   void   Send05 (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	click(By.xpath(openLink));
		writeText(By.xpath(usernameId), row.getCell(3).toString());
		writeText(By.xpath(captcha), obj.Ca);
    	//Enter Option mensaje de texto
    	Thread.sleep (500);
    	click(By.xpath(optionCel));
        Thread.sleep (500);
        click(By.xpath(btnAceptar));
        Thread.sleep (500);

	}
	
	
    //Verify Username Condition
    @Step("Verify username: {0} step...")    
    public void verifyMessage01 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(messageAlert)).trim(), expectedUserNameMessage.trim());	
        click(By.xpath(btnAceptarAlert));
    }
    
    //Verify Username Condition
    @Step("Verify username: {0} step...")   
    public void verifyMessage02 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(msjWelcome)).trim(), expectedUserNameMessage.trim());
    }
    
    //Verify Username Condition
    @Step("Verify username: {0} step...")   
    public void verifyMessage03 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(errorMassageUsername)).trim(), expectedUserNameMessage.trim());
    }
    
    //Verify Captcha Condition
    @Step("Verify username: {0} step...")   
    public void verifyMessage04 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(errorMassageCaptcha)).trim(), expectedUserNameMessage.trim());
    }

	
}

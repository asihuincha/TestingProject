package died_procesos_generales.pgLoginPage;

import   io.qameta.allure.Step;
import   org.apache.poi.xssf.usermodel.XSSFRow;
import   org.testng.Assert;
import   org.openqa.selenium.By;
import   org.openqa.selenium.By.ByXPath;
import   org.openqa.selenium.WebDriver;
import   org.openqa.selenium.support.ui.WebDriverWait;
import   objectDriver.BasePages;
import   objectDriver.Constans;

public class LoginPage extends   BasePages {



    //*********Constructor********* 
    public   LoginPage ( WebDriver  driver ,   WebDriverWait  wait )   { 
        super ( driver ,   wait ) ; 
    } 

    //*********Web Elements********* 
    String   usenameId   =   "usuario_sec_documento" ; //usuario 
    String   passwordId   =   "usuario_sec_password" ; //contraseña  
    String   loginButtonId   =   "usuario_sec_login" ; //boton ingresar 
    String   capchat = "usuario_sec_captcha_login"; // captcha
    String   errorMessageUsernameXpath_antes   =   "//*[@id=\"usuario_sec_documento-error\"]" ; //*[@id="usuario_sec_documento-error"]
    String   errorMessagePasswordXpath_antes   =   "//*[@id=\"usuario_sec_password-error\"]" ; // //*[@id="usuario_sec_password-error"]
    String   errorMessageCaptcha = "//*[@id=\"usuario_sec_captcha_login-error\"]"; //*[@id="usuario_sec_captcha_login-error"]
    String   errorMessageButton = "//*[@id=\"usuario_sec_frm_login\"]/div[6]";  //*[@id="usuario_sec_frm_login"]/div[6]
    String   errorMessage  =  "//*[@id=\"usuario_sec_frm_login\"]/div[3]"; 
    String   close = "btn_cerrar_sesion";
    String   Oplista = "//*[@id=\"modal_comite_lista\"]/div/div/div[2]/table/tbody/tr[1]/td[5]/button"; // //*[@id=\"modal_comite_lista\"]/div/div/div[2]/table/tbody/tr/td[6]/button

    

    //*********Page Methods********* 
    
    @Step("Login Step with username: {0}, password: {1}, for method: {method} step...")  
    
    // contraseña actual
    public   void   loginToUsually (XSSFRow row ) { 
    	
    	Constans obj = new Constans();
        //Enter Username       
    	writeText(By.id(usenameId), row.getCell(3).toString());
        //Enter Password 
        writeText(By.id(passwordId), row.getCell(4).toString()); 
        writeText(By.id(capchat), obj.Ca);
        //Click Login Button 
        click ( By . id ( loginButtonId ) ) ;
        
    } 
    
    // contraseña nueva
    public   void   loginToNewPass (XSSFRow row ) { 
    	
    	Constans obj = new Constans();
        //Enter Username       
    	writeText(By.id(usenameId), row.getCell(3).toString());
        //Enter Password 
        writeText(By.id(passwordId), row.getCell(5).toString()); 
        writeText(By.id(capchat), obj.Ca);
        //Click Login Button 
        click ( By . id ( loginButtonId ) ) ;
        
    } 
    
    
    public   void   loginToCaptchaNull (XSSFRow row ) { 
    	
    	Constans obj = new Constans();
        //Enter Username       
    	writeText(By.id(usenameId), row.getCell(3).toString());
        //Enter Password 
        writeText(By.id(passwordId), row.getCell(4).toString()); 
        writeText(By.id(capchat), obj.CaV);
        //Click Login Button 
        click ( By . id ( loginButtonId ) ) ;
        
    } 
    
    public   void   loginToCapchat   (XSSFRow row) { 
        //Enter Username 
        writeText ( By.id ( usenameId ),row.getCell(3).toString()) ; 
        //Enter Password 
        writeText ( By.id ( passwordId ),row.getCell(4).toString()) ; 
        try {
	        Thread.sleep (10000);
	     } catch (InterruptedException e) {
	        e.printStackTrace ();
	     }
        click ( By . id ( loginButtonId ) ) ;    
    } 
    
    
    public   void   loginToPopup  ( XSSFRow row) { 
    	
    	Constans obj = new Constans();
    	
        //Enter Username 
        writeText ( By.id ( usenameId ),row.getCell(3).toString() ) ; 
        //Enter Password 
        writeText ( By.id ( usenameId ),row.getCell(4).toString() ) ; 
        writeText(By.id(capchat), obj.CaV);
        //Click Login Button 
        click ( By . id ( loginButtonId ) ) ;     
       try {
	        Thread.sleep (1000);
	     } catch (InterruptedException e) {
	        e.printStackTrace ();
	     }
        click (By.xpath(Oplista));  
    } 

    
    
    //Verify Username Condition
    @Step("Verify username: {0} step...")    
    public void verifyLoginUserName (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath_antes)), expectedUserNameMessage);
    }

    //Verify Password Condition
    @Step("Verify verifyLoginPassword: {0} step...")
    public void verifyLoginPassword (String expectedPasswordMessage) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath_antes)), expectedPasswordMessage);
    }
    
    //Verify Captcha Condition
    @Step("Verify username: {0} step...")    
    public void verifyLoginCaptcha (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(errorMessageCaptcha)), expectedUserNameMessage);
    }
    
    
    //Verify Message Button Condition
    @Step("Verify username: {0} step...")    
    public void verifyLoginButton (String expectedUserNameMessage) {
      //   Assert.assertEquals(readText(By.xpath(errorMessageButton)), expectedUserNameMessage);
    	  Assert.assertEquals(readText(By.xpath(errorMessageButton)).substring(2), expectedUserNameMessage);
    } 
    
    public   void   loginToClose () { 
    	
    	Constans obj = new Constans();
    	
        //Click Login Button 
        click ( By . id ( close ) ) ;   
    } 
    


} 
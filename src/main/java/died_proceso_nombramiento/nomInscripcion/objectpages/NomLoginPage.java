package died_proceso_nombramiento.nomInscripcion.objectpages;


import   io.qameta.allure.Step;
import   org.apache.poi.xssf.usermodel.XSSFRow;
import   org.testng.Assert;
import   org.openqa.selenium.By;
import   org.openqa.selenium.By.ByXPath;
import   org.openqa.selenium.WebDriver;
import   org.openqa.selenium.support.ui.WebDriverWait;
import   objectDriver.BasePages;
import   objectDriver.Constans;

public class NomLoginPage extends   BasePages {



    //*********Constructor********* 
    public   NomLoginPage ( WebDriver  driver ,   WebDriverWait  wait )   { 
        super ( driver ,   wait ) ; 
    } 

    //*********Web Elements********* 
    String   usenameId   =   "usuario_sec_documento" ; //usuario 
    String   passwordId   =   "usuario_sec_password" ; //contraseña 
    String   loginButtonId   =   "usuario_sec_login" ; //boton ingresar 
    String   capchat = "usuario_sec_captcha_login"; // captcha
    String   errorMessageUsernameXpath_antes   =   "//*[@id=\"usuario_sec_documento-error\"]" ; // mensaje error usuario //*[@id=\"usuario_sec_frm_login\"]/div[1]/div/label
    String   errorMessagePasswordXpath_antes   =   "//*[@id=\"usuario_sec_password-error\"]" ; // mensaje error contraseña //*[@id=\"usuario_sec_frm_login\"]/div[2]/div/label
    String   errorMessageCaptcha = "//*[@id=\"usuario_sec_captcha_login-error\"]";
    String   errorMessageButton = "//*[@id=\"usuario_sec_frm_login\"]/div[9]";  
    String   errorMessage  =  "//*[@id=\"usuario_sec_frm_login\"]/div[3]"; 
    String   close = "//*[@id=\"btn_cerrar_sesion\"]";
    String   Oplista = "//*[@id=\"modal_comite_lista\"]/div/div/div[2]/table/tbody/tr[1]/td[5]/button"; // //*[@id=\"modal_comite_lista\"]/div/div/div[2]/table/tbody/tr/td[6]/button

    

    //*********Page Methods********* 
    
    @Step("Login Step with username: {0}, password: {1}, for method: {method} step...")  
    public   void   loginToUsually (XSSFRow row ) { 
    	
    	Constans obj = new Constans();
        //Enter Username       
    	writeText(By.id(usenameId), row.getCell(2).toString());
        //Enter Password 
        writeText(By.id(passwordId), row.getCell(3).toString()); 
        writeText(By.id(capchat), obj.Ca);
        //Click Login Button 
        click ( By . id ( loginButtonId ) ) ;
        
    } 
    
    public   void   loginToCaptchaNull (XSSFRow row ) { 
    	
    	Constans obj = new Constans();
        //Enter Username       
    	writeText(By.id(usenameId), row.getCell(2).toString());
        //Enter Password 
        writeText(By.id(passwordId), row.getCell(3).toString()); 
        writeText(By.id(capchat), obj.CaV);
        //Click Login Button 
        click ( By . id ( loginButtonId ) ) ;
        
    } 
    
    public   void   loginToCapchat   ( String   username ,   String   password) { 
        //Enter Username 
        writeText ( By.id ( usenameId ),username) ; 
        //Enter Password 
        writeText ( By.id ( passwordId ),password) ; 
        try {
	        Thread.sleep (10000);
	     } catch (InterruptedException e) {
	        e.printStackTrace ();
	     }
        click ( By . id ( loginButtonId ) ) ;    
    } 
    
    
    public   void   loginToPopup  ( String   username ,   String   password, String Capchat ) { 
        //Enter Username 
        writeText ( By . id ( usenameId ) , username ) ; 
        //Enter Password 
        writeText ( By . id ( passwordId ) ,   password ) ; 
        writeText(By.id(capchat), Capchat);
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
    


} 
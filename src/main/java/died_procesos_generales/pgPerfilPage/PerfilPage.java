package died_procesos_generales.pgPerfilPage;

import   io.qameta.allure.Step;

import java.util.ArrayList;

import   org.apache.poi.xssf.usermodel.XSSFRow;
import   org.testng.Assert;
import org.testng.annotations.BeforeTest;
import   org.openqa.selenium.By;
import   org.openqa.selenium.By.ByXPath;
import   org.openqa.selenium.WebDriver;
import   org.openqa.selenium.support.ui.WebDriverWait;
import   objectDriver.BasePages;
import   objectDriver.Constans;


public class PerfilPage extends BasePages {

    //*********Constructor********* 
	public PerfilPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}
	
    //*********Web Elements********* 
	String MnuPerfil = "//*[@id=\"mnuPerfilUsuario\"]";
	String BtnCerraSesion = "//*[@id=\"btn_cerrar_sesion\"]";
	String MsjValid = "/html/body/div[4]/div/div/div[2]/div";  
	String BtnMsjAceptar = "/html/body/div[4]/div/div/div[3]/button";
	String BtnMsjNo = "/html/body/div[7]/div/div/div[3]/button[1]";
	String BtnMsjSi = "html/body/div[4]/div/div/div[3]/button[2]";
	String openLink = "//*[@id=\"usuario_sec_frm_login\"]/div[3]/label[2]/b/a"; 
	String nameEmail = "login";
	String refresh = "//input[@value = 'Revisa el correo']"; 
	String linkEmail = "//*[@id=\"mailmillieu\"]/div[2]/p/a";
	String iframeYopmail = "ifmail";
	
	//*********Web Elementos de campos obligatorios ********* 
	// Contraseña
	String BtnCotMod = "//*[@id=\"perfil_btn_cambiar_contrasena\"]";
	String TxtCotOld = "//*[@id=\"perfil_pass_clave_old\"]";
	String TxtCotNva = "//*[@id=\"perfil_pass_nueva_clave\"]";
	String TextCotnvaCof = "//*[@id=\"perfil_pass_nueva_clave_confir\"]";
	String CheMuestra = "//*[@id=\"cb_mostrar_contrasenias\"]";
	String BtnCotCancel = "//*[@id=\"perfil_row_pass_cancelar\"]"; 
	String BtnCotSave = "//*[@id=\"perfil_row_pass_guardar\"]";
	// Email
	String BtnEmailMod = "//*[@id=\"perfil_btn_cambiar_correo\"]";
	String TxtEmail = "//*[@id=\"div_row_cambio_correo\"]/div[2]/div[1]/div/div[2]/label";
	String TxtEmailNva = "//*[@id=\"perfil_correo_nuevo\"]";
	String TxtEmailNvaCof = "//*[@id=\"perfil_correo_nuevo_confir\"]";
	String BtnEmailSave = "//*[@id=\"perfil_row_correo_guardar\"]";
	String BtnEmailCancel = "//*[@id=\"perfil_row_correo_cancelar\"]";
	String BtnAtras = "/html/body/div[3]/div/div[2]/div[2]/div[2]/p[2]/a/b"; 
	String MsjConfirma = "/html/body/div[3]/div/div[2]/div[2]/div[2]/p[1]";
	// Celular
	String BtnCelMod = "//*[@id=\"perfil_btn_cambiar_celular\"]"; 
	String TxtCel = "//*[@id=\"perfil_celular_old\"]";
	String TxtCelNva = "//*[@id=\"perfil_celular_nuevo\"]";
	String TxtCodVal = "//*[@id=\"perfil_codigo_valcel\"]";
	String BtnCelSave = "//*[@id=\"perfil_row_celular_guardar\"]";
	String BtnCelCancel = "//*[@id=\"perfil_row_celular_cancelar\"]";
	String BtnCelConfi = "//*[@id=\"perfil_row_celular_confirmar\"]";
	
	
	
	//*********Web Elementos de campos Opcionales ********* 
	
	// Telefono fijo
	String BtnTelfAgr = "//*[@id=\"perfil_btn_cambiar_telefono\"]";
	String CobCodCity = "//*[@id=\"perfil_lista_codigo_ciudad\"]";
	String TxtNumTelf = "//*[@id=\"perfil_telefono_nuevo\"]";
	String BtnTelfSave = "//*[@id=\"perfil_row_telefono_guardar\"]";
	String BtnTelfMod = "//*[@id=\"perfil_btn_cambiar_telefono\"]";
	String BtnTelfDelet = "//*[@id=\"perfil_btn_eliminar_telefono\"]";
	// Direccion
	String BtnDirAgr = "//*[@id=\"perfil_btn_cambiar_direccion\"]";
	String CobDepart = "//*[@id=\"perfil_lista_departamento\"]";
	String CobProv = "//*[@id=\"perfil_lista_provincia\"]";
	String CobDist = "//*[@id=\"perfil_lista_distrito\"]";
	String TxtDir = "//*[@id=\"perfil_direccion_nuevo\"]";
	String TxtRef = "//*[@id=\"perfil_referencia_nuevo\"]";
	String BtnDirSave = "//*[@id=\"perfil_row_direccion_guardar\"]";
	String BtnDirMod = "//*[@id=\"perfil_btn_cambiar_direccion\"]";
	String BtnDirDelet = "//*[@id=\"perfil_btn_eliminar_direccion\"]";
	// Numero de celular alternativo
	String BtnCelAltAgr = "//*[@id=\"perfil_btn_cambiar_celular_alternativo\"]";
	String TxtCelAlt = "//*[@id=\"perfil_celular_alternativo_nuevo\"]";
	String BtnCelAltSave = "//*[@id=\"perfil_row_celular_alternativo_guardar\"]";
	String BtnCelAltMod = "//*[@id=\"perfil_btn_cambiar_celular_alternativo\"]";
	String BtnCelAltDelet = "//*[@id=\"perfil_btn_eliminar_celular_alternativo\"]";
	// Otro correo electronico
	String BtnEmailAltAgr = "//*[@id=\"perfil_btn_cambiar_correo_alternativo\"]";
	String TxtEmailAlt = "//*[@id=\"perfil_correo_alternativo_nuevo\"]";
	String BtnEmailAltSave = "//*[@id=\"perfil_row_correo_alternativo_guardar\"]";
	String BtnEmailAltMod = "//*[@id=\"perfil_btn_cambiar_correo_alternativo\"]";
	String BtnEmailAltDelet = "//*[@id=\"perfil_btn_eliminar_correo_alternativo\"]";
	// Contacto de referencia
	String BtnContRefAgr = "//*[@id=\"perfil_btn_cambiar_contacto_referencia\"]";
	String TxtNameContRef = "//*[@id=\"perfil_nombre_referencia_nuevo\"]";
	String TxtCelContRef = "//*[@id=\"perfil_celular_referencia_nuevo\"]";
	String TxtTelfContRef = "//*[@id=\"perfil_telefono_referencia_nuevo\"]";
	String CobCodCityContRef = "//*[@id=\"perfil_lista_codigo_ciudad_referencia\"]";
	String BtnContRefSave = "//*[@id=\"perfil_row_contacto_referencia_guardar\"]";
	String BtnContRefMod = "//*[@id=\"perfil_btn_cambiar_contacto_referencia\"]";
	String BtnContRefDelet = "//*[@id=\"perfil_btn_eliminar_contacto_referencia\"]";
	
	
	
	
	
	
	@Step("metodo que modifica Contraseña")  
    
    public   void   ModPassword (XSSFRow row ) throws InterruptedException { 
    	
    	
		click(By.xpath(MnuPerfil));
    	Thread.sleep (500);
		click(By.xpath(BtnCotMod));
    	Thread.sleep (500);     
    	writeText(By.xpath(TxtCotOld),row.getCell(4).toString());
    	writeText(By.xpath(TxtCotNva),row.getCell(5).toString());
    	writeText(By.xpath(TextCotnvaCof),row.getCell(5).toString());
    	click(By.xpath(CheMuestra));
    	click(By.xpath(BtnCotSave));
    } 
	
	@Step("metodo que modifica Email")  
    
    public   void   ModEmail (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(MnuPerfil));
    	Thread.sleep (500);
		click(By.xpath(BtnEmailMod));
    	Thread.sleep (500);     
    	writeText(By.xpath(TxtEmailNva),row.getCell(8).toString());
    	writeText(By.xpath(TxtEmailNvaCof),row.getCell(8).toString());
    	click(By.xpath(BtnEmailSave));
    } 
	
	
	@Step("metodo que modifica Celular")  
    
    public   void   ModCell (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(MnuPerfil));
    	Thread.sleep (1000);
		click(By.xpath(BtnCelMod));
    	Thread.sleep (500);     
    	writeText(By.xpath(TxtCelNva),row.getCell(12).toString());
    	click(By.xpath(BtnCelSave));
    } 
	
	
	@Step("metodo para confirmar el cambio del email")  
    
    public   void   ConfirmaModEmail (XSSFRow row) throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	
    	
		writeText(By.name(nameEmail), row.getCell(8).toString());
		click(By.xpath(refresh));
		Thread . sleep ( 1000 ) ;
		/*try {
	        Thread.sleep (20000);
	        for(String winHandle: driver.getWindowHandles() ) {	
	        driver.switchTo().window(winHandle);	
	        }
	     } catch (InterruptedException e) {
	        e.printStackTrace ();
	     }*/
		driver.switchTo (). frame (iframeYopmail);
		Thread . sleep ( 1000 ) ;
		String oldTab = driver.getWindowHandle(); 
		click(By.xpath(linkEmail));
		ArrayList<String> newTab = new ArrayList<String> (driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0)); 
	    Thread . sleep (1500) ;
	    Assert.assertEquals(readText(By.xpath(MsjConfirma)).trim(), row.getCell(11).toString().trim());
	    Thread . sleep (1000 ) ;
	    click(By.xpath(BtnAtras));
	   		
	}
	
	
	@Step("metodo para confirmar el cambio del celular")  
    
    public   void   ConfirmaModCell() throws InterruptedException { 
		
    	Constans obj = new Constans();
    	
    	
    	try {
	        Thread.sleep (20000);
	     } catch (InterruptedException e) {
	        e.printStackTrace ();
	     }
	    Thread . sleep ( 500 ) ;
	    click(By.xpath(BtnCelConfi));
	}
	
	
	
	
	@Step("metodo para Agregar Telefono Fijo")  
    
    public   void   AgrTelf (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(MnuPerfil));
    	Thread.sleep (500);
		click(By.xpath(BtnTelfAgr));
		Thread.sleep (500);
		SelectText(By.xpath(CobCodCity), row.getCell(5).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtNumTelf),row.getCell(8).toString());
		Thread.sleep (500);
		click(By.xpath(BtnTelfSave));
    } 
	
	
	@Step("metodo para Agregar Direccion")  
    
    public   void   AgrDirec (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnDirAgr));
		Thread.sleep (500);
		SelectText(By.xpath(CobDepart), row.getCell(12).toString());
		Thread.sleep (500);
		SelectText(By.xpath(CobProv), row.getCell(16).toString());
		Thread.sleep (500);
		SelectText(By.xpath(CobDist), row.getCell(19).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtDir),row.getCell(22).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtRef),row.getCell(25).toString());
		Thread.sleep (500);
		click(By.xpath(BtnDirSave));
    } 

	
	
	@Step("metodo para Agregar Numero de Celular Alternativo")  
    
    public   void   AgrCelAlt (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnCelAltAgr));
		Thread.sleep (500);
		writeText(By.xpath(TxtCelAlt),row.getCell(28).toString());
		Thread.sleep (500);
		click(By.xpath(BtnCelAltSave));
    } 
	

	@Step("metodo para Agregar Email Alternativo")  
    
    public   void   AgrEmailAlt (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnEmailAltAgr));
		Thread.sleep (500);
		writeText(By.xpath(TxtEmailAlt),row.getCell(31).toString());
		Thread.sleep (500);
		click(By.xpath(BtnEmailAltSave));
    } 
	
	

	
	@Step("metodo para Agregar Contacto Referencial")  
    
    public   void   AgrContRef (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnContRefAgr));
		Thread.sleep (500);
		writeText(By.xpath(TxtNameContRef),row.getCell(34).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtCelContRef),row.getCell(37).toString());
		Thread.sleep (500);
		SelectText(By.xpath(CobCodCityContRef), row.getCell(5).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtTelfContRef),row.getCell(40).toString());
		Thread.sleep (500);
		click(By.xpath(BtnContRefSave));
    } 
	
	
	
	@Step("metodo para Modificar Telefono Fijo")  
    
    public   void   ModTelf (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(MnuPerfil));
    	Thread.sleep (500);
		click(By.xpath(BtnTelfMod));
		Thread.sleep (500);
		SelectText(By.xpath(CobCodCity), row.getCell(5).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtNumTelf),row.getCell(8).toString());
		Thread.sleep (500);
		click(By.xpath(BtnTelfSave));
    } 
	
	
	@Step("metodo para Modificar Direccion")  
    
    public   void   ModDirec (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnDirMod));
		Thread.sleep (500);
		SelectText(By.xpath(CobDepart), row.getCell(12).toString());
		Thread.sleep (500);
		SelectText(By.xpath(CobProv), row.getCell(16).toString());
		Thread.sleep (500);
		SelectText(By.xpath(CobDist), row.getCell(19).toString());
		Thread.sleep (500);
		Clear(By.xpath(TxtDir));
		Thread.sleep (500);
		writeText(By.xpath(TxtDir),row.getCell(22).toString());
		Thread.sleep (500);
		Clear(By.xpath(TxtRef));
		Thread.sleep (500);
		writeText(By.xpath(TxtRef),row.getCell(25).toString());
		Thread.sleep (500);
		click(By.xpath(BtnDirSave));
    } 

	
	
	@Step("metodo para Modificar Numero de Celular Alternativo")  
    
    public   void   ModCelAlt (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnCelAltMod));
		Thread.sleep (500);
		writeText(By.xpath(TxtCelAlt),row.getCell(28).toString());
		Thread.sleep (500);
		click(By.xpath(BtnCelAltSave));
    } 
	

	@Step("metodo para Modificar Email Alternativo")  
    
    public   void   ModEmailAlt (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnEmailAltMod));
		Thread.sleep (500);
		writeText(By.xpath(TxtEmailAlt),row.getCell(31).toString());
		Thread.sleep (500);
		click(By.xpath(BtnEmailAltSave));
    } 
	
	

	
	@Step("metodo para Modificar Contacto Referencial")  
    
    public   void   ModContRef (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnContRefMod));
		Thread.sleep (500);
		writeText(By.xpath(TxtNameContRef),row.getCell(34).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtCelContRef),row.getCell(37).toString());
		Thread.sleep (500);
		SelectText(By.xpath(CobCodCityContRef), row.getCell(5).toString());
		Thread.sleep (500);
		writeText(By.xpath(TxtTelfContRef),row.getCell(40).toString());
		Thread.sleep (500);
		click(By.xpath(BtnContRefSave));
    } 
	
	
	
	@Step("metodo para Eliminar Telefono Fijo")  
    
    public   void   DelTelf (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(MnuPerfil));
    	Thread.sleep (500);
		click(By.xpath(BtnTelfDelet));

    } 
	
	
	@Step("metodo para Eliminar Direccion")  
    
    public   void   DelDirec (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnDirDelet));

    } 

	
	
	@Step("metodo para Eliminar Numero de Celular Alternativo")  
    
    public   void   DelCelAlt (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnCelAltDelet));

    } 
	

	@Step("metodo para Eliminar Email Alternativo")  
    
    public   void   DelEmailAlt (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnEmailAltDelet));
		
    } 
	
	

	
	@Step("metodo para Eliminar Contacto Referencial")  
    
    public   void   DelContRef (XSSFRow row ) throws InterruptedException { 

		click(By.xpath(BtnContRefDelet));
	
    } 
	
	

	
	
		
    @Step("Verify username: {0} step...")    
    public void verifyMessage01 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(MsjValid)).trim(), expectedUserNameMessage.trim());	
        click(By.xpath(BtnMsjSi));
    }
	
    @Step("Verify username: {0} step...")    
    public void verifyMessage02 (String expectedUserNameMessage) {
        Assert.assertEquals(readText(By.xpath(MsjValid)).replaceAll("\\\\s",""), expectedUserNameMessage.replaceAll("\\\\s",""));	
        click(By.xpath(BtnMsjAceptar));
    }
	
	
	
}

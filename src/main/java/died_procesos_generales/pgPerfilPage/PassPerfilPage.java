package died_procesos_generales.pgPerfilPage;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;
import objectDriver.BasePages;

public class PassPerfilPage extends BasePages {
	
	   //*********Constructor********* 
		public PassPerfilPage(WebDriver driver, WebDriverWait wait) {
			super(driver, wait);

		}
		String MnuPerfil = "//*[@id=\"mnuPerfilUsuario\"]";
		//*********Web Elementos de campos obligatorios ********* 
		// Contraseña
		String BtnCotMod = "//*[@id=\"perfil_btn_cambiar_contrasena\"]";
		String TxtCotOld = "//*[@id=\"perfil_pass_clave_old\"]";
		String TxtCotNva = "//*[@id=\"perfil_pass_nueva_clave\"]";
		String TextCotnvaCof = "//*[@id=\"perfil_pass_nueva_clave_confir\"]";
		String CheMuestra = "//*[@id=\"cb_mostrar_contrasenias\"]";
		String BtnCotCancel = "//*[@id=\"perfil_row_pass_cancelar\"]"; 
		String BtnCotSave = "//*[@id=\"perfil_row_pass_guardar\"]";
		
		
		@Step("metodo que modifica Contraseña")  
	    
	    public   void   ModPassword (XSSFRow row ) throws InterruptedException { 
	    	
	    	
			click(By.xpath(MnuPerfil));
	    	Thread.sleep (500);
			click(By.xpath(BtnCotMod));
	    	Thread.sleep (500);     
	    	writeText(By.xpath(TxtCotOld),row.getCell(4).toString());
	    	writeText(By.xpath(TxtCotNva),row.getCell(5).toString());
	    	writeText(By.xpath(TextCotnvaCof),row.getCell(6).toString());
	    	click(By.xpath(CheMuestra));
	    	click(By.xpath(BtnCotSave));
	    } 
		

}

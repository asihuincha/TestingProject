package objectDriver;

import   io.qameta.allure.Step;
import   org . openqa . selenium . By ; 
import   org . openqa . selenium . WebDriver ; 
import   org . openqa . selenium . support . ui . WebDriverWait ; 


public class OpenPages extends   BasePages  {


    //*********Constructor********* 
    public   OpenPages   ( WebDriver  driver ,   WebDriverWait  wait )   { 
        super ( driver ,   wait ) ; 
    } 

    //*********Page Variables********* 
    
    String UrlApp = " "; // aplicativos con alertas al inicio
    String UrlApp1 = "http://11.35.100.48:8001/apps/nmcd_2019/nmcd2019_inscripcion/public/sec";
    String UrlApp2 = "http://11.35.100.48:8001/apps/AppDesacoplado/public/";                     //  "http://11.35.100.48:8001/apps/AppBase3/public/sec";
    String UrlApp3 = " ";
    String UrlApp4 = " ";
    String UrlYopmail = "http://www.yopmail.com/es/";
    
    //*********Web Elements********* 
    String Oplista = "//*[@id=\"modal_comite_lista\"]/div/div/div[2]/table/tbody/tr/td[6]/button";
    



    //*********Page Method Nombramiento ********* 
    @Step("Open N11 Step...")
    public   void   goToN11   ( ) { 
        driver . get (UrlApp1);      
       // driver.navigate().to(UrlApp1); 
    } 
    
    //*********Page Method AppBase ********* 
    @Step("Open N12 Step...")
    public   void   goToN12   ( ) { 
        driver . get ( UrlApp2 ) ; 
     // driver.navigate().to(UrlApp2);
    } 
    
    public   void   goToNop   ( ) { 
        driver . get ( UrlApp2 ) ; 
        
        driver.navigate().to(UrlApp);
        click (By.xpath(Oplista));
    } 
    
    public   void   goToYopmail   ( ) { 
        //driver . get ( baseURL ) ; 
        driver.navigate().to(UrlYopmail); 
    } 

} 
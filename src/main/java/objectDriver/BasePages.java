package objectDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;




public   class   BasePages   { 
    public   WebDriver  driver ; 
    public   WebDriverWait  wait ; 

    //Constructor 
    public   BasePages   ( WebDriver  driver ,   WebDriverWait  wait ) { 
        this . driver   =   driver ; 
        this . wait   =   wait ; 
    } 

    //Click Method 
    public   void   click   ( By  elementLocation )   { 
        driver . findElement ( elementLocation ) . click ( ) ; 
    } 
    
    //Clear Method 
    public   void   Clear   ( By  elementLocation )   { 
        driver . findElement ( elementLocation ) . clear(); 
    } 

    //Write Text 
    public   void   writeText   ( By  elementLocation ,   String   text )   { 
        driver . findElement ( elementLocation ) . sendKeys ( text ) ; 
    } 

    //Read Text 
    public   String   readText   ( By  elementLocation )   { 
        return   driver . findElement ( elementLocation ) . getText ( ) ; 
    } 
    
    // Select Options
    
    public void SelectText (By elementLocation, String text) {
    	
     Select xyz = new Select (driver.findElement(elementLocation));
     xyz.selectByVisibleText(text);
    }
    


    
} 
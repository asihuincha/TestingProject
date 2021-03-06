package tests;


import   org.openqa.selenium.WebDriver; 
import   org.openqa.selenium.chrome.ChromeDriver; 
import   org.openqa.selenium.support.ui.WebDriverWait;
import   org.testng.annotations.AfterClass;
import   org.testng.annotations.BeforeClass;
import   objectDriver.Constans; 


public   class   BaseTest   { 
    public   WebDriver  driver ; 
    public   WebDriverWait  wait ; 
    
    // Global test data excel file
    public static final String testDataExcelFileName="appBase.xlsx";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass (description = "Class Level Setup!")
    public   void   setup   ( )   { 
   	 
   	 Constans obj = new Constans();
  	 System.setProperty(obj.Nave,obj.RutaNave);
   	 
   	 //Create a Chrome driver. All test and page classes use this driver. 
   	 driver   =   new   ChromeDriver ( ) ; 

     //Create a wait. All test and page classes use this wait. 
     wait   =   new   WebDriverWait ( driver , 15 ) ; 

      //Maximize Window 
     driver . manage ( ) . window ( ) . maximize ( ) ; 
    } 

    @AfterClass(description = "Class Level Teardown!")
    public   void   teardown   ( )   { 
        driver . quit ( ) ; 
    } 
} 
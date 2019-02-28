package utils.extentreports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.util.HashMap;
import java.util.Map;



/* OB: extensionTestMap contiene la información de los ID de subprocesos y las instancias de ExtentTest.
                 ExtentReports instancia creada al llamar al método getReporter () desde ExtentManager.
                 En el método startTest (), se creó una instancia de ExtentTest y se puso en extensionTestMap con el id del hilo actual.
                 En el método endTest (), la prueba finaliza y la instancia de ExtentTest se obtiene de extensionTestMap a través del ID del hilo actual.
                 En el método getTest (), devuelva la instancia de ExtentTest en extensionTestMap usando el ID de hilo actual.
          */


public class ExtentTestManager {
  
    static Map extentTestMap = new HashMap();
    static ExtentReports extent = ExtentManager.getReporter();

    public static synchronized ExtentTest getTest() {
        return (ExtentTest)extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized void endTest() {
        extent.endTest((ExtentTest)extentTestMap.get((int) (long) (Thread.currentThread().getId())));
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.startTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }
	
}

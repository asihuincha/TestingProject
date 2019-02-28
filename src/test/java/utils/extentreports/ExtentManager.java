package utils.extentreports;

import com.relevantcodes.extentreports.ExtentReports;

//OB: extension notifica la instancia de extensión creada aquí. Esa instancia puede ser accesible por el método getReporter ().
public class ExtentManager {

  private static ExtentReports extent;
  public synchronized static ExtentReports getReporter(){
	if(extent == null){
	  //Set HTML reporting file location
	  String workingDir = System.getProperty("user.dir");
	  extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportResults.html", true);
	 }
	return extent;
   } 
}

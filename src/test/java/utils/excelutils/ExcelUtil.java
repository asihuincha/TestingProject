package utils.excelutils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import static tests.BaseTest.testDataExcelFileName;
 

public class ExcelUtil {
	
	 
    //Directorio principal del proyecto
    public static final String currentDir = System.getProperty("user.dir");
 
    //Ubicacion del archivo excel de datos de prueba 
    public static String testDataExcelPath = null;
 
    //Excel Libro de trabajo
    private static XSSFWorkbook excelWBook;
 
    //Excel Hoja
    private static XSSFSheet excelWSheet;
 
    //Excel Celda
    private static XSSFCell cell;
 
    //Excel fila
    private static XSSFRow row;
 
    //Numero de fila
    public static int rowNumber;
 
    //numero de columna
    public static int columnNumber;
 
    //Setter and Getters of row and columns
    public static void setRowNumber(int pRowNumber) {
        rowNumber = pRowNumber;
    }
 
    public static int getRowNumber() {
        return rowNumber;
    }
 
    public static void setColumnNumber(int pColumnNumber) {
        columnNumber = pColumnNumber;
    }
 
    public static int getColumnNumber() {
        return columnNumber;
    }
 
    // Este método tiene dos parámetros: "Nombre de archivo de Excel de datos de prueba" y "Nombre de hoja de Excel"
    // Crea FileInputStream y establece excel file y excel sheet para excelWBook y excelWSheet variables.
    public static void setExcelFileSheet(String sheetName) throws Exception {
        
    	//MAC or Windows Selection for excel path
        if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
            testDataExcelPath = currentDir + "//src//test//java//resources//";
        } else if (Platform.getCurrent().toString().contains("WIN")) {
            testDataExcelPath = currentDir + "\\src\\test\\java\\resources\\";
        }
        try {
            // Abre el archivo Excel
            FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + testDataExcelFileName);
            excelWBook = new XSSFWorkbook(ExcelFile);
            excelWSheet = excelWBook.getSheet(sheetName);
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
 
    // Este método lee los datos de prueba de la celda de Excel.
    // Estamos pasando el número de fila y el número de columna como parámetros.
    public static String getCellData(int RowNum, int ColNum) throws Exception {
        try {
            cell = excelWSheet.getRow(RowNum).getCell(ColNum);
            DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
        } catch (Exception e) {
            throw (e);
        }
    }
 
    // Este método toma el número de fila como un parámetro y devuelve los datos del número de fila dado.
    public static XSSFRow getRowData(int RowNum) throws Exception {
        try {
            row = excelWSheet.getRow(RowNum);
            return row;
        } catch (Exception e) {
            throw (e);
        }
    }
 


    // Este método obtiene el archivo de Excel, el número de fila y columna y establece un valor para esa celda.
    public static void setCellData(String value, int RowNum, int ColNum) throws Exception {
        try {
            row = excelWSheet.getRow(RowNum);
            cell = row.getCell(ColNum);
            if (cell == null) {
                cell = row.createCell(ColNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
         // Variables constantes Ruta de datos de prueba y Nombre del archivo de datos de prueba
            FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + testDataExcelFileName);
            excelWBook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
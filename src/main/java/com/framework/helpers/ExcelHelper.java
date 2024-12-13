package com.framework.helpers;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelHelper {
    FileInputStream fileInputStream;
    Workbook workbook;

    public ExcelHelper(String filePath) {

        try {
            String dir = System.getProperty("user.dir");
            fileInputStream = new FileInputStream(new File(dir + filePath));

            workbook = new XSSFWorkbook(fileInputStream);

        } catch (IOException e) {
             Reporter.info("IO Exception Occurred in Excel File");
        }
    }

    public Map<String, String> read(String sheetName) {

        Map<String, String> dataMap = new HashMap<>();

        Sheet sheet = workbook.getSheet(sheetName);

        Row headerRow = sheet.getRow(0);

        Row valueRow = sheet.getRow(1);

        int columnIndex = 0;
        for (Cell cell : valueRow) {
            String columnName = headerRow.getCell(columnIndex).toString();

            String cellValue = cell.toString();

            dataMap.put(columnName, cellValue);
            columnIndex++;

        }

        try {
            workbook.close();
        } catch (IOException e) {
            System.out.println("Error while closing the workbook");
        }
        return dataMap;
    }

    public Object[][] readExcelData(String sheetName) {
        Object[][] data = null;

        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        int numRowsWithData = 0;

        for (int i = 1; i <= rowCount; i++) {
            Row row = sheet.getRow(i);

            boolean hasData = false;
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    hasData = true;
                    break;
                }
            }

            if (hasData) {
                numRowsWithData++;
            } else {
                break;
            }
        }

        data = new Object[numRowsWithData][colCount];

        for (int i = 1; i <= numRowsWithData; i++) {
            Row row = sheet.getRow(i);

            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);

                if (cell != null) {
                    if (cell.getCellType() == CellType.STRING) {
                        data[i - 1][j] = cell.getStringCellValue();
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        data[i - 1][j] = cell.getNumericCellValue();
                    } else if (cell.getCellType() == CellType.BOOLEAN) {
                        data[i - 1][j] = cell.getBooleanCellValue();
                    }
                } else {
                    data[i - 1][j] = "N/A";
                }
            }
        }
        return data;
    }


}



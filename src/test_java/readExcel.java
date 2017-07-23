package test_java;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


/**
 * Created by mao on 2017/6/19.
 */
public class readExcel {
    //xls
    public static void readExcelFile(String filepath,int i,int j){

        try {
            File file = new File(filepath);
            FileInputStream input = new FileInputStream(file);
            Workbook work = Workbook.getWorkbook(input);
            Sheet sheet = work.getSheet(0);
            int rows = sheet.getRows();
            System.out.println(rows+"行");
            int cols = sheet.getColumns();
            System.out.println(cols+"列");
//            for(int i=0; i<1;i++){
//                for(int j=0;j<cols;j++){
//                    Cell cell = sheet.getCell(j,i);
//                    System.out.println(cell.getContents());
//                }
//            }

            Cell cell = sheet.getCell(i,j); //获取i列j行的单元格内容
            String  name = cell.getContents();
            System.out.println(name);
            System.out.println("hhhh");
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void main(String argv[]) {
        readExcelFile("E:\\maoyujia\\report.xls",1,3); //取2列，4行的值。

    }


}

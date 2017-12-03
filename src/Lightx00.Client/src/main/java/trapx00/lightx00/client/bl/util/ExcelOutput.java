package trapx00.lightx00.client.bl.util;

import java.io.*;

import jxl.*;
import jxl.write.*;
import trapx00.lightx00.shared.po.ResultMessage;


public class ExcelOutput {

    private static WritableWorkbook book;
    private static WritableSheet sheet;
    private static WritableFont normalFont;
    private static WritableCellFormat normalFormat;


    public static ResultMessage createExcel(String path, String[]outputMessage,String name) {
        try {
            path=path+"\\"+name+".xls";
            book = Workbook.createWorkbook(new File(path));
            //页码
            sheet = book.createSheet( name, 0);
            normalFont = new WritableFont(WritableFont.createFont("宋体"), 11, WritableFont.NO_BOLD);
            // 设置字体为宋体,11号字,不加粗,颜色为红色
            normalFormat = new WritableCellFormat(normalFont);
            normalFormat.setAlignment(jxl.format.Alignment.CENTRE);
            normalFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);

            for(int i=0;i<outputMessage[0].split("-").length;i++){
                for(int j=0;j<outputMessage.length;j++){
                    sheet.addCell(new Label(i,j,outputMessage[j].split("-")[i],normalFormat));
                }
            }

            book.write();
            book.close();
            System.out.println("创建文件成功!");
            return ResultMessage.Success;
        } catch (NullPointerException e) {
            throw e;
        }catch(FileNotFoundException e){
           // 路径错误;
            return ResultMessage.Failure;
        }catch(Exception e){
            return ResultMessage.Failure;
        }

    }


}

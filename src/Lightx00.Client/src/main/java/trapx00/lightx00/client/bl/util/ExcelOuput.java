package trapx00.lightx00.client.bl.util;

import java.io.*;
import java.util.Date;

import jxl.*;
import jxl.format.Colour;
import jxl.write.*;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPictureItem;


public class ExcelOuput {

    private static WritableWorkbook book;
    private static WritableSheet sheet;
    private static WritableFont normalFont;

    private static WritableFont diffFont;
    private static WritableCellFormat normalFormat;
    private static WritableCellFormat diffFormat;

    /**
     * java创建excel简单示例
     */


    public static ResultMessage createExcel(String path, InventoryPictureVo inventoryPictureVo) {
        try {
            //名称，型号，库存数量，库存均价，批次，批号，出厂日期
            // String fileNameAndPath = ;
            book = Workbook.createWorkbook(new File(path));
            System.out.println("1");
            // 生成名为"第一页"的工作表，参数0表示这是第一页
            String name = FormatDateTime.toShortTimeString(new Date());
            sheet = book.createSheet("库存快照" + name, 0);
            normalFont = new WritableFont(WritableFont.createFont("宋体"), 11, WritableFont.NO_BOLD);
            // 设置字体为宋体,11号字,不加粗,颜色为红色
            //  diffFont = new WritableFont(WritableFont.createFont("宋体"), 11, WritableFont.NO_BOLD);
            // diffFont.setColour(Colour.RED);

            normalFormat = new WritableCellFormat(normalFont);
            normalFormat.setAlignment(jxl.format.Alignment.CENTRE);
            normalFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);


            Label labelA = new Label(0, 0, "名称", normalFormat);
            Label labelB = new Label(1, 0, "型号", normalFormat);
            Label labelC = new Label(2, 0, "库存数量", normalFormat);
            Label labelD = new Label(3, 0, "库存均价", normalFormat);
            Label labelE = new Label(4, 0, "批次", normalFormat);
            Label labelF = new Label(5, 0, "批号", normalFormat);
            Label labelG = new Label(6, 0, "出厂日期", normalFormat);


            for (int i = 1; i <= inventoryPictureVo.getItems().length; i++) {
                Label lab1 = new Label(0, i, inventoryPictureVo.getItems()[i-1].getName());
                Label lab2 = new Label(1, i, inventoryPictureVo.getItems()[i-1].getType());
                Label lab3 = new Label(2, i, String.valueOf(inventoryPictureVo.getItems()[i-1].getAmount()));
                Label lab4 = new Label(3, i, String.valueOf(inventoryPictureVo.getItems()[i-1].getPrice()));
                Label lab5 = new Label(4, i, inventoryPictureVo.getItems()[i-1].getBatch());
                Label lab6 = new Label(5, i, inventoryPictureVo.getItems()[i-1].getBatchNo());
                Label lab7 = new Label(6, i, FormatDateTime.toShortDateString(inventoryPictureVo.getItems()[i-1].getDate()));
                sheet.addCell(lab1);
                sheet.addCell(lab2);
                sheet.addCell(lab3);
                sheet.addCell(lab4);
                sheet.addCell(lab5);
                sheet.addCell(lab6);
                sheet.addCell(lab7);
            }
            // 将定义好的单元格添加到工作表中
            sheet.addCell(labelA);
            sheet.addCell(labelB);
            sheet.addCell(labelC);
            sheet.addCell(labelD);
            sheet.addCell(labelE);
            sheet.addCell(labelF);
            sheet.addCell(labelG);

            book.write();
            book.close();
            System.out.println("创建文件成功!");
            return ResultMessage.Success;

        } catch (Exception e) {
            System.out.print("失败");
            return ResultMessage.Failure;
            // TODO Auto-generated catch block
        }
    }


}

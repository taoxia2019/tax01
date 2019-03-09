package com.lena.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.lena.entity.Tax;

import com.lena.service.IDeptService;
import com.lena.service.ITaxService;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping("/tax")
public class TaxController {
    @Autowired
    private ITaxService iTaxService;
    @Autowired
    private IDeptService iDeptService;

    @RequestMapping("/index")
    public String index() {
        return "submittax";
    }
    @RequestMapping("/employeetaxpage")
    public String gettaxdatapage(Integer current,Model model) {
        System.out.println("起始传入页面值"+current);
        if(current==null){
            current=1;
        }
        Page<Tax> taxPage = new Page<>(current,4);
        Page<Tax> taxList = iTaxService.selectPage(taxPage, new EntityWrapper<Tax>());
        System.out.println(",,,,,,,,,,,,,,,,");
        System.out.println(taxList.getRecords());
        System.out.println("-----------------");
        System.out.println(taxList.getCurrent());
        System.out.println(taxList.getTotal());
        System.out.println(taxList.getPages());
        System.out.println(taxList.hasPrevious());
        System.out.println(taxList.hasNext());

        System.out.println("============");
        System.out.println("当前传入页码为"+current);
        model.addAttribute("previous",taxList.hasPrevious());
        model.addAttribute("next",taxList.hasNext());
        model.addAttribute("listpage",taxList);
        return "tax/employeetaxpage";
    }
    @RequestMapping("/submit")
    public String importAndExport() {
        return "tax/submittax";
    }

    @RequestMapping("/exportall")
    public String exportall() {
        System.out.println("下载成功");
        return "tax/sussecc";
    }

    @RequestMapping("/importall")
    public String importall(MultipartFile filename,Model model) throws Exception {
        // 獲取流對象
        // MultipartFile 的filename必須和input的name屬性名稱一致
        InputStream is = filename.getInputStream();
        // 導入流對象
        HSSFWorkbook wb = new HSSFWorkbook(is);
        // 獲取sheet表的名稱
        HSSFSheet sheet = wb.getSheet("正常工资薪金收入");
        // 獲取有數據的最後一行
        for (Row row : sheet) {
            for (Cell cell : row) {
                // 读取数据前设置单元格类型
                if (cell != null) {
                    cell.setCellType(CellType.STRING);
                }
            }
        }
        int lastRowNum = sheet.getLastRowNum();
        Tax tax = new Tax();
        // 除掉標題行,進行遍歷
        for (int i = 2; i <= lastRowNum; i++) {
            if (null == sheet.getRow(i).getCell(0)) {
                break;
            }
            // 獲取pojo對象
            //数据id	id自增
            //姓名	xingming
            tax.setXingming(sheet.getRow(i).getCell(1).getStringCellValue());
            //*证照类型	zhengzhaoleixing
            tax.setZhengzhaoleixing(sheet.getRow(i).getCell(2).getStringCellValue());
            //*证照号码	zhengzhaohaoma
            String zhengzhaohaoma = sheet.getRow(i).getCell(3).getStringCellValue();
            tax.setZhengzhaohaoma(zhengzhaohaoma);
            //*本期收入	benqishouru
            tax.setBenqishouru(sheet.getRow(i).getCell(4).getStringCellValue());
            //本期免税收入	benqimianshuishouru
            tax.setBenqimianshuishouru(sheet.getRow(i).getCell(5).getStringCellValue());
            //基本养老保险费	jibenyanglaobaoxian
            tax.setJibenyanglaobaoxian(sheet.getRow(i).getCell(6).getStringCellValue());
            //基本医疗保险费	jibenyiliaobaoxianfei
            tax.setJibenyiliaobaoxianfei(sheet.getRow(i).getCell(7).getStringCellValue());
            //失业保险费	shiyebaoxianfei
            tax.setShiyebaoxianfei(sheet.getRow(i).getCell(8).getStringCellValue());
            //住房公积金	zhufanggongjijin
            tax.setZhufanggongjijin(sheet.getRow(i).getCell(9).getStringCellValue());
            //累计子女教育	leijizinvjiaoyu
            tax.setLeijizinvjiaoyu(sheet.getRow(i).getCell(10).getStringCellValue());
            //累计继续教育	leijijixujiaoyu
            tax.setLeijijixujiaoyu(sheet.getRow(i).getCell(11).getStringCellValue());
            //累计住房贷款利息	leijizhufangdaikuanlixi
            tax.setLeijizhufangdaikuanlixi(sheet.getRow(i).getCell(12).getStringCellValue());
            //累计住房租金	leijizhufangzujin
            tax.setLeijizhufangzujin(sheet.getRow(i).getCell(13).getStringCellValue());
            //累计赡养老人	leijishanyanglaoren
            tax.setLeijishanyanglaoren(sheet.getRow(i).getCell(14).getStringCellValue());
            //企业(职业)年金	qiyenianjin
            tax.setQiyenianjin(sheet.getRow(i).getCell(15).getStringCellValue());
            //商业健康保险	shangyejiankangbaoxian
            tax.setShangyejiankangbaoxian(sheet.getRow(i).getCell(16).getStringCellValue());
            //税延养老保险	shuiyanyanglaobaoxian
            tax.setShuiyanyanglaobaoxian(sheet.getRow(i).getCell(17).getStringCellValue());
            //其他	qita
            tax.setQita(sheet.getRow(i).getCell(8).getStringCellValue());
            //准予扣除的捐赠额	zhunyukouchudejuanzenge
            tax.setZhunyukouchudejuanzenge(sheet.getRow(i).getCell(19).getStringCellValue());
            //减免税额	jianmianshuie
            tax.setJianmianshuie(sheet.getRow(i).getCell(20).getStringCellValue());
            //累计应补(退)税额	leijiyingbutuishuie
            tax.setLeijiyingbutuishuie(sheet.getRow(i).getCell(21).getStringCellValue());
            //部门	dept
            String s = filename.getOriginalFilename().toString();
            tax.setDept(s);
            //创建时间	creatdate
            tax.setCreatdate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
           if((null==iTaxService.selectMap(new EntityWrapper<Tax>()
                   .eq("zhengzhaohaoma",zhengzhaohaoma)))&&(tax.getZhengzhaohaoma().toString().length()>4)){
                this.iTaxService.insert(tax);
           }else{
               this.iTaxService.update(tax,new EntityWrapper<Tax>()
               .eq("zhengzhaohaoma",zhengzhaohaoma));
           }
            }
            // 返回成功頁面

            model.addAttribute("taxlist",this.iTaxService.selectList(new EntityWrapper<Tax>()));
            return "tax/employeetax";
        }

    }
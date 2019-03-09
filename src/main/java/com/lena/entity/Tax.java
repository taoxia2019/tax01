package com.lena.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lena
 * @since 2019-03-08
 */
public class Tax extends Model<Tax> {

    private static final long serialVersionUID = 1L;
   @TableId(type=IdType.AUTO)
	private Integer id;
	private String xingming;
	private String zhengzhaoleixing;
	private String zhengzhaohaoma;
	private String benqishouru;
	private String benqimianshuishouru;
	private String jibenyanglaobaoxian;
	private String jibenyiliaobaoxianfei;
	private String shiyebaoxianfei;
	private String zhufanggongjijin;
	private String leijizinvjiaoyu;
	private String leijijixujiaoyu;
	private String leijizhufangdaikuanlixi;
	private String leijizhufangzujin;
	private String leijishanyanglaoren;
	private String qiyenianjin;
	private String shangyejiankangbaoxian;
	private String shuiyanyanglaobaoxian;
	private String qita;
	private String zhunyukouchudejuanzenge;
	private String jianmianshuie;
	private String leijiyingbutuishuie;
	private String dept;
	private String creatdate;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXingming() {
		return xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	public String getZhengzhaoleixing() {
		return zhengzhaoleixing;
	}

	public void setZhengzhaoleixing(String zhengzhaoleixing) {
		this.zhengzhaoleixing = zhengzhaoleixing;
	}

	public String getZhengzhaohaoma() {
		return zhengzhaohaoma;
	}

	public void setZhengzhaohaoma(String zhengzhaohaoma) {
		this.zhengzhaohaoma = zhengzhaohaoma;
	}

	public String getBenqishouru() {
		return benqishouru;
	}

	public void setBenqishouru(String benqishouru) {
		this.benqishouru = benqishouru;
	}

	public String getBenqimianshuishouru() {
		return benqimianshuishouru;
	}

	public void setBenqimianshuishouru(String benqimianshuishouru) {
		this.benqimianshuishouru = benqimianshuishouru;
	}

	public String getJibenyanglaobaoxian() {
		return jibenyanglaobaoxian;
	}

	public void setJibenyanglaobaoxian(String jibenyanglaobaoxian) {
		this.jibenyanglaobaoxian = jibenyanglaobaoxian;
	}

	public String getJibenyiliaobaoxianfei() {
		return jibenyiliaobaoxianfei;
	}

	public void setJibenyiliaobaoxianfei(String jibenyiliaobaoxianfei) {
		this.jibenyiliaobaoxianfei = jibenyiliaobaoxianfei;
	}

	public String getShiyebaoxianfei() {
		return shiyebaoxianfei;
	}

	public void setShiyebaoxianfei(String shiyebaoxianfei) {
		this.shiyebaoxianfei = shiyebaoxianfei;
	}

	public String getZhufanggongjijin() {
		return zhufanggongjijin;
	}

	public void setZhufanggongjijin(String zhufanggongjijin) {
		this.zhufanggongjijin = zhufanggongjijin;
	}

	public String getLeijizinvjiaoyu() {
		return leijizinvjiaoyu;
	}

	public void setLeijizinvjiaoyu(String leijizinvjiaoyu) {
		this.leijizinvjiaoyu = leijizinvjiaoyu;
	}

	public String getLeijijixujiaoyu() {
		return leijijixujiaoyu;
	}

	public void setLeijijixujiaoyu(String leijijixujiaoyu) {
		this.leijijixujiaoyu = leijijixujiaoyu;
	}

	public String getLeijizhufangdaikuanlixi() {
		return leijizhufangdaikuanlixi;
	}

	public void setLeijizhufangdaikuanlixi(String leijizhufangdaikuanlixi) {
		this.leijizhufangdaikuanlixi = leijizhufangdaikuanlixi;
	}

	public String getLeijizhufangzujin() {
		return leijizhufangzujin;
	}

	public void setLeijizhufangzujin(String leijizhufangzujin) {
		this.leijizhufangzujin = leijizhufangzujin;
	}

	public String getLeijishanyanglaoren() {
		return leijishanyanglaoren;
	}

	public void setLeijishanyanglaoren(String leijishanyanglaoren) {
		this.leijishanyanglaoren = leijishanyanglaoren;
	}

	public String getQiyenianjin() {
		return qiyenianjin;
	}

	public void setQiyenianjin(String qiyenianjin) {
		this.qiyenianjin = qiyenianjin;
	}

	public String getShangyejiankangbaoxian() {
		return shangyejiankangbaoxian;
	}

	public void setShangyejiankangbaoxian(String shangyejiankangbaoxian) {
		this.shangyejiankangbaoxian = shangyejiankangbaoxian;
	}

	public String getShuiyanyanglaobaoxian() {
		return shuiyanyanglaobaoxian;
	}

	public void setShuiyanyanglaobaoxian(String shuiyanyanglaobaoxian) {
		this.shuiyanyanglaobaoxian = shuiyanyanglaobaoxian;
	}

	public String getQita() {
		return qita;
	}

	public void setQita(String qita) {
		this.qita = qita;
	}

	public String getZhunyukouchudejuanzenge() {
		return zhunyukouchudejuanzenge;
	}

	public void setZhunyukouchudejuanzenge(String zhunyukouchudejuanzenge) {
		this.zhunyukouchudejuanzenge = zhunyukouchudejuanzenge;
	}

	public String getJianmianshuie() {
		return jianmianshuie;
	}

	public void setJianmianshuie(String jianmianshuie) {
		this.jianmianshuie = jianmianshuie;
	}

	public String getLeijiyingbutuishuie() {
		return leijiyingbutuishuie;
	}

	public void setLeijiyingbutuishuie(String leijiyingbutuishuie) {
		this.leijiyingbutuishuie = leijiyingbutuishuie;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCreatdate() {
		return creatdate;
	}

	public void setCreatdate(String creatdate) {
		this.creatdate = creatdate;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Tax{" +
			", id=" + id +
			", xingming=" + xingming +
			", zhengzhaoleixing=" + zhengzhaoleixing +
			", zhengzhaohaoma=" + zhengzhaohaoma +
			", benqishouru=" + benqishouru +
			", benqimianshuishouru=" + benqimianshuishouru +
			", jibenyanglaobaoxian=" + jibenyanglaobaoxian +
			", jibenyiliaobaoxianfei=" + jibenyiliaobaoxianfei +
			", shiyebaoxianfei=" + shiyebaoxianfei +
			", zhufanggongjijin=" + zhufanggongjijin +
			", leijizinvjiaoyu=" + leijizinvjiaoyu +
			", leijijixujiaoyu=" + leijijixujiaoyu +
			", leijizhufangdaikuanlixi=" + leijizhufangdaikuanlixi +
			", leijizhufangzujin=" + leijizhufangzujin +
			", leijishanyanglaoren=" + leijishanyanglaoren +
			", qiyenianjin=" + qiyenianjin +
			", shangyejiankangbaoxian=" + shangyejiankangbaoxian +
			", shuiyanyanglaobaoxian=" + shuiyanyanglaobaoxian +
			", qita=" + qita +
			", zhunyukouchudejuanzenge=" + zhunyukouchudejuanzenge +
			", jianmianshuie=" + jianmianshuie +
			", leijiyingbutuishuie=" + leijiyingbutuishuie +
			", dept=" + dept +
			", creatdate=" + creatdate +
			"}";
	}
}

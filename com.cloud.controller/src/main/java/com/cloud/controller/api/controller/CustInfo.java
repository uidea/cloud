package com.cloud.controller.api.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

/**
 * ClassName: CustInfo Function: TODO Description: TODO date: 2019年2月27日
 * 下午3:08:56
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */
public class CustInfo {
	private String id;
	private String custName;// 客户姓名
	private String sex;// 性别
	private String nation;// 民族
	private String intOrg;// 营业部代码
	private String idType;// 证件类型
	private String idNo;// 证件号码
	private String policeOrg;// 发证机关
	private String idAddr;// 发证地址
	private String idBegDate;// 证件有效开始日期
	private String idEndDate;// 证件有效结束日期
	private String openMode;// 开户模式
	private String SAOpen;// 深圳A开户
	private String SBOpen;// 深圳B开户
	private String HAOpen;// 上海A开户
	private String HBOpen;// 上海B开户
	private String Bank;// 银行
	private String BankID;// 银行账户
	private String tel;// 联系电话
	private String address;// 联系地址
	private String email;// 电子邮件
	private String zipCode;// 邮政编码
	private Date subTime;// 开户时间
	private String education;//学历
	private String occuType;//职业类型

	private Integer statusIDOCR; // 身份证图片信息校验状态
	private Integer statusIDPolice; // 身份信息校验状态
	private Integer statusAutoPhotoCompare; // 图片对比校验状态
	private Integer statusManuPhotoCompare; // 人工图片对比校验状态
	private Integer statusBrokerCheck; // 资金账户校验状态
	private Integer statusBrokerOA; // 券商开户校验状态

	private Object statusObj; // 上述6个状态转换成用于界面展示的Json
	private String mobileTel; // 手机号
	private String actionBrokerOAInfo;// 券商开户信息
	
	private String reservedData5;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the nation
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * @param nation the nation to set
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}

	/**
	 * @return the intOrg
	 */
	public String getIntOrg() {
		return intOrg;
	}

	/**
	 * @param intOrg the intOrg to set
	 */
	public void setIntOrg(String intOrg) {
		this.intOrg = intOrg;
	}

	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * @param idType the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}

	/**
	 * @return the idNo
	 */
	public String getIdNo() {
		return idNo;
	}

	/**
	 * @param idNo the idNo to set
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	/**
	 * @return the policeOrg
	 */
	public String getPoliceOrg() {
		return policeOrg;
	}

	/**
	 * @param policeOrg the policeOrg to set
	 */
	public void setPoliceOrg(String policeOrg) {
		this.policeOrg = policeOrg;
	}

	/**
	 * @return the idAddr
	 */
	public String getIdAddr() {
		return idAddr;
	}

	/**
	 * @param idAddr the idAddr to set
	 */
	public void setIdAddr(String idAddr) {
		this.idAddr = idAddr;
	}

	/**
	 * @return the idBegDate
	 */
	public String getIdBegDate() {
		return idBegDate;
	}

	/**
	 * @param idBegDate the idBegDate to set
	 */
	public void setIdBegDate(String idBegDate) {
		this.idBegDate = idBegDate;
	}

	/**
	 * @return the idEndDate
	 */
	public String getIdEndDate() {
		return idEndDate;
	}

	/**
	 * @param idEndDate the idEndDate to set
	 */
	public void setIdEndDate(String idEndDate) {
		this.idEndDate = idEndDate;
	}

	/**
	 * @return the openMode
	 */
	public String getOpenMode() {
		return openMode;
	}

	/**
	 * @param openMode the openMode to set
	 */
	public void setOpenMode(String openMode) {
		this.openMode = openMode;
	}

	/**
	 * @return the sAOpen
	 */
	public String getSAOpen() {
		return SAOpen;
	}

	/**
	 * @param sAOpen the sAOpen to set
	 */
	public void setSAOpen(String sAOpen) {
		SAOpen = sAOpen;
	}

	/**
	 * @return the sBOpen
	 */
	public String getSBOpen() {
		return SBOpen;
	}

	/**
	 * @param sBOpen the sBOpen to set
	 */
	public void setSBOpen(String sBOpen) {
		SBOpen = sBOpen;
	}

	/**
	 * @return the hAOpen
	 */
	public String getHAOpen() {
		return HAOpen;
	}

	/**
	 * @param hAOpen the hAOpen to set
	 */
	public void setHAOpen(String hAOpen) {
		HAOpen = hAOpen;
	}

	/**
	 * @return the hBOpen
	 */
	public String getHBOpen() {
		return HBOpen;
	}

	/**
	 * @param hBOpen the hBOpen to set
	 */
	public void setHBOpen(String hBOpen) {
		HBOpen = hBOpen;
	}

	/**
	 * @return the bank
	 */
	public String getBank() {
		return Bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(String bank) {
		Bank = bank;
	}

	/**
	 * @return the bankID
	 */
	public String getBankID() {
		return BankID;
	}

	/**
	 * @param bankID the bankID to set
	 */
	public void setBankID(String bankID) {
		BankID = bankID;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the subTime
	 */
	public long getSubTime() {
		return subTime.getTime();
	}

	/**
	 * @param subTime the subTime to set
	 */
	public void setSubTime(Date subTime) {
		this.subTime = subTime;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @return the occuType
	 */
	public String getOccuType() {
		return occuType;
	}

	/**
	 * @param occuType the occuType to set
	 */
	public void setOccuType(String occuType) {
		this.occuType = occuType;
	}

	public Integer getStatusIDOCR() {
		return statusIDOCR;
	}

	public void setStatusIDOCR(Integer statusIDOCR) {
		this.statusIDOCR = statusIDOCR;
	}

	public Integer getStatusIDPolice() {
		return statusIDPolice;
	}

	public void setStatusIDPolice(Integer statusIDPolice) {
		this.statusIDPolice = statusIDPolice;
	}

	public Integer getStatusAutoPhotoCompare() {
		return statusAutoPhotoCompare;
	}

	public void setStatusAutoPhotoCompare(Integer statusAutoPhotoCompare) {
		this.statusAutoPhotoCompare = statusAutoPhotoCompare;
	}

	public Integer getStatusManuPhotoCompare() {
		return statusManuPhotoCompare;
	}

	public void setStatusManuPhotoCompare(Integer statusManuPhotoCompare) {
		this.statusManuPhotoCompare = statusManuPhotoCompare;
	}

	public Integer getStatusBrokerCheck() {
		return statusBrokerCheck;
	}

	public void setStatusBrokerCheck(Integer statusBrokerCheck) {
		this.statusBrokerCheck = statusBrokerCheck;
	}

	public Integer getStatusBrokerOA() {
		return statusBrokerOA;
	}

	public void setStatusBrokerOA(Integer statusBrokerOA) {
		this.statusBrokerOA = statusBrokerOA;
	}

	public String getMobileTel() {
		return mobileTel;
	}

	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	public String getActionBrokerOAInfo() {
		return actionBrokerOAInfo;
	}

	public void setActionBrokerOAInfo(String actionBrokerOAInfo) {
		this.actionBrokerOAInfo = actionBrokerOAInfo;
	}

	public String getReservedData5() {
		return reservedData5;
	}

	public void setReservedData5(String reservedData5) {
		this.reservedData5 = reservedData5;
	}

	/**
	 *
	 * @return
	 */
	public Object getStatusObj() {
		final String STEP_IDOCR = "OCR";
		final String STEP_ID_POLICE = "公安校验";
		final String STEP_AUTO_PHOTO_COMPARE = "自动图片比对";
		final String STEP_MANUAL_CHECK = "人工审核";
		final String STEP_BROKER_CHECK = "开户校验";
		final String STEP_BROKER_OA = "开户";

		final Integer STAT_NOT_START = 1;
		final Integer STAT_IN_PROGRESS = 2;
		final Integer STAT_SUCCESS = 3;
		final Integer STAT_FAIL = 4;

		class StatusItem {
			public String msg;
			public Integer status;

			public StatusItem(String msg, Integer status) {
				this.msg = msg;
				this.status = status;
			}

			public StatusItem(Integer flagValue, String prefix, boolean isDeserted) {
				if (flagValue == 3) {
					this.msg = prefix + "成功";
					this.status = STAT_SUCCESS;
				} else if (flagValue == 2) {
					this.msg = prefix + "中";
					this.status = STAT_IN_PROGRESS;
				} else if (flagValue <= 1) {
					this.msg = prefix;
					if (isDeserted)
					    this.status = STAT_FAIL;
					else
					    this.status = STAT_NOT_START;
				} else if (flagValue > 3) {
					if (STEP_BROKER_OA.equals(prefix))
						this.msg = prefix + "失败";
					else
				    	this.msg = prefix + "不通过";
					this.status = STAT_FAIL;
				} else {
					msg = "";
					status = -1;
				}
			}

			public StatusItem() {
				msg = "";
				status = -1;
			}
		} // end of class StatusItem

		statusObj = new Object() {
            /**
             * 是否作废
             * @return boolean
             */
		    private boolean isDeserted() {
		        return (statusBrokerOA >= 5 && statusManuPhotoCompare <= 3);  // 开户作废
            }

            private boolean isNotApprove() {
		    	return (statusBrokerOA == 5 && statusManuPhotoCompare >= 4);
			}

			public StatusItem getOverallStatus() {
			    if (statusBrokerOA == null || statusManuPhotoCompare == null)
			        return new StatusItem();
			    if (isDeserted())
			        return new StatusItem("作废", STAT_FAIL);
			    else if (isNotApprove())
			    	return new StatusItem("审核不通过", STAT_FAIL);
			    else {
                    int stat = (statusBrokerOA <= 1) ? 2 : statusBrokerOA;
                    return new StatusItem(stat, STEP_BROKER_OA, false);
                }
			}

			public Object[] getStepsStatus() {
		        boolean isDeserted = isDeserted();
				List<StatusItem> statusItemList = new ArrayList<StatusItem>();
				if (statusIDOCR != null)
					statusItemList.add(new StatusItem(statusIDOCR, STEP_IDOCR, isDeserted));
				if (statusIDPolice != null)
					statusItemList.add(new StatusItem(statusIDPolice, STEP_ID_POLICE, isDeserted));

				boolean autoCompareStatusShown = false;
				if (statusAutoPhotoCompare != null && statusManuPhotoCompare != null
						&& (statusAutoPhotoCompare <= 3 && statusAutoPhotoCompare > 0 || statusManuPhotoCompare > 3)) {
					autoCompareStatusShown = true;
					statusItemList.add(new StatusItem(statusAutoPhotoCompare, STEP_AUTO_PHOTO_COMPARE, isDeserted));
				}
				if (statusManuPhotoCompare != null && (statusManuPhotoCompare > 0 || !autoCompareStatusShown))
					statusItemList.add(new StatusItem(statusManuPhotoCompare, STEP_MANUAL_CHECK, isDeserted));
				if (statusBrokerCheck != null && statusBrokerCheck > 0)
					statusItemList.add(new StatusItem(statusBrokerCheck, STEP_BROKER_CHECK, isDeserted));

				return statusItemList.toArray();
			}
		};

		return statusObj;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustInfo [id=" + id + ", custName=" + custName + ", sex=" + sex + ", nation=" + nation + ", intOrg=" + intOrg + ", idType="
				+ idType + ", idNo=" + idNo + ", policeOrg=" + policeOrg + ", idAddr=" + idAddr + ", idBegDate=" + idBegDate
				+ ", idEndDate=" + idEndDate + ", openMode=" + openMode + ", SAOpen=" + SAOpen + ", SBOpen=" + SBOpen + ", HAOpen=" + HAOpen
				+ ", HBOpen=" + HBOpen + ", Bank=" + Bank + ", BankID=" + BankID + ", tel=" + tel + ", address=" + address + ", email="
				+ email + ", zipCode=" + zipCode + ", statusIDOCR=" + statusIDOCR + ", statusIDPolice=" + statusIDPolice
				+ ", statusAutoPhotoCompare=" + statusAutoPhotoCompare + ", statusManuPhotoCompare=" + statusManuPhotoCompare
				+ ", statusBrokerCheck=" + statusBrokerCheck + ", statusBrokerOA=" + statusBrokerOA + " ]";
	}
}

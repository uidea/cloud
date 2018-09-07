/**
 * 
 */
package com.cloud.model.core;

import org.apache.ibatis.type.Alias;

/**
 * @ClassName: User
 * @Description: 用户信息
 * @date: 2018年7月6日 下午4:54:11
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

@Alias("user")
public class User {

	private String id;
	private String name;
	private String age;
	private String sex;// 0女生 1男生
	private String idNo;
	private String address;
	private Integer edu;// 0小学 1初中 2高中 3本科 4硕士 5博士 6其他
	private Integer dept;// 0信息技术部 1财务部 2产品部 3销售部 4秘书部 5其他
	private String telNo;
	private String lastModifyDate;
	private String lastModifyUser;

	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getEdu() {
		return edu;
	}

	public void setEdu(Integer edu) {
		this.edu = edu;
	}

	public Integer getDept() {
		return dept;
	}

	public void setDept(Integer dept) {
		this.dept = dept;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(String lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public String getLastModifyUser() {
		return lastModifyUser;
	}

	public void setLastModifyUser(String lastModifyUser) {
		this.lastModifyUser = lastModifyUser;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", idNo=" + idNo + ", address=" + address + ", edu="
				+ edu + ", dept=" + dept + ", telNo=" + telNo + ", lastModifyDate=" + lastModifyDate + ", lastModifyUser=" + lastModifyUser
				+ "]";
	}

}

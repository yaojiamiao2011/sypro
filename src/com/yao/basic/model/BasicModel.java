package com.yao.basic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BasicModel {

	private Long sid;
	private Date editDate;
	
	private String editMan;
	private String editRemark;
	private Date addDate;
	@Column(length=30)
	private String addMan;
	@Column(length=100)
	private String addRemark;
	
	@Id
	@GeneratedValue
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public Date getEditDate() {
		return editDate;
	}
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	@Column(length=30)
	public String getEditMan() {
		return editMan;
	}
	public void setEditMan(String editMan) {
		this.editMan = editMan;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	@Column(length=30)
	public String getAddMan() {
		return addMan;
	}
	public void setAddMan(String addMan) {
		this.addMan = addMan;
	}
	
	@Column(length=100)
	public String getEditRemark() {
		return editRemark;
	}
	public void setEditRemark(String editRemark) {
		this.editRemark = editRemark;
	}
	
	@Column(length=100)
	public String getAddRemark() {
		return addRemark;
	}
	public void setAddRemark(String addRemark) {
		this.addRemark = addRemark;
	}


	
}
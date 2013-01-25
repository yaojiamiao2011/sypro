package com.yao.pu.model;

import java.util.Date;

import javax.persistence.Entity;

import com.yao.basic.model.BasicModel;

/**
 * User: yaojiamiao
 * Date: 12-10-25  
 * Version: 1.0
 */
@Entity
public class PuUpLog extends BasicModel {

	private Date ymd;
	private int no;
	private String upLog;
	
	public String getUpLog() {
		return upLog;
	}
	public void setUpLog(String upLog) {
		this.upLog = upLog;
	}
	public Date getYmd() {
		return ymd;
	}
	public void setYmd(Date ymd) {
		this.ymd = ymd;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}

package com.yao.test.model;

import javax.persistence.Entity;

import com.yao.basic.model.BasicModel;

/**
 * User: yaojiamiao
 * Date: 12-10-24  
 * Version: 1.0
 */
@Entity
public class TestTable extends BasicModel {

	private String testName;

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
}

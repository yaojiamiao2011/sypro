package com.yao.test.model;

import javax.persistence.Entity;

import com.yao.basic.model.BasicModel;

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

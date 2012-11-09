package com.yao.pu.dao.impl;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import basic.BasicSpringTest;

import com.yao.pu.model.PuUpLog;

public class PuUpLogDaoImplTest extends BasicSpringTest {

	@AfterClass
	public static void afterClass() {
		// sf.close();
	}
	@Autowired
	private PuUpLogDaoImpl dao1;



	@Test
	public void testSave() {

		System.out.println("OK LA!");
		PuUpLog t = new PuUpLog();
		
		t.setYmd(new Date());
		t.setUpLog("测试一下吧。");
		//t.setAddDate(new Date());
		
		//System.out.println(ctx.getBean("TestAccountDAO"));
		dao1.save(t);
		System.out.println("OK LA!");

	}


}

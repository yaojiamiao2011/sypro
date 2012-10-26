package com.yao.pu.dao.impl;

import static org.junit.Assert.*;

import java.util.Date;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
		
		//System.out.println(ctx.getBean("TestAccountDAO"));
		dao1.save(t);
		System.out.println("OK LA!");

	}


}

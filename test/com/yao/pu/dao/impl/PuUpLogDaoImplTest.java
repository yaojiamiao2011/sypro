package com.yao.pu.dao.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import sy.model.Syportal;

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
		System.out.println("OK LA end!");
		
		List<PuUpLog> list =dao1.find("from PuUpLog");
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.print(i+1);
			System.out.println(list.get(i));
			//list.remove(i);
			} 
		 for (Iterator i = list.iterator(); i.hasNext();) {
			 PuUpLog v = (PuUpLog) i.next();
	            System.out.println("---------------");
	            System.out.println(v.getUpLog());
	            System.out.println(v.getAddDate());
	            System.out.println(i.next());
	            System.out.println("``````````````````");
	        }
	}


}

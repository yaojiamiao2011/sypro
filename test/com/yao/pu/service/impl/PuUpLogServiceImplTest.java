package com.yao.pu.service.impl;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import basic.BasicSpringTest;

import com.yao.pu.model.PuUpLog;
import com.yao.pu.service.PuUpLogServiceI;

public class PuUpLogServiceImplTest extends BasicSpringTest{
	    @Autowired
	    private PuUpLogServiceI puUpLogService;

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		    	PuUpLog t = new PuUpLog();
		    	t.setUpLog("test on 001");
		    	t.setNo(1);
		    	t.setAddDate(new Date());
		    	//t.setSid((long) 3);
		    	
		    	puUpLogService.add(t);
	}

}

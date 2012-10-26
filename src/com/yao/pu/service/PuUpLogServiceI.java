package com.yao.pu.service;


import sy.service.BaseServiceI;

import com.yao.pu.model.PuUpLog;

/**
 * 更新日志Service
 * 
 * @author 
 * 
 */
public interface PuUpLogServiceI extends BaseServiceI {

	
	public PuUpLog add(PuUpLog puUpLog);

	public PuUpLog edit(PuUpLog puUpLog);

	public void del(String ids);

}

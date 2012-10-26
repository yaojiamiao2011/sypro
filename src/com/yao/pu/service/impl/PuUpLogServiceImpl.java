package com.yao.pu.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.BaseDaoI;
import sy.model.Syrole;
import sy.service.impl.BaseServiceImpl;

import com.yao.pu.model.PuUpLog;
import com.yao.pu.service.PuUpLogServiceI;

/**
 * 用户Service
 * 
 * @author 孙宇
 * 
 */

@Service("puUpLogService")
public class PuUpLogServiceImpl extends BaseServiceImpl implements
		PuUpLogServiceI {


	private BaseDaoI<PuUpLog> puUpLogDao;

	public BaseDaoI<PuUpLog> getPuUpLogDao() {
		return puUpLogDao;
	}

	@Autowired
	public void setPuUpLogDao(BaseDaoI<PuUpLog> puUpLogDao) {
		this.puUpLogDao = puUpLogDao;
	}
	

	// @CacheEvict(value = "syproUserCache", allEntries = true)
	public PuUpLog add(PuUpLog puUpLog) {

		PuUpLog t = new PuUpLog();
		BeanUtils.copyProperties(puUpLog, t);
		puUpLogDao.save(puUpLog);

		return puUpLog;
	}

	// @CacheEvict(value = "syproUserCache", allEntries = true)
	public void del(String ids) {
		/**
		for (String id : ids.split(",")) {
			PuUpLog t = puUpLogDao.get(PuUpLog.class, id);
			puUpLogDao.delete(t);
		}
		*/

	}

	// @CacheEvict(value = { "syproAuthCache", "syproUserCache" }, allEntries =
	// true)
	public PuUpLog edit(PuUpLog puUpLog) {

		// TODO Auto-generated method stub
		// Syuser syuser = userDao.get(Syuser.class, user.getId());
		//PuUpLog t = puUpLogDao.get(PuUpLog.class, puUpLog.getSid());
		//puUpLogDao.save(t);
		return puUpLog;
	}

}

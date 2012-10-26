package com.yao.pu.dao.impl;

import org.springframework.stereotype.Repository;

import com.yao.pu.dao.PuUpLogDaoI;


import sy.dao.impl.BaseDaoImpl;

@Repository("puUpLogDao")
public class PuUpLogDaoImpl<T> extends BaseDaoImpl<T> implements PuUpLogDaoI<T> {

}

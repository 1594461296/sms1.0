package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Qq;
import com.briup.app02.dao.QqMapper;
import com.briup.app02.service.IQqService;


@Service
public  class QqServiceImpl implements IQqService {
	@Autowired
	private QqMapper qqMapper;

	

	@Override
	public Qq findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Qq qq=qqMapper.findById(id);
		return qq;
	}

	@Override
	public void save(Qq qq) throws Exception {
		// TODO Auto-generated method stub
		qqMapper.save(qq);
	}

	@Override
	public void updateQq(Qq qq) throws Exception {
		// TODO Auto-generated method stub
		qqMapper.updateQq(qq);
	}

	@Override
	public void delQqById(long id) throws Exception {
		// TODO Auto-generated method stub
		qqMapper.delQqById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		qqMapper.deleteAll();
	}

	@Override
	public List<Qq> findAllVM() throws Exception {
		// TODO Auto-generated method stub
		return qqMapper.findAllVM();
	}

	

	
	
}










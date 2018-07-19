package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Clazz;
import com.briup.app02.dao.ClazzMapper;
import com.briup.app02.dao.extend.ClazzVMMapper;
import com.briup.app02.service.IClazzService;
import com.briup.app02.vm.ClazzVM;


@Service
public  class ClazzServiceImpl implements IClazzService {
	@Autowired
	private ClazzMapper ClassMapper;
	@Autowired
	private ClazzVMMapper clazzvmmapper;
	
	@Override
	public List<Clazz> findAll() throws Exception {
		//调用ClassMapper查询所有学生
		List<Clazz> list = ClassMapper.findAll();
		
		return list;
	}


	@Override
	public Clazz findById(long id) throws Exception {
		
		return ClassMapper.findById(id);
	}




	@Override
	public void save(Clazz Class) throws Exception {
		// TODO Auto-generated method stub
		ClassMapper.save(Class);
	}


	@Override
	public void updateClass(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		ClassMapper.updateClass(clazz);
		
	}


	@Override
	public void delClassById(long id) throws Exception {
		// TODO Auto-generated method stub
		ClassMapper.delClassById(id);
	}


	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		ClassMapper.deleteAll();
	}


	@Override
	public List<ClazzVM> findAllClazzVM() throws Exception {
		// TODO Auto-generated method stub
           return 	clazzvmmapper.findAllClazzVM();
		
	}


	
	


	
	}














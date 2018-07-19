package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Grade;
import com.briup.app02.dao.GradeMapper;
import com.briup.app02.service.IGradeService;

@Service
public  class GradeServiceImpl implements IGradeService {
	@Autowired
	private GradeMapper gradeMapper;

	@Override
	public List<Grade> findAll() throws Exception {
		// TODO Auto-generated method stub
		 List<Grade> list=gradeMapper.findAll();
		return list;
	}

	@Override
	public Grade findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Grade grade=gradeMapper.findById(id);
		return grade;
	}

	@Override
	public void save(Grade grade) throws Exception {
		// TODO Auto-generated method stub
		gradeMapper.save(grade);
	}

	@Override
	public void updateGrade(Grade grade) throws Exception {
		// TODO Auto-generated method stub
		gradeMapper.updateGrade(grade);
	}

	@Override
	public void delGradeById(long id) throws Exception {
		// TODO Auto-generated method stub
		gradeMapper.delGradeById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		gradeMapper.deleteAll();
	}
	
	

	
	}














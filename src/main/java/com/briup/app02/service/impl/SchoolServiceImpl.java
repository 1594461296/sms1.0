package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.School;
import com.briup.app02.dao.SchoolMapper;
import com.briup.app02.service.ISchoolService;

@Service
public  class SchoolServiceImpl implements ISchoolService {
	@Autowired
	private SchoolMapper SchoolMapper;

	@Override
	public List<School> findAll() throws Exception {
		// TODO Auto-generated method stub
		 List<School> list=SchoolMapper.findAll();
		return list;
	}

	@Override
	public School findById(long id) throws Exception {
		// TODO Auto-generated method stub
		School School=SchoolMapper.findById(id);
		return School;
	}

	@Override
	public void save(School School) throws Exception {
		// TODO Auto-generated method stub
		SchoolMapper.save(School);
	}

	@Override
	public void updateSchool(School School) throws Exception {
		// TODO Auto-generated method stub
		SchoolMapper.updateSchool(School);
	}

	@Override
	public void delSchoolById(long id) throws Exception {
		// TODO Auto-generated method stub
		SchoolMapper.delSchoolById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		SchoolMapper.deleteAll();
	}
}











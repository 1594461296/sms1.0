package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Course;
import com.briup.app02.dao.CourseMapper;
import com.briup.app02.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper CourseMapper;
	
	
	@Override
	public List<Course> findAll() throws Exception {
		//调用CourseMapper查询所有学生
		List<Course> list = CourseMapper.findAll();
		
		return list;
	}


	@Override
	public Course findById(long id) throws Exception {
		
		return CourseMapper.findById(id);
	}




	@Override
	public void save(Course Course) throws Exception {
		// TODO Auto-generated method stub
		CourseMapper.save(Course);
	}


	@Override
	public void updateCourse(Course clazz) throws Exception {
		// TODO Auto-generated method stub
		CourseMapper.updateCourse(clazz);
		
	}


	@Override
	public void delCourseById(long id) throws Exception {
		// TODO Auto-generated method stub
		CourseMapper.delCourseById(id);
	}


	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		CourseMapper.deleteAll();
	}
	
	


	
	}











package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Course;

public interface CourseMapper {

	List <Course> findAll();
	Course findById(long id );
	void save(Course course);
	void updateCourse(Course course);
	void delCourseById(long id);
	void deleteAll();
}

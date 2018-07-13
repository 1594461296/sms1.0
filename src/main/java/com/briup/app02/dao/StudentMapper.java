package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Student;

public interface StudentMapper {
	// 查询所有学生信息
	List<Student> findAll();
	
	// 通过id查询学生信息
	Student findById(long id);
	//通过id来更新学生信息
	void updateById(Student student);
    //
	void save(Student student);
	
	
	
	
	
}

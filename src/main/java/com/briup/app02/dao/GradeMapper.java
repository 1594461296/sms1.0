package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Grade;

public interface GradeMapper {

	List <Grade> findAll();
	Grade findById(long id );
	void save(Grade grade);
	void updateGrade(Grade grade);
	void delGradeById(long id);
	void deleteAll();
}

package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Clazz;
import com.briup.app02.vm.ClazzVM;


public interface IClazzService {

	List <Clazz> findAll() throws Exception;
    List <ClazzVM> findAllClazzVM() throws Exception;
	Clazz findById(long id ) throws Exception;
	void save(Clazz clazz) throws Exception;
	void updateClass(Clazz clazz) throws Exception;
	void delClassById(long id) throws Exception;
	void deleteAll() throws Exception;
}

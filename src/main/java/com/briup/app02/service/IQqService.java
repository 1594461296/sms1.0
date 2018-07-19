package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Qq;


public interface IQqService {

	
	
    List<Qq> findAllVM() throws Exception;
	Qq findById(long id)throws Exception;
	void save(Qq qq) throws Exception;
	void updateQq(Qq qq) throws Exception;
	void delQqById(long id) throws Exception;
	void deleteAll() throws Exception;
	
	
	
	
}

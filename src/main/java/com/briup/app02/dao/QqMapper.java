package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Qq;



public interface QqMapper {
	

	
    List<Qq> findAllVM();
	Qq findById(long id );
	void save(Qq qq);
	void updateQq(Qq qq);
	void delQqById(long id);
	void deleteAll();

}

package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Option;

public interface IOptionService {
	
	

   
	List<Option> findbyQuestionId(long id);
	Option findById(long id )throws Exception;
	void save(Option option) throws Exception;
	void saveoption(Option option) throws Exception;
	void updateOption(Option option) throws Exception;
	void delOptionById(long id) throws Exception;
	void deleteAll() throws Exception;
}

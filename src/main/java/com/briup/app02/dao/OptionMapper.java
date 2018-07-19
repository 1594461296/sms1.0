package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Option;


public interface OptionMapper {

	
	
	List <Option> findbyQuestionId(long id);
	
	Option findById(long id );
	
	void save(Option option);
	void saveoption(Option option);
	
	void updateOption(Option option);
	void delOptionById(long id);
	void deleteAll();
}

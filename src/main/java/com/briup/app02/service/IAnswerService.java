package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Answer;
import com.briup.app02.vm.AnswerVM;



public interface IAnswerService {

	List <AnswerVM> findAllAnswer() throws Exception;
	
	List <Answer> findAll() throws Exception;
	Answer findById(long id ) throws Exception;
	void save(Answer answer) throws Exception;
	void updateAnswer(Answer answer) throws Exception;
	void delAnswerById(long id) throws Exception;
	void deleteAll() throws Exception;
	
}

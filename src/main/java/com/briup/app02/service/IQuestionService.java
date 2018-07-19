package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Question;
import com.briup.app02.vm.QuestionVM;


public interface IQuestionService {
	
	 void saveQuestion(QuestionVM questionVM) throws Exception;
	 

    List<QuestionVM> findAllQuestion() throws Exception;
	List <Question> findAll() throws Exception;
	Question findById(long id) throws Exception;
	
	void save(Question question) throws Exception;
	
	void updateQuestion(Question question) throws Exception;
	void delQuestionById(long id) throws Exception;
	void deleteAll() throws Exception;
}

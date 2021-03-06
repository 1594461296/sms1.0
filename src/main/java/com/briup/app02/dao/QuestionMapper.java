package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Question;

public interface QuestionMapper {

	List <Question> findAll();
	Question findById(long id );
	
	void save(Question question);
	
	void updateQuestion(Question question);
	void delQuestionById(long id);
	void deleteAll();
}

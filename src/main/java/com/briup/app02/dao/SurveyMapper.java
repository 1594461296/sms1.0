package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Survey;

public interface  SurveyMapper {

	List <Survey> findAllVM();
	Survey findById(long id );
	void save(Survey survey);
	void updateSurvey(Survey survey);
	void delSurveyById(long id);
	void deleteAll();
}

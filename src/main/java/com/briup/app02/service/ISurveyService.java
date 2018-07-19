package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Survey;

public interface ISurveyService {


	List <Survey> findAllVM() throws Exception;
	Survey findById(long id) throws Exception;
	void save(Survey survey) throws Exception;
	void updateSurvey(Survey survey) throws Exception;
	void delSurveyById(long id) throws Exception;
	void deleteAll() throws Exception;
}

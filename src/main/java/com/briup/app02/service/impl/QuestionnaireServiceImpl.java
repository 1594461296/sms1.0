package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.dao.QuestionnaireMapper;
import com.briup.app02.service.IQuestionnaireService;

@Service
public  class QuestionnaireServiceImpl implements IQuestionnaireService {
	@Autowired
	private QuestionnaireMapper QuestionnaireMapper;

	@Override
	public List<Questionnaire> findAll() throws Exception {
		// TODO Auto-generated method stub
		 List<Questionnaire> list=QuestionnaireMapper.findAll();
		return list;
	}

	@Override
	public Questionnaire findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Questionnaire Questionnaire=QuestionnaireMapper.findById(id);
		return Questionnaire;
	}

	@Override
	public void save(Questionnaire Questionnaire) throws Exception {
		// TODO Auto-generated method stub
		QuestionnaireMapper.save(Questionnaire);
	}

	@Override
	public void updateQuestionnaire(Questionnaire Questionnaire) throws Exception {
		// TODO Auto-generated method stub
		QuestionnaireMapper.updateQuestionnaire(Questionnaire);
	}

	@Override
	public void delQuestionnaireById(long id) throws Exception {
		// TODO Auto-generated method stub
		QuestionnaireMapper.delQuestionnaireById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		QuestionnaireMapper.deleteAll();
	}
}














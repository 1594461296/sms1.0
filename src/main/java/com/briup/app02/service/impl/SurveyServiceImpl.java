package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Survey;
import com.briup.app02.dao.SurveyMapper;
import com.briup.app02.service.ISurveyService;

@Service
public  class SurveyServiceImpl implements ISurveyService {
	@Autowired
	private SurveyMapper SurveyMapper;

	@Override
	public List<Survey> findAllVM() throws Exception {
		// TODO Auto-generated method stub
		 List<Survey> list=SurveyMapper.findAllVM();
		return list;
	}

	@Override
	public Survey findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Survey Survey=SurveyMapper.findById(id);
		return Survey;
	}

	@Override
	public void save(Survey Survey) throws Exception {
		// TODO Auto-generated method stub
		SurveyMapper.save(Survey);
	}

	@Override
	public void updateSurvey(Survey Survey) throws Exception {
		// TODO Auto-generated method stub
		SurveyMapper.updateSurvey(Survey);
	}

	@Override
	public void delSurveyById(long id) throws Exception {
		// TODO Auto-generated method stub
		SurveyMapper.delSurveyById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		SurveyMapper.deleteAll();
	}
	



}






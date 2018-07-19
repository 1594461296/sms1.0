package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Answer;
import com.briup.app02.dao.AnswerMapper;
import com.briup.app02.dao.extend.AnswerVMMapper;
import com.briup.app02.service.IAnswerService;
import com.briup.app02.vm.AnswerVM;

@Service
public  class AnswerServiceImpl implements IAnswerService {
	@Autowired
	private AnswerMapper AnswerMapper;
	@Autowired
	private AnswerVMMapper AnswervmMapper;
	
	@Override
	public List<Answer> findAll() throws Exception {
		//调用AnswerMapper查询所有学生
		List<Answer> list = AnswerMapper.findAll();
		
		return list;
	}


	@Override
	public Answer findById(long id) throws Exception {
		
		return AnswerMapper.findById(id);
	}


	


	@Override
	public void save(Answer answer) throws Exception {
		// TODO Auto-generated method stub
		AnswerMapper.save(answer);
	}


	@Override
	public void updateAnswer(Answer answer) throws Exception {
		// TODO Auto-generated method stub
		AnswerMapper.updateAnswer(answer);;
	}


	@Override
	public void delAnswerById(long id) throws Exception {
		// TODO Auto-generated method stub
		
		AnswerMapper.delAnswerById(id);
	}


	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		AnswerMapper.deleteAll();
	}


	@Override
	public List<AnswerVM> findAllAnswer() throws Exception {
		// TODO Auto-generated method stub
		
		return AnswervmMapper.findAllAnswer();
	}


	
	
	}














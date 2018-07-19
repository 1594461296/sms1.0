package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Option;
import com.briup.app02.bean.Question;
import com.briup.app02.dao.OptionMapper;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.dao.extend.QuestionVMMapper;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.vm.QuestionVM;


@Service
public  class QuestionServiceImpl implements IQuestionService {
	@Autowired
	private QuestionMapper QuestionMapper;
   @Autowired
    private QuestionVMMapper QuestionVMMapper;
   @Autowired
   private OptionMapper optionmapper;
   
   @Override
   public void saveQuestion(QuestionVM questionVM) throws Exception{
	   
	   Long questionId=questionVM.getId();
	   String questionName=questionVM.getName();
	   String questionType=questionVM.getQuestiontype();
	   
	   Question question=new Question(questionId, questionName, questionType);
	   
	   List<Option> options=questionVM.getOptions();
	   
	   QuestionMapper.save(question);
	   
	   Long question_id=question.getId();
	   
	   System.out.println("========="+question_id);
	   for(Option option:options)
	   {
		   option.setQuestion_id(question_id);
		   optionmapper.save(option);
	   }
   }
	
 
 
	@Override
	public List<Question> findAll() throws Exception {
		// TODO Auto-generated method stub
		 List<Question> list=QuestionMapper.findAll();
		return list;
	}

	@Override
	public Question findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Question Question=QuestionMapper.findById(id);
		return Question;
	}

	@Override
	public void save(Question Question) throws Exception {
		// TODO Auto-generated method stub
		QuestionMapper.save(Question);
	}

	@Override
	public void updateQuestion(Question Question) throws Exception {
		// TODO Auto-generated method stub
		QuestionMapper.updateQuestion(Question);
	}

	@Override
	public void delQuestionById(long id) throws Exception {
		// TODO Auto-generated method stub
		QuestionMapper.delQuestionById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		QuestionMapper.deleteAll();
	}

	@Override
	public List<QuestionVM> findAllQuestion() throws Exception {
		// TODO Auto-generated method stub
		return QuestionVMMapper.findAllQuestion();
	}

	
}












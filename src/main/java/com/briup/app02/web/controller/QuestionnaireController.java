package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.service.IQuestionnaireService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Questionnaire")
public class QuestionnaireController {
	
   @Autowired
   private IQuestionnaireService Questionnaireservice;

   
   @GetMapping("findAllQuestionnaire")
   public MsgResponse findAll()
   {
	   try {
		List<Questionnaire> list=Questionnaireservice.findAll();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   
   @GetMapping("findQuestionnaireById")
   public MsgResponse findById(long id){
	   try {
		Questionnaire Questionnaire=Questionnaireservice.findById(id);
		return MsgResponse.success("查询完成", Questionnaire);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("saveQuestionnaire")
   public MsgResponse save(Questionnaire Questionnaire)
   {
	   try {
		Questionnaireservice.save(Questionnaire);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateQuestionnaire")
   public MsgResponse updateQuestionnaire(Questionnaire Questionnaire){
	   try {
		Questionnaireservice.updateQuestionnaire(Questionnaire);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteQuestionnaireById")
public MsgResponse delQuestionnaireById(long id)
{
	try {
		Questionnaireservice.delQuestionnaireById(id);
		return MsgResponse.success("删除成功", null);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
         return MsgResponse.error(e.getMessage());
	}}
	
@PostMapping("deleteAll")
public MsgResponse deletAll()
{
	try{
		Questionnaireservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
}

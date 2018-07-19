package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;
import com.briup.app02.vm.QuestionVM;

import io.swagger.annotations.Api;

@Api(description="问题相关接口")
@RestController
@RequestMapping("/Question")
public class QuestionController {
	
   @Autowired
   private IQuestionService Questionservice;

   
   
   @PostMapping("saveQuestion")
   public MsgResponse saveQuestion(QuestionVM questionVM)
   {
	try {
		System.out.println("========"+questionVM);
		Questionservice.saveQuestion(questionVM);
		return MsgResponse.success("保存成功", null);	
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	   
   }
   
   
   @GetMapping("findAllQuestionVM")
   public MsgResponse findAllQuestionVM()
   {
	   try {
		   List<QuestionVM> list=Questionservice.findAllQuestion();
		   return MsgResponse.success("查询完成", list);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
   
   @GetMapping("findAllQuestion")
   public MsgResponse findAll()
   {
	   try {
		List<Question> list=Questionservice.findAll();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   
   @GetMapping("findQuestionById")
   public MsgResponse findById(long id){
	   try {
		Question Question=Questionservice.findById(id);
		return MsgResponse.success("查询完成", Question);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("save")
   public MsgResponse save(Question Question)
   {
	   try {
		Questionservice.save(Question);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateQuestion")
   public MsgResponse updateQuestion(Question Question){
	   try {
		Questionservice.updateQuestion(Question);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteQuestionById")
public MsgResponse delQuestionById(long id)
{
	try {
		Questionservice.delQuestionById(id);
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
		Questionservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
}

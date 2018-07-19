package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Answer;
import com.briup.app02.service.IAnswerService;
import com.briup.app02.util.MsgResponse;
import com.briup.app02.vm.AnswerVM;

@RestController
@RequestMapping("/Answer")
public class AnswerController {
	
   @Autowired
   private IAnswerService Answerservice;

   
   
   @GetMapping("findAllAnswerVM")
   
   public MsgResponse findAllAnswerVM()
   {
	   try {
		List<AnswerVM> list=Answerservice.findAllAnswer();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   @GetMapping("findAllAnswer")
   public MsgResponse findAll()
   {
	   try {
		List<Answer> list=Answerservice.findAll();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   
   @GetMapping("findAnswerById")
   public MsgResponse findById(long id){
	   try {
		Answer Answer=Answerservice.findById(id);
		return MsgResponse.success("查询完成", Answer);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("saveAnswer")
   public MsgResponse save(Answer Answer)
   {
	   try {
		Answerservice.save(Answer);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateAnswer")
   public MsgResponse updateAnswer(Answer Answer){
	   try {
		Answerservice.updateAnswer(Answer);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteAnswerById")
public MsgResponse delAnswerById(long id)
{
	try {
		Answerservice.delAnswerById(id);
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
		Answerservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
	
	
}

package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Survey;
import com.briup.app02.service.ISurveyService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Survey")
public class SurveyController {
	
   @Autowired
   private ISurveyService Surveyservice;

   
   @GetMapping("findAllSurvey")
   public MsgResponse findAll()
   {
	   try {
		List<Survey> list=Surveyservice.findAllVM();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   
   @GetMapping("findSurveyById")
   public MsgResponse findById(long id){
	   try {
		Survey Survey=Surveyservice.findById(id);
		return MsgResponse.success("查询完成", Survey);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("saveSurvey")
   public MsgResponse save(Survey Survey)
   {
	   try {
		Surveyservice.save(Survey);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateSurvey")
   public MsgResponse updateSurvey(Survey Survey){
	   try {
		Surveyservice.updateSurvey(Survey);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteSurveyById")
public MsgResponse delSurveyById(long id)
{
	try {
		Surveyservice.delSurveyById(id);
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
		Surveyservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
	
}

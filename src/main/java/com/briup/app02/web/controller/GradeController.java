package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Grade;
import com.briup.app02.service.IGradeService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Grade")
public class GradeController {
	
   @Autowired
   private IGradeService Gradeservice;

   
   @GetMapping("findAllGrade")
   public MsgResponse findAll()
   {
	   try {
		List<Grade> list=Gradeservice.findAll();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   
   @GetMapping("findGradeById")
   public MsgResponse findById(long id){
	   try {
		Grade Grade=Gradeservice.findById(id);
		return MsgResponse.success("查询完成", Grade);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("saveGrade")
   public MsgResponse save(Grade Grade)
   {
	   try {
		Gradeservice.save(Grade);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateGrade")
   public MsgResponse updateGrade(Grade Grade){
	   try {
		Gradeservice.updateGrade(Grade);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteGradeById")
public MsgResponse delGradeById(long id)
{
	try {
		Gradeservice.delGradeById(id);
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
		Gradeservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
	
}

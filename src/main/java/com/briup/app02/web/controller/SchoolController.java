package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.School;
import com.briup.app02.service.ISchoolService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/School")
public class SchoolController {
	
   @Autowired
   private ISchoolService Schoolservice;

   
   @GetMapping("findAllSchool")
   public MsgResponse findAll()
   {
	   try {
		List<School> list=Schoolservice.findAll();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   
   @GetMapping("findSchoolById")
   public MsgResponse findById(long id){
	   try {
		School School=Schoolservice.findById(id);
		return MsgResponse.success("查询完成", School);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("saveSchool")
   public MsgResponse save(School School)
   {
	   try {
		Schoolservice.save(School);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateSchool")
   public MsgResponse updateSchool(School School){
	   try {
		Schoolservice.updateSchool(School);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteSchoolById")
public MsgResponse delSchoolById(long id)
{
	try {
		Schoolservice.delSchoolById(id);
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
		Schoolservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
	
}

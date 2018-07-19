package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.briup.app02.bean.Qq;
import com.briup.app02.service.IQqService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/Qq")
public class QqController {
	
   @Autowired
   private IQqService Qqservice;
   

   
   
   @GetMapping("findaAllVM")
   public MsgResponse findAllVM()
   {
	   try {
		   List<Qq> list=Qqservice.findAllVM();
		   return MsgResponse.success("OJBK", list);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }

   
 
   
   @GetMapping("findQqById")
   public MsgResponse findById(long id){
	   try {
		Qq Qq=Qqservice.findById(id);
		return MsgResponse.success("查询完成", Qq);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("saveQq")
   public MsgResponse save(Qq Qq)
   {
	   try {
		Qqservice.save(Qq);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateQq")
   public MsgResponse updateQq(Qq Qq){
	   try {
		Qqservice.updateQq(Qq);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteQqById")
public MsgResponse delQqById(long id)
{
	try {
		Qqservice.delQqById(id);
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
		Qqservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
	
	
}

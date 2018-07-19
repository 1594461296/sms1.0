package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Clazz;
import com.briup.app02.service.IClazzService;
import com.briup.app02.util.MsgResponse;
import com.briup.app02.vm.ClazzVM;

import io.swagger.annotations.Api;

@Api(description="班级相关接口")
@RestController
@RequestMapping("/Clazz")
public class ClazzController {
	
   @Autowired
   private IClazzService clazzservice;

  @GetMapping("findAllClazzVM")
  public MsgResponse findAllClazzVM()
  {
	   try {
		List<ClazzVM> list=clazzservice.findAllClazzVM();
		return MsgResponse.success("success", list);	   
	} 
	   catch (Exception e) {
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
		
	}
	   
  }   

   
   @GetMapping("findAllClazz")
   public MsgResponse findAll()
   {
	   try {
		List<Clazz> list=clazzservice.findAll();
		return MsgResponse.success("查询完成", list);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		return MsgResponse.error(e.getMessage());
		
	}
   }   
   
   @GetMapping("findClassById")
   public MsgResponse findById(long id){
	   try {
		Clazz clazz=clazzservice.findById(id);
		return MsgResponse.success("查询完成", clazz);
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("saveClass")
   public MsgResponse save(Clazz Class)
   {
	   try {
		clazzservice.save(Class);
		   return MsgResponse.success("保存成功",null);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   @PostMapping("updateClass")
   public MsgResponse updateClass(Clazz Class){
	   try {
		clazzservice.updateClass(Class);
		return MsgResponse.success("更改完成", null);
	} catch (Exception e) {
		// TODO: handle exception	
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
   }
   
@PostMapping("deleteClassById")
public MsgResponse delClassById(long id)
{
	try {
		clazzservice.delClassById(id);
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
		clazzservice.deleteAll();
		return MsgResponse.success("清除成功", null);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
	
	
}

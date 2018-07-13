package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;
import com.briup.app02.util.MsgResponse;


@RestController
@RequestMapping("/student")
public class StudentController {
	// 注入studentService的实例
	@Autowired
	private IStudentService studentService;
	
	// http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllStudent")
	public MsgResponse findAllStudent(){
		try {
			List<Student> list = studentService.findAll();
			return MsgResponse.success("查询完成", list) ;
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findStudentById")
	public MsgResponse findStudentById(long id){
		try {
			Student student = studentService.findById(id);
			return MsgResponse.success("以查找", student);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveStudent")
	public MsgResponse insertStudent(Student student)
	{
		try {
			studentService.save(student);
			return MsgResponse.success("保存成功",null);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			 return MsgResponse.error(e.getMessage()) ;
		}
	}
	
	@PostMapping("updateStudent")

	public MsgResponse updateById(Student student)
{
		try {
			studentService.updateById(student);
			return MsgResponse.success("更新成功", null);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		}
	
}














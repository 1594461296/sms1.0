package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.User;
import com.briup.app02.dao.UserMapper;
import com.briup.app02.service.IUserService;

@Service
public  class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper UserMapper;

	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		 List<User> list=UserMapper.findAll();
		return list;
	}

	@Override
	public User findById(long id) throws Exception {
		// TODO Auto-generated method stub
		User User=UserMapper.findById(id);
		return User;
	}

	@Override
	public void save(User User) throws Exception {
		// TODO Auto-generated method stub
		UserMapper.save(User);
	}

	@Override
	public void updateUser(User User) throws Exception {
		// TODO Auto-generated method stub
		UserMapper.updateUser(User);
	}

	@Override
	public void delUserById(long id) throws Exception {
		// TODO Auto-generated method stub
		UserMapper.delUserById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		UserMapper.deleteAll();
	}
}














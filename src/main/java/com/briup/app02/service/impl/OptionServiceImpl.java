package com.briup.app02.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.briup.app02.bean.Option;
import com.briup.app02.dao.OptionMapper;
import com.briup.app02.service.IOptionService;

@Service
public  class OptionServiceImpl implements IOptionService {
	@Autowired
	private OptionMapper optionMapper;

	

	@Override
	public Option findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Option option=optionMapper.findById(id);
		return option;
	}

	@Override
	public void save(Option option) throws Exception {
		// TODO Auto-generated method stub
		optionMapper.save(option);
	}

	@Override
	public void updateOption(Option option) throws Exception {
		// TODO Auto-generated method stub
		optionMapper.updateOption(option);
	}

	@Override
	public void delOptionById(long id) throws Exception {
		// TODO Auto-generated method stub
		optionMapper.delOptionById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		optionMapper.deleteAll();
	}

	@Override
	public List<Option> findbyQuestionId(long id) {
		// TODO Auto-generated method stub
		return optionMapper.findbyQuestionId(id);
	}

	@Override
	public void saveoption(Option option) throws Exception {
		// TODO Auto-generated method stub
		optionMapper.saveoption(option);
	}

	
}




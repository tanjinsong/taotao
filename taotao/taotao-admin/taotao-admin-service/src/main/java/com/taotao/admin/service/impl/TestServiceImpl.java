package com.taotao.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.admin.itfservice.TestService;
import com.taotao.admin.mapper.TestMapperService;
@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapperService testMapperService;
	@Override
	public String queryCurrentDate() {
		
		return testMapperService.queryCurrentDate();
	}

	
}

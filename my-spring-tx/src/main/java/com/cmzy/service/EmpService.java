package com.cmzy.service;

import com.cmzy.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	private EmpDao empDao;

	public void insertInfo(){
		empDao.insertInfo();
		System.out.println("insert success");
	}
}

package com.cmzy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class EmpDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(transactionManager = "")
	public void insertInfo(){
		String sql = "INSERT INTO `person`.`test` (`name`) VALUES (?)";
		String name  = UUID.randomUUID().toString().substring(0,5);
		jdbcTemplate.update(sql,name);

		//int i = 10 /0;
	}
}

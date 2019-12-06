package com.cmzy.test;

import com.cmzy.service.EmpService;
import com.cmzy.tx.TxApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tx_Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TxApp.class);

		EmpService empService = (EmpService) ac.getBean("empService");
		empService.insertInfo();

		ac.close();
	}
}

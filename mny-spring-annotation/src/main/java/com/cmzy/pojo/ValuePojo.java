package com.cmzy.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValuePojo {

	public ValuePojo(Car car){
		System.out.println(car.toString());
	}

	public void setCar(Car car){
		System.out.println("Autowired is on Function");
		System.out.println(car.toString());
	}
}

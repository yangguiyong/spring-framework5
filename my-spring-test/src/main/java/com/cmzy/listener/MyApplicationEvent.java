package com.cmzy.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.io.Serializable;


public class MyApplicationEvent extends ApplicationEvent {

	private static final long serialVersionUID = 7099057708183571931L;
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public MyApplicationEvent(Object source) {
		super(source);
		System.out.println("this is MyApplicationEvent");
	}
}

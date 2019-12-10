package com.cmzy.utils;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;


public class MyServletContainerInitializer implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

		ServletRegistration.Dynamic myServlet = ctx.addServlet("myServlet", new ServletTest());
		myServlet.addMapping("/hello");
		myServlet.setLoadOnStartup(1);
	}
}

package com.cmzy.utils;

import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * asyncSupported=true表示Servlet支持异步请求
 */
@WebServlet(value="/hello",asyncSupported = true)
public class ServletTest extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		//开启异步模式
		AsyncContext asyncContext = req.startAsync()	;

		asyncContext.start(new Runnable() {
			@Override
			public void run() {
				System.out.println("异步执行业务逻辑");

				//执行完业务逻辑后执行complete()方法，表示执行完成
				asyncContext.complete();

				//获取响应，返回数据
				ServletResponse response = asyncContext.getResponse();
				try {
					response.getWriter().write("返回数据");
				} catch (IOException e) {
					e.printStackTrace();
				}


			}
		});
	}
}

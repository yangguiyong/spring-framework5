package com.cmzy.pojo;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean implements SmartLifecycle {


	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println("执行LifecycleBean strop（Runnable） 方法 ");
	}

	@Override
	public void start() {
		System.out.println("执行LifecycleBean start 方法");
	}

	@Override
	public void stop() {
		System.out.println("执行LifecycleBean stop 方法");
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public int getPhase() {
		return 0;
	}
}

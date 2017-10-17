package com.newlecture.webapp.aop.spring;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeHandler implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		//왠만해서는 주업무와는 독립적으로 생각해야한다.

		System.out.println("before handler");
	}



}

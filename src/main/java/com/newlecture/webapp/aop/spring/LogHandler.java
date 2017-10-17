package com.newlecture.webapp.aop.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LogHandler implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {

		System.out.println("스프링 사전 보조업무");
		
		
		//프로그램 구동 시간 재보기
		StopWatch watch = new StopWatch();
		watch.start();
		Object result = method.proceed();	//무조건 있어야한다.
		watch.stop();
		
		long du = watch.getTotalTimeMillis();
		
		System.out.println("duration : "+du);
				
				
		return result;
	}

}

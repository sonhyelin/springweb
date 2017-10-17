package com.newlecture.webapp.aop.spring;

import org.springframework.aop.ThrowsAdvice;

public class ThrowingHandler implements ThrowsAdvice{
	public void afterThrowing(ArithmeticException e) throws Throwable{
		// 주 업무에서 예외처리가 일어나지 않았을 경우에 사용한다.
		System.out.println("예외가 발생하였습니다:" +e.getMessage());
		
	}
}

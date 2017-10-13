package com.newlecture.webapp.aop.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class Program {

	public static void main(String argsp[]) {
		Calculator origin = new NewlecCalculator() ;
		
		
		int data = cal.add(3, 4);
		//int data = proxy.add(3, 4);
		
		System.out.println(data);
	}
}

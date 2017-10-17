package com.newlecture.webapp.aop.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//aop는 관점지향 프로그래밍이다. 사용자가 아닌 프로그래머의 입장에서의 업무를(기타업무) 담당하는 프로그래밍이다.(보안,트렌젝션,로깅)
//구현하기 위해서는 프록시를 만들어주는 라이브러리를 사용하여야한다.
//근데 우리는 스프링으로 사용해서 구현이 가능하다.

public class Program {

	public static void main(String argsp[]) {
		
		//1 appllicationcontext로 설정파일을 읽어서 ioc 컨테이너로 옮긴다.
		ApplicationContext context= new ClassPathXmlApplicationContext("com/newlecture/webapp/aop/spring/aop-context.xml");
		Calculator cal = (Calculator) context.getBean("cal");
		
		int data = cal.add(3, 4);
		data = cal.div(3, 0);
		//int data = proxy.add(3, 4);
		
		System.out.println(data);
	}
}

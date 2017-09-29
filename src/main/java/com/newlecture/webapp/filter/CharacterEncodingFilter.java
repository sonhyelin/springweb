package com.newlecture.webapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("안녕~~"); //서블릿 또는 필터가 실행되기 전에 실행됨
		chain.doFilter(request, response);
		System.out.println("잘가~~"); //후에 실행
	}
	
	

}

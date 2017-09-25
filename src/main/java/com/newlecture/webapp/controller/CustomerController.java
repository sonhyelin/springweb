package com.newlecture.webapp.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newlecture.webapp.dao.NoticeDao;
import com.newlecture.webapp.entity.NoticeView;

@Controller
@RequestMapping("/customer/*")
public class CustomerController {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@RequestMapping("notice")
	@ResponseBody
	public String notice(@RequestParam(value="p", defaultValue="1")Integer page,
						@RequestParam(value="q", defaultValue="")String query) {
		
		String output = String.format("p:%s, q:%s", page, query);
		
		return output;
		
	}
	@RequestMapping("notice/{id}")
	@ResponseBody
	public String noticeDetail(@PathVariable("id") String aaid) {
		
		NoticeDao noticeDao = sqlSession.getMapper(NoticeDao.class);
		NoticeView noticeView = noticeDao.get(aaid);
		
		
		
		return aaid+"번째 공지사항:"+noticeView.getTitle();
		
	}
}

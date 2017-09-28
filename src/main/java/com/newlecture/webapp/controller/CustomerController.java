package com.newlecture.webapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.newlecture.webapp.dao.NoticeDao;
import com.newlecture.webapp.entity.NoticeView;

@Controller
@RequestMapping("/customer/*")
public class CustomerController {
	
	@Autowired
	private NoticeDao noticeDao;
	
	@RequestMapping("notice")
	public String notice(@RequestParam(value="p", defaultValue="1")Integer page,
						@RequestParam(value="f", defaultValue="title")String field,
						@RequestParam(value="q", defaultValue="")String query,
						Model model) {
		
		List<NoticeView> list = noticeDao.getList(page, field, query);
		
		model.addAttribute("list", list);
		//return "customer/notice";
		return "customer.notice.list";
	}
	@RequestMapping("notice/{id}")
	public String noticeDetail(@PathVariable("id") String aaid) {
		
		//return aaid+"번째 공지사항:"+noticeView.getTitle();
		return "customer.notice.detail";
		
	}
}

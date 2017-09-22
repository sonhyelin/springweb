/*package com.newlecture.webapp.dao.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.newlecture.webapp.dao.NoticeDao;
import com.newlecture.webapp.entity.NoticeView;

public class SpringNoticeDao implements NoticeDao {
	
	@Autowired
	private DataSource dataSource;

	public List<NoticeView> getList(int page, String query) {
		
		return null;
	}

	public int getCount() {
		return 0;
	}

	public NoticeView get(String id) {
		
		String sql = "SELECT *FROM NoticeView WHERE id = ?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.queryForObject(sql, requiredType); //반환값이 리스트일경우 queryForObject이 아닌 query로 작성.
		
		return null;
	}

	public int update(String id, String title, String content) {
		return 0;
	}

}
*/
package kr.kosta.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class GusetBookDAOImpl implements GuestBookDAO {

	private JdbcTemplate jdbcTemplate;	//DML - select,insert,update,delete
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {	//DI - setter method
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List listGuest() {	//select
		String sql = "SELECT * FROM GUESTBOOK ORDER BY NUM DESC";
		
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void insertGuest(GuestBookVO vo) {
		String sql = "INSERT INTO GUESTBOOK VALUES(?,?,?,?,?)";
		Object[] arr = {vo.getNum(),vo.getName(),vo.getEmail(),vo.getHome(),vo.getContents()};
		this.jdbcTemplate.update(sql, arr);

	}

	@Override
	public void deleteGuest(int num) {
		String sql = "DELETE FROM GUESTBOOK WHERE NUM = ?";
		Object[] arr = {num};
		this.jdbcTemplate.update(sql,arr);
		
	}
	
	

}

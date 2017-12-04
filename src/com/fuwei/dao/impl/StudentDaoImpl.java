package com.fuwei.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import com.fuwei.dao.StudentDao;
import com.fuwei.model.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addStudent(Student student) {
		String sql="insert into stu_information values (null,?,?,?,?,?,?,?);";
		Object [] params=new Object[]{student.getUsername(),
				student.getClasses(),student.getBirthday(),student.getCity(),
				student.getQq(),student.getWords(),student.getPhone()};
		return jdbcTemplate.update(sql,params);
	}

	@Override
	public int updateStudent(Student student) {
		String sql="update stu_information set username=?,classes=?,birthday=?,city=?,qq=?,words=?,phone=? where sid=?";
		Object [] params=new Object[]{student.getUsername(),
				student.getClasses(),student.getBirthday(),student.getCity(),
				student.getQq(),student.getWords(),student.getPhone(),student.getSid()};
		return jdbcTemplate.update(sql,params);
	}

	@Override
	public int deleteStudent(int sid) {
		String sql="delete from stu_information where sid=?";
		Object [] params=new Object[]{sid};
		return jdbcTemplate.update(sql,params);
	}

	@Override
	public List<Student> findStudents() {
		String sql="select * from stu_information";
		final List<Student> studentList=new ArrayList<Student>();
		jdbcTemplate.query(sql, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				Student student=new Student();
				student.setSid(rs.getInt("sid"));
				student.setUsername(rs.getString("username"));
				student.setClasses(rs.getString("classes"));
				student.setBirthday(rs.getString("birthday"));
				student.setCity(rs.getString("city"));
				student.setQq(rs.getInt("qq"));
				student.setWords(rs.getString("words"));
				student.setPhone(rs.getInt("phone"));
				studentList.add(student);
			}
			
		});
		return studentList;
	}

}

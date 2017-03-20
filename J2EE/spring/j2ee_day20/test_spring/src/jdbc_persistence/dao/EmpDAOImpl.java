package jdbc_persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import jdbc_persistence.model.Emp;

public class EmpDAOImpl implements EmpDAO {
	
	private SimpleJdbcTemplate jdbcTemplate;

	@Override
	public List<Emp> getEmps() {
		System.out.println("jdbc template "+jdbcTemplate);
		String sql="select * from my_emp";
		List<Emp> l1=jdbcTemplate.query(sql,new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rst, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Emp e1=new Emp(rst.getInt(1),rst.getString(5),rst.getString(2), rst.getString(3),rst.getDouble(4));
				System.out.println("e1 ="+e1);
				return e1;
			}
			
		});
		System.out.println("l1="+l1);
		return l1;
	}
	

	@Override
	public List<Emp> getEmpByDeptAndSalary(String deptId,double limit) {
		//rets list of emp from specified dept & sal > limit
		String sql="select * from my_emp where deptid = ? and salary > ?";
		return jdbcTemplate.query(sql, new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rst, int arg1) throws SQLException {
				Emp e1=new Emp(rst.getInt(1),rst.getString(5),rst.getString(2), rst.getString(3),rst.getDouble(4));
				return e1;
			}
			
		},deptId,limit);
	
	}
	


	@Override
	public List<Emp> getEmpByJoinDate(Date joinDate) {
		//rets list of emps joined after specified date
		String sql="select * from my_emp where join_date > ?";
		return jdbcTemplate.query(sql, new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rst, int arg1) throws SQLException {
				Emp e1=new Emp(rst.getInt(1),rst.getString(5),rst.getString(2), rst.getString(3),rst.getDouble(4));
				return e1;
			}
			
		},joinDate);
		
	}
	


	@Override
	public void insertEmp(Emp e) {
		//col names (empid,name,addr,salary,deptid) , parameter nms  matching to that of POJO props
		String sql="insert into my_emp values (:id,:name,:addr,:sal,:deptId,:joinDate)";
		jdbcTemplate.update(sql,new BeanPropertySqlParameterSource(e));
		
	}
	


	@Override
	public void updateSalary(String deptId, double percentInc) {
		String sql="update my_emp set salary=salary+(salary*?)/100 where deptid=?";
		System.out.println("row updated -- "+jdbcTemplate.update(sql,percentInc,deptId));
		
	}
	
	@Override
	public void removeEmp(int empid) {
		String sql="delete from my_emp where empid=?";
		
		System.out.println("rows deleted-- "+jdbcTemplate.update(sql,empid));
	}


	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}

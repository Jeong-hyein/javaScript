package com.yedam.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	Connection  conn = null;
	public EmpDAO() { //DB연결할때 사용.
		String user = "hr";
		String pass= "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //라이브러리를 쓰겠다
			conn= DriverManager.getConnection(url, user, pass); //커넥션을 사용해서 conn에 정보를 받겠다.
		} catch (ClassNotFoundException e) { //실패했을때 강제 다운 안하고 밑에꺼 실행?
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Employee> getEmpList() {
		String sql = "select * from employees";
		List<Employee> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { //데이터가 있는동안 계속 처리(데이터확인: next)
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); //int타입으로 가지고옴 :getInt
				emp.setFirstName(rs.getString("first_name")); //colum 이름
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
}

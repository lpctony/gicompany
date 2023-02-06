package Dao.porder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import Model.porder;

public interface porderDao {
	//連線方法
	static Connection getdb() 
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return conn;
		
		
	}
	//Create
	
	void add(porder p);
	
	//Read
	
	List<porder> selectAll();
	porder selectId(int id);
	
	//Update
	
	void update(porder p);
	
	
	//delete
	
	void delete(int id);
	
}

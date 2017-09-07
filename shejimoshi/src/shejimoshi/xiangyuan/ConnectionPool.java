package shejimoshi.xiangyuan;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

import com.mysql.jdbc.Connection;

public class ConnectionPool {
	private Vector<Connection> pool;
	
	private String url = "jdbc:mysql:local:63306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";
	
	private int poolSize = 3;
	private static ConnectionPool instance = null;
	Connection conn = null;
	
	private ConnectionPool(){
		pool = new Vector<Connection>(poolSize);
		for(int i = 0 ; i < poolSize; i++){
			try {
				Class.forName(driverClassName);
				conn = (Connection) DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private synchronized void release(){
		pool.add(conn);
	}
	
	public synchronized Connection getConnection(int i){
		if(pool.size() > 0){
			Connection conn = pool.get(i);
			pool.remove(conn);
			return conn;
		}else{
			return null;
		}
	}
}

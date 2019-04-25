package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class BaseDatos {

	private String host;
	private String dbName;
	private String dbUser;
	private String dbPass;
	private Connection conexion;

	public BaseDatos(String host, String dbName, String dbUser, String dbPass) {
		super();
		this.host = host;
		this.dbName = dbName;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/sakila?&"
			     //           + "user=root&password=1234&serverTimezone=UTC");
			
			this.conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" +
			dbName + "?&user=" + dbUser + "&password=" + dbPass + "&serverTimezone=UTC");
	              
			
			System.out.println("Conectado ...");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BaseDatos() {
		super();

	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPass() {
		return dbPass;
	}

	public void setDbPass(String dbPass) {
		this.dbPass = dbPass;
	}
	
	

}

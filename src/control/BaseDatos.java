package control;

import java.sql.Connection;
import java.sql.DriverManager;

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

package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



import control.BaseDatos;

public class AccesoDatos {

	public static void recorreTabla() {
		// mostrar por consola TODOS LOS ACTORES...
		// CONECTAR A LA BBDD.

		try {
			BaseDatos bd = new BaseDatos("localhost", "sakila", "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();
			ResultSet rS = stmt.executeQuery("SELECT * FROM actor WHERE last_name LIKE '%xxx' ");
			ResultSetMetaData mD = rS.getMetaData();
			
			while (rS.next()) 
				System.out.println(rS.getString("first_name") + "\t\t" + rS.getString(2));
			rS.close();
			stmt.close();
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("Error de conexión");
		}
	}

}

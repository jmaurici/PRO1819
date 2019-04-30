package modelo.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import control.BaseDatos;

public class AccesoDatos {
	// 30 abril 2019

	public static void insertaEquiposDesdeFichero(String rutaEquipos) {

		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader(rutaEquipos));
			String registro;

			BaseDatos bd = new BaseDatos("localhost", "liga", "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();
			
			
			
			while ((registro = fichero.readLine()) != null) {

				
				String[] campos = registro.split("#");

				int id = Integer.parseInt(campos[0]);
				String nombreCorto = campos[1]; // ojo con las COMILLAS EN EL INSERT!!
				String nombre = campos[2];

				String sql = "INSERT INTO equipos (id, nombreCorto, nombre) VALUES ";
				sql += "(" + id + ",\"" + nombreCorto + "\"," + "\"" +nombre + "\")";
				System.out.println(sql);
				stmt.executeUpdate(sql);
			}

			fichero.close();
			System.out.println("Fin de la lectura del fichero");
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void recorreTabla() {
		// mostrar por consola TODOS LOS ACTORES...
		// CONECTAR A LA BBDD.

		try {
			BaseDatos bd = new BaseDatos("localhost", "sakila", "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();
			ResultSet rS = stmt.executeQuery("SELECT * FROM actor WHERE 1 ");

			ResultSetMetaData mD = rS.getMetaData();

			while (rS.next())
				System.out.println(rS.getString("first_name") + "\t\t" + rS.getString(2));
			rS.close();
			stmt.close();
			conexion.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Error de conexión");
		}
	}

}

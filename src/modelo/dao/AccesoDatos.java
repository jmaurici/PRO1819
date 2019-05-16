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
import java.util.ArrayList;

import control.BaseDatos;
import modelo.Equipo;
import modelo.Jugador;

public class AccesoDatos {

// 15 mayo 2019
// lista de jugadores de un equipo dado

	public static ArrayList<Jugador> getPlayersByTeam(int idEquipo){
		
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		try {
			BaseDatos bd = new BaseDatos("localhost:3306",  "liga", "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();
			String sql ="select * from jugadores where idEquipo " +		
             " like '" +  idEquipo + "'";
			
			System.out.println(sql);
			
			ResultSet rS = stmt.executeQuery(sql);
     		
				//	+ "(select id from equipos where equipos.nombre like \"" +  equipo +"\" );");
			while(rS.next()) { 					
				Jugador jugador = new Jugador();
				jugador.setId(rS.getInt("id"));
				jugador.setNombre(rS.getString("nombre"));
				jugador.setDorsal(rS.getInt("dorsal"));
				jugador.setIdEquipo(rS.getInt("idequipo"));				
				listaJugadores.add(jugador);			
			}			
			rS.close();
			stmt.close();
			conexion.close();
			return listaJugadores;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
		
	}

	public static ArrayList<Equipo> getAllTeams() {
		ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
		try {
			BaseDatos bd = new BaseDatos("localhost:3306", "liga", "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();
			ResultSet rS = stmt.executeQuery("select * from equipos where 1;");

			while (rS.next()) { // devuelve una linea de la consulta, es decir, una fila de la tabla
				Equipo e = new Equipo();
				e.setId(rS.getInt("id"));
				e.setNombre(rS.getString("nombre"));
				e.setNombreCorto(rS.getString("nombreCorto"));
				e.setGc(rS.getInt("pj"));
				e.setGf(rS.getInt("puntos"));
				e.setPe(rS.getInt("pg"));
				e.setPg(rS.getInt("pj"));
				e.setPp(rS.getInt("pp"));
				e.setGf(rS.getInt("gf"));
				e.setGc(rS.getInt("gc"));

				listaEquipos.add(e);
			}

			rS.close();
			stmt.close();
			conexion.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		return listaEquipos;
	}

	public static void insertaJugadoresDesdeFichero(String rutaJugadores) {
		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader(rutaJugadores));
			BaseDatos bd = new BaseDatos("localhost:3306", "liga", "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();

			String registro;
			while ((registro = fichero.readLine()) != null) {
				String[] campos = registro.split("#");
				int id = Integer.parseInt(campos[0]);
				String nombre = campos[1];
				int dorsal = Integer.parseInt(campos[2]);
				int idEquipo = Integer.parseInt(campos[3]);

				String sql = "insert into jugadores(id, nombre,dorsal, idEquipo) values";
				sql += "(" + id + ",\"" + nombre + "\"," + dorsal + "," + idEquipo + ")";
				System.out.println(sql);
				stmt.executeUpdate(sql);
			}
			stmt.close();
			conexion.close();
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
	// 8 mayo 2019

	public static boolean validaLogin(String u, String p) {
		// mostrar por consola TODOS LOS ACTORES...
		// CONECTAR A LA BBDD.

		try {
			BaseDatos bd = new BaseDatos("localhost", "liga", "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();

			String sql = "SELECT * FROM usuarios  WHERE usuario LIKE '" + u + "' AND clave LIKE '" + p + "'";

			ResultSet rS = stmt.executeQuery(sql);
			int contador = 0;
			while (rS.next()) {
				contador++;
			}
			rS.close();
			stmt.close();
			conexion.close();
			if (contador == 0) // no encontrado
				return false;
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Error de conexión");
		}
		return false;
	}

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
				sql += "(" + id + ",\"" + nombreCorto + "\"," + "\"" + nombre + "\")";
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

	public static void recorreTabla(String bdatos, String tabla) {
		// mostrar por consola TODOS LOS ACTORES...
		// CONECTAR A LA BBDD.

		try {
			BaseDatos bd = new BaseDatos("localhost", bdatos, "root", "1234");
			Connection conexion = bd.getConexion();
			Statement stmt = conexion.createStatement();
			ResultSet rS = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE 1 ");

			ResultSetMetaData mD = rS.getMetaData();
			for (int i = 1; i <= mD.getColumnCount(); i++) {
				System.out.print(i + " -> " + mD.getColumnName(i) + "\t\t");
			}
			System.out.println();
			while (rS.next()) {
				for (int i = 1; i <= mD.getColumnCount(); i++)
					System.out.print(rS.getString(i) + "\t\t");
				System.out.println();
			}
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

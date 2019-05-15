package combo;

import java.net.URL;
import java.util.ResourceBundle;

import control.Ejercicios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import modelo.Equipo;
import modelo.Jugador;
import modelo.dao.AccesoDatos;

public class ComboController  {
	@FXML
	private ComboBox<Equipo> miCombo;
	@FXML
	private ListView<Jugador> lv_jugadores;
	
	public void cargaEquipos() {
		miCombo.getItems().clear();
		miCombo.getItems().addAll(Ejercicios.crearListaEquipos("ficheros/equipos.txt"));
	}
	
	public void muestraEquipo() {
		System.out.println("Ha seleccionado un equipo...");
		System.out.println(miCombo.getValue().getId());
	}
	public void cargaJugadoresEquipo() {
		
		lv_jugadores = new ListView<Jugador>();
		
		ObservableList<Jugador> items =FXCollections.observableArrayList (
		   AccesoDatos.getPlayersByTeam("12"));
		lv_jugadores.setItems(items);
		
	}
}

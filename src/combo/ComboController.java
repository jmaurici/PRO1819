package combo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Equipo;
import modelo.Jugador;
import modelo.dao.AccesoDatos;

public class ComboController {
	@FXML
	private ComboBox<Equipo> miCombo;
	@FXML
	private ListView<Jugador> lv_jugadores;

	@FXML
	private Button bt_clasificacion;

	@FXML
	private ImageView iv_estadio;

	public void cargaEquipos() {
		miCombo.getItems().clear();
		// miCombo.getItems().addAll(Ejercicios.crearListaEquipos("ficheros/equipos.txt"));
		miCombo.getItems().addAll(AccesoDatos.getAllTeams());
		
	}

	public void limpiaJugadoresEquipo() {
		lv_jugadores.getItems().clear();
	}

	public void muestraEquipo() {
		System.out.println("Ha seleccionado un equipo...");
		System.out.println(miCombo.getValue().getId());
	}

	public void cargaJugadoresEquipo() {
		lv_jugadores.getItems().clear();
		lv_jugadores.getItems().addAll(AccesoDatos.getPlayersByTeam(miCombo.getValue().getId()));
		// System.out.println(miCombo.getValue().getId());
		try {
			File file = new File("img/" + miCombo.getValue().getId() + ".jpg");
			Image image = new Image(file.toURI().toString());
			iv_estadio.setImage(image);
		} catch (NullPointerException e) {
			
		}
	}
	public void clasificacion() {
		bt_clasificacion.setOnMouseClicked((event) -> {
		    try {
		        FXMLLoader fxmlLoader = new FXMLLoader();
		        fxmlLoader.setLocation(getClass().getResource("clasificacion.fxml"));
		        /* 
		         * if "fx:controller" is not set in fxml
		         * fxmlLoader.setController(NewWindowController);
		         */
		        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
		        Stage stage = new Stage();
		        stage.setTitle("CLASIFICACION LIGA 2018-2019");
		        stage.setScene(scene);
		        stage.show();
		    } catch (IOException e) {
		        Logger logger = Logger.getLogger(getClass().getName());
		        logger.log(Level.SEVERE, "Failed to create new Window.", e);
		    }
		});
	}
}

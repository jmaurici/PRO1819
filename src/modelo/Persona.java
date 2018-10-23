package modelo;

import java.time.LocalDate;
import java.util.Random;

public class Persona {
	private String nif;
	 private String nombre;
	 private int longitudPaso;
	 private LocalDate fecha_nac; // Clase "LocalDate" manejar fechas
	 
	 
	 
	 public Persona() {
		super();
		this.nif = "12345678F";
		this.nombre="Anónimo";
		this.fecha_nac=LocalDate.now();
		this.longitudPaso=33;
		
	}

	public Persona(String nif, String nombre, int longitudPaso, LocalDate fecha_nac) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.longitudPaso = longitudPaso;
		this.fecha_nac = null;
	}

	
	 
	 public int caminar (int numPasos) {
		 
		 double a=9.0;
		 double raiz = Math.sqrt(a);
		 
		 Random miRandom = new Random(); // Crea un objeto de la clase "Random"
		 
		 int valor = miRandom.nextInt();
		 
		 return numPasos * longitudPaso / 100;
		 
	 }

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;  // -- nif de la derecha es que se pasa por parámetro. Es diferente a la propiedad nif
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLongitudPaso() {
		return longitudPaso;
	}

	public void setLongitudPaso(int longitudPaso) {
		this.longitudPaso = longitudPaso;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
}

package modelo;

import java.time.LocalDate;
import java.util.Random;

public class Persona {
	private String nif;
	private String nombre;
	private int longitudPaso;
	private String fecha_nac; // AAAAMMDD
	private char sexo; // 'M' 'F'
   
	public Persona() {
		super();
		this.nif = "12345678F";
		this.nombre = "Anónimo";
		this.fecha_nac = LocalDate.now().toString();
		longitudPaso = 33;

	}

	public Persona(String nif, String nombre, int longitudPaso, String fecha_nac, char sexo) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.longitudPaso = longitudPaso;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
	}

	public String toString() {
		return this.getNombre();
	}
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	public int caminar(int numPasos) {

		double a = 9.0;
		double raiz = Math.sqrt(a);

		Random miRandom = new Random(); // Crea un objeto de la clase "Random"

		int valor = miRandom.nextInt();

		return numPasos * longitudPaso / 100;

	}

	public String getNif() {
		
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif; // -- nif de la derecha es que se pasa por parámetro. Es diferente a la
						// propiedad nif
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

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
}

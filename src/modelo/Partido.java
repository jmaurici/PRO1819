package modelo;

public class Partido {
	private int id;
	private int jornada;
	private String eL;
	private int gL;
	private String eV;
	private int gV;

	public Partido() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public String geteL() {
		return eL;
	}

	public void seteL(String eL) {
		this.eL = eL;
	}

	public int getgL() {
		return gL;
	}

	public void setgL(int gL) {
		this.gL = gL;
	}

	public String geteV() {
		return eV;
	}

	public void seteV(String eV) {
		this.eV = eV;
	}

	public int getgV() {
		return gV;
	}

	public void setgV(int gV) {
		this.gV = gV;
	}

}

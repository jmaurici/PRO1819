package control.ordena;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Byron {

	public static void main(String[] args) {
		Byron byron = new Byron();
		byron.escribirDosFicherosEnUno("ficheros/fichero1.txt", "ficheros/fichero2.txt", "ficheros/fichero3.txt");
	}

	public void escribirDosFicherosEnUno(String ruta1, String ruta2, String rutaDestino) {
		// Se lee el primer fichero, se crea una lista con los campos separados y se
		// guardan en "lista"
		ArrayList<String[]> lista = crearListaCampos(ruta1, "#");

		// Se hace lo mismo con el segundo fichero, "addAll" añade a "lista" todo el
		// ArrayList con los campos
		lista.addAll(crearListaCampos(ruta2, "#"));

		// Ordenamos la lista según el índice 2
		ordenaArrayList(lista, 2);

		// Escribimos la lista ordenada en la ruta especificada
		escribirLista(lista, rutaDestino, "#");
	}

	// Método que, dada una ruta de fichero y un separador, separa los campos,
	// los guarda y devuelve en un ArrayList<String[]>
	public ArrayList<String[]> crearListaCampos(String ruta, String separador) {
		try {
			ArrayList<String[]> lista = new ArrayList<String[]>();
			BufferedReader fichero = new BufferedReader(new FileReader(ruta));
			String registro;
			while ((registro = fichero.readLine()) != null)
				lista.add(registro.split(separador));
			fichero.close();
			System.out.println("Fin de la lectura del fichero");
			return lista;
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}

		return null;
	}

	// Método que, dado un ArrayList<String[]> y un índice, ordene la lista según el
	// índice
	public void ordenaArrayList(ArrayList<String[]> lista, int indice) {
		for (int i = 0; i < lista.size() - 1; i++)
			for (int j = i + 1; j < lista.size(); j++)
				if (lista.get(i)[indice].compareTo(lista.get(j)[indice]) > 0) {
					String[] aux = lista.get(i);
					lista.set(i, lista.get(j));
					lista.set(j, aux);
				}
	}

	// Método que escribe la lista que se le pasa por parámetro en la ruta
	// especificada
	public void escribirLista(ArrayList<String[]> lista, String rutaDestino, String separador) {
		try {
			BufferedWriter escritura = new BufferedWriter(new FileWriter(rutaDestino));

			// Para escribir newLine() delante y que la última línea no quede vacía
			escritura.write(getRegistroDeCampos(lista.get(0), separador));
			for (int i = 1; i < lista.size(); i++)
				escritura.write("\n" + getRegistroDeCampos(lista.get(i), separador));

			escritura.close();
		} catch (IOException e) {
			System.out.println("IO Exception.");
		}
	}

	// Método que devuelve el registro con todos los campos que se le pasan por
	// parámetro
	public String getRegistroDeCampos(String[] campos, String sep) {
		String registro = "";
		for (int i = 0; i < campos.length; i++)
			registro = registro + campos[i] + sep;

		return registro;
	}

}

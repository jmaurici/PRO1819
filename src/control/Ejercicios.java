package control;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import modelo.Estudiante;
import modelo.Persona;

public class Ejercicios {

	// 18 diciembre 18

	public void introListas() {

		ArrayList<Persona> lista;

		lista = new ArrayList<Persona>();
		
		lista.add(new Persona());
		
		lista.add(new Persona("44321654F", "Pepe", 145, LocalDate.now(),'M'));
		
		lista.add(1, new Persona("nuevoNif", "Pepe", 145, LocalDate.now(),'M'));

		
		
		System.out.println(lista.get(1).getNombre());
		
		System.out.println("fin listas");
	}

	// 13 dic 2018 Intro a la Herencia

	// crear un Estudiante

	public void crearEstudiante() {

		Estudiante estudiante = new Estudiante("43781230V", "Pedro Garcia", 153, LocalDate.now(), 'M');

	}

	private Persona[] personas;

	/*
	 * public void hijosPersonas() { for (int i = 0; i < personas.length; i++) {
	 * Persona[] hijos = personas[i].getHijosBiologicos();
	 * System.out.println("PROGENITOR -> " + personas[i].getNombre()); if ( hijos !=
	 * null) { for (int j = 0; j < hijos.length; j++) {
	 * System.out.println("Hijo -> " + hijos[j].getNombre()); }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */
	// 27 noviembre 18

	public int[] matrizToArrayOrdenado(int[][] matriz) {
		int[] result = new int[1];
		ordenaFilasMatriz(matriz);
		for (int i = 0; i < matriz.length; i++)
			// Se crea un nuevo array con la unión de matriz[i] y result
			// Y se guarda en result
			result = mezclaListasOrdenadas(result, matriz[i]);
		return result;

	}

	// 21 noviembre 2018

	public void ordenaFilasMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++)
			ordenaArrayNumeros(matriz[i]);
	}

	// 20 noviembre 2018

	// Ejercicios con arrays

	// 1. Dada una lista (array) de enteros (int), obtener la lista INVERTIDA sobre
	// si misma

	public void invertirLista(int[] lista) {
		int aux;
		for (int i = 0; i < lista.length / 2; i++) {
			aux = lista[i];
			lista[i] = lista[lista.length - i - 1];
			lista[lista.length - i - 1] = aux;

		}

	}

	public int[] invertirLista2(int[] lista) {
		int[] resultado = new int[lista.length];
		for (int i = 0; i < lista.length; i++)
			resultado[lista.length - 1 - i] = lista[i];
		return resultado;
	}

	// 2. Dadas dos listas PREVIAMENTE ORDENADAS, se pide obtener la lista MEZCLA de
	// ambas

	public int[] mezclaListasOrdenadas(int[] l1, int[] l2) {

		int[] resultado = new int[l1.length + l2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (k < l1.length + l2.length) {
			// while (i < l1.length || j < l2.length) {
			try {
				if (l1[i] < l2[j]) {
					resultado[k] = l1[i];
					i++;
				} else {
					resultado[k] = l2[j];
					j++;
				}
				k++;

			} catch (ArrayIndexOutOfBoundsException excepcion) {

				if (i == l1.length) // fin de l1..
					l1[--i] = Integer.MAX_VALUE;
				else
					l2[--j] = Integer.MAX_VALUE;
			}

		}
		return resultado;

	}

	// 3. Dada una cadena , obtener la cadena INVIRTIENDO sus caracteres (char)
	// usar charAt() o toCharArray()

	public String ivertirCaracteres(String cadena) {
		return cadena;

	}

	// 14 noviembre 2018
	public int[] sumaColumnasMatrizHeterogenea(int[][] matriz) {

		int numColMAX = 0;
		for (int i = 0; i < matriz.length; i++)
			if (matriz[i].length > numColMAX)
				numColMAX = matriz[i].length;

		int[] resultado = new int[numColMAX];
		// recorrer matriz por COLUMNAS

		for (int j = 0; j < numColMAX; j++) {
			for (int i = 0; i < matriz.length; i++)
				try {
					resultado[j] += matriz[i][j];
				} catch (ArrayIndexOutOfBoundsException e) {

				}
		}
		return resultado;
	}

	public void ordenaArrayCadenas(String[] cadenas) {
		for (int i = 0; i < cadenas.length - 1; i++)
			for (int j = i + 1; j < cadenas.length; j++)
				if (cadenas[i].compareTo(cadenas[j]) < 0) {
					String aux = cadenas[i];
					cadenas[i] = cadenas[j];
					cadenas[j] = aux;
				}
	}

	// 13 nov 2018
	public void ordenaArrayNumeros(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					int aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
	}

	public void listaDesgloseMoneda(int cantidad) {
		System.out.println("CANTIDAD : " + cantidad);
		int[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] resultado = desgloseMoneda(cantidad);
		for (int i = 0; i < resultado.length; i++) {
			if (resultado[i] != 0)
				System.out.println(monedas[i] + " -> " + resultado[i]);
		}

	}

	public int[] desgloseMoneda(int cantidad) {
		int[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] resultado = new int[monedas.length];
		// bucle
		int indice = 0;
		while (cantidad % monedas[indice] != 0) {
			resultado[indice] = cantidad / monedas[indice];
			cantidad = cantidad % monedas[indice];
			indice++;
		}

		// Para que cuando el resto sea 0 coja el valor
		resultado[indice] = cantidad / monedas[indice];

		return resultado;
	}

	// 8 noviembre 2018

	public boolean esPrimo(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public void listarPrimos(int desde, int hasta) {

		for (int i = desde; i < hasta; i++) {
			if (esPrimo(i))
				System.out.print(i + ", ");
		}
	}

	public void listarPrimos2(int desde, int cuantos) {
		int contador = 0;
		while (contador < cuantos)
			if (esPrimo(desde++)) {
				System.out.print(desde + ", ");
				contador++;
			}
	}

	public int[] listarPrimos3(int desde, int cuantos) {
		int[] resultado = new int[cuantos];
		int contador = 0;
		while (contador < cuantos)
			if (esPrimo(desde)) {
				resultado[contador] = desde++;
				contador++;
			}
		return resultado;
	}

	// 7 noviembre 2018
	// 3 bucles anidados for , un reloj

	public void mostrarHMS() {
		for (int h = 0; h < 1; h++)
			for (int m = 0; m < 60; m++)
				for (int s = 0; s < 60; s++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(h + " : " + m + " : " + s);
				}
	}

	// 25/10/18

	public void pruebaCadenas() {

		String nombre = "LAS PALMAS DE GRAN CANARIA";
		// iterar en la cadena mostrando sus caracteres
		// for (int i = 0; i < nombre.length(); i++)
		// System.out.println(nombre.charAt(i));

		String c1 = "abcd";
		String c2 = "abcdaaaaaaaaa";
		System.out.println(c1.compareTo(c2));

	}

	public float calcularSaldoFinal(float saldoInicial, float[] movimientos) {

		float saldoFinal = saldoInicial;
		// recorrer el array movimientos
		// sumando dichas cantidades a saldoFinal.
		for (int i = 0; i < movimientos.length; i++)
			saldoFinal += movimientos[i];
		return saldoFinal;
	}

	// 23/10/18

	// metodo para devolver una lista de n pèrsonas

	Persona[] creaListaPersonas(int n) {
		Persona[] lista = null;

		lista = new Persona[n];
		for (int i = 0; i < lista.length; i++)
			lista[i] = new Persona();
		return lista;
	}

	// --------------- 04/10/2018 ACTIVIDAD: BUSCAR EN LA API
	// -------------------------------

	public void pruebasAPI() {
		/*
		 * 1. imprime por consola el valor de 2^3 - Usa la clase estática Math y su
		 * método pow (Cuando es estático no hace falta el new)
		 * 
		 * 2. Imprime un valor aleatorio entre 1 y 100 - Usa la clase java.util.Random y
		 * el método rnd 3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN"
		 * -Usa el método substring de la clase java.lang.String
		 */

		// 1.
		System.out.println("1. " + Math.pow(2, 3));

		// 2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));

		// 3.
		System.out.println("3. " + "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}

	// ACTIVIDAD: Mostrar por consola los números comprendidos entre dos
	// enteros, a y b

	// 1Parte método:. prototipo o cabecera
	public void listaIntervaloEnteros(int primero, int ultimo) {
		// 2Parte método: cuerpo o implementación del método
		/*
		 * int i=primero; while(i < ultimo) System.out.println(++i); i++; i=i+1;
		 */
		for (int j = primero; j <= ultimo; j++)
			System.out.println(j++);

		// true /false
		boolean condicion = true;
		if (condicion) {
			// en caso de verdadero
		} else {
			// la otra opción, falso
		}

	}

	// ---------------------- ACTIVIDAD
	// ----------------------------------------------------- 10/10/2018
	/*
	 * Dado una “cadena” (String) devolver el valor en forma de número entero
	 * correspondiente. Ejempo String: “ab95f1”
	 */

	// String cadena ="ab95f1";
	/*
	 * public static int converString(String cadena) { int numeros =
	 * Integer.parseInt(cadena); return numeros; }
	 */

	// ---------------------- ACTIVIDAD : Serie Fibonacci
	// --------------------------------------- 11/10/2018

	public static void serieFibonacci(int cuantos) {
		int num1 = 0;
		int num2 = 1;
		int total = 1;

		System.out.print(num1 + " ," + num2);
		for (int i = 1; i < cuantos; i++) {
			total = num1 + num2;
			System.out.print(" ," + total);
			num1 = num2;
			num2 = total;
		}
	}

	// ---------------------- ACTIVIDAD : Factorial (1.-Deberes
	// Casa)-------------------------------- 11/10/2018

	public static void factorial(int numFact) {
		int num1 = 1;
		if (numFact == 0 | numFact == 1) {
			System.out.println("El factorial de " + "'" + numFact + "'" + " es :  1");
		} else {
			for (int i = 2; i <= numFact; i++) {
				num1 = num1 * i;
			}
			System.out.println("El factorial de " + "'" + numFact + "'" + " es :" + num1);
		}
	}

	// ---------------------- ACTIVIDAD : Devolver el número menor de tres
	// (2.-Deberes Casa)----------- 11/10/2018

	public int calNumMenor(int x, int y, int z) {
		if (x < y)
			if (x < z)
				return x;
			else
				return z;
		else if (y < z)
			return y;
		else
			return z;

	}

	public int calNumMenor(int x, int y, int z, int w) {
		if (x < y)
			if (x < z)
				if (x < w)
					return x;
				else
					return w;

			else if (z < w)
				return z;
			else
				return w;

		else if (y < z)
			if (y < w)
				return y;
			else
				return w;
		else if (z < w)
			return z;
		else
			return w;

	}

	// IMPRIME POR CONSOLA n números enteros aleatorios
	// entre inferior y superior

	public void imprimeAleatorios(int n, int inferior, int superior) // n,
																		// cuantos
																		// numeros
	{
		Random rnd = new Random();
		int numero = 0;
		for (int i = 0; i < n; i++) {
			numero = inferior + rnd.nextInt(superior - inferior + 1);
			System.out.println(i + 1 + ".- " + numero);
		}
	}

	// Devuelve un array de números enteros aleatorios, basandonos en el método
	// anterior
	public int[] generaListaAleatorios(int n, int inferior, int superior) {
		int[] resultado; // DECLARACION EN LA TABLA DE SIMBOLOS
		resultado = new int[n]; // INICIALIAZACION
		Random rnd = new Random();
		int numero = 0;
		for (int i = 0; i < n; i++)
			resultado[i] = inferior + rnd.nextInt(superior - inferior + 1);
		return resultado;
	}

	// 30 octubre 2018
	public int sumaAleatorios(int n, int inferior, int superior) {
		int resultado; // DECLARACION EN LA TABLA DE SIMBOLOS
		resultado = 0; // INICIALIAZACION
		Random rnd = new Random();
		int numero = 0;
		for (int i = 0; i < n; i++)
			resultado += inferior + rnd.nextInt(superior - inferior + 1);
		return resultado / n;
	}

	public int[] generaEstadisticaAparicion(int n, int inferior, int superior) {
		{
			int[] resultado; // DECLARACION EN LA TABLA DE SIMBOLOS
			resultado = new int[superior - inferior + 1]; // INICIALIAZACION
			Random rnd = new Random();
			int numero = 0;
			for (int i = 0; i < n; i++) {
				numero = inferior + rnd.nextInt(superior - inferior + 1);
				resultado[numero - 1]++;
			}
			return resultado;
		}
	}

	public float[] resumenVendedor(float[][] ventas) {
		// float acumVendedor = 0;
		float[] resultado = new float[ventas.length];
		// iterar por filas/columnas acumulando ventas de cada vendedor en un
		// año
		for (int i = 0; i < ventas.length; i++) {
			// acumVendedor = 0;
			for (int j = 0; j < ventas[i].length; j++)
				resultado[i] += ventas[i][j]; // acumVendedor += ventas[i][j];;
			// resultado[i] = acumVendedor;
		}
		return resultado;
	}

	public void mostrarVentasVendedor() {
		String[] nombresVendedor = { "JUAN CARLOS", "ISABEL", "MARTA" };
		float[][] ventasYear = {
				// hay 3 filas (vendedores) y 12 columnas (meses)
				{ 12.5f, 13.5f, 8.5f, 5.0f, 10.5f, 9.5f, 20.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 10.5f, 15.5f, 3.5f, 2.0f, 10.5f, 15.5f, 2.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 11.5f, 10.5f, 4.5f, 1.0f, 9.5f, 5.5f, 3.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f }

		};
		float[] ventas = resumenVendedor(ventasYear);
		for (int i = 0; i < ventas.length; i++)
			System.out.println(nombresVendedor[i] + " : " + ventas[i]);

	}

	public float[] resumenVentasPorMes(float[][] ventas) {
		// float acumVendedor = 0;
		float[] resultado = new float[ventas[0].length];
		// iterar por filas/columnas acumulando ventas de cada vendedor en un
		// año
		for (int j = 0; j < ventas[0].length; j++) {
			// acumVendedor = 0;
			for (int i = 0; i < ventas.length; i++)
				resultado[j] += ventas[i][j]; // acumVendedor += ventas[i][j];;

		}
		return resultado;
	}

	public int[] convierteCadenas(String[] cadenas) {
		// el array de salida tiene el MISMO numero
		// de elementos que el de entrada
		// si un numero no es valido, se pone -1.
		int[] resultado = new int[cadenas.length];
		for (int i = 0; i < cadenas.length; i++)
			try {
				resultado[i] = Integer.parseInt(cadenas[i]);
				System.out.println("LLega aqui");
			} catch (NumberFormatException e) {
				resultado[i] = -1;
			}

		return resultado;
	}

	public static void main(String[] args) {

		Ejercicios ejercicios = new Ejercicios();
		
		ejercicios.introListas();
		System.exit(0);
		
		int[] lista1 = { 2, 4, 8, 9 };
		int[] lista2 = { 1, 3, 5, 23, 45, 67, 89, 123 };

		// int [] listasMezcladas = ejercicios.mezclaListasOrdenadas(lista1, lista2);
		// ejercicios.invertirLista(lista2);
		// int[] listaInvertida = ejercicios.invertirLista2(lista2);
		ejercicios.crearEstudiante();

		int[][] datos = { { 7, 4, 6 }, { 6 }, { 5, 2, 3 }, { 4, 2, 5, 1, 9, 0, 3 }, { 5, 6, 1, 3 } };

		int[] vector = ejercicios.matrizToArrayOrdenado(datos);
		// ejercicios.ordenaFilasMatriz(datos);

		int[] acumuladoColumnas = ejercicios.sumaColumnasMatrizHeterogenea(datos);

		// int[] x = {78,34,1,34,54,29,3};
		String[] nombres = { "carlos", "maria", "luis", "nuria", "roberto", "alejandro" };
		// ejercicios.ordenaArrayCadenas(nombres);
		int[] lista = ejercicios.generaListaAleatorios(1000, 1, 5000);
		// ejercicios.ordenaArrayNumeros(lista);
		// int[] monedas = ejercicios.desgloseMoneda(1234);
		// ejercicios.listaDesgloseMoneda(3);
		// System.out.println(ejercicios.esPrimo(99525));

		int inicio = 500;
		int cuantos = 5;
		ejercicios.listarPrimos2(inicio, cuantos);

		// int[] numeros = ejercicios.listarPrimos3(inicio, cuantos);
		// ejercicios.mostrarHMS();
		// String[] datos = { "123", "8k8", "9811", "xyz" };
		// int[] numeros = ejercicios.convierteCadenas(datos);

		float[][] ventasYear = {
				// hay 3 filas (vendedores) y 12 columnas (meses)
				{ 12.5f, 13.5f, 8.5f, 5.0f, 10.5f, 9.5f, 20.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 10.5f, 15.5f, 3.5f, 2.0f, 10.5f, 15.5f, 2.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f },
				{ 11.5f, 10.5f, 4.5f, 1.0f, 9.5f, 5.5f, 3.5f, 10.5f, 4.0f, 6.5f, 5.5f, 6.0f }

		};
		float[] resumenVendedor;
		// resumenVendedor = ejercicios.resumenVendedor(ventasYear);
		// float[] reumenPorMes = ejercicios.resumenVentasPorMes(ventasYear);
		// crear e inicializar un array, varias opciones.
		float[] movs = { 10.0f, -5.0f, 20.0f, -10.0f };
		float saldoI = 100.0f;
		// ejercicios.pruebaCadenas();
		// System.out.println("Saldo final :"
		// + ejercicios.calcularSaldoFinal(saldoI, movs));
		// String[] diasSemana = {"LUNES", "MARTES"};
		/*
		 * movs = new float[4];
		 * 
		 * movs[0] = 10.0f; movs[1] = -5.0f; movs[2] = 20.5f; movs[3] = -10.5f;
		 */

		int a = 10, b = 17, c = 14, d = 11;
		// int menor= Ejercicios.calNumMenor(a, b, c, d);
		int menor = ejercicios.calNumMenor(a, b, c, d);
		// System.out.println("el menor es : " + menor);

		// ejercicios.imprimeAleatorios(6, 1, 6);
		int[] estadisticaDados = ejercicios.generaEstadisticaAparicion(1000, 1, 6);

		Persona[] listaPersonas = ejercicios.creaListaPersonas(10);
		// factorial(5);

		// serieFibonacci(8);

		// Act: 10/10/2018
		// System.out.println(converString("8fgf"));

		/*
		 * Ejercicios ejercicios = new Ejercicios(); int x=10; int y= 30;
		 * ejercicios.listaIntervaloEnteros(x, y);
		 */

		// Ejercicios.pruebasAPI();
		// new Ejercicios().pruebasAPI();

		// Persona juan = new Persona();
		// int pasos = juan.caminar(20);

		// Persona juan;
		// juan = new Persona("4545455X", "Juan Luis", 47,null);
		// Persona persona1 = new Persona();

		System.out.println("Fin del programa");
	}
}

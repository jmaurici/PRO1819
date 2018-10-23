package control;

import java.time.LocalDate;

import java.util.Random;

import modelo.Persona;

public class Ejercicios {

	// --------------- 04/10/2018 ACTIVIDAD: BUSCAR EN LA API
	// -------------------------------

	public void pruebasAPI() {
		/*
		 * 1. imprime por consola el valor de 2^3 - Usa la clase estática Math y
		 * su método pow (Cuando es estático no hace falta el new)
		 * 
		 * 2. Imprime un valor aleatorio entre 1 y 100 - Usa la clase
		 * java.util.Random y el método rnd 3. En la cadena
		 * "LAS PALMAS DE GRAN CANARIA", imprime "GRAN" -Usa el método substring
		 * de la clase java.lang.String
		 */

		// 1.
		System.out.println("1. " + Math.pow(2, 3));

		// 2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));

		// 3.
		System.out.println("3. "
				+ "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
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
			System.out.println("El factorial de " + "'" + numFact + "'"
					+ " es :  1");
		} else {
			for (int i = 2; i <= numFact; i++) {
				num1 = num1 * i;
			}
			System.out.println("El factorial de " + "'" + numFact + "'"
					+ " es :" + num1);
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

	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();
		//
		int a = 10, b = 17, c = 14, d = 11;
		// int menor= Ejercicios.calNumMenor(a, b, c, d);
		int menor = ejercicios.calNumMenor(a, b, c, d);
		// System.out.println("el menor es : " + menor);

		// ejercicios.imprimeAleatorios(6, 1, 6);
		int[] estadisticaDados = ejercicios.generaEstadisticaAparicion(1000, 1, 6);
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

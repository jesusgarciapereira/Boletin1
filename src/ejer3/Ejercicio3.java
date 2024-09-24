package ejer3;

public class Ejercicio3 {
	public static String devuelveCadena(int numero) {

		String cadena = "";

		if (numero % 3 == 0)
			cadena += "fizz";

		if (numero % 5 == 0)
			cadena += "buzz";

		return cadena;
	}
}

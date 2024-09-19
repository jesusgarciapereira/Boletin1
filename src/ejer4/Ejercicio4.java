package ejer4;

public class Ejercicio4 {
	public static boolean esPrimo(int numero) {
		
		boolean resultado = numero != 1;
		
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0)
				resultado = false;
		}


		return resultado;
	}
}

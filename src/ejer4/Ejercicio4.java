package ejer4;

public class Ejercicio4 {
	public static boolean esPrimo(int numero) {

		boolean resultado = (numero > 1);

		int i = 2;

		while (i <= Math.sqrt(numero) && resultado) {
			if (numero % i == 0)
				resultado = false;

			i++;
		}

		return resultado;
	}
}

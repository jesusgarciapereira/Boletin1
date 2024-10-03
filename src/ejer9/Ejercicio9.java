package ejer9;


public class Ejercicio9 {

	public static int decimalToBinary(int numDecimal) {

		String cadenaCifrasBinario = "";
		int aux = numDecimal;
		int numBinario = 0;

		do {

			cadenaCifrasBinario = (aux % 2) + cadenaCifrasBinario;

			aux /= 2;

		} while (aux > 0);

		numBinario = Integer.valueOf(cadenaCifrasBinario);

		return numBinario;

	}

}

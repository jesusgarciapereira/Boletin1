package ejer9;


public class Ejercicio9 {

	public static int decimalToBinary(int numDecimal) {

		String cadenaCifrasBinario = "";
		int auxiliar = numDecimal;
		int numBinario = 0;

		do {

			cadenaCifrasBinario = (auxiliar % 2) + cadenaCifrasBinario;

			auxiliar /= 2;

		} while (auxiliar > 0);

		numBinario = Integer.valueOf(cadenaCifrasBinario);

		return numBinario;

	}

}

package ejer1;

public class Ejercicio1 {

	public static boolean esVocal(char caracter) {
		boolean resultado = false;
		char charMinus = Character.toLowerCase(caracter);

		switch (charMinus) {
		case 'a', 'e', 'i', 'o', 'u':
			resultado = true;
			break;

		}

		return resultado;
	}
}

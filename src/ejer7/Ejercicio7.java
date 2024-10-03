package ejer7;

public class Ejercicio7 {

	public static boolean fechaCorrecta(int dia, int mes, int annio) {

		boolean resultado = false;

		switch (mes) {
		case 1, 3, 5, 7, 8, 31, 12:
			if (dia >= 1 && dia <= 31) {
				resultado = true;
			}
		case 4, 6, 9, 11:
			if (dia >= 1 && dia <= 30) {
				resultado = true;
			}

			break;
		case 2:
			if (dia >= 1 && dia <= 28 || dia == 29 && (annio % 400 == 0 || (annio % 4 == 0 && annio % 100 != 0))) {
				resultado = true;
			}

			break;

		default:
			break;
		}

		return resultado;
	}
}

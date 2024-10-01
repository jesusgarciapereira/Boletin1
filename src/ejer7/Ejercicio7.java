package ejer7;

public class Ejercicio7 {

	public static boolean fechaCorrecta(int dia, int mes, int annio) {

		boolean resultado = false;

		if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
			resultado = true;
		}

		return resultado;
	}
}

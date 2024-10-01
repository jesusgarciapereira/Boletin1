package ejer5;

public class Ejercicio5 {

	public static boolean esCapicua(int num) {
		boolean resultado;
		int numAlreves = 0;
		int aux = num;

		while (aux > 0) {
			numAlreves = numAlreves * 10 + (aux % 10);
			aux /= 10;

		}
		
		resultado = (num == numAlreves);

		// Todo este código se volverá innecesario
		
//		if (num < 10 && num >= 0 || num / 10 == num % 10) {
//			resultado = true;
//
//		} else if (num >= 100 && num / 100 == num % 10) {
//			resultado = true;
//		}
//
//		else if (num >= 1000 && num / 1000 == num % 10 && num / 100 == num % 100 && num % 100 / 10 == num % 100 % 10) {
//			resultado = true;
//		} 
//		
//		else if (num == numAlreves) {
//			resultado = true;
//		}

		return resultado;
	}
}

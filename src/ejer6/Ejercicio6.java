package ejer6;

public class Ejercicio6 {

	public static double calculadora(double num1, double num2, int operacion) {
		double resultado = 0;
		
		switch (operacion) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
		default:
			break;
		}
		
		return resultado;
	}
}

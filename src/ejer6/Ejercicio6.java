package ejer6;

public class Ejercicio6 {

	public static double calculadora(double num1, double num2, int operacion) throws Exception 
	{
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
			if (num2 == 0) {
				throw new Exception ("No se puede dividir entre 0");
			}
			resultado = num1 / num2;
			break;
		default:
			throw new Exception ("Operación no válida");
		}
		
		return resultado;
	}
	
	
}

package ejer8;

public class Ejercicio8 {

	public static int fibonacci(int posicion) throws Exception{

		int resultado = 0;
		
		if (posicion < 1) {
			throw new Exception ("El valor del parámetro no puede ser menor que uno");
		}
		else if (posicion == 1 || posicion == 2) {
			resultado = 1;
		} else {
			resultado = fibonacci(posicion - 1) + fibonacci(posicion - 2);
		}

		return resultado;
	}

}

package ejer10;

public class Ejercicio10 {

	public static boolean esPalindromo(String palabra) {
		boolean resultado = true;

		int contador = 0;
		
		while(resultado && contador < palabra.length() / 2) {
			if(palabra.charAt(contador) != palabra.charAt(palabra.length()-1-contador)){
				resultado = false;
			}
			
			contador++;
		}

		return resultado;
	}
}

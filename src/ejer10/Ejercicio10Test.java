package ejer10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Ejercicio10Test {

	@ParameterizedTest
	@MethodSource("palindromando")
	void testFechaCorrecta(String palabra, boolean resEsperado)  {
		boolean resObtenido = Ejercicio10.esPalindromo(palabra);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> palindromando() {
		return Stream.of(Arguments.of("a", true)
				

		);

	}

}

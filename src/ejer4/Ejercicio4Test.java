package ejer4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Ejercicio4Test {

	@ParameterizedTest
	@MethodSource("numerando")
	void testEsPrimo(int numero, boolean resEsperado) {
		boolean resObtenido = Ejercicio4.esPrimo(numero);
		assertEquals(resEsperado, resObtenido);
	}
	

	private static Stream<Arguments> numerando() {
		return Stream.of(
				Arguments.of(2, true),
				Arguments.of(3, true),
				Arguments.of(4, false),
				Arguments.of(5, true), 
				Arguments.of(9, false), 
				Arguments.of(11, true),
				Arguments.of(1, false)
		);
	}


}

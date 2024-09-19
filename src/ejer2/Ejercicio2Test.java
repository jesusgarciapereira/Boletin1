package ejer2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Ejercicio2Test {
	
	@ParameterizedTest
	@MethodSource("paresImpares")
	void testEsPar(int numero, boolean resEsperado) {
		boolean resObtenido = Ejercicio2.esPar(numero);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> paresImpares() {
		return Stream.of(
				Arguments.of(2, true), 
				Arguments.of(3, false), 
				Arguments.of(4, true)

		);
	}
//
//	@Test
//	void testEsPar2() {
//		boolean resultado = Ejercicio2.esPar(2);
//		assertTrue(resultado);
//	}
//	
//	@Test
//	void testEsPar3() {
//		boolean resultado = Ejercicio2.esPar(3);
//		assertFalse(resultado);
//	}
//
//	@Test
//	void testEsPar4() {
//		boolean resultado = Ejercicio2.esPar(4);
//		assertTrue(resultado);
//	}
//	


}

package ejer6;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio6Test {

	@Test
	void testDivide0() {
		// Verificamos que se lanza ArithmeticException cuando se divide por cero
		assertThrows(Exception.class, () -> {
			Ejercicio6.calculadora(5, 0, 4);
		});
	}
	
	@Test
	void testOperacionInexistente() {
		assertThrows(Exception.class, () -> {
			Ejercicio6.calculadora(6, 4, 5);
		});
	}

	@ParameterizedTest
	@MethodSource("calculando")
	void testCalculadora(double num1, double num2, int operacion, double resEsperado) throws Exception {
		double resObtenido = Ejercicio6.calculadora(num1, num2, operacion);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> calculando() {
		return Stream.of(Arguments.of(1, 1, 1, 2), 
				Arguments.of(5, 2, 2, 3), 
				Arguments.of(2, 5, 3, 10),
				Arguments.of(20, 8, 4, 2.5)

		);
	}

//	@Test (expected = java.lang.Exception.class)
//	public void testCalculoInexistente() {
//
//	  double resObtenido = Ejercicio6.calculadora(5, 1, 5);
//	}
}

package ejer6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio6Test {

	@ParameterizedTest
	@MethodSource("calculando")
	void testCalculadora(double num1, double num2, int operacion, double resEsperado) {
		double resObtenido = Ejercicio6.calculadora(num1, num2, operacion);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> calculando() {
		return Stream.of(
				Arguments.of(1, 1, 1, 2), 
				Arguments.of(5, 2, 2, 3),
				Arguments.of(2, 5, 3, 10),
				Arguments.of(20, 8, 4, 2.5)

		);
	}

}

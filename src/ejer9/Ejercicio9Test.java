package ejer9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio9Test {

	@ParameterizedTest
	@MethodSource("binareando")
	void testFechaCorrecta(int numDecimal, int resEsperado)  {
		int resObtenido = Ejercicio9.decimalToBinary(numDecimal);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> binareando() {
		return Stream.of(Arguments.of(1, 1),
				Arguments.of(2, 10),
				Arguments.of(3, 11),
				Arguments.of(4, 100),
				Arguments.of(5, 101),
				Arguments.of(255, 11111111)

		);

	}
}

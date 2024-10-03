package ejer7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio7Test {

	@ParameterizedTest
	@MethodSource("fechando")
	void testFechaCorrecta(int dia, int mes, int annio, boolean resEsperado) {
		boolean resObtenido = Ejercicio7.fechaCorrecta(dia, mes, annio);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> fechando() {
		return Stream.of(Arguments.of(1, 1, 2024, true), 
				Arguments.of(31, 4, 2024, false),
				Arguments.of(29, 2, 2024, true),
				Arguments.of(29, 2, 1800, false)

		);
	}

}

package ejer5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio5Test {

	
	@ParameterizedTest
	@MethodSource("capicuando")
	void testEsCapicua(int numero, boolean resEsperado) {
		boolean resObtenido = Ejercicio5.esCapicua(numero);
		assertEquals(resEsperado, resObtenido);
	}
	

	private static Stream<Arguments> capicuando() {
		return Stream.of(
				Arguments.of(1, true),
				Arguments.of(2, true),
				Arguments.of(-1, false),
				Arguments.of(10, false),
				Arguments.of(11, true),
				Arguments.of(100, false),
				Arguments.of(121, true),
				Arguments.of(1000, false),
				Arguments.of(1001, true),
				Arguments.of(1111, true),
				Arguments.of(3103, false),
				Arguments.of(10000, false),
				Arguments.of(22222, true),
				Arguments.of(20002, true),
				Arguments.of(20102, true)
				
		);
	}

}

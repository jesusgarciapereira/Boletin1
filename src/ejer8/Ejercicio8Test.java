package ejer8;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Ejercicio8Test {
	
	@Test
	void testPosicionMenorQue1() {
		// Verificamos que se lanza una excepcion cuando se pasa por parametro un numero menor que 1
		assertThrows(Exception.class, () -> {
			Ejercicio8.fibonacci(0);
		});
	}

	@ParameterizedTest
	@MethodSource("fibonachiando")
	void testFechaCorrecta(int posicion, int resEsperado) throws Exception {
		long resObtenido = Ejercicio8.fibonacci(posicion);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> fibonachiando() {
		return Stream.of(Arguments.of(1, 1),
				Arguments.of(2, 1),
				Arguments.of(3, 2),
				Arguments.of(4, 3),
				Arguments.of(5, 5),
				Arguments.of(6, 8)

		);

	}
}

package ejer1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio1Test {

	@ParameterizedTest
	@MethodSource("vocalista")
	void testEsVocal(char caracter, boolean resEsperado) {
		boolean resObtenido = Ejercicio1.esVocal(caracter);
		assertEquals(resEsperado, resObtenido);
	}

	private static Stream<Arguments> vocalista() {
		return Stream.of(
				Arguments.of('a', true), 
				Arguments.of('e', true), 
				Arguments.of('i', true),
				Arguments.of('O', true),
				Arguments.of('U', true),
				Arguments.of('C', false)

		);
	}

//	@Test
//	void testEsVocalAMinuscula() {
//		boolean resutado = Ejercicio1.esVocal('a');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalAMayuscula() {
//		boolean resutado = Ejercicio1.esVocal('A');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalEMinuscula() {
//		boolean resutado = Ejercicio1.esVocal('e');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalEMayuscula() {
//		boolean resutado = Ejercicio1.esVocal('E');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalIMinuscula() {
//		boolean resutado = Ejercicio1.esVocal('i');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalIMayuscula() {
//		boolean resutado = Ejercicio1.esVocal('I');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalOMayuscula() {
//		boolean resutado = Ejercicio1.esVocal('O');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalUMayuscula() {
//		boolean resutado = Ejercicio1.esVocal('U');
//		assertTrue(resutado);
//	}
//
//	@Test
//	void testEsVocalConsonante() {
//		boolean resutado = Ejercicio1.esVocal('C');
//		assertFalse(resutado);
//	}

}

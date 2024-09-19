package ejer3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio3Test {
	
	@ParameterizedTest
	@MethodSource("encadenando")
	void testDevuelveCadena(int numero, String cadenaEsperada) {
		String cadenaObtenida = Ejercicio3.devuelveCadena(numero);
		assertEquals(cadenaEsperada, cadenaObtenida);
	}

	private static Stream<Arguments> encadenando() {
		return Stream.of(
				Arguments.of(3, "fizz"),
				Arguments.of(5, "buzz"),
				Arguments.of(15, "fizzbuzz"),
				Arguments.of(23, "")
		);
	}

//	@Test
//	void testDevuelveCadena3() {
//		String cadena = Ejercicio3.devuelveCadena(3);
//		assertEquals("fizz", cadena);
//	}
//
//	@Test
//	void testDevuelveCadena5() {
//		String cadena = Ejercicio3.devuelveCadena(5);
//		assertEquals("buzz", cadena);
//	}
//	
//	@Test
//	void testDevuelveCadena3Y5() {
//		String cadena = Ejercicio3.devuelveCadena(15);
//		assertEquals("fizzbuzz", cadena);
//	}
//	
//	@Test
//	void testDevuelveCadenaOtro() {
//		String cadena = Ejercicio3.devuelveCadena(23);
//		assertEquals("", cadena);
//	}

}

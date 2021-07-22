package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class CalculatorTest {
	
	Calculator resultado = new Calculator();
	
	@Test
	@DisplayName("Método para sumar")
	void testSum() {
		assertEquals(8, resultado.sum(3, 5));
	}

}

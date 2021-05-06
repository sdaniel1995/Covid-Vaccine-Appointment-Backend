package com.github.covid.vaccine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CovidVaccineApplicationTests {

	@Test
	void testDummyString() {
		assertEquals("a","a");
	}

	@Test
	void testDummyNumbers() {
		assertEquals(1,1);
	}

}

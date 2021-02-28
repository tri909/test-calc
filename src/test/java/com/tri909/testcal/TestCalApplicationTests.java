package com.tri909.testcal;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCalApplicationTests {
private TestCalApplication calculator = new TestCalApplication();
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}	
}

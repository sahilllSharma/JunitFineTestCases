package junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestUtilTest {

	@Test
	@DisplayName("Test Case to check add function")
	void test() {
		TestUtil test=new TestUtil();
		int expected=3;
		int actual=test.sum(2, 1);
		assertEquals(expected,actual,"AssertEquals Works Successfully...");
	}
	
	@Test
	@DisplayName("Test Case to check add function")
	@Disabled
	void testCase2() {
		TestUtil test=new TestUtil();
		int expected=3;
		int actual=test.sum(2, 1);
		assertEquals(expected,actual,"AssertEquals Works Successfully...");
	}

}

package tests;

import static org.junit.jupiter.api.Assertions.*;



import classes.Example;
import org.junit.jupiter.api.Test;

class ExampleTest {
	
	Example example = new Example();
	@Test
	void test1() {
		example.function(-1);
	}
//	@Test
//	void test2() {
//		example.b(1);
//	}
//	@Test
//	void test1() {
//		example.function(0);
//	}
//
//	@Test
//	void test2() {
//		example.function(-1);
//	}
//	
//	@Test
//	void test3() {
//		example.function(-2);
//	}
}

package org.cambridge.java.classes.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.cambridge.java.classes.Person;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person person1 = new Person();
	Person person2 = new Person();
	@Test
	void test1_GetAge() {
		person1.Init(23, 2500, false);
		assertEquals(23, person1.GetAge());
	}

//	@Test
//	void test2_GetSalary() {
//		person1.Init(23, 2500, false);
//		assertEquals(2500, person1.GetSalary());
//	}
//	
//	@Test
//	void test3_GetMarried() {
//		person1.Init(23, 2500, false);
//		assertEquals(false, person1.GetMarried());
//	}
//	
//	@Test
//	void test4_Compare() {
//		assertEquals(true, person1.Compare(0, 0));
//	}
//	
//	@Test
//	void test5_Compare() {
//		assertEquals(false, person1.Compare(1, 0));
//	}
//	
//	@Test
//	void test6_Compare() {
//		assertEquals(false, person1.Compare(0, 1));
//	}
//	
//	@Test
//	void test7_Compare() {
//		assertEquals(true, person1.Compare(1, 1));
//	}
//	
//	@Test
//	void test8_Compare() {
//		assertEquals(false, person1.Compare(0, -1));
//	}
//	
//	@Test
//	void test9_Compare() {
//		assertEquals(true, person1.Compare(-1, -1));
//	}
//	
//	@Test
//	void test10_Equal() {
//		person1.Init(23, 2500, false);
//		person2.Init(23, 2500, false);
//		assertEquals(true, person1.Equal(person2));
//	}
//	
//	@Test
//	void test11_Equal() {
//		person1.Init(23, 2500, true);
//		person2.Init(23, 2500, true);
//		assertEquals(true, person1.Equal(person2));
//	}
//	
//	@Test
//	void test12_Equal() {
//		person1.Init(23, 2500, false);
//		person2.Init(25, 2500, false);
//		assertEquals(false, person1.Equal(person2));
//	}
//	
//	@Test
//	void test13_Equal() {
//		person1.Init(23, 2500, false);
//		person2.Init(23, 3000, false);
//		assertEquals(false, person1.Equal(person2));
//	}
//	
//	@Test
//	void test14_Equal() {
//		person1.Init(23, 2500, false);
//		person2.Init(23, 2500, true);
//		assertEquals(false, person1.Equal(person2));
//	}
//	
//	@Test
//	void test15_Equal() {
//		person1.Init(23, 2500, true);
//		person2.Init(23, 2500, false);
//		assertEquals(false, person1.Equal(person2));
//	}
//	
//	@Test
//	void test16_Equal() {
//		person1.Init(25, 2700, false);
//		person2.Init(23, 2500, false);
//		assertEquals(false, person1.Equal(person2));
//	}
//	
//	@Test
//	void test17_Equal() {
//		person1.Init(23, 2700, true);
//		person2.Init(23, 2500, false);
//		assertEquals(false, person1.Equal(person2));
//	}
//	
//	@Test
//	void test18_Equal() {
//		person1.Init(23, 2700, false);
//		person2.Init(23, 2500, true);
//		assertEquals(false, person1.Equal(person2));
//	}
//	
//	@Test
//	void test19_Equal() {
//		person1.Init(25, 2700, true);
//		person2.Init(23, 2500, false);
//		assertEquals(false, person1.Equal(person2));
//	}
}

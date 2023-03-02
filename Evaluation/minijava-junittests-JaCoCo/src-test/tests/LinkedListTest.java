package tests;

import static org.junit.jupiter.api.Assertions.*;

import classes.Person;
import classes.LinkedList;
import org.junit.jupiter.api.Test;

class LinkedListTest {

//	@Test
//	void test1_getElem() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		assertEquals(null, head.GetElem());
//	}
//	
//	@Test
//	void test2_getElem() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		// inserting first element
//		Person person1 = new Person();
//		person1.Init(25,37000,false);
//		head = head.Insert(person1);
//		assertEquals(person1, head.GetElem());
//	}
//	
//	@Test
//	void test3_getNext() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		assertEquals(null, head.getNextElem());
//	}
//	
//	@Test
//	void test4_getNext() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		// inserting first element
//		Person person1 = new Person();
//		person1.Init(25,37000,false);
//		head = head.Insert(person1);
//		assertEquals(null, head.getNextElem().GetElem());
//	}
//	
//	@Test
//	void test5_getNext() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		// inserting first element
//		Person person1 = new Person();
//		person1.Init(25,37000,false);
//		head = head.Insert(person1);
//		// inserting second element
//		Person person2 = new Person();
//		person2.Init(35,39000,true);
//		head = head.Insert(person2);
//		assertEquals(person1, head.getNextElem().GetElem());
//	}
//	
//	@Test
//	void test6_getEnd() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		assertEquals(true, head.GetEnd());
//	}
//
//	@Test
//	void test7_getEnd() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		// inserting first element
//		Person person1 = new Person();
//		person1.Init(25,37000,false);
//		head = head.Insert(person1);
//		assertEquals(false, head.GetEnd());
//	}
//	
//	@Test
//	void test8_Search() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		// inserting first element
//		Person person1 = new Person();
//		person1.Init(25,37000,false);
//		head = head.Insert(person1);
//		assertEquals(true, head.Search(person1));
//	}
//
//	@Test
//	void test9_Search() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		// inserting first element
//		Person person1 = new Person();
//		person1.Init(25,37000,false);
//		head = head.Insert(person1);
//		// inserting second element
//		Person person2 = new Person();
//		person2.Init(35,39000,true);
//		head = head.Insert(person2);
//		// inserting third element
//		Person person3 = new Person();
//		person3.Init(20,17500,false);
//		head = head.Insert(person3);
//		assertEquals(true, head.Search(person3));
//	}
//	
	@Test
	void test10_Delete() {
		LinkedList head = new LinkedList();
		head.Init();
		// inserting first element
		Person person1 = new Person();
		person1.Init(25,37000,false);
		head = head.Insert(person1);
		head = head.Delete(person1);
		assertEquals(null, head.GetElem());
		assertEquals(true, head.GetEnd());
	}
//	
//	@Test
//	void test11_Delete() {
//		LinkedList head = new LinkedList();
//		head.Init();
//		// inserting first element
//		Person person1 = new Person();
//		person1.Init(25,37000,false);
//		head = head.Insert(person1);
//		// inserting second element
//		Person person2 = new Person();
//		person2.Init(35,39000,true);
//		head = head.Insert(person2);
//		head.Delete(person1);
//		assertEquals(false, head.Search(person1));
//		assertEquals(true, head.Search(person2));
//	}
}

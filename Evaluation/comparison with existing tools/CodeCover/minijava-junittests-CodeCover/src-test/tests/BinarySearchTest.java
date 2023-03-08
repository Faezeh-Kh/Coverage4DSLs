package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.BinarySearch;


public class BinarySearchTest {
	
	BinarySearch binarySearch = new BinarySearch();
	@Test
	public void test1_Exists() {
		binarySearch.Init(20);
		assertEquals(true, binarySearch.Search(20));
	}

//	@Test
//	public void test2_Exists() {
//		binarySearch.Init(1);
//		assertEquals(true, binarySearch.Search(0));
//	}
//	
//	@Test
//	public void test3_NotExists() {
//		binarySearch.Init(20);
//		assertEquals(false, binarySearch.Search(19));
//	}
//	
//	@Test
//	public void test4_NotExists() {
//		binarySearch.Init(1);
//		assertEquals(false, binarySearch.Search(1));
//	}
//	
//	@Test
//	public void test5_Compare() {
//		assertEquals(true, binarySearch.Compare(0, 0));
//	}
//	
//	@Test
//	public void test6_Compare() {
//		assertEquals(false, binarySearch.Compare(1, 0));
//	}
//	
//	@Test
//	public void test7_Compare() {
//		assertEquals(false, binarySearch.Compare(0, 1));
//	}
//	
//	@Test
//	public void test8_Compare() {
//		assertEquals(true, binarySearch.Compare(1, 1));
//	}
//	
//	@Test
//	public void test9_Compare() {
//		assertEquals(false, binarySearch.Compare(0, -1));
//	}
//	
//	@Test
//	public void test10_Compare() {
//		assertEquals(true, binarySearch.Compare(-1, -1));
//	}
//	
//	@Test
//	public void test11_Div() {
//		assertEquals(0, binarySearch.Div(0));
//	}
//	@Test
//	public void test12_Div() {
//		assertEquals(0.0, binarySearch.Div(1), 0.0);
//	}
//	@Test
//	public void test13_Div() {
//		assertEquals(1, binarySearch.Div(2), 0.0);
//	}
//	@Test
//	public void test14_Div() {
//		assertEquals(0.0, binarySearch.Div(-1), 0.0);
//	}
}

package org.cambridge.java.classes.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.cambridge.java.classes.QuickSort;
import org.junit.jupiter.api.Test;

class QuickSortTest {

	QuickSort quickSort = new QuickSort();
	
	@Test
	void test() {
		quickSort.size = 5 ;
		quickSort.number = new int[5] ;
		
		quickSort.number[0] = 20 ;
		quickSort.number[1] = 7  ; 
		quickSort.number[2] = 12 ;
		quickSort.number[3] = 18 ;
		quickSort.number[4] = 2  ; 
		quickSort.Sort(0, quickSort.size-1);
		
		assertEquals(2, quickSort.number[0]);
		assertEquals(7, quickSort.number[1]);
		assertEquals(12, quickSort.number[2]);
		assertEquals(18, quickSort.number[3]);
		assertEquals(20, quickSort.number[4]);
	}

}

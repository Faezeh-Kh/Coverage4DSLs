package tests;

import static org.junit.jupiter.api.Assertions.*;

import classes.BubbleSort;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

	BubbleSort bubbleSort = new BubbleSort();
	
	@Test
	void testSort() {
		bubbleSort.size = 5 ;
		bubbleSort.number = new int[5] ;
		
		bubbleSort.number[0] = 20 ;
		bubbleSort.number[1] = 7  ; 
		bubbleSort.number[2] = 12 ;
		bubbleSort.number[3] = 18 ;
		bubbleSort.number[4] = 2  ; 
		
		bubbleSort.Sort();
		assertEquals(2, bubbleSort.number[0]);
		assertEquals(7, bubbleSort.number[1]);
		assertEquals(12, bubbleSort.number[2]);
		assertEquals(18, bubbleSort.number[3]);
		assertEquals(20, bubbleSort.number[4]);
	}

}

package tests;

import static org.junit.jupiter.api.Assertions.*;

import classes.Tree;
import org.junit.jupiter.api.Test;

class TreeTest {
	Tree tree = new Tree();
	
//	@Test
//	void test1_HasLeft_HasRight() {
//		Tree root = new Tree();
//		root.Init(10) ;
//		root.Insert(9) ;
//		root.Insert(11) ;
//		assertEquals(true, root.GetHas_Left());
//		assertEquals(true, root.GetHas_Right());
//	}
//
//	@Test
//	void test2_HasLeft_HasRight() {
//		Tree root = new Tree();
//		root.Init(10) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		assertEquals(true, root.GetHas_Left());
//		assertEquals(false, root.GetHas_Right());
//		assertEquals(true, root.GetLeft().GetHas_Left());
//		assertEquals(false, root.GetLeft().GetHas_Right());
//	}
//	
//	@Test
//	void test3_HasLeft_HasRight() {
//		Tree root = new Tree();
//		root.Init(10) ;
//		root.Insert(11) ;
//		root.Insert(12) ;
//		assertEquals(false, root.GetHas_Left());
//		assertEquals(true, root.GetHas_Right());
//		assertEquals(false, root.GetRight().GetHas_Left());
//		assertEquals(true, root.GetRight().GetHas_Right());
//	}
//	
//	@Test
//	void test4_search() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		assertEquals(false, root.Search(0));
//	}
	
	@Test
	void test5_search() {
		Tree root = new Tree();
		root.Init(11) ;
		root.Insert(9) ;
		root.Insert(8) ;
		root.Insert(10) ;
		root.Insert(13) ;
		root.Insert(12) ;
		root.Insert(14) ;
		assertEquals(true, root.Search(11));
		assertEquals(true, root.Search(8));
		assertEquals(true, root.Search(9));
		assertEquals(true, root.Search(10));
		assertEquals(true, root.Search(12));
		assertEquals(true, root.Search(13));
		assertEquals(true, root.Search(14));
	}
	
//	@Test
//	void test6_RemoveLeft() {
//		Tree root = new Tree();
//		root.Init(10) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		Tree parentNode = root.GetLeft();
//		Tree currentNode = parentNode.GetLeft();
//		assertEquals(true, parentNode.GetHas_Left());
//		root.RemoveLeft(parentNode, currentNode);
//		assertEquals(false, parentNode.GetHas_Left());
//	}
//	
//	@Test
//	void test7_RemoveRight() {
//		Tree root = new Tree();
//		root.Init(10) ;
//		root.Insert(11) ;
//		root.Insert(12) ;
//		Tree parentNode = root;
//		Tree currentNode = parentNode.GetRight();
//		assertEquals(11, currentNode.GetKey());
//		root.RemoveRight(parentNode, currentNode);
//		currentNode = root.GetRight();
//		assertEquals(12, currentNode.GetKey());
//	}
//	
//	@Test
//	void test8_RemoveRight() {
//		Tree root = new Tree();
//		root.Init(10) ;
//		root.Insert(11) ;
//		root.Insert(12) ;
//		Tree parentNode = root.GetRight();
//		Tree currentNode = parentNode.GetRight();
//		assertEquals(true, parentNode.GetHas_Right());
//		root.RemoveRight(parentNode, currentNode);
//		assertEquals(false, parentNode.GetHas_Right());
//	}
//	
//	@Test
//	void test9_Remove() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;//8 is the left element of 9
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		Tree parentNode = root;
//		Tree currentNode = parentNode.GetLeft();
//		assertEquals(9, currentNode.GetKey());
//		root.Remove(parentNode, currentNode);
//		currentNode = parentNode.GetLeft();
//		assertEquals(8, currentNode.GetKey());
//		assertEquals(true, currentNode.GetHas_Right());
//	}
//	
//	@Test
//	void test10_Remove() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;//it has no left element
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		Tree parentNode = root;
//		Tree currentNode = parentNode.GetLeft();
//		assertEquals(9, currentNode.GetKey());
//		root.Remove(parentNode, currentNode);
//		currentNode = parentNode.GetLeft();
//		assertEquals(10, currentNode.GetKey());
//		assertEquals(false, currentNode.GetHas_Right());
//	}
//	
//	@Test
//	void test11_Remove() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;//12 is the right element of 13
//		root.Insert(12) ;
//		root.Insert(14) ;
//		Tree parentNode = root;
//		Tree currentNode = parentNode.GetRight();
//		assertEquals(13, currentNode.GetKey());
//		root.Remove(parentNode, currentNode);
//		currentNode = parentNode.GetRight();
//		assertEquals(12, currentNode.GetKey());
//		assertEquals(true, currentNode.GetHas_Right());
//	}
//	
//	@Test
//	void test12_Remove() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;//it has no right element
//		root.Insert(14) ;
//		Tree parentNode = root;
//		Tree currentNode = parentNode.GetRight();
//		assertEquals(13, currentNode.GetKey());
//		root.Remove(parentNode, currentNode);
//		currentNode = parentNode.GetRight();
//		assertEquals(14, currentNode.GetKey());
//		assertEquals(false, currentNode.GetHas_Right());
//	}
//	
//	@Test
//	void test13_Delete() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;//10 is the right element of its parent
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		assertEquals(true, root.Delete(8));//left leave
//		assertEquals(false, root.Search(8));
//	}
//	
//	@Test
//	void test14_Delete() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;//its parent doesn't have a right element
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		assertEquals(true, root.Delete(8));//left leave
//		assertEquals(false, root.Search(8));
//	}
//	
//	@Test
//	void test15_Delete() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;//12 is the left element of its parent
//		assertEquals(true, root.Delete(14));//right leave
//		assertEquals(false, root.Search(14));
//	}
//	
//	@Test
//	void test16_Delete() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		assertEquals(true, root.Delete(9));//left middle node
//		assertEquals(false, root.Search(9));
//	}
//	
//	@Test
//	void test17_Delete() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		assertEquals(true, root.Delete(13));//right middle node
//		assertEquals(false, root.Search(13));
//	}
//	
//	@Test
//	void test18_Delete() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(8) ;
//		root.Insert(9) ;
//		root.Insert(10) ;
//		root.Insert(12) ;
//		root.Insert(13) ;
//		root.Insert(14) ;
//		assertEquals(true, root.Delete(11));//root
//		assertEquals(false, root.Search(11));
//	}
//	
//	@Test
//	void test19_Delete() {
//		Tree root = new Tree();
//		root.Init(11) ;
//		root.Insert(9) ;
//		root.Insert(8) ;
//		root.Insert(10) ;
//		root.Insert(13) ;
//		root.Insert(12) ;
//		root.Insert(14) ;
//		assertEquals(false, root.Delete(23));//not existed element
//	}
//	@Test
//	void test20_Compare() {
//		assertEquals(true, tree.Compare(0, 0));
//	}
//	
//	@Test
//	void test21_Compare() {
//		assertEquals(false, tree.Compare(1, 0));
//	}
//	
//	@Test
//	void test22_Compare() {
//		assertEquals(false, tree.Compare(0, 1));
//	}
//	
//	@Test
//	void test23_Compare() {
//		assertEquals(true, tree.Compare(1, 1));
//	}
//	
//	@Test
//	void test24_Compare() {
//		assertEquals(false, tree.Compare(0, -1));
//	}
//	
//	@Test
//	void test25_Compare() {
//		assertEquals(true, tree.Compare(-1, -1));
//	}
}

package org.cambridge.java.classes;

// This class contains an array of integers and
// methods to initialize, print and search the array
// using Binary Search

public class BinarySearch{
    int[] number ;
    int size ;
    // Search for a specific value (num) using
    // binary search
    public boolean Search(int num){
		boolean bs01 = false;
		int right = this.number.length;
		right = right - 1 ;
		int left = 0;
		boolean var_cont = true;
		int medium = 0;
		int aux01 = 0;
		int nt = 0;

		while (var_cont){
		    medium = left + right ;
		    medium = this.Div(medium);
		    aux01 = this.number[medium] ;
		    if (num < aux01) {
		    	right = medium - 1;
		    }
		    else {
		    	left = medium + 1;
		    }
		    if (this.Compare(aux01,num)) {
		    	var_cont = false;
		    }
		    else {
		    	var_cont = true;
		    }
		    if (right < left) {
		    	var_cont = false;
		    }
		    else {
		    	nt = 0;
		    }
		}
	
		if (this.Compare(aux01,num)) {
			bs01 = true;
		}
		else {
			bs01 = false;
		}
		return bs01 ;
    }

    // This method computes and returns the
    // integer division of a number (num) by 2
    public int Div(int num){
		int count01 = 0;
		int count02 = 0;
		int aux03 = num -1;
		while (count02 < aux03) {
		    count01 = count01 + 1 ;
		    count02 = count02 + 2 ;
		}
		return count01 ;	
    }

    
    // This method compares two integers and
    // returns true if they are equal and false
    // otherwise
    public boolean Compare(int num1 , int num2){
		boolean retval = false;
		int aux02 = num2 + 1;
		if (num1 < num2) {
			retval = false;
		}
		else{
			if (!(num1 < aux02)) {
				retval = false;
			}
			else {
				retval = true;
			}
		}
		return retval;
    }

    // Print the integer array
//    public int Print(){
//		int j = 1;
//		while (j < (this.size)) {
//		    System.out.println(this.number[j]);
//		    j = j + 1 ;
//		}
//		System.out.println(99999);
//		return 0 ;
//    }
    

    // Initialize the integer array
    public int Init(int sz){
    	this.size = sz ;
		this.number = new int[sz] ;
		int j = 1;
		int k = this.size + 1;
		int aux02 = 0;
		int aux01 = 0;
		while (j < (this.size)) {
		    aux01 = 2 * j ;
		    aux02 = k - 3 ;
		    this.number[j] = aux01 + aux02 ;
		    j = j + 1 ;
		    k = k - 1 ;
		}
		return 0 ;	
    }
}
package classes;

public class LinearSearch {
    public int[] number ;
    public int size ;

    // Search for a specific value (num) using
    // linear search
    public boolean Search(int num){
		int j = 0;
		boolean ls01 = false;
		boolean ifound = false;
		int aux01 = 0 ;
		int aux02 = 0;
		int nt = 0;
		int aSize = this.size;
		while (j < aSize) {
		    aux01 = this.number[j] ;
		    aux02 = num + 1 ;
		    if (aux01 < num) {
		    	nt = 0 ;}
		    else{
		    	if (!(aux01 < aux02)){
			    	nt = 0 ;} 
			    else {
					ls01 = true ;
					ifound = true ;
					j = aSize ;}}
		    j = j + 1 ;
		}
		return ifound ;
	}
  
    // initialize array of integers with some
    // some sequence
    public int Init(int sz){
    	this.size = sz;
    	this.number = new int[sz];
		int j = 1;
		int k = this.size + 1;
		int aux01 = 0;
		int aux02 = 0;
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
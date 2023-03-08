package classes;

public class LinkedList{
    Person elem ;
    LinkedList nextElem ;
    boolean end ;

    // Initialize the node list as the last node
    public void Init(){
		this.end = true ;}

    // Initialize the values of a new node
    public void InitNew(Person v_elem, LinkedList v_nextElem, boolean v_end){
		this.elem = v_elem ;
		this.nextElem = v_nextElem ;
		this.end = v_end ;}
    
    // Insert a new node at the beginning of the list
    public LinkedList Insert(Person new_elem){
    	//LinkedList aux03 = this ;
    	LinkedList aux02 = new LinkedList();
		aux02.InitNew(new_elem,this,false);
		return aux02 ;
	}
    
    
    // Update the the pointer to the nextElem node
    public void SetnextElem(LinkedList v_nextElem){
		this.nextElem = v_nextElem ; }
    
    // Delete an element e from the list
    public LinkedList Delete(Person e){
    	LinkedList my_head = new LinkedList();
    	my_head = this;
		boolean ret_val = false;
		LinkedList aux01 = my_head;
		LinkedList prev = my_head;
		boolean var_end = my_head.GetEnd();
		Person var_elem = my_head.GetElem();
		boolean isFirstElement = true;
		int nt = 0;
		
		while (!var_end){
			if (!ret_val) {
				if (e.Equal(var_elem)){
					ret_val = true ;
					if (isFirstElement) { 
					    // delete first element
					    my_head = aux01.getNextElem() ;} 
					else{ // delete a non first element
					    prev.SetnextElem(aux01.getNextElem());}} 
				else {
			    	nt = 0 ;}
			    if (!ret_val){
					prev = aux01 ;
					aux01 = aux01.getNextElem() ;
					var_end = aux01.GetEnd();
					var_elem = aux01.GetElem();
					isFirstElement = false ; } 
			    else {
			    	nt = 0 ;} }
			if (ret_val) {
				var_end = true;}
		}
		return my_head ;
    }
    
    
    // Search for an element e on the list
    public boolean Search(Person e){
		boolean found = false;
		LinkedList aux01 = this;
		Person var_elem = this.GetElem();
		boolean var_end = this.GetEnd();
		int nt = 0;
		while (!var_end){
		    if (e.Equal(var_elem)){
				found = true;}
		    else {
		    	nt = 0 ;} 
		    aux01 = aux01.getNextElem() ;
		    var_end = aux01.GetEnd();
		    var_elem = aux01.GetElem();
		}
		return found ;
    }
    
    public boolean GetEnd(){
		return this.end;
    }
    
    public Person GetElem(){
		return this.elem;
    }
    
    public LinkedList getNextElem(){
		return this.nextElem ;
    }
}
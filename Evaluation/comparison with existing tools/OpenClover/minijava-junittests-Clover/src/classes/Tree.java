package classes;

public class Tree{
    Tree left ;
    Tree right;
    int key ;
    boolean has_left ;
    boolean has_right ;
    Tree my_null ;

    public void Init(int v_key){
		this.key = v_key ;
		this.has_left = false ;
		this.has_right = false ;}

    public Tree GetRight(){
		return this.right ;
    }
    
    public void SetRight(Tree rn){
		this.right = rn ;}

    public Tree GetLeft(){
		return this.left;
    }

	public void SetLeft(Tree ln){
		this.left = ln ; }
	
    public int GetKey(){
		return this.key ;
    }

    public void SetKey(int v_key){
		this.key = v_key ;}

    public boolean GetHas_Right(){
		return this.has_right;
    }

	public void SetHas_Right(boolean val){
		 this.has_right = val ;}
    
    public boolean GetHas_Left(){
		return this.has_left ;
    }

    public void SetHas_Left(boolean val){
		 this.has_left = val ;} 

    public boolean Compare(int num1 , int num2){
		boolean ntb = false;
		int nti = num2 + 1 ;
		if (num1 < num2) {
			ntb = false ;}
		else{
			if (!(num1 < nti)){
				ntb = false ;} 
			else {
				ntb = true ;}}
		return ntb ;
    }

    public void Insert(int v_key){
		Tree new_node = new Tree();
		new_node.Init(v_key) ;
		Tree current_node = this ;
		boolean cont = true ;
		int key_aux = 0;
		while (cont){
		    key_aux = current_node.GetKey();
		    if (v_key < key_aux){
				if (current_node.GetHas_Left()){
					current_node = current_node.GetLeft() ;}
				else {
				    cont = false ;
				    current_node.SetHas_Left(true);
				    current_node.SetLeft(new_node);}}
		    else{
				if (current_node.GetHas_Right()){
				    current_node = current_node.GetRight() ;}
				else {
				    cont = false ;
				    current_node.SetHas_Right(true);
				    current_node.SetRight(new_node);}}}}

    public boolean Delete(int v_key){
		Tree current_node = this ;
		Tree parent_node = this ;
		boolean cont = true ;
		boolean found = false ;
		boolean ntb = false;
		boolean is_root = true ;
		int key_aux = 0;

		while (cont){
		    key_aux = current_node.GetKey();
		    if (v_key < key_aux){
		    	if (current_node.GetHas_Left()){
				    parent_node = current_node ;
				    current_node = current_node.GetLeft() ;}
		    	else {
					cont = false ;}}
		    else {
		    	if (key_aux < v_key){
				    if (current_node.GetHas_Right()){
						parent_node = current_node ;
						current_node = current_node.GetRight() ;}
				    else {
			   	 		cont = false ;}}
		    	else { 
				    if (is_root) {
				    	if (!current_node.GetHas_Right() ){
				    		if (!current_node.GetHas_Left()) {
				    			ntb = true ;}}
				    	else{
							ntb = this.Remove(parent_node,current_node);}}
				    else {
				    	ntb = this.Remove(parent_node,current_node);}
				    found = true ;
				    cont = false ;}
		    }is_root = false ;
		}return found ;
    }

    public boolean Remove(Tree p_node, Tree c_node){
		boolean ntb = false;
		int auxkey1 = 0;
		int auxkey2 = 0;
	
		if (c_node.GetHas_Left()) {
			ntb = this.RemoveLeft(p_node,c_node) ;} 
		else {
			if (c_node.GetHas_Right()){
				ntb = this.RemoveRight(p_node,c_node) ;}
			else {
				auxkey1 = c_node.GetKey();
				Tree auxkey00 = p_node.GetLeft();
				auxkey2 = auxkey00.GetKey() ;
				if (this.Compare(auxkey1,auxkey2)) {
				    p_node.SetLeft(this.my_null);
				    p_node.SetHas_Left(false);}
				else {
				    p_node.SetRight(this.my_null);
				    p_node.SetHas_Right(false);}}
		}return true ;
    }

    public boolean RemoveRight(Tree p_node, Tree c_node){
		boolean ntb = false;
		while (c_node.GetHas_Right()){
			Tree auxkey00 = c_node.GetRight();
		    c_node.SetKey(auxkey00.GetKey());
		    p_node = c_node ;
		    c_node = c_node.GetRight() ;
		}
		p_node.SetRight(this.my_null);
		p_node.SetHas_Right(false);
		return true ;
    }

    public boolean RemoveLeft(Tree p_node, Tree c_node){
		boolean ntb = false;
		while (c_node.GetHas_Left()){
			Tree auxkey00 = c_node.GetLeft();
		    c_node.SetKey(auxkey00.GetKey());
		    p_node = c_node ;
		    c_node = c_node.GetLeft() ;
		}
		p_node.SetLeft(this.my_null);
		p_node.SetHas_Left(false);
		return true ;
    }


    public boolean Search(int v_key){
		Tree current_node = this;
		boolean ifound = false;
		boolean cont = true;
		int key_aux = 0;

		while (cont){
		    key_aux = current_node.GetKey();
		    if (v_key < key_aux){
		    	if (current_node.GetHas_Left()){
		    		current_node = current_node.GetLeft() ;}
		    	else {
					cont = false ;}}
		    else {
		    	if (key_aux < v_key){
		    		if (current_node.GetHas_Right()){
		    			current_node = current_node.GetRight() ;}
		    		else {
		    			cont = false ;}} 
		    	else { 
				    ifound = true;
				    cont = false ;}}
		}return ifound ;
    }
}

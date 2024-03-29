package classes;

public class Person {
    int Age ;          
    int Salary ;
    boolean Married ;

    // Initialize some class variables
    public void Init(int v_Age, int v_Salary, boolean v_Married){
		this.Age = v_Age ;
		this.Salary = v_Salary ;
		this.Married = v_Married ;}

    public int GetAge(){
		return this.Age ;
	}
    
    public int GetSalary(){
		return this.Salary ;
	}

    public boolean GetMarried(){
		return this.Married;
	}

    // This method returns true if the object "other"
    // has the same values for age, salary and married
    public boolean Equal(Person other){
		boolean ret_val = true;
		int nt = 0;
		int thisAge = this.GetAge();
		int otherAge = other.GetAge();
		if (!this.Compare(thisAge,otherAge)){
			ret_val = false ;} 
		else { 
			int thisSalary = this.GetSalary();
			int otherSalary = other.GetSalary();
		    if (!this.Compare(thisSalary, otherSalary)){
		    	ret_val = false ;} 
		    else {
		    	boolean thisMarried = this.GetMarried();
		    	boolean otherMarried = other.GetMarried();
		    	if (thisMarried) {
		    		if (!otherMarried){
		    			ret_val = false;} 
			   	 	else {
			   	 		nt = 0 ;}}
				else{
					if (otherMarried){
						ret_val = false;} 
				    else {
				    	nt = 0 ;} }}}
		return ret_val ;
	}

    // This method compares two integers and
    // returns true if they are equal and false
    // otherwise
    public boolean Compare(int num1 , int num2){
		boolean retval = false;
		int aux02 = num2 + 1 ;
		if (num1 < num2){
			 retval = false ;}
		else{
			if (!(num1 < aux02)){
				retval = false ;} 
			else {
				retval = true ;}}
		return retval ;
	}
}
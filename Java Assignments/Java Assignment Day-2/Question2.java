package question2;
/*Create a class with two (overloaded) constructors. Using 
*this, call the second constructor inside the first one.
*/

class OverloadedConst{
	int a;	
	OverloadedConst(int num){
		a=num;
		System.out.println("Parameterised constructor call: value of a is "+a);
	}
	OverloadedConst(){
		this(0);
		System.out.println("Default constructor call");
	}
	void print(){
		System.out.println(a);
	}
    public static void main(String[] args)     {
       new OverloadedConst().print();
       new OverloadedConst(5).print();
     }
}


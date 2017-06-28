package question3;
/*Create a class with a constructor that takes a String argument. During construction, print the argument. 
*Create an array of object references to this class, but don’t actually create objects to assign into the array. 
*When you run the program, notice whether the initialization messages from the constructor calls are printed.
*/

class ObjArr{
	String s;
	ObjArr(String str){
	 	System.out.println("Initialization message "+str);
	 	s=str;
	}
	// ObjArr(){
	// 	System.out.println("hi");
	// }
	public static void main(String[] args){
		//Array of references
		ObjArr obj []=new ObjArr[5];
	}
}
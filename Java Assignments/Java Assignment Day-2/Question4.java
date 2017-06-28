package question4;
/*
*Complete the previous exercise by creating objects to attach to the array of references.
*/

class ObjArr{
	String s;
	ObjArr(String str){
	 	s=str;
	 	System.out.println("Initialization message. s= "+str);
	 	//s=str;
	}
	// ObjArr(){
	// 	System.out.println("hi");
	// }
	public static void main(String[] args){
		//Array of references
		ObjArr obj []=new ObjArr[5];
		obj[0]=new ObjArr("gate");
		obj[1]=new ObjArr("cat");
		obj[2]=new ObjArr("jee");
		obj[3]=new ObjArr("mat");
		obj[4]=new ObjArr("gmat");

	}
}
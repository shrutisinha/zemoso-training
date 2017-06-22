package shruti.assignment.main;
import shruti.assignment.data.*;
import shruti.assignment.singleton.*;
public class Main {
	public static void main(String args[]){
		Data obj1=new Data();
		obj1.print();
		obj1.printloc();
		Singleton obj2= Singleton.create_obj("shruti");
		obj2.print();
	}
}


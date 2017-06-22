package shruti.assignment.singleton;

public class Singleton {
	static String s;
	public static Singleton create_obj(String str){
		s=str;
		Singleton obj=new Singleton();
		//obj.s=str;
		return obj;
	}
	public void print (){
		System.out.println(s); 
	}
}

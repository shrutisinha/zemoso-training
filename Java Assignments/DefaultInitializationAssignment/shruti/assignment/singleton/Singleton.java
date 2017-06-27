package shruti.assignment.singleton;

public class Singleton {
	String s;
	public static Singleton create_obj(String str){
		/*s=str;*/
		/*The above line is commented out since we cannot make 
		 *a static reference to a non static field so that was
		 * producing an error.
		 */
		Singleton obj=new Singleton();
		obj.s=str;
		/*The above line initializes variable 's' of newly created 
		 * object obj to the string passed to the method.
		 */
		return obj;
	}
	public void print (){
		System.out.println(s); 
	}
}

package exception_handle;
/*Create three new types of exceptions. Write a class with a method that throws all three.
* In main( ), call the method but only use a single catch clause that will catch all three
* types of exceptions. Add a finally clause and verify that your finally clause is executed,
* even if a NullPointerException is thrown.
*/
class Exception1 extends Exception {
	Exception1(String str) { super(str); } 	
}

class Exception2 extends Exception {
	Exception2(String str) { super(str); } 	
}

class Exception3 extends Exception {
	Exception3(String str) { super(str); } 		
}

public class ExceptionHandle {
	public static void symbols(char x) throws Exception1, Exception2, Exception3 {
		if(x >= 'a' && x <= 'z') throw new Exception1("Lowercase letter");
		if(x >= 'A' && x <= 'Z') throw new Exception2("Uppercase letter");
		if(x >= '0' && x <= '9') throw new Exception3("Digit");
	}
	public static void main(String[] args) {
		try {
			if (true) {
				throw new NullPointerException();
			}
			symbols('a');
			symbols('B');
			symbols('5');
		} 
		catch(Exception1 | Exception2 | Exception3 e) {
			System.out.println("Caught Exception");
			e.printStackTrace(System.out);
		} 
		finally {
			System.out.println("Finally block executed");;
		}
	}	
}
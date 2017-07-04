/**Day 4 Java Assignment : Exception Handling 
* Create three new types of exceptions. Write a class with a method that throws all three.
* In main( ), call the method but only use a single catch clause that will catch all three
* types of exceptions. Add a finally clause and verify that your finally clause is executed,
* even if a NullPointerException is thrown.
*/
package exception_handle;

/**
*1st type of exception created
*@see Exception
*/
class Exception1 extends Exception {
	/**
	* This constructor calls Exception class constructor
	*@param str This argument is the error description that is send to the super constructor 
	*/
	Exception1(String str) { super(str); } 	
}
/**
*2nd type of exception created
*@see Exception
*/
class Exception2 extends Exception {
	/**
	* This constructor calls Exception class constructor
	*@param str This argument is the error description that is send to the super constructor 
	*/
	Exception2(String str) { super(str); } 	
}
/**
*3rd type of exception created
*@see Exception
*/
class Exception3 extends Exception {
	/**
	* This constructor calls Exception class constructor
	*@param str This argument is the error description that is send to the super constructor 
	*/
	Exception3(String str) { super(str); } 		
}
/**
*Class containing method that throws exception
*/
class ThrowsException {
	/**
	*This method throws all 3 exceptions that we created.
	* <p>i.e. It throws exception everytime we sent an alphanumeric character</p>
	*@param x The character which it has to check
	*@return No return. (If the character is not alphanumeric then the program executes as normal else exception is thrown.)
	*@throws Exception1 If character x is a lowercase
	*@throws Exception2 If char x is uppercase
	*@throws Exception3 If char x is digit
	*/
	void symbols(char x) throws Exception1, Exception2, Exception3 {
		if(x >= 'a' && x <= 'z') throw new Exception1("Lowercase letter");
		if(x >= 'A' && x <= 'Z') throw new Exception2("Uppercase letter");
		if(x >= '0' && x <= '9') throw new Exception3("Digit");
	}
}
/**
* <h3>The main class</h3>
* Contain the main fuction whick calls the method but only use a single catch clause that will catch all three
* types of exceptions. Add a finally clause and verify that your finally clause is executed,
* even if a NullPointerException is thrown.
*/
public class ExceptionHandle{
	/**
	*Main function which checks how exception handling(try, catch and finally blocks) works.
	*@param args Unused.
    *@return No return.
    *@see ThrowsException
    *@throws NullPointerException
	*/
	public static void main(String[] args) {
		ThrowsException ex=new ThrowsException();
		//comment lines to see different kinds of exception thrown
		try {
			if (true) {	throw new NullPointerException();}
			ex.symbols('a');
			ex.symbols('B');
			ex.symbols('5');
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
package strings_problem;

/* Using the documentation for java.util.regex.Pattern as a resource,
* write and test a regular expression that checks a sentence to see
* that it begins with a captial letter and ends with a period.
*/
import java.util.regex.Pattern;
/**
* <h3>Main class </h3>
* This program finds whether a sting starts with uppercase and ends in period.
*/
public class Main {
	/**
   * This is the main method which prints boolean output to the screen.
   * It uses java.util.regex.Pattern class.
   * @param args Unused.
   * @return Nothing.
   */
	public static void main(String[] args) {
		/* ^matches with beginning of line
		*  [A-Z] matches uppercase character from A through Z
		*  .* '.' mathes any character and '*' means 0 or more time, .*  matches any character sequence
		*  [\\.] matches '.' i.e. dot character
		*  $  matches end of line
		*/ 
		String str = "^[A-Z].*[\\.]$";
		System.out.println("My name is Sinha.".matches(str));//true
		System.out.println("#$^%$^.".matches(str));//false
		System.out.println("A.".matches(str));//true
		System.out.println("^Whats in name.".matches(str));//false
		System.out.println("W.$".matches(str));//false
		System.out.println("Empty.".matches(str));//true
	}
}
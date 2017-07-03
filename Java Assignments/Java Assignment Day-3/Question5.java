package question5;
/*Create a class with an inner class that has a non-default constructor (one that takes arguments).
* Create a second class with an inner class that inherits from the first inner class.
*/
class Outer{
	Outer(){
		System.out.println("Outer");
	}
	class Inner{
		int n;
		Inner(int n){
			this.n=n;
			System.out.println("Outer.Inner " + n);
		}
	}
}
public class Question5 extends Outer {
 	class Inner2 extends Inner{
		Inner2(){
			super(0);
			System.out.println("Inner2 ");
		}
		Inner2(int n){
			super(n);
			System.out.println("Inner 2");
		}

	}
	
	// public Inner2 inner() { return new Inner2(); }
	// public Inner2 inner(int n) { return new Inner2(n); }

	public static void main(String[] args) {
		Question5 out = new Question5();
		// Question5.Inner2 x = out.inner();
		// Question5.Inner2 y = out.inner(5);
		// Inner2 n = out.inner(5);
		Inner2 x= out.new Inner2();
		Inner2 y= out.new Inner2(5);
	}
} 
	
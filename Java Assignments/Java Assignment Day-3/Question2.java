package question2;
/*Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
* Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
* Create instances of all three types and upcast them to an array of Cycle.
* Try to call balance( ) on each element of the array and observe the results.
* Downcast and call balance( ) and observe what happens.
*/

class Cycle{
	
}

class Unicycle extends Cycle{
	
	public void balance(){
		System.out.println("Balancing on Unicycle");
	}
}

class Bicycle extends Cycle{
	
	public void balance(){
		System.out.println("Balancing on Bicycle");
		}
}
	
class Tricycle extends Cycle{
	
}
	
public class Question2 {
	public static void ride(Cycle c){
		System.out.println("Riding a " + c.toString());
	}
	public static void main(String[] args) {
		//Creating instance of all three types and upcast to array of Cycles
		Cycle[] c = {
				new Unicycle(), 
				new Bicycle(),
				new Tricycle()
		};

		/* Error "Cannot find symbol. symbol: method balance()  location: class Cycle"
		 * appears on compiling the below commented segment since balance method is not
		 * defined in Cycle class so it cannot be called after upcasting*/

		/*
		c[0].balance();   
		c[1].balance();
		c[2].balance();
		*/

		//Downcasting and calling balance
		((Unicycle)c[0]).balance();
		((Bicycle)c[1]).balance();
		//((Tricycles)c[2]).balance();   //"The method balance() is undefined for the type Tricycles" error appears
	}
}
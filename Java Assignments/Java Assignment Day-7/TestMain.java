package slist;
/**<h3> The Main Class</h3>
*  This code is used to demonstrate SList
*/
public class TestMain {
	/**
	*This <strong>generic </strong>method simplifies print statement.
	*@param s This can be of any type sice T is generic.
	*@return no return
	*/
	static <T>void print(T s){
		System.out.println(s);
	}
	/**
	*<h3>Main method</h3>
	*It carries out various tests to check our SList.
	*@param args not used
	*/
	public static void main(String[] args ){
		SList <String> s = new SList<>();
		SListIterator<String> it = s.iterator();
		print(s);
		print(it);
		it.add("Apple");
		print("Add: Apple");
		print(s);
		it.add("Orange");
		print("Add: Orange");
		print(s);
		it.add("Pineapple");
		print("Add: Pineapple");
		print(s);
		print(it.hasNext()); //false
		it.remove();
		print("Remove nothing");
		print(s);
		SListIterator<String> it1 = s.iterator();
		it1.remove();
		print("Remove: Apple");
		print(s);
		it1.add("Mango");
		print("Add: Mango");
		print(s);
		it1.add("Litchee");
		print("Add: Litchee");
		print(s);
		it1.remove();
		print("Remove: Orange");
		print(s);
		it.add("Banana");
		print("Add: Banana");
		print(s);
		SList<String> sl=new SList<>();
	}
}

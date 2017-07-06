package slist;


import java.util.*;
/**Creates a generic, singly linked list class called SList, which, to keep things simple, does not
* implement the List interface.
*@param <T> This implies its a generic class and can work on any type T.
*/
public class SList<T>{
	private final Link<T> head=new Link<>();
	/**
	*This method is called whenever an instance of class SList is printed. It is used everytime we need a
	* string represantaion of Object
	*@return Returns the list in readable format
	*/
	public String toString(){
		if(head.next==null) return "LinkedList: []";
		else{
			StringBuilder s=new StringBuilder();
			SListIterator<T> it = this.iterator();
			s.append("LinkedList: [");
			while(it.hasNext()){
				s.append(it.next()+",");
			}
			s.setCharAt(s.length()-1,']');
			return s+"";
		}
	}
	/**
	*Produces SListIterator pointing at header of corresponding SList. The only way to insert and
	* remove elements from an SList is through SListIterator.
	*@return Produces SListIterator for SList instance
	*/
	public SListIterator<T> iterator(){
		return new SListIterator<T>(head);
	}
}
// /**
// *This forms the nodes of SList. Each Link object in the list contains information about itself and a reference
// * to the next element in the list.
// */
// class Link<T>{
// 	T item;
// 	Link<T> next;
// 	Link(T item, Link<T> next) { 
// 		this.item = item;
// 		this.next = next; 
// 	}
// 	Link(T item) {
// 		this(item, null);
// 	} 
// 	Link(){
// 		this(null,null);
// 	}	
// 	/**
// 	*It is used everytime we need a string represantaion of Object,
// 	*@return Information about calling object.
// 	*/
// 	public String toString() {
// 		if(item == null) return "null";
// 		return item.toString();

// 	}

// }

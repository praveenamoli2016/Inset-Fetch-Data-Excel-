package Collectionframework;

import java.util.LinkedList;

public class LinkedListCollection {
	public static void main(String[] args) {
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("neeraj");//array list me array ke form me 
		Name.add("suraj");//aur likedlist me likedke form me element store hota hai
		Name.add("sachin");
		System.out.println(Name);
		Name.addFirst("rohit");
		System.out.println(Name);
		Name.addLast("anish");
		System.out.println(Name);
		Name.remove(1);
		System.out.println(Name);
		Name.removeFirst();
		System.out.println(Name);
		
		
		

}
}




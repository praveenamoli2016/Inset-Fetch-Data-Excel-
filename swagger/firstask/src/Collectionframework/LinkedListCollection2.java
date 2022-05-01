package Collectionframework;

import java.util.LinkedList;

public class LinkedListCollection2 {
	public static void main(String[] args) {
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("neeraj");//array list me array ke form me 
		Name.add("suraj");//aur likedlist me likedke form me element store hota hai
		Name.add("sachin");
		for(String str:Name)
		{
			System.out.println(str);//jo akele multiple value ko hold rakh ho uske liye hm for loop
		}                             //use karenge

}

}

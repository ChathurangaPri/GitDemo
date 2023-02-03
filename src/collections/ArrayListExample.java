package collections;

import java.util.ArrayList;

public class ArrayListExample {
 
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("abc"); //add data inorder
		a.add("java");
		System.out.println(a);
		a.add(0, "Student"); //add data anywhere we want defining the index as well
		System.out.println(a);
		
		//a.remove(1); // remove based on index
		//System.out.println(a); 
		//a.remove("Student"); // remove based on string object
		//System.out.println(a);
		
		System.out.println(a.get(1)); //retrieve element at index
		
		System.out.println(a.contains("java"));  //check whether this string present in arraylist
		
		System.out.println(a.indexOf("java")); //gives the index of object
		
		System.out.println(a.isEmpty()); //check whether the arraylist is empty
		
		System.out.println(a.size()); //arraylist size
		
	}

}

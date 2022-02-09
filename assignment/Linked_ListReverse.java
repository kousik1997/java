package com.Ccc;
import java.util.*;
public class Linked_ListReverse {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Collections.reverse(al);
		System.out.println(al);
}
}
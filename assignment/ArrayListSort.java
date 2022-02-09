package com.Ccc;
import java.util.*;
public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		Collections.sort(list);
		System.out.println(list);
}
}
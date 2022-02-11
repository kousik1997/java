package com.Ccc;
import java.util.*;
public class ArrayListCollection2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Ravi"); 
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		list.set(1, "koushik");
		
		 
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}
}

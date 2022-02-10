package com.Ccc;
import java.util.*;
public class HashSetCollection2 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  
	    set.add("One");    
	    set.add("Two");    
	    set.add("One");   
	    set.add("Four");  
	    set.add("Five");  
	    Iterator<String> i=set.iterator();  
	    while(i.hasNext())  
	    {  
	    System.out.println(i.next());  
	    }
	}
}

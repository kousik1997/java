package com.Ccc;
import java.util.*;
public class HashSetCollection {
public static void main(String[] args) {
	HashSet<String> set=new HashSet();  
    set.add("One");    
    set.add("Two");    
    set.add("one");   
    set.add("Four");  
    set.add("Five");  
    Iterator<String> i=set.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(i.next());  
    }
}
}

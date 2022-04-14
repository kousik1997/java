package com;
import java.util.*;

public class KeySort {
	
	 static HashMap<Integer, String> m = new HashMap<>();
	 
	    public static void sortMapByKey()
	    {
	        ArrayList<Integer> sortKeys
	            = new ArrayList<Integer>(m.keySet());
	 
	        Collections.sort(sortKeys);

	        for (Integer x : sortKeys)
	            System.out.println("Key = " + x
	                               + ", Value = " + m.get(x));
	    }
	 
	    public static void main(String args[])
	    {
	      
	        m.put(5, "five");
	        m.put(1, "one");
	        m.put(3, "three");
	        m.put(9, "nine");
	 
	   
	        sortMapByKey();
	    }
	}
	
